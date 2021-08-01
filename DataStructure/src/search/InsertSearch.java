package search;

/**
 * 插值查找类似于二分查找，同样是在数组有序的前提下进行查找，不同的是插值查找每次从mid自适应查找
 * int mid = left + (right – left) * (findVal – arr[left]) / (arr[right] – arr[left])
 */
public class InsertSearch {
    /*
     * 插值查找，如果找到返回下标，没有找到返回-1
     * */
    public static int insertSearch(int[] arr, int left, int right, int findVal) {
        if (left > right || findVal < arr[0] || findVal > arr[arr.length - 1]) {
            return -1;
        }
        int mid = left + (right - left) * (findVal - arr[left]) / (arr[right] - arr[left]);

        //如果查找的值比mid大，向右递归，此时数组是从小到大排序的
        if (findVal > arr[mid]) {
            return insertSearch(arr, mid + 1, right, findVal);
        } else if (findVal < arr[mid]) {
            return insertSearch(arr, left, mid - 1, findVal);
        } else {
            return mid;
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 33, 443, 3223, 3223, 3223, 3223};
        System.out.println(insertSearch(arr, 0, arr.length - 1, 3223));
    }
}
