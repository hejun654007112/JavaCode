package com.offcn.homework;

import java.util.Scanner;

/**
 * 键盘录入一个字符串，统计该字符串中的大写字母、小写字母、数字字符和其他字符分别有多少个
 * 例如，键盘录入abcABCD12345!@#$%&，输出结果为：小写字母有3个，大写字母有4个，数字字符有5个，其他字符有6个。
 */
public class Homework01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("录入一个字符串:");
        printCount(sc.nextLine());
    }

    public static void printCount(String s) {
        int lowCount = 0;
        int upperCount = 0;
        int digitCount = 0;
        int otherCount = 0;

        char[] chars = s.toCharArray();

        for (char ch : chars) {
            if (Character.isLowerCase(ch)){
                lowCount++;
            }else if (Character.isUpperCase(ch)){
                upperCount++;
            }else if (Character.isDigit(ch)){
                digitCount++;
            }else {
                otherCount++;
            }
        }
        System.out.println("小写字母有"+lowCount+"个，大写字母有"+upperCount+"个，数字字符有"+digitCount+"个，其他字符有"+otherCount+"个");
    }
}
