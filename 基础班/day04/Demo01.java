import java.util.Scanner;
/*
	1������¼��һ�������������������ż����������
	2������¼������������������������ĺ�
	3������¼���������������������������Сֵ
*/
class Demo01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("������һ��������");
		int num1 = sc.nextInt();
		System.out.println(num1 + "�ǣ�" +(num1 % 2 == 0? "ż��":"����"));
		
		System.out.println("����������������");
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println(num2 + "+" + num3  + "=" + (num2 + num3));
		
		System.out.println("����������������");
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		int num6 = sc.nextInt();
		int temp = num4 > num5 ? num5:num4;
		int min = temp > num6 ? num6:temp;
		System.out.println(num4 +" " + num5 +" " +num6 +"����С�����ǣ�" + min);
		


	}
}
