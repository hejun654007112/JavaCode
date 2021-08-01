package com.offcn.exercise;

import java.text.DateFormatSymbols;
import java.util.Calendar;

/**
 * 输出当前时间的年、月、日、时、分、秒和星期几，星期几用汉字表示，例如“星期四”
 */
public class Demo02 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols();
        String[] weekdays = dateFormatSymbols.getWeekdays();
        StringBuilder sb = new StringBuilder();
        sb.append(calendar.get(Calendar.YEAR)).append("年")
                .append(calendar.get(Calendar.MONTH) + 1).append("月")
                .append(calendar.get(Calendar.DAY_OF_MONTH)).append("日 ")
                .append(calendar.get(Calendar.HOUR_OF_DAY)).append(":")
                .append(calendar.get(Calendar.MINUTE)).append(":")
                .append(calendar.get(Calendar.SECOND)).append("  ")
                .append(weekdays[calendar.get(Calendar.DAY_OF_WEEK)]);

        System.out.println(sb);

    }
}
