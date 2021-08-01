package sort;

import java.util.Arrays;

/**
 * 快速排序（Quicksort）是对冒泡排序的一种改进。
 * 基本思想是：通过一趟排序将要排序的数据分割成独立的两 部分，
 * 其中一部分的所有数据都比另外一部分的所有数据都要小，然后再按此方法对这两部分数据分别进行快速排 序，
 * 整个排序过程可以递归进行，以此达到整个数据变成有序序列
 */
public class QuickSort {

    //以中间为轴数据
    public static void quickSort(int[] arr, int left, int right) {
        //记录左右下标
        int l = left;
        int r = right;
        //中轴数据
        int pivot = arr[(left + right) / 2];
        //临时变量用于交换
        int temp = 0;
        while (l < r) {
            //在左边找到一个比pivot大的值
            while (arr[l] < pivot) {
                l++;
            }
            //在右边找到一个比pivot小的数
            while (arr[r] > pivot) {
                r--;
            }

            //如果没有找到就直接返回
            if (l >= r) {
                break;
            }

            //找到了就进行交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            //最后当左指针到达pivot位置,右指针前移
            if (arr[l] == pivot) {
                r--;
            }
            //最后当右指针到达pivot位置,左指针后移
            if (arr[r] == pivot) {
                l++;
            }
        }

        if (l == r) {
            l++;
            r--;
        }

        if (left < r) {
            quickSort(arr, left, r);
        }

        if (right > l) {
            quickSort(arr, l, right);
        }
    }

    //以第一个数据为轴数据
    public static void quickSort1(int[] arr, int left, int right) {
        int mid;
        if (left < right) {
            mid = partition(arr, left, right);
            //向左递归
            quickSort1(arr, left, mid - 1);
            //向右递归
            quickSort1(arr, mid + 1, right);
        }
    }

    /**
     * 以轴数据排序分组
     *
     * @param arr
     * @param left
     * @param right
     * @return
     */

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= pivot)
                right--;
                arr[left] = arr[right];

            while (left < right && arr[left] <= pivot)
                left++;
                arr[right] = arr[left];
        }
        arr[left] = pivot;
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 5, 6, 7, 8};
        quickSort1(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
