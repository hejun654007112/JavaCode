/*
	6�������������󣬲��ô���ʵ�֣�
	(1)����һ��int���͵�һά���飬����Ϊ{6,2,9,15,1,5,20,7,18}
	(2)���������Ԫ�������һλԪ�ؽ��н���,��СԪ�����һλԪ�ؽ��н���������ӡ����
	��ʾ˼·���Ȳ������ֵ����Сֵ���ֵ�������
*/
class Homework06 {
	public static void main(String[] args) {
		int[] arr = {6,2,9,15,1,5,20,7,18};
		int maxIndex = getMaxIndex(arr);
		int minIndex = getMinIndex(arr);
		//���������Ԫ�������һλԪ�ؽ��н���,
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[arr.length - 1]; 
		arr[arr.length - 1] = temp;
		//��СԪ�����һλԪ�ؽ��н���
		temp = arr[minIndex];
		arr[minIndex] = arr[0]; 
		arr[0] = temp;
		//
		printArray(arr);
	}
	
	//��ȡ�������ֵ����
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

	//��ȡ������Сֵ����
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

	//��ӡ
	public static void printArray(int[] arr) {
		for(int item:arr){
			System.out.print(item+"  ");
		}
		System.out.println();	
	}
}
