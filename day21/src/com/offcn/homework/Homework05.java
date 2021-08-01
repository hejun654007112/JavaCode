package com.offcn.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 5、产生10个1-100的随机数，并放到一个数组中
 * (1)把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
 * (2)把数组中的数字放到当前文件夹的number.txt文件中
 */
public class Homework05 {
    public static void main(String[] args) {
        List<Integer> list = getNum(getRandoms());
        System.out.println(list);


        writeToFile(list, new File(".\\day21\\src\\com\\offcn\\homework\\number.txt"));
    }

    public static int[] getRandoms() {
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        return arr;
    }

    public static List<Integer> getNum(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i >= 10) {
                list.add(i);
            }
        }
        return list;
    }

    public static void writeToFile(List<Integer> list, File file) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (Integer i : list) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
