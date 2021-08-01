package com.offcn.homework;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 1、【问题描述】（注意理解题意，题目本身不难，但是题干很绕）
 * 一个字符串的非空子串是指字符串中长度至少为 1 的连续的一段字符组成 的串。
 * 例如，字符串aaab 有非空子串a, b, aa, ab, aaa, aab, aaab，一共 7 个。
 * 注意在计算时，只算本质不同的串的个数。
 * 请问，字符串0100110001010001 有多少个不同的非空子串？
 * 【正确答案】
 * 100个
 */
public class Homework01 {

    public static String[] getAllSubStr(String str){
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            int count = i + 1;
            while (count   <= str.length()){
                hashSet.add(str.substring(i,count));
                count++;
            }
        }
        return hashSet.toArray(new String[str.length()]);
    }

    public static void main(String[] args) {
        String[] allSubStr = getAllSubStr("0100110001010001");
        System.out.println("所有非空子串共有:" + allSubStr.length + "个" +Arrays.toString(allSubStr));
    }
}
