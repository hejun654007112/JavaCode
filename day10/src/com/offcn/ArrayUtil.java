package com.offcn;

/**
 * 数组工具类
 * @author jun
 * @version 1.0
 *
 */
public class ArrayUtil {

    private ArrayUtil() {
    }

    /**
     * 遍历打印数组
     * @param arr int类型一维数组
     */
    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i : arr) {
            System.out.print(i+" ,");
        }
        System.out.println("]");
    }

    /**
     * 查找指定元素第一次在数组中出现的索引
     * @param arr int类型一维数组
     * @param value 指定元素(查找值)
     * @return  查找到就返回这个元素出现的索引,没有查找到就返回-1
     */
    public static int getFirstIndex(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }
}
