package com.offcn.exercise;

public class Demo2 {
    public static void main(String[] args) {
        String str = "我";
        char[] chars1={'我','是','哈'};
        int[] ints = {1,2,3};
        char[] chars = str.toCharArray();
        System.out.println(chars);
        System.out.println(chars1);
        System.out.println(ints);

        byte[] bytes = str.getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
    }
}
