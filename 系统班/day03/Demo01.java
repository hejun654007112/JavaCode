class Demo01 {
	//分别使用for循环和while循环完成下列需求：

	//需求1: 使用while循环语句计算1-100累加和

	//需求2: 使用while循环语句打印1-100之间所有的偶数
	public static void main(String[] args) {
		int sum1 = 0;
		for(int i = 1;i<=100;i++){
			sum1 += i;
		}
		System.out.println(sum1);

		int j = 1;
		int sum2 = 0;
		while(j <= 100){
			sum2 += j;
			j++;
		}
		System.out.println(sum2);

		for(int i = 2;i<=100;i+=2){
			System.out.print(i + " ");
		}
		System.out.println();p
		System.out.println("-----------------------------------------------");
		int k = 2;
		while(k<=100){
			System.out.print(k + " ");
			k += 2;
		}
		System.out.println();
	}
}
