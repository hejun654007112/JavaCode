package sort;

import java.util.Arrays;

/**
 * 堆排序
 */
public class HeapSort {
    //将一个数组(二叉树), 调整成一个大顶堆

    /*** 功能： 完成 将 以 i 对应的非叶子结点的树调整成大顶堆 * 举例 int arr[] = {4, 6, 8, 5, 9}; => i = 1 => adjustHeap => 得到 {4, 9, 8, 5, 6} * 如果我们再次调用 adjustHeap 传入的是 i = 0 => 得到 {4, 9, 8, 5, 6} => {9,6,8,5, 4}
     *
     * @param arr 待调整的数组 *
     * @param i 表示非叶子结点在数组中索引 *
     * @param lenght 表示对多少个元素继续调整， length 是在逐渐的减少
     * */
    public static void adjustHeap(int arr[], int i, int lenght) {
        int temp = arr[i];

        for (int k = i * 2 + 1; k < lenght; k = k * 2 + 1) {
            if (k + 1 < lenght && arr[k] < arr[k + 1]) {
                k++;
            }
            if (arr[k] > temp) {
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        arr[i] = temp;
    }

    public static void heapSort(int arr[]) {
        int temp = 0;

        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }

//        2).将堆顶元素与末尾元素交换，将最大元素 "沉" 到数组末端;
//        3).重新调整结构，使其满足堆定义，然后继续交换堆顶元素与当前末尾元素，反复执行调整 + 交换 步骤，直到整个序列有序。

        for (int i = arr.length -1; i >= 0 ; i--) {
            temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            adjustHeap(arr,0,i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 6, 8, 5, 9};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
