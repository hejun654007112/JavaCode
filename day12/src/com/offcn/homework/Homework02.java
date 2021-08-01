package com.offcn.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 键盘录入一个正整数n，创建一个大小为n的数组
 * 键盘录入m（m <= n）个整数，存入上述数组，
 * 当录入字符串"end"或者录入个数达到n时，结束录入
 * 并且将数组内容、数组最大值按照指定格式进行输出
 * 例如：
 * 请录入数组大小：
 * 10
 * 请录入若干整数
 * 2
 * 4
 * 5
 * 6
 * 7
 * end
 * 最终结果为：[2, 4, 5, 6, 7, 0, 0, 0, 0, 0], 最大值为7
 * 提示：如果录入的数字是String类型的，即"123"，通过 Integer.parseInt("123")，
 * 即可将"123"变为int类型的123
 */
public class Homework02 {


    public static int[] inputData(int n) {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        int[] arr = new int[n];
        System.out.println("请录入若干整数:");
        while (true) {
            String input = sc.nextLine();
            if (input.equals("end")) {
                break;
            }
            if (index == n - 1) {
                arr[index] = Integer.parseInt(input);
                break;
            }
            arr[index] = Integer.parseInt(input);
            index++;

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入数组大小：");
        int[] dataArr = inputData(sc.nextInt());
        System.out.print(Arrays.toString(dataArr) + ", ");
        Arrays.sort(dataArr);
        System.out.println("最大值为:" + dataArr[dataArr.length-1]);
    }
}
