package com.offcn.homework;

import java.io.*;
import java.util.Scanner;

/**
 * 1、键盘录入一个文件夹路径，作为源文件夹，这个文件夹还嵌套了文件夹；键盘录入一个文件夹路径，
 * 将其作为目标文件夹
 * 写代码将源文件夹拷贝到目标文件夹中
 * <p>
 * a
 * b
 * <p>
 * b/a
 */
public class Homework01 {

    public static void main(String[] args) throws IOException {
        File source = getSourceFolder();
        File desFolder = getDesFolder();
        copy(source,desFolder);

    }

    public static File getSourceFolder() {
        File file;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("录入一个源文件夹:");
            String source = sc.nextLine();
            file = new File(source);
            if (file.exists()) {
                break;
            }
            System.out.println("指定路径文件不存在,请重新录入");
        }
        return file;
    }

    public static File getDesFolder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("录入一个复制路径:");
        String s = sc.nextLine();
        File file = new File(s);
        if (!file.exists()){

        }
        return file;

    }

    public static void copyFile(File source,File des){
        try {

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(des));

            byte[] arr = new byte[2048];

            int len;

            while ((len = bis.read(arr)) != -1){
                bos.write(arr,0,len);
            }

            bis.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copy(File f1,File f2) throws IOException {
        if (!f1.exists()){
            return;
        }
        if (!f2.exists()){
            f2.mkdirs();
        }

        File[] files = f1.listFiles();
        for (File file : files) {
            if (file.isFile()){
                copyFile(file,new File(f2,file.getName()));
            }else {
                copy(file,new File(f2,file.getName()));
            }
        }
    }

}