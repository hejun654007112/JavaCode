class Demo01 {
	//�ֱ�ʹ��forѭ����whileѭ�������������

	//����1: ʹ��whileѭ��������1-100�ۼӺ�

	//����2: ʹ��whileѭ������ӡ1-100֮�����е�ż��
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
