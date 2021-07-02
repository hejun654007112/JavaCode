package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/*      冒泡排序（Bubble Sorting）的基本思想是：通过对待排序序列从前向后（从下标较小的元素开始）,
        依次比较 相邻元素的值，若发现逆序则交换，使值较大的元素逐渐从前移向后部，就象水底下的气泡一样逐渐向上冒。*/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 8000000); // 生成一个[0, 8000000) 数
        }
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:HH:ss");
        System.out.println(simpleDateFormat.format(date));

        bubble(arr);
        Date date1 = new Date();
        System.out.println(simpleDateFormat.format(date1));

    }

    //从小到大排序
    public static int[] bubble(int[] arr){
        boolean flag = false;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
//            System.out.println("第"+(i+1)+"趟排序" + Arrays.toString(arr));
            if (!flag) {
                break;
            }else {
                flag = false;
            }

        }
        return arr;
    }
}
