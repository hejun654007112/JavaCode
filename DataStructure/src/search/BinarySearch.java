package search;

import java.util.ArrayList;
import java.util.List;

/**
 * 二分查找的前提是数组是有序的
 */
public class BinarySearch {

    //只找一个
    public static int binarySearch(int[] arr,int left,int right,int findVal){
        //找不到返回
        if (left > right){
            return -1;
        }

        //中间坐标
        int mid = (left + right)/2;
        int midVal = arr[mid];

        if (midVal > findVal){
            //向左递归
            return binarySearch(arr,left,mid -1,findVal);
        }else if (midVal < findVal){
            //向右递归
            return binarySearch(arr,mid+1,right,findVal);
        }else {
            return mid;
        }

    }

    //找到所有的下标
    public static List<Integer> binarySearch2(int[] arr,int left,int right,int findVal){
        if (left > right){
            return new ArrayList<>();
        }
        int mid = (left + right)/2;
        int midVal = arr[mid];

        if (midVal > findVal){
            //向左递归
            return binarySearch2(arr,left,mid-1,findVal);
        }else if (midVal < findVal){
            //向右递归
            return binarySearch2(arr,mid+1,right,findVal);
        }else {
            List<Integer> list = new ArrayList<>();
            //找到后向左扫描其他findVal
            int temp = mid -1;
            while (true){
                if (temp < 0 || findVal != arr[temp]){
                    break;
                }else {
                    list.add(temp);
                    temp--;
                }
            }
            //添加当前mid
            list.add(mid);

            //向右扫描
            temp = mid +1;
            while (true){
                if (temp > right || findVal != arr[temp]){
                    break;
                }else {
                    list.add(temp);
                    temp++;
                }
            }
            return list;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,33,443,3223,3223,3223,3223};
        System.out.println(binarySearch(arr,0,arr.length-1,5));
        System.out.println(binarySearch2(arr,0,arr.length-1,3223));
    }
}
