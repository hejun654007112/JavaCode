package com.offcn.homework;

import java.util.Arrays;

/**
 * 2、有一个数组String[] arr = {"abc", "qwe23tt", "zxc6", "qqq", "yui7n8m", "hell0", "java"};
 * 	编写代码删除数组中含有数字的字符串，并且将剩余的字符串打印
 */
public class Homework02 {
    public static void main(String[] args) {
        String[] arr = {"abc", "qwe23tt", "zxc6", "qqq", "yui7n8m", "hell0", "java"};


        System.out.println(Arrays.toString(delArrayNum(arr)));
    }

    private static String[] delArrayNum(String[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if(!isContainsNumber(arr[i])){
                stringBuilder.append(arr[i]).append("\t");
            }
        }

        return stringBuilder.toString().split("\t");
    }

    public static boolean isContainsNumber(String str){
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c))
                return true;
        }
        return false;
    }
}
