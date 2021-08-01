package sort;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 归并排序（MERGE-SORT）是利用归并的思想实现的排序方法，
 * 该算法采用经典的分治（divide-and-conquer）
 * 策略（分治法将问题分(divide)成一些小的问题然后递归求解，
 * 而治(conquer)的阶段则将分的阶段得到的各答案"修 补"在一起，即分而治之)。
 */
public class MergeSort {

    /**
     * @param arr   需要排序的数组
     * @param left  左边索引
     * @param right 右边索引
     * @param mid   中间位置索引
     * @param temp  中转数组
     */
    //合并，定义左右指针，比较数据添加到中转数组，最后将中转数组中的数据copy会待排序数组中
    public static void merge(int[] arr, int left, int right, int mid, int[] temp) {
        //定义左指针,起始位置为最左边
        int l = left;
        //定义右指针，起始位置为中间位置+1
        int r = mid + 1;
        //定义中转数组的下标指针
        int t = 0;
        //逐步将数据添加到中转数组中
        while (l <= mid && r <= right){
            if (arr[l] <= arr[r]){
                temp[t] = arr[l];
                t++;
                l++;
            }else {
                temp[t] = arr[r];
                t++;
                r++;
            }
        }
        //如果左边数据加入完毕，右边还剩余，就依次将右边剩余数据加入重装数组
        while ( r <= right){
            temp[t] = arr[r];
            t++;
            r++;
        }
        //反之，将左边数据依次加入中转数组
        while ( l <= mid){
            temp[t] = arr[l];
            t++;
            l++;
        }

        //最后将中转数组的数据copy回来
        t = 0;
        int tempLeft = left;
        while (tempLeft <= right){
            arr[tempLeft] = temp[t];
            tempLeft++;
            t++;
        }

    }

    /**
     * 分+合并
     */
    public static void mergeSort(int[] arr,int left,int right,int[] temp){

        if (left < right){
            //中间索引
            int mid = (left + right)/2;
            //左边分
            mergeSort(arr,left,mid,temp);
            //右边分
            mergeSort(arr,mid + 1,right,temp);
            //合并
            merge(arr,left,right,mid,temp);

        }
    }

//    public static void main(String[] args) {
//        int[] arr = {1,2,9,5,6,7,8};
//        int[] temp = new int[arr.length];
//        mergeSort(arr,0,arr.length-1,temp);
//        System.out.println(Arrays.toString(arr));
//    }
    public static void main(String[] args) {
        int[] arr = new int[80000000];
        int[] temp = new int[arr.length];
        for (int i = 0; i < 80000000; i++) {
            arr[i] = (int) (Math.random() * 8000000); // 生成一个[0, 8000000) 数
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:HH:ss");
        System.out.println(simpleDateFormat.format(date));

        mergeSort(arr,0,arr.length-1,temp);
        Date date1 = new Date();
        System.out.println(simpleDateFormat.format(date1));

    }
}
