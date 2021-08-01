package search;

/**
 * 线性查找
 */
public class SeqSearch {
    public static void main(String[] args) {
        int[] arr = {-12, -24, -91, 52, 67, 70, 890,0};

        System.out.println(seqSearch(arr,6));
    }

    public static int seqSearch(int[] arr,int findVal){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findVal){
                return i;
            }
        }
        return -1;
    }
}
