import java.util.Scanner;
class Homework08 {
/*
	8������¼��һ��ѧ���ĳɼ���int���͵ķ���������¼��ķ�������������ȼ�
		[90, 100]������
		[80,90)������
		[60, 80)������
		[0, 60)��������
	ʹ�����ַ�ʽ��ɣ�
		1��ʹ��if������
		2��ʹ��switch������
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¼��һ��ѧ���ĳɼ�:");

		int score = sc.nextInt();
		
		if(score >= 90 && score <= 100){
			System.out.println("����");
		}else if(score >= 80 && score < 90){
			System.out.println("����");
		}else if(score >= 60 && score < 80){
			System.out.println("����");
		}else if(score >= 0 && score < 60){
			System.out.println("������");
		}else{
			System.out.println("¼�����~");
		}

		switch(score / 10){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("������");
				break;
			case 6:
			case 7:
				System.out.println("����");
				break;
			case 8:
				System.out.println("����");
				break;
			case 9:
			case 10:
				System.out.println("����");
				break;
			default:
				System.out.println("¼�����~");
		}
	}
}
