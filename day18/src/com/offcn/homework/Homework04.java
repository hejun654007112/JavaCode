package com.offcn.homework;

import java.util.HashMap;
import java.util.Map;

/**
 * 4、分析以下需求，并用代码实现：
 * 	(1)统计每个单词出现的次数
 * 	(2)有如下字符串"If you want to change your fate I think you must come to the ujiuye to learn java"(用空格间隔)
 * 	(3)打印格式：
* 		to=3
*   	think=1
*   	you=2
*   	//........
 */
public class Homework04 {
    public static void main(String[] args) {
        String str = "If you want to change your fate I think you must come to the ujiuye to learn java";
        String[] strings = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            map.put(s,map.containsKey(s)?map.get(s)+1:1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
