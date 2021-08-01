package com.offcn.exercise;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 键盘录入一个字符串，表示一个文件夹路径，如果不是文件夹路径则提示重新录入
 * 打印当前文件夹下，所有的大于70M的后缀名是.mp4的文件的绝对路径
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("文件夹路径:");
            String path = sc.nextLine();
            File f = new File(path);
            if (f.isDirectory()) {
                getAllPath(f.getAbsolutePath());
                break;
            } else {
                System.out.println("不是文件夹路径,重新录入!");
            }
        }
    }

    public static void getAllPath(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                if (f.getName().endsWith(".mp4") && f.length()/1024/1024 > 70)
                    System.out.println(f.getAbsolutePath());
            }
            if (f.isDirectory()) {
                getAllPath(f.getAbsolutePath());
            }
        }
    }
}
