import java.util.Scanner;
class day04_homwork3 {
	/*
		3������¼��x��ֵ�������y�Ĳ������
		 x>=3		y = 2 * x + 1;
		 -1<x<3	    y = 2 * x;
		 x<=-1		y = 2 * x - 1;
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("������x��ֵ��");
		int x = sc.nextInt();
		
		if(x >= 3){
			System.out.println("y��ֵ�ǣ�" + (2 * x + 1));
		}else if(x > -1){
			System.out.println("y��ֵ�ǣ�" + (2 * x ));
		}else{
			System.out.println("y��ֵ�ǣ�" + (2 * x - 1 ));
		}
	}
}
