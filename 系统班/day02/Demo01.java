import java.util.Scanner;
class Demo01  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¼������������");
		System.out.println("���ֵΪ��" + getMax(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		
		System.out.println("¼��һ����������");
		System.out.println(judge(sc.nextInt()));

	}
	//��ϰ1: ����¼�������������ֵ
	public static int getMax(int num1,int num2,int num3){
		int max = num1 > num2 ? num1:num2;
		return max>num3?max:num3;
	}
	//����¼��һ����,�ж���ż
	public static String judge(int num){
		return num%2==0?"ż��":"����";
	}
}
