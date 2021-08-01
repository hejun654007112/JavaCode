package com.offcn.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 4.分析以下需求，并用代码实现（使用传统方式和正则方式，两种办法完成）：
 * 	(1)定义Collection集合，存入多个字符串
 * 	(2)删除集合中包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字符串)
 * 	(3)然后利用迭代器遍历集合元素并输出
 */
public class Homework04 {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("de2f");
        list.add("def1");
        list.add("1def");
        list.add("c");

        remove(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }



    public static void remove(Collection list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            if (!judge2(iterator.next().toString())){
                iterator.remove();
            }
        }
    }

    private static boolean judge(String next) {
        return next.matches("\\D*");
    }

    private static boolean judge2(String next) {
        char[] chars = next.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])){
                return false;
            }

        }
        return true;
    }
}
