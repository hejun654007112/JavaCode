package com.offcn.exercise;

import java.util.GregorianCalendar;

/**
 * 键盘录入一个年份，判断是平年还是闰年
 */
public class Demo03 {
    public static void main(String[] args) {
        String year = "2020";

        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        System.out.println(gregorianCalendar.isLeapYear(Integer.parseInt(year)));
    }
}
