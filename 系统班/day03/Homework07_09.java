import java.util.Scanner;
/*
	7������һ������getMax�����Ի�ȡ���������Ľϴ�ֵ��
		���������У�����¼���������������÷�����ȡ�������ֵ

	8������һ������isEqual�������ж�����С���Ƿ���ȡ�
		���������У�����¼�������������Զ�����ΪС�������÷����Ƚ������Ƿ����

	9������һ�����������Դ�ӡָ�������������ľ��Ρ�
		���������У�����¼��������������Ϊ���������������÷�����ӡ��Ӧ��ģ�ľ���
*/
class Homework07_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¼����������,��ȡ�������ֵ");
		System.out.println("�������ֵ:" + getMax(sc.nextInt(),sc.nextInt()));

		System.out.println("¼����������,�Զ�����ΪС�����Ƚ������Ƿ����");
		System.out.println("�Ƿ����:" + isEqual(sc.nextInt(),sc.nextInt()));

		System.out.println("¼��������������Ϊ����������,��ӡ��Ӧ��ģ�ľ���");
		printRectangle(sc.nextInt(),sc.nextInt());
	
	}

	public static int getMax(int num1,int num2){
		return num1 > num2 ? num1:num2;
	}

	public static boolean isEqual(double num1,double num2){
		return num1 == num2 ;
	}

	public static void printRectangle(int row,int col){
		for(int i = 1;i <= row;i++){
			for(int j = 1;j<= col;j++){
				System.out.print("��");
			}
			System.out.println();
		}
	}
}
