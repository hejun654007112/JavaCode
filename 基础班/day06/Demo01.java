class Demo01 {
	public static void main(String[] args) {
		//����һ�����飬��ȡ�����е���Сֵ
		int[] arr = new int[99999];

		for(int i = 0;i < arr.length;i++){
			arr[i] = (int)(Math.random()*300);
		}
		
		
		for(int i = 0;i < arr.length;i++){
			if(arr[i] <= 50){
				System.out.println(arr[i]);
			}
		}
	
		
	}
}
