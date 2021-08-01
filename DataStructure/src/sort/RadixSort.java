package sort;

import java.util.Arrays;

/**
 * 1) 基数排序（radix sort）属于“分配式排序”（distribution sort），又称“桶子法”（bucket sort）或 bin sort，顾 名思义，它是通过键值的各个位的值，将要排序的元素分配至某些“桶”中，达到排序的作用
 * 2) 基数排序法是属于稳定性的排序，基数排序法的是效率高的稳定性排序法
 * 3) 基数排序(Radix Sort)是桶排序的扩展
 * 4) 基数排序是 1887 年赫尔曼·何乐礼发明的。它是这样实现的：将整数按位数切割成不同的数字，然后按每个 位数分别比较。
 */
public class RadixSort {
    public static void main(String[] args) {

        int[] arr = {-12, -24, -91, 52, 67, 70, 890,0};

        radixSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void radixSort(int[] arr){
        //获取数组中的最大值的位数
        int max = arr[0];
        for (int item : arr) {
            if (max < item)
                max = item;
        }
        int maxElementCounts = (max + max + "").length();

        //定义一个二维数组桶来来存放数据，外层鸡表示0-9的数字
        int[][] bucket = new int[10][arr.length];
        //定义一个一位数组保存各个桶内的数据个数
        int[] bucketElementCount = new int[bucket.length];

        for (int i = 0,j=1; i < maxElementCounts; i++,j*=10) {

            for (int k = 0; k < arr.length; k++) {
                //获取各位上的数字
                int digitOfElement = (arr[k]+max)  / j % 10;
                //放入对应的桶内
                bucket[digitOfElement][bucketElementCount[digitOfElement]] = arr[k];
                bucketElementCount[digitOfElement]++;
            }

            //定义arr索引
            int index = 0;
            
            //依次取回桶中的数据
            for (int k = 0; k < bucket.length; k++) {
                if (bucketElementCount[k] != 0){
                    for (int l = 0; l < bucketElementCount[k]; l++) {
                        arr[index] = bucket[k][l];
                        index++;
                    }
                }
                //取完后将该桶的数据清零！！！！
                bucketElementCount[k] = 0;
            }
        }
    }

}
