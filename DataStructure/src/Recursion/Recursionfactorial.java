package Recursion;
//使用递归求一个数的阶乘
public class Recursionfactorial {
    public static void main(String[] args) {
        System.out.println( factorial(214324));

    }

    private static int factorial(int num) {
        if (num == 1){
            return 1;
        }
        return num*(num - 1);
    }
}
