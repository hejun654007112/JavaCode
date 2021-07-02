package stack;

//简易中缀表达式的计算器
public class Calculator {
    public static void main(String[] args) {
        //根据前面老师思路，完成表达式的运算
        String expression = "7*2+(20+3)-5"; // 15//如何处理多位数的问题？
        //创建一个数字栈存放数字,大小为20
        ArrayStack2 number = new ArrayStack2(20);
        //创建一个符号栈存放运算符,大小为20
        ArrayStack2 operat = new ArrayStack2(20);
        System.out.println(calculate(expression, number, operat));

    }

    public static int calculate(String expression, ArrayStack2 number, ArrayStack2 operat) {
        //进行运算的数字
        int num1 = 0;
        int num2 = 0;
        //计算的结果
        int res = 0;
        //用于拼接多位数
        String concat = "";
        //用于拼接（）内的内容
        String str = "";
        //定义一个扫描指针表示
        int index = 0;
        //保存每次扫描得到的字符
        char ch = ' ';
        //开始while循环的扫描expression
        boolean loop = true;
        while (loop) {
            ch = expression.substring(index, index + 1).charAt(0);
            if (operat.isOper(ch)) {
                //如果符号栈为空，直接入栈，如果不为空则与栈顶比较优先级，如果当前操作符优先级较高直接入栈，否则取出符号栈栈顶进行计算
                //再将当前运算符入栈
                if (operat.isEmpert()) {
                    operat.pushArray(ch);
                } else {
                    if (operat.priority(ch) >= operat.priority((char) operat.getTop())) {
                        operat.pushArray(ch);
                    } else {
                        num1 = number.popArray();
                        num2 = number.popArray();
                        res = number.cal(num1, num2, (char) operat.popArray());
                        number.pushArray(res);
                        operat.pushArray(ch);
                    }
                }
            } else {
                //分析思路
                //1. 当处理多位数时，不能发现是一个数就立即入栈，因为他可能是多位数
                //2. 在处理数，需要向expression的表达式的index 后再看一位,如果是数就进行扫描，如果是符号才入栈
                //3. 因此我们需要定义一个变量 字符串，用于拼接
                concat += ch;
                if (index == expression.length() - 1) {
                    number.pushArray(Integer.parseInt(concat));
                } else {
                    if (operat.isOper(expression.substring(index + 1, index + 2).charAt(0))) {
                        number.pushArray(Integer.parseInt(concat));
                        concat = "";
                    }
                }
            }
            index++;
            if (index == expression.length()) {
                break;
            }


        }
        number.list();
        System.out.println("----------");
        operat.list();
        //当表达式扫描完毕，就顺序的从 数栈和符号栈中pop出相应的数和符号，并运行.
        while (loop) {
            if (operat.isEmpert()) {
                break;
            }
            num1 = number.popArray();
            num2 = number.popArray();
            res = number.cal(num1, num2, (char) operat.popArray());
            number.pushArray(res);
        }
        return res;
    }

}

class ArrayStack2 {
    private int[] arr;
    private int maxSize;
    private int top;

    public ArrayStack2(int size) {
        this.maxSize = size;
        this.top = -1;
        this.arr = new int[maxSize];
    }

    //是否栈满
    public boolean isFull() {
        return top == maxSize - 1;
    }

    //是否栈空
    public boolean isEmpert() {
        return top == -1;
    }

    //入栈
    public void pushArray(int num) {
        if (top >= maxSize - 1) {
            throw new RuntimeException("栈满");
        }
        top++;
        arr[top] = num;
    }

    //出栈
    public int popArray() {
        if (isEmpert()) {
            throw new RuntimeException("栈空");
        }
        return arr[top--];
    }

    public void list() {
        if (isEmpert()) {
            System.out.println("栈空，没有数据~~");
            return;
        }
        //需要从栈顶开始显示数据
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d]=%d\n", i, arr[i]);
        }
    }

    //返回当前栈顶位置
    public int getTop() {
        return arr[top];
    }

    //判断是否为一个运算符
    public boolean isOper(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    //判断优先级
    public int priority(char oper) {
        if (oper == '+' || oper == '-') {
            return 1;
        } else if (oper == '*' || oper == '/') {
            return 2;
        } else {
            return 0;
        }
    }

    //计算
    public int cal(int num1, int num2, char op) {
        int res = 0;
        switch (op) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num2 - num1;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num2 / num1;
                break;
            default:
                break;
        }
        return res;
    }
}
