import java.util.Scanner;
class Demo01 {
	/*
	������С��Ϸ����:ϵͳ����һ��1-100֮����������ͨ������¼��Ҫ�²�����֣���³�������Ƕ��٣�һ��10�λ��ᡣ
	�´��˾���ʾ"����"֮������£���С�˾���ʾ"С��"֮�������,�¶��˾���ʾ"����"��֮������²⡣
	��������ӡһ�����˼��Ρ�
	*/
	public static void main(String[] args) {
		int random = (int)(Math.random()*100 + 1);
		Scanner sc = new Scanner(System.in);
		

		for(int i = 1; i <= 10;i++){
			System.out.println("��³�������Ƕ���:");
			int num = sc.nextInt();
			if(num == random){
				System.out.println("��ϲ��¶��ˣ�������" + i + "��");
				break;
			}else if(num < random && num >= 1){
				System.out.println("С��");
			}else if(num > random && num < 100){
				System.out.println("����");
			}else{
				System.out.println("1-100֮��������");
				continue;
			}
			if(i == 10){
				System.out.println("10�λ���������");
			}
		}


	}
}
