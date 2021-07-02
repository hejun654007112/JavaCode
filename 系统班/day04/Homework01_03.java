/*
	1����һά����ı�������װ�ɷ���
	2����һά����������ֵ����װ�ɷ���
	3����һά����ķ�ת����װ�ɷ���
*/
class Homework01_03 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,8,7};
		printArray(arr);
		System.out.println("���ֵ��" +getMaxFromArray(arr) );
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
