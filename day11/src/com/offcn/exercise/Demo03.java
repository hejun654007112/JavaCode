package com.offcn.exercise;

public class Demo03 {


    public static void main(String[] args) {

        String str1 = new StringBuilder("计算机").append("软件").toString();

        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("Java(TM) SE ").append("Runtime Environment").toString();

        System.out.println(str2.intern() == str2);

    }

}
