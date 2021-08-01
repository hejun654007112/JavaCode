package search;

import java.util.Arrays;

/**
 * 1) 黄金分割点是指把一条线段分割为两部分，
 * 使其中一部分与全长之比等于另一部分与这部分之比。
 * 取其前三位 数字的近似值是 0.618。由于按此比例设计的造型十分美丽，
 * 因此称为黄金分割，也称为中外比。这是一个神 奇的数字，会带来意向不大的效果。
 * 2) 斐波那契数列 {1, 1, 2, 3, 5, 8, 13, 21, 34, 55 } 发现斐波那契数列的两个相邻数 的比例，无限接近 黄金分割值 0.618
 * 斐波那契查找原理与前两种相似，仅仅改变了中间结点（mid）的位置，mid 不再是中间或插值得到，
 * 而是位 于黄金分割点附近，即 mid=low+F(k-1)-1（F 代表斐波那契数列）
 */
public class FibonacciSearch {

    public static int fibonacciSearch(int[] arr,int findVal){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int k = 0;
        int[] f = fib();
        while (high >= f[k]-1){
            k++;
        }

        int[] temp = Arrays.copyOf(arr,f[k]);

        for (int i = arr.length; i < temp.length ; i++) {
            temp[i] = arr[high];
        }

        while (low < high){
            mid = low + f[k] - 1;
            if (findVal > temp[mid]){
                low = mid + 1;
                k -= 2;
            }else if (findVal < temp[mid]){
                high = mid -1;
                k--;
            }else {
                if (high <= mid) {
                    return high;
                }else {
                    return mid;
                }
            }
        }
        return -1;
    }

    //创建斐波那契数组，长度为20
    public static int[] fib(){
        int[] fib = new int[20];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 33, 443, 3223, 3223, 3223, 3223};
        System.out.println(fibonacciSearch(arr,33));
    }
}
