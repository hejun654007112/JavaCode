package com.offcn.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 4、键盘录入一个数据n（n>=3  否则重新录入），之后再录入n个数存入一个合适的数组。
 * *  编写方法，将数组的元素按照从小到大的顺序排序，最后将数组中最小的三个元素删除。
 * *  例如：录入的n为3，之后就录入3个数作为数组元素；录入的n为10，之后就录入10个数作为数组元素。
 */
public class Homework02 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("请录入数据的个数：");
        int[] arr = enterNum(sc.nextInt());
        System.out.println("原始数据：" + Arrays.toString(arr));
        sortArray(arr);


        System.out.println("排序后：" + Arrays.toString(arr));
        arr = delMinNumThreeElement(arr, 3);
        System.out.println("删除后：" + Arrays.toString(arr));


    }

    public static int[] enterNum(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("请录入第" + (i + 1) + "个数据");
            arr[i] = sc.nextInt();
        }
        System.out.println("录入完成~~~");
        return arr;
    }

    public static int[] delMinNumThreeElement(int[] arr, int num) {
        if (num > arr.length) {
            return arr;
        }
        int[] newArray = new int[arr.length - num];
        int index = 0;
        sortArray(arr);
        for (int i = num; i < arr.length; i++) {
            newArray[index] = arr[i];
            index++;
        }
        return newArray;
    }

    // 使用冒泡排序将数组从小到大排序
    public static void sortArray(int[] arr) {
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!flag) {
                break;
            } else {
                flag = false;
            }
        }
    }
}
