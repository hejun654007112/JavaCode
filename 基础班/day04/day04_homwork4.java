import java.util.Scanner;
class day04_homwork4 {
	/*
		4�������������󣬲��ô���ʵ�֣�
		(1)���ݹ���(����)��Ա���ǹ���(����),����ͻ�������ͨ������¼��
		(2)�ǹ��ʵ��������£�
			[10-15)     +5000
			[5-10)      +2500
			[3~5)       +1000
			[1~3)       +500
			[0~1)       +200
		(3)����û�����Ĺ���Ϊ10����������Ϊ3000���������к��ӡ��ʽ
			"��Ŀǰ������10�꣬��������Ϊ 3000Ԫ, Ӧ�ǹ��� 5000Ԫ,�Ǻ��� 8000Ԫ"
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("�����Ļ������ʣ�");
		int basicSalary = sc.nextInt();
		System.out.println("�����Ĺ��䣺");
		int workAge = sc.nextInt();
		
		int increaseSalary = 0;
		int afterSalary = 0;

		if(workAge >= 0 && workAge < 1){
			increaseSalary = 200;
			
		}else if(workAge >= 1 && workAge < 3){
			increaseSalary = 500;
		}else if(workAge >= 3 && workAge < 5){
			increaseSalary = 1000;
		}else if(workAge >= 5 && workAge < 10){
			increaseSalary = 2500;
		}else if(workAge >= 10 && workAge < 15){
			increaseSalary = 5000;
		}
		
		afterSalary = basicSalary + increaseSalary;

		System.out.println("��Ŀǰ������"+workAge+"�꣬��������Ϊ "+basicSalary+"Ԫ,Ӧ�ǹ��� "+increaseSalary+"Ԫ,�Ǻ��� "+afterSalary+"Ԫ");
	}
}
