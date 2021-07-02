import java.util.Arrays;
class day06_homework {
	public static void main(String[] args) {
		int[] arr1 = {95,92,75,56,98,71,80,58,91,91};
		//1.��������
		showArray(arr1);
		System.out.println();
		System.out.println();
		//2.��ȡ�������ֵ
		System.out.println(getMax(arr1));
		System.out.println();
		//3.��������������͵��ĸ�Ԫ�ص�λ��
		swapByIndex(arr1,3,4);
		showArray(arr1);
		System.out.println();
		//��ת����
		reverseArray(arr1);
		showArray(arr1);
		System.out.println();
		//��ȡƽ�����͸���
		System.out.println("ƽ�����ǣ�" + getAvg(arr1)+",��������ƽ�����ĸ���:"+getOverAvgCount(arr1));
		//�ж������Ƿ�Գ�
		int[] arr2 = {1,2,3,4,3,2,1};
		int[] arr3 = {1,2,3,4,5,3,2,1};
		System.out.println(Arrays.toString(arr2)+"�Ƿ�Գƣ�"+sym(arr2));
		System.out.println(Arrays.toString(arr3)+"�Ƿ�Գƣ�"+sym(arr3));

	}
	//1����һά����ı�������װ�ɷ���
	public static void showArray(int[] arr){
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
	//2����һά����������ֵ����װ�ɷ���
	public static int getMax(int[] arr){
		int max = arr[0];
		for(int i = 0;i < arr.length;i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	//3����װһ�����������Խ���һ��ָ���������������Ԫ�ص�λ��
	public static void swapByIndex(int[] arr,int index01,int index02){
		int temp = arr[index01-1];
		arr[index01-1] = arr[index02-1];
		arr[index02-1] = temp;
	}
	//4����һά����ķ�ת����װ�ɷ���
	public static void reverseArray(int[] arr){
		for(int i = 0;i<arr.length/2;i++){
			int temp = arr[i];
			arr[i] = arr[arr.length - 1-i];
			arr[arr.length - 1-i] = temp;
		}
	}
	//5.����getAvg����, ��ȡһ�������е�ƽ����
	public static double getAvg(int[] arr){
		double sum = 0;
		for(int i = 0;i<arr.length;i++){
			sum += arr[i];
		}
		return sum/arr.length;
	}
	//ͳ�Ƹ���ƽ���ֵķ����ж��ٸ�
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
	//6������sym����,�ж������е�Ԫ��ֵ�Ƿ�Գ�
	public static boolean sym(int[] arr){
		for(int i = 0;i<arr.length/2;i++){
			if(arr[i] != arr[arr.length - 1-i]){
				return false;
			}
		}
		return true;
	}
}
