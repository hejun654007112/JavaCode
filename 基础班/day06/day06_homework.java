import java.util.Arrays;
class day06_homework {
	public static void main(String[] args) {
		int[] arr1 = {95,92,75,56,98,71,80,58,91,91};
		//1.遍历数组
		showArray(arr1);
		System.out.println();
		System.out.println();
		//2.获取数组最大值
		System.out.println(getMax(arr1));
		System.out.println();
		//3.交换数组第三个和第四个元素的位置
		swapByIndex(arr1,3,4);
		showArray(arr1);
		System.out.println();
		//反转数组
		reverseArray(arr1);
		showArray(arr1);
		System.out.println();
		//获取平均数和个数
		System.out.println("平均数是：" + getAvg(arr1)+",分数大于平均数的个数:"+getOverAvgCount(arr1));
		//判断数组是否对称
		int[] arr2 = {1,2,3,4,3,2,1};
		int[] arr3 = {1,2,3,4,5,3,2,1};
		System.out.println(Arrays.toString(arr2)+"是否对称："+sym(arr2));
		System.out.println(Arrays.toString(arr3)+"是否对称："+sym(arr3));

	}
	//1、将一维数组的遍历，封装成方法
	public static void showArray(int[] arr){
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
	//2、将一维数组的求最大值，封装成方法
	public static int getMax(int[] arr){
		int max = arr[0];
		for(int i = 0;i < arr.length;i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	//3、封装一个方法，可以交换一个指定数组的任意两个元素的位置
	public static void swapByIndex(int[] arr,int index01,int index02){
		int temp = arr[index01-1];
		arr[index01-1] = arr[index02-1];
		arr[index02-1] = temp;
	}
	//4、将一维数组的反转，封装成方法
	public static void reverseArray(int[] arr){
		for(int i = 0;i<arr.length/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length - 1-i];
			arr[arr.length - 1-i] = temp;
		}
	}
	//5.定义getAvg方法, 获取一个数组中的平均数
	public static double getAvg(int[] arr){
		double sum = 0;
		for(int i = 0;i<arr.length;i++){
			sum += arr[i];
		}
		return sum/arr.length;
	}
	//统计高于平均分的分数有多少个
	public static int getOverAvgCount(int[] arr){
		int count = 0;
		double avg = getAvg(arr);
		for(int i = 0;i<arr.length;i++){
			if(arr[i] > avg){
				count++;
			}
		}
		return count;
	}
	//6、定义sym方法,判断数组中的元素值是否对称
	public static boolean sym(int[] arr){
		for(int i = 0;i<arr.length/2;i++){
			if(arr[i] != arr[arr.length - 1-i]){
				return false;
			}
		}
		return true;
	}
}
