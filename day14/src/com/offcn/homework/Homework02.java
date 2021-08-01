package com.offcn.homework;

import java.util.Arrays;

/**
 * 8、写一个正则表达式，能判断字符串中是否包含数字。之后结合起来，处理昨天的作业：
 * 有一个数组String[] arr = {"abc", "qwe23tt", "zxc6", "qqq", "yui7n8m", "hell0", "java"};
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
        return str.matches(".*\\d+.*");
    }
}
