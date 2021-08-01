package com.offcn.homework;

import java.util.Arrays;

/**
 * 3、定义sym方法,判断数组中的元素值是否对称. 代码实现,效果如图所示：
 *
 */
public class Homerwork01 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,3,2,1};
        int[] arr2 = {1,2,3,4,5,2,1};
        Homerwork01 homerwork01 = new Homerwork01();
        System.out.println(Arrays.toString(arr1) + "是否对称:" + homerwork01.sym(arr1));
        System.out.println(Arrays.toString(arr2) + "是否对称:" + homerwork01.sym(arr2));

    }

    private  boolean sym(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1-i]){
                return false;
            }
        }
        return true;
    }
}
