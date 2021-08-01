package com.offcn.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 键盘录入一个字符串，统计每个字符出现的次数
 * 例如，录入aaaabbccddd!@#@#$@#$%cc66ff
 * 打印出来：a有4个，b有2个，c有4个，d有3个，!有1个，@有3个，$有2个，%有1个，6有2个，f有2个
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("录入一个字符串:");
        String s = sc.nextLine();

        char[] chars = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        for (char aChar : chars) {
            if (hashMap.containsKey(aChar)){
                hashMap.put(aChar,hashMap.get(aChar)+1);
            }else {
                hashMap.put(aChar,1);
            }
        }


        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            System.out.print(entry.getKey() +"有"+ entry.getValue() + "个, ");
        }
    }
}
