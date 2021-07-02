/*
	1、将一维数组的遍历，封装成方法
	2、将一维数组的求最大值，封装成方法
	3、将一维数组的反转，封装成方法
*/
class Homework01_03 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,8,7};
		printArray(arr);
		System.out.println("最大值：" +getMaxFromArray(arr) );
		reverseArray(arr);
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		for(int item:arr){
			System.out.print(item+"  ");
		}
		System.out.println();	
	}

	public static int getMaxFromArray(int[] arr) {
		int max = arr[0];
		for(int i = 0;i < arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	}

	public static void reverseArray(int[] arr) {
		for(int i = 0;i < arr.length/2; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 -i];
			arr[arr.length - 1 -i] = temp;
		}
	}
}
