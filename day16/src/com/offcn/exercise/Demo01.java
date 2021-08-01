package com.offcn.exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/**
 * 1、比较Vector、ArrayList和LinkedList在头部增删元素的效率
 * 2、比较Vector、ArrayList和LinkedList查询元素的效率
 */
public class Demo01 {
    public static void main(String[] args) {
        int count = 800000;
        long[] arrayListTime = arrayListAddTime(count);
        System.out.println("ArrayList添加"+count+"个数据耗费的时间:"  + arrayListTime[0] + "ms "
                            +"查询耗费的时间:" +arrayListTime[1] + "ms");

        long[] linkedListTime = linkedListAddTime(count);
        System.out.println("LinkedList"+count+"个数据耗费的时间:"  + linkedListTime[0] + "ms "
                +"查询耗费的时间:" +linkedListTime[1] + "ms");

        long[] vectorListTime = vectorListAddTime(count);
        System.out.println("Vector添加"+count+"个数据耗费的时间:"  + vectorListTime[0] + "ms "
                +"查询耗费的时间:" +vectorListTime[1] + "ms");

    }

    public static long[] arrayListAddTime(int count){
        ArrayList<Integer> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.add(0,i);
        }
        long stop1 = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if (count/2 == iterator.next()){
                break;
            }
        }
        long stop2 = System.currentTimeMillis();
        return new long[]{(stop1-start),(stop2-stop1)};
    }

    public static long[] linkedListAddTime(int count){
        LinkedList<Integer> list = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.addFirst(i);
        }
        long stop1 = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if (count/2 == iterator.next()){
                break;
            }
        }
        long stop2 = System.currentTimeMillis();
        return new long[]{(stop1-start),(stop2-stop1)};
    }

    public static long[] vectorListAddTime(int count){
        Vector<Integer> list = new Vector<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            list.add(0,i);
        }
        long stop1 = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if (count/2 == iterator.next()){
                break;
            }
        }
        long stop2 = System.currentTimeMillis();
        return new long[]{(stop1-start),(stop2-stop1)};
    }
}
