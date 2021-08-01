package com.offcn.exercise;

import java.util.Arrays;


public class Demo03 {

    public static void main(String[] args) {
        // String[]  split(String regex) 根据参数正则，将调用者字符串进行切割，将切割的每一段放进一个String[]
        String[] arr = "I hate java very much".split(" ");
        System.out.println(Arrays.toString(arr));

        String str = "人人为我，我为人人".replaceAll("人", "*******");
        System.out.println("str = " + str);
    }
}

