package sort;

import java.util.Arrays;

/**
 * 希尔排序是希尔（Donald Shell）于 1959 年提出的一种排序算法。希尔排序也是一种插入排序，
 * 它是简单插入排序经过改进之后的一个更高效的版本，也称为缩小增量排序。
 * 思路：希尔排序是把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；
 * 随着增量逐渐减少，每组包含 的关键词越来越多，当增量减至 1 时，整个文件恰被分成一组，算法便终止
 */
public class ShellSort {

    public static void shellSort(int[] arr){
        int count = 0;
        //增量gap，并逐步缩小增量
        for (int gap = arr.length/2 ; gap > 0 ; gap /= 2) {
            //从gap开始，使用简单插入排序
            for (int i = gap; i < arr.length ; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]){
                    //移动直到找到合适的位置
                    while (j -gap >= 0 && temp < arr[j - gap]){
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = temp;
                }
            }
            count++;
//            System.out.println("第"+count+"趟排序：" + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 9, 1, 7, 2, 3, 5, 4, 6, 0 };
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
