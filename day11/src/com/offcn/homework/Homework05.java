package com.offcn.homework;

import java.util.Scanner;

/**
 * 5、分析以下需求，并用代码实现：
 * 	(1)从键盘循环录入录入一个字符串,输入"end"表示结束
 * 	(2)将字符串中大写字母变成小写字母，小写字母变成大写字母，其它字符用"*"代替,并统计字母的个数
 * 		举例:
 * 			键盘录入：Hello12345World
 * 			输出结果：hELLO*****wORLD
 * 					  总共10个字母
 */
public class Homework05 {
    /**
     * 键盘录入数据,直到end结束
     * @param end 录入结束标记(不区分大小写)
     * @return  返回录入数据的字符串
     */
    public static StringBuilder getScanner(String end){
        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        while (true){
            String s = sc.nextLine();
            if (s.equalsIgnoreCase(end)){
                break;
            }
            stringBuilder.append(s);
        }
        return stringBuilder;
    }

    /**
     * 转换字符串,并返回转换字符的个数
     * @param inputStr 待转换的字符串
     * @return  字母的个数
     */
    public static int transformStr(StringBuilder inputStr) {

        //计数
        int count = 0;
        if (inputStr.length() != 0) {
            for (int i = 0; i < inputStr.length(); i++) {
                char c = inputStr.charAt(i);
                if (c >= 'a' && c <= 'z'){
                    c += 32;
                    count++;
                }else if (c >= 'A' && c <= 'Z'){
                    c -= 32;
                    count++;
                }else {
                    c='*';
                }
                inputStr.replace(i,i+1, String.valueOf(c));
            }
        }
      return count;
    }

    public static void main(String[] args) {
        System.out.println("输入数据,输入\"end\"表示结束:");
        StringBuilder inputStr = getScanner("end");

        int count = transformStr(inputStr);

        System.out.println("转换后:" + inputStr);
        System.out.println("共有"+count+"个字母");
    }
}
