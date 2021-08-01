package com.offcn.exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 键盘录入一个自己的生日，计算今天是自己出生的第几天
 */
public class Demo01 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("录入一个出生日期:");
        String birth = sc.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MM dd");
        Date birthDate = dateFormat.parse(birth);

        Date todayDate = new Date();

        long l = todayDate.getTime() - birthDate.getTime();

        System.out.println(l/1000/3600/24);


    }
}
