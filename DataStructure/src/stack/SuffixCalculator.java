package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//后缀表达式的计算
public class SuffixCalculator {
   public static String expression = "30 4 + 5 * 6 -";//注意表达式
    //将表达式存入集合中
    public static void main(String[] args) {
        List<String> List = getExpressionList(expression);
        System.out.println(calculate(List));

    }
    public static int calculate(List<String> expressionList){
        Stack<String> stack = new Stack();
        for (String item:expressionList){
            if (item.matches("\\d+")){
                stack.push(item);
            }else {
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                int res = 0;
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
                stack.push(String.valueOf(res));
            }
        }
      return Integer.parseInt(stack.pop());
    }

    public static List<String> getExpressionList(String expres){
        String[] s = expres.split(" ");
        List<String> list = new ArrayList<>();
        for (String item :s) {
            list.add(item);
        }
        return list;
    }
}
