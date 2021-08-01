package com.offcn.exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 * 随机生成10个20~40之间的随机数，存储在合适的集合中，并且进行遍历
 * 要求：随机数不能重复
 */
public class Demo03 {

    public static int[]  getRandomArr(int count){
        int[] arr = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            arr[i] = random.nextInt(20) + 20;
        }
        return arr;
    }

    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();

        int[] randomArr = getRandomArr(10);

        List<int[]> ints = Arrays.asList(randomArr);

        System.out.println(ints);
    }
}
