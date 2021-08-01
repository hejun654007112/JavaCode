package com.offcn.homework;

/**
 * 定义一个方法，接收一个String类型的字符串，返回该字符串的反转形式
 * 举例：接收字符串为abc，返回字符串为cba 要求：使用StringBuilder进行反转，提高开发效率
 *
 * 定义一个方法，接收一个int[]类型的数组，返回该数组的字符串表示形式
 * 举例：接收数组为int[] arr = {1, 2, 3}，返回的字符串为[1, 2, 3] 要求：使用StringBuilder进行拼接，提高运行效率
 */
public class Homework06 {
    //返回该字符串的反转形式
    public static String reverseStr(String str){
        return new StringBuilder(str).reverse().toString();
    }

    //返回该数组的字符串表示形式
    public static String arrayToString(int[] arr){
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1){
                stringBuilder.append(arr[i]).append("]");
            }else
            stringBuilder.append(arr[i]).append(", ");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdEDF"));

        int[] arr = {1, 2, 3,5,7,2};
        System.out.println(arrayToString(arr));
    }
}
