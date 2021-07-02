package stack;

import java.util.*;
import java.util.regex.Pattern;

//完整版的逆波兰计算器，功能包括 1) 支持 + - * / ( ) 2) 多位数，支持小数, 3) 兼容处理, 过滤任何空白字符，包括空格、制表符、换页符
public class ReversePolishMultiCalc {
    /*** 匹配 + - * / ( ) 运算符 */
    static final String SYMBOL = "\\+|-|\\*|/|\\(|\\)";
    static final String LEFT = "(";
    static final String RIGHT = ")";
    /*** 加減 + - */
    static final int LEVEL_01 = 1;
    /*** 乘除 * / */
    static final int LEVEL_02 = 2;
    //去除所有空白符
    public static String replaceAllBlank(String s) {
        // \\s+ 匹配任何空白字符，包括空格、制表符、换页符等等, 等价于[ \f\n\r\t\v]
        return s.replaceAll("\\s", "");
    }

    //判断是否是数字
    public static boolean isNumber(String s) {
        Pattern pattern = Pattern.compile("[.\\d]*$");
        return pattern.matcher(s).matches();
    }

    //判断是否为运算符
    public static boolean isSymbol(String s) {
        return s.matches(SYMBOL);
    }

    //匹配运算等级
    public static int calcLevel(String s) {
        if ("+".equals(s) || "-".equals(s)) {
            return LEVEL_01;
        } else if ("*".equals(s) || "/".equals(s)) {
            return LEVEL_02;
        }
        return 0;
    }
    //将中缀表达式转换为对应的list
    public static List<String> toInfixExpressionList(String s){
         List<String> list = new ArrayList<>();
         s = replaceAllBlank(s);
         int i = 0;
         String str;
         char c;
        do {
            if (isSymbol(String.valueOf(c = s.charAt(i)))){
                list.add(c + "");
                i++;
            }else {
                str = "";
                while (i<s.length()&&isNumber(String.valueOf(c=s.charAt(i))) ){
                    str += c;
                    i++;
                }
                list.add(str);
            }
        }while (i < s.length());
        return list;
    }//方法：将得到的中缀表达式对应的List => 后缀表达式对应的List
    public static List<String> parseSuffixExpreesionList(List<String> ls){
        Stack<String> stack = new Stack<>();
        List<String> data = Collections.synchronizedList(new ArrayList<>());

        for (String item:ls){
            if (isNumber(item)){
                data.add(item);
            }else if (LEFT.equals(item)){
                stack.push(item);
            }else if (RIGHT.equals(item)){
                ////如果是右括号“)”，则依次弹出s1栈顶的运算符，并压入s2，直到遇到左括号为止，此时将这一对括号丢弃
                while (!stack.peek().equals(LEFT)){
                    data.add(stack.pop());
                }
                stack.pop();
            }else {
                //当item的优先级小于等于s1栈顶运算符, 将s1栈顶的运算符弹出并加入到s2中，再次转到(4.1)与s1中新的栈顶运算符相比较
                while (stack.size()!= 0 && calcLevel(item) <= calcLevel(stack.peek())){
                    data.add(stack.pop());
                }
                stack.push(item);
            }
        }

        //将s1中剩余的运算符依次弹出并加入s2
        while (stack.size()!=0){
            data.add(stack.pop());
        }
        return data;
    }
    //运算后缀表达式
    public static double calculate(List<String> expressionList){
        Stack<String> stack1 = new Stack();
        for (String item:expressionList){
            if (isNumber(item)){
                stack1.push(item);
            }else {
                double num1 = Double.parseDouble((stack1.pop()));
                double num2 = Double.parseDouble(stack1.pop());
                double res = 0;
                if (item.equals("+")){
                    res = num1 + num2;
                }else if (item.equals("-")){
                    res = num2-num1;
                }else if (item.equals("*")){
                    res = num2*num1;
                }else if (item.equals("/")){
                    res = num2/num1;
                }else {
                    throw new RuntimeException("运算符错误~~~");
                }
                stack1.push(String.valueOf(res));
            }
        }
        return Double.parseDouble((stack1.pop()));
    }


    public static void main(String[] args) {
        String expression = "1 + ( ( 2.5+3.0)*4.0) -5";
        List<String> infixExpressionList = toInfixExpressionList(expression);
        System.out.println("中缀表达式对应的List=" + infixExpressionList);
        List<String> suffixExpreesionList = parseSuffixExpreesionList(infixExpressionList);
        System.out.println("后缀表达式对应的List" + suffixExpreesionList); //ArrayList [1,2,3,+,4,*,+,5,–]
        System.out.println(replaceAllBlank(expression) + "=" + calculate(suffixExpreesionList));
    }
}
