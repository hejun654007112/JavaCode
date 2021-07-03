package sort;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 插入排序（Insertion Sorting）的基本思想是：把 n 个待排序的元素看成为一个有序表和一个无序表，
 * 开始时有 序表中只包含一个元素，无序表中包含有 n-1 个元素，排序过程中每次从无序表中取出第一个元素，
 * 把它的排 序码依次与有序表元素的排序码进行比较，将它插入到有序表中的适当位置，使之成为新的有序表。
 */
public class InsertSort {

    public static void insertSort(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            int insertVal = arr[i];
            int insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]){
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex+1] = insertVal;
        }
    }

    public static void main(String[] args) {
//        int[] arr = {3,1,325,21,6,32,667,23,7623,7};
//        insertSort(arr);
//        System.out.println(Arrays.toString(arr));
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 8000000); // 生成一个[0, 8000000) 数
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:HH:ss");
        System.out.println(simpleDateFormat.format(date));

        insertSort(arr);
        Date date1 = new Date();
        System.out.println(simpleDateFormat.format(date1));
    }
}
