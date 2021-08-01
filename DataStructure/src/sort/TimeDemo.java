package sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDemo {
    public static void main(String[] args) {
        int[] arr = new int[8000000];
        int[] temp = new int[arr.length];
        for (int i = 0; i < 8000000; i++) {
            arr[i] = (int) (Math.random() * 8000000); // 生成一个[0, 8000000) 数
        }
        beforeTime();
        RadixSort.radixSort(arr);
        afterTime();
    }

/*    public static void main(String[] args) {
        int[] arr = {-1,-4,3,4,5,2,5,2,0};
        //冒泡排序支持负数
//        BubbleSort.bubble(arr);
        //插入排序支持负数
//        InsertSort.insertSort(arr);
        //shell支持负数
//        ShellSort.shellSort(arr);
        //选择排序支持负数
//        SelectSort.selectSort(arr);
        //快排支持负数
//        QuickSort.quickSort(arr,0,arr.length-1);
        //归并排序支持负数
//        int[] temp = new int[arr.length];
//        MergeSort.mergeSort(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));

    }*/
    public static void afterTime() {
        System.out.println("排序后时间");
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:HH:ss");
        System.out.println(simpleDateFormat.format(date1));
    }

    public static void beforeTime() {
        System.out.println("排序前时间");
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:HH:ss");
        System.out.println(simpleDateFormat.format(date1));
    }
}
