class Demo02 {
	/*
		1、打印数字1-5
		2、打印数字5-1
		3、计算1-100的和
		4、计算1-100的偶数和
		5、计算1-10的乘积
		6、打印1-100中的奇数
		使用while循环，统计水仙花数个数
		水仙花数：特指一种三位数，其各个数之立方和等于该数
		例如1^3 + 5^3 + 3^3 = 153
	*/
	public static void main(String[] args) {
		
		for(int i = 1 ; i < 6 ; i++){
			System.out.println(i);
		}

		System.out.println("----------");

		for(int i = 5 ; i > 0 ; i--){
			System.out.println(i);
		}
		
		int sum1 = 0;
		for(int i = 1 ; i < 101 ; i++){
			 sum1 += i;
		}
		System.out.println("1-100的数字和为：" + sum1);

		int sum2 = 0;
		for(int i = 1 ; i < 101 ; i++){
			if(i % 2 == 0){
				sum2 += i;
			}
		}
		System.out.println("1-100的偶数和为：" + sum2);

		int result = 1;
		for(int i = 1 ; i < 11 ; i++){
			result *= i;
		}
		System.out.println("1-10的乘积为：" + result);
		
		System.out.println("1-100的奇数有：" );
		for(int i = 1 ; i < 101 ; i++){
			if(i % 2 != 0){
				System.out.print( i + "\t" );
			}
		}

		int num = 100;
		while(num < 1000){
			int unit = num % 10;
			int ten = num / 10 % 10;
			int hunder = num / 100;
			if((unit*unit*unit + ten*ten*ten + hunder*hunder*hunder) == num){
				System.out.println( num );
			}
			num++;
		}
	
	}
}
