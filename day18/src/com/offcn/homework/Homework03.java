package com.offcn.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 3、分析以下需求，并用代码实现：
 * 	(1)利用键盘录入，输入一个字符串
 * 	(2)统计该字符串中各个字符的数量
 * 	(3)如：
 * 		用户输入字符串"If~you-want~to~change-your_fate_I_think~you~must~come-to-the-ujiuye-to-learn-java"
 * 		程序输出结果：-(9)I(2)_(3)a(7)c(2)d(1).....
 */
public class Homework03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("录入一个字符串:");
        String s = sc.nextLine();

        char[] chars = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char aChar : chars) {
                hashMap.put(aChar,hashMap.containsKey(aChar)?hashMap.get(aChar)+1:1);
        }

        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            System.out.print(entry.getKey() +"("+ entry.getValue() + ")");
        }
    }
}
