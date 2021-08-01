package com.offcn.homerwork;

import java.io.File;
import java.util.Scanner;

/**
 * 2、键盘录入一个文件夹路径，这个文件夹还嵌套了文件夹。统计该文件夹的大小
 */
public class Homework02 {
    public static long getSize(File file){
        File[] listFiles = file.listFiles();
        long size = 0;
        if (listFiles != null){
            for (File f : listFiles) {
                if (f.isFile()){
                    size += f.length();
                }else{
                    size += getSize(f);
                }
            }
        }
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个有效路径:");
        File file = new File(sc.nextLine());
        System.out.println(getSize(file) /1024 /1024);
    }
}
