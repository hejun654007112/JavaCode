import java.util.Scanner;
/*
	����һ������getMax�����Ի�ȡ���������Ľϴ�ֵ
	���������У�����¼���������������÷�����ȡ�������ֵ
*/
class Demo05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������:");
		int num1 = sc.nextInt();
		System.out.println("������ڶ�������:");
		int num2 = sc.nextInt();
		System.out.println("���ֵ�ǣ�" + getMax(num1,num2));
	}

	public static int getMax(int num1,int num2){
		return num1>num2?num1:num2;
	}
}
