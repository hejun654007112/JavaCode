package com.offcn.homework;

import java.util.*;

/**
 * 结合Arrays工具类中学过的方法：
 * 生成1-100内的n个不重复的随机数（n需要键盘录入），之后存入合适的数组，最终输出
 * 数组中第一、第二、第三大的元素。
 */
public class Homework03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入数组大小：");
        int count = Integer.parseInt(sc.nextLine());
        if (count > 100 || count <= 0){
            System.out.println("请输入0~100的数,错误,程序退出~~");
            return;
        }
        Integer[] arr = getArray(count);
        //排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("数组中第一大的元素是:" + arr[arr.length-1] );
        System.out.println("数组中第二大的元素是:" + arr[arr.length-2] );
        System.out.println("数组中第三大的元素是:" + arr[arr.length-3] );

    }

    public static Integer[] getArray(int length){
        List<Integer> list = new ArrayList<>();
        int count = 0;
        while (true){
            if (count >= length){
                break;
            }
            int random = (int) (Math.random() * 100 + 1);
            if (!list.contains(random)){
                list.add(random);
                count++;
            }
        }
//        System.out.println(list.toString());
        return list.toArray(new Integer[length]);
    }
}
