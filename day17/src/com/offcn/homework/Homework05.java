package com.offcn.homework;

import java.util.*;

/**
 * 5、定义一个方法，可以对List集合内容进行去重，并且不改变原来List中元素的顺序
 */
public class Homework05 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);

        removeRepeatEle(list);

        System.out.println(list);
    }

    public static void removeRepeatEle(List list){
        LinkedHashSet<Object> hashSet = new LinkedHashSet<>();
        hashSet.addAll(list);
        list.clear();
        list.addAll(hashSet);
    }
}
