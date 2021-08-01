package com.offcn.exercise;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 5、需求：
 * 键盘录入一个字符串，判断是否是一个合法的QQ号码
 * 合法QQ号码的条件：
 * 必须全都是数字
 * 必须在5-15位
 * 0数字不能开头
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("录入一个QQ号:");
        String s = sc.nextLine();
        if (judge1(s)) {
            System.out.println(s + "是一个QQ号");
        }else {
            System.out.println(s + "不是一个QQ号");
        }

    }

    public static boolean judge(String str) {
        if (str.length() < 5 || str.length() > 15 || str.charAt(0) == 0) {
            return false;
        }
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (!Character.isDigit(array[i])) {
                return false;
            }
        }
        return true;
    }
    public static boolean judge1(String str) {
       return Pattern.matches("[1-9][0-9]{4,14}",str);
    }
}

