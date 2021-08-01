package com.offcn.homework;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 2、获取一个文本上每个字符出现的次数,将结果写在times.txt上
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Homework02.txt"));


        HashMap<Character, Integer> map = new HashMap<>();

        int s;

        while ((s = br.read()) != -1){
            char ch = (char) s;
            if (ch=='\r'||ch=='\n'){
                continue;
            }
            map.put(ch,map.containsKey(ch)?map.get(ch) + 1:1);
        }
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter("times.txt"));
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            bw.write(entry.getKey() + "=" + entry.getValue());
            bw.newLine();
        }

        bw.close();
    }
}
