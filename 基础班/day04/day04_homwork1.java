import java.util.Scanner;
class day04_homwork1 {
	//1��ͨ������¼�����ֻ�����, ��ͨ������¼����Ҫ������ֻ�����
	//	 ���������㹻, �������ɹ�, ����ʾ�ֻ�ʣ������
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ʣ���ֻ�������");
		int  inventory = sc.nextInt();
		
		System.out.println("������Ҫ�����ֻ�������");
		int num = sc.nextInt();

		if(num <= inventory){
			System.out.println("����ɹ�,ʣ���ֻ�������" + (inventory - num));
		}else if(num > inventory){
			System.out.println("��������㣬�޷�����");
		}else{
			System.out.println("�������");
		}
		
	}
}
