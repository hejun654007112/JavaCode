package com.offcn.homework;

import java.util.Scanner;

/**
 * 1、键盘录入一个大小写混杂的纯英文字符串
 * 将字符串转换成首字母大写，其他字母全部小写
 * 例如，键盘录入”i lOvE jAvA”，转换成 “I love java”
 */
public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符,用空格隔开:");
        System.out.println(firstEleToUpper(sc.nextLine()));
    }

    public static String firstEleToUpper(String str){
        StringBuilder newStr = new StringBuilder();
        String[] s = str.toLowerCase().split("\\b");
        for (int i = 0; i < s.length; i++) {
            char first = s[i].charAt(0);
            char upper = (char) (first - 32);
            s[i] = s[i].replaceFirst(String.valueOf(first),String.valueOf(upper));
            newStr.append(s[i]).append(" ");
        }
        return newStr.toString();
    }
}
