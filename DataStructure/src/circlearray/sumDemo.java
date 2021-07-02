package circlearray;

import java.util.Arrays;
//两数之和
public class sumDemo {
    public static void main(String[] args) {
        int[] nums01 = {2,7,11,15};
        int target01 = 9;
        System.out.println(Arrays.toString(twoNumber(nums01,target01)));

        int[] nums02 = {3,2,4};
        int target02 = 6;
        System.out.println(Arrays.toString(twoNumber(nums02,target02)));

        int[] nums03 = {3,3};
        int target03 = 6;
        System.out.println(Arrays.toString(twoNumber(nums03,target03)));
    }

    public static int[] twoNumber(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

}
