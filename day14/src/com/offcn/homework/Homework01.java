package com.offcn.homework;

/**
 * 7、编写一个方法，能判断手机号是否合法
 * 手机号号码：第一位是1
 *             第二位：8，3，5，7
 *             第3位到11位：0-9
 */
public class Homework01 {
    public static void main(String[] args) {
        String s = "13637458732";
        System.out.println(isPhoneNum(s));
    }

    private static boolean isPhoneNum(String s) {
        return s.matches("^[1][8|5|3|7]\\d{9}");
    }
}
