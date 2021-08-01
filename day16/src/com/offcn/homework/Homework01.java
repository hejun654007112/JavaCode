package com.offcn.homework;

import java.util.ArrayList;

/**
 * 1、一个ArrayList对象aList中存有若干个字符串元素，现欲遍历该ArrayList对象，
 * 删除其中所有值为"abc"的字符串元素，请用代码实现。
 */
public class Homework01 {
    public static void main(String[] args) {
        ArrayList aList = new ArrayList();
        aList.add("a");
        aList.add("abc");
        aList.add("abc");
        aList.add("b");

        ArrayList objects = new ArrayList<>();
        objects.add("abc");

        aList.removeAll(objects);

        System.out.println(aList);
    }


}
