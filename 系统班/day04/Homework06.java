/*
	6、分析以下需求，并用代码实现：
	(1)定义一个int类型的一维数组，内容为{6,2,9,15,1,5,20,7,18}
	(2)将数组最大元素与最后一位元素进行交换,最小元素与第一位元素进行交换，并打印数组
	提示思路：先查找最大值和最小值出现的索引。
*/
class Homework06 {
	public static void main(String[] args) {
		int[] arr = {6,2,9,15,1,5,20,7,18};
		int maxIndex = getMaxIndex(arr);
		int minIndex = getMinIndex(arr);
		//将数组最大元素与最后一位元素进行交换,
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[arr.length - 1]; 
		arr[arr.length - 1] = temp;
		//最小元素与第一位元素进行交换
		temp = arr[minIndex];
		arr[minIndex] = arr[0]; 
		arr[0] = temp;
		//
		printArray(arr);
	}
	
	//获取数组最大值索引
	public static int getMaxIndex(int[] array){
		int max = array[0];
		int index = 0;
		for(int i = 0;i < array.length ; i++){
			if(array[i] > max){
				max = array[i];
				index = i;
			}
		}
		return index;
	}

	//获取数组最小值索引
	public static int getMinIndex(int[] array){
		int min = array[0];
		int index = 0;
		for(int i = 0;i < array.length ; i++){
			if(array[i] < min){
				min = array[i];
				index = i;
			}
		}
		return index;
	}

	//打印
	public static void printArray(int[] arr) {
		for(int item:arr){
			System.out.print(item+"  ");
		}
		System.out.println();	
	}
}
