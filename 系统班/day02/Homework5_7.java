import java.util.Scanner;
class Homework5_7 {
	/*
		5������¼��һ���·�,�������·ݶ�Ӧ�ļ��ڡ�
			345���Ǵ���,678���ļ�,9��10��11�＾,12��1��2����,��������,û���κμ���,��ʾ¼�����
		6��x = 2;
			switch(x){ 
			case 1:
				System.out.println(1);
			//���⿪ʼִ��
			case 2:
			case 3:
				System.out.println(3); 
			case 4:
				 System.out.println(4);		 
			//�Ҵ����Ž���					 
			}
			��������ӡ  3
						  4
		7��(1) y=4
		   (2) y=6
		   (3) c
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��¼��һ���·ݣ�");
		int num = sc.nextInt();
		switch(num){
			case 12:
			case 1:
			case 2:
				System.out.println(num + "���Ƕ���");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(num + "���Ǵ���");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(num + "�����ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(num + "�����＾");
				break;
			default:
				System.out.println("¼�����~~");
		}
		
	}
}
