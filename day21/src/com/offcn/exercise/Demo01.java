package com.offcn.exercise;

import java.io.*;
import java.util.LinkedList;

/**
 * 键盘录入一个文件路径，将该文件反转
 * 反转：第一行变成最后一行，第二行变成倒数第二行
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\1.txt"));

        LinkedList<String> list = new LinkedList<>();

        String str;

        while ((str = br.readLine()) != null){
            list.push(str);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\1.txt"));

        while (list.size() > 0){
            bw.write(list.poll());
            bw.newLine();
        }


        bw.close();


    }
}
