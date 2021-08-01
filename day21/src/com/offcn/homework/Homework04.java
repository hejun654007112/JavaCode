package com.offcn.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 4、用代码实现以下需求
 * 	(1)有如下字符串"If you want to change your fate I think you must come to the ujiuye to learn java"(用空格间隔)
 * 	(2)打印格式：
 * 		to=3
 * 		think=1
 * 		you=2
 * 		//........
 * 	(3)按照上面的打印格式将内容写入到D:\\count.txt文件中(要求用高效流)
 */
public class Homework04 {
    public static void main(String[] args) throws IOException {
        String str = "If you want to change your fate I think you must come to the ujiuye to learn java";
        String[] strings = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            map.put(s,map.containsKey(s)?map.get(s)+1:1);
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter("homework04.txt"));
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String s = entry.getKey() + "=" + entry.getValue();
            System.out.println(s);
            bw.write(s);
            bw.newLine();
        }
        bw.close();
    }
}
