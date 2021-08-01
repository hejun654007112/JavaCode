package com.offcn.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/**
 * 4、键盘录入一个纯数字字符串，如果该字符串不是纯数字就重新录入。
 * 将该纯数字字符串中重复的数字去掉，然后返回一个按照自然顺序升序排序的数字字符串
 * 例如：输入"3321321167867768" -> 返回"123678"
 */
public class Homework04 {

    public static void main(String[] args) {
        String inputStr = input();
        inputStr = removeRepeatEle(inputStr);

        System.out.println(inputStr);
    }

    public static String input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("录入一个纯数字字符串");
        while (true){
            String s = sc.nextLine();
            if (s.matches("\\d+")){
                return s;
            }
            System.out.println("录入一个纯数字字符串");
        }
    }

    public static String removeRepeatEle(String str){
        HashSet<Character> hashSet = new HashSet<>();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            hashSet.add(aChar) ;
        }
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(hashSet);
        Collections.sort(list);
        return list.toString();
    }
}
