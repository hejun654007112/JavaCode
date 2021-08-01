package com.offcn.homework;

/**
 * 4、写一个方法判断一个字符串是否对称，要求：要用到StringBuilder
 */
public class Homework04 {

    public static boolean isItSymmetrical(String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    public static void main(String[] args) {
        System.out.println(isItSymmetrical("我不是不我"));
    }
}
