package com.offcn.homerwork;

import java.io.File;
import java.util.Scanner;

/**
 * 1、键盘录入一个文件夹路径，这个文件夹还嵌套了文件夹。删除该文件夹
 */
public class Homework01 {


    public static void delFile(File file){
        File[] listFiles = file.listFiles();

        for (File f : listFiles) {
            if (f.isFile()){
                f.delete();
            }else{
                delFile(f);
            }
        }

        file.delete();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个有效路径:");
        File file = new File(sc.nextLine());
        if (file.exists()){
            delFile(file);
        }else {
            System.out.println("路径错误");
        }

    }
}
