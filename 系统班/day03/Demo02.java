class Demo02 {
	/*
		1��ʹ��Ƕ��ѭ��,��ӡ�����������Ǿ���
			*****
			*****
			*****
			*****
	*/
	public static void main(String[] args) {
		for(int i = 0 ;i < 4;i++){
			for(int j = 0;j < 5;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		2��ʹ��Ƕ��ѭ��,��ӡ5��5�е�ֱ��������
			*
			**
			***
			****
			*****
		*/

		for(int i = 0 ;i < 5;i++){
			for(int j = 0;j <= i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		3����ӡ99�˷���
			1*1=1
			1*2=2 2*2=4
			1*3=3 2*3=6	3*3=9
			....................................
			1*9=9 2*9=18 3*9=27 .......... 8*9=72 9*9=81
		*/
		for(int i = 1 ;i < 10;i++){
			for(int j = 1;j <= i;j++){
				System.out.print(j + "x" + i +"="+(i*j) + "\t");
			}
			System.out.println();
		}
		
	}
}
