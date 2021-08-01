package com.offcn.homework;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 3、使用Scanner从键盘读取一行输入(字符串),去掉其中重复字符, 打印出不同的那些字符
 */
public class Homework03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("录入一段字符:");
        String s = scanner.nextLine();
        s = removeRepeatEle(s);

        System.out.println(s);
    }

    public static String removeRepeatEle(String str){
        HashSet<Character> hashSet = new HashSet<>();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            hashSet.add(aChar) ;
        }
        return hashSet.toString();
    }


}
