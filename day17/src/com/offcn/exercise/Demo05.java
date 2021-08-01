package com.offcn.exercise;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 键盘录入一个字符串，输出其中的字符，相同字符只输出一次，要求保证原录入顺序
 */
public class Demo05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("录入一个字符串:");

        String s = scanner.nextLine();

        HashSet<Character> hashSet = new HashSet<>();

        char[] chars = s.toCharArray();



        for (char aChar : chars) {
            hashSet.add(aChar);
        }

        System.out.println(hashSet);

    }
}
