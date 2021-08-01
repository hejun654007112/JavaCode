package com.offcn.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 2.分析以下需求，并用代码实现：
 * 	(1)生成10个1至100之间的随机整数(不能重复)，存入一个Collection集合
 * 	(2)编写方法对Collection集合进行排序（排序操作：可以在帮助手册的Collections类中寻找,锻炼读文档能力）
 * 	(2)然后利用迭代器遍历集合元素并输出
 * 	(3)如：15 18 20 40 46 60 65 70 75 91
 */
public class Homework02 {

    public static void main(String[] args) {
        List<Integer> list = getRandom(10);
        Collections.sort(list);
        System.out.println(list);
    }

    private static List<Integer> getRandom(int count) {
        List<Integer> list = new ArrayList<>();
        while (list.size() < count){
            int random = new Random().nextInt(100) + 1;
            if (!list.contains(random)){
                list.add(random);
            }
        }
        return list;
    }
}
