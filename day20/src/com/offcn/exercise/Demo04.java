package com.offcn.exercise;

import java.io.File;

public class Demo04 {
    public static void main(String[] args) {
        File file = new File("E:\\1");
        boolean b = file.renameTo(new File("F:\\1"));
        System.out.println(b);
    }
}
