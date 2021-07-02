package sort;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.SimpleFormatter;

//选择排序
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[80000];
        for (int i = 0; i < 80000; i++) {
            arr[i] = (int) (Math.random() * 8000000); // 生成一个[0, 8000000) 数
        }
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:HH:ss");
            System.out.println(simpleDateFormat.format(date));

            selectSort(arr);
            Date date1 = new Date();
            System.out.println(simpleDateFormat.format(date1));

        }

        public static int[] selectSort ( int[] arr){
            for (int i = 0; i < arr.length - 1; i++) {
                int min = arr[i];
                int index = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (min > arr[j]) {
                        min = arr[j];
                        index = j;
                    }
                }
                if (index != i) {
                    arr[index] = arr[i];
                    arr[i] = min;

                }
            }
            return arr;
        }
    }
