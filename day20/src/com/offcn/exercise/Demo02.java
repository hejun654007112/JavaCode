package com.offcn.exercise;

/**
 * 斐波那契数列：1, 1, 2, 3, 5, 8, 13, 21, 34, 55......使用递归，计算出该数列的第n项是多少
 */
public class Demo02 {

    public static int getFib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return getFib(n - 1) + getFib(n - 2);
        }
    }

    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(getFib(999));
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
    }
}
