package com.offcn.homework;

import java.io.*;

/**
 * 3、结合磁盘与内存的特点，完成需求：当我们下载一个试用版软件,没有购买正版的时候,
 * 每执行一次就会提醒我们还有多少次使用机会用学过的IO流知识,
 * 模拟试用版软件,试用10次机会,执行一次就提示一次您还有几次机会,如果次数到了提示请购买正版
 */
public class Homework03 {
    public static int getCount() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Homework03.config"));
        int read = bis.read();
        bis.close();
        return read;
    }

    public static void setCount(int count) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Homework03.config"));
        bos.write(count);
        bos.close();
    }

    //使用方法模拟使用
    public static void use() throws IOException {
        int count = getCount();
        if (count > 0){
            System.out.println("~~~正在使用~~");
            setCount(count-1);
        }else {
            endOfTrial();
        }

    }

    //endOfTrial
    public static void  endOfTrial(){
        System.out.println("试用机会已用尽,请购买正版");
    }

    //软件安装
    public static void install() throws IOException {
        setCount(10);
        System.out.println("安装成功~");
    }

    public static void main(String[] args) throws IOException {
       install();
        for (int i = 0; i <= 10; i++) {
            use();
        }
    }
}
