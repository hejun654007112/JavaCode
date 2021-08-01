package com.offcn.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 1、分析以下需求，并用代码实现：
 * 	(1)通过键盘录入日期字符串，格式(2021-01-01)
 * 	(2)输出该日期是星期几及这一年的第几天
 * 	(3)如输入：2021-01-01，输出"2021年-01月-01日是星期五，是2021年的第1天"
 */
public class Homework01 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("录入日期，格式(2021-01-01)");

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(sc.nextLine());

        dateFormat.applyPattern("yyyy年-MM月-dd日E，是yyyy年的第D天");
        System.out.println(dateFormat.format(date));

    }
}
