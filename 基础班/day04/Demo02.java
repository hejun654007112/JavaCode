class Demo02 {
	/*
		1����ӡ����1-5
		2����ӡ����5-1
		3������1-100�ĺ�
		4������1-100��ż����
		5������1-10�ĳ˻�
		6����ӡ1-100�е�����
		ʹ��whileѭ����ͳ��ˮ�ɻ�������
		ˮ�ɻ�������ָһ����λ�����������֮�����͵��ڸ���
		����1^3 + 5^3 + 3^3 = 153
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
		System.out.println("1-100�����ֺ�Ϊ��" + sum1);

		int sum2 = 0;
		for(int i = 1 ; i < 101 ; i++){
			if(i % 2 == 0){
				sum2 += i;
			}
		}
		System.out.println("1-100��ż����Ϊ��" + sum2);

		int result = 1;
		for(int i = 1 ; i < 11 ; i++){
			result *= i;
		}
		System.out.println("1-10�ĳ˻�Ϊ��" + result);
		
		System.out.println("1-100�������У�" );
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
