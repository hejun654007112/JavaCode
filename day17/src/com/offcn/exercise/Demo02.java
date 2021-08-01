package com.offcn.exercise;

import java.util.Arrays;

/**
 * 定义一个方法，可以交换任意类型的数组的某两个元素
 */
public class Demo02 {

    public static <T> void swap(T[] t,int index01,int index02){
        T temp = t[index01];
        t[index01] = t[index02];
        t[index02] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = {11,22,33};
        swap(arr,0,1);

        String[] arr1 = {"ab","bc","aa"};
        swap(arr1,0,2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }
}
