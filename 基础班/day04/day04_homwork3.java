import java.util.Scanner;
class day04_homwork3 {
	/*
		3、键盘录入x的值，计算出y的并输出。
		 x>=3		y = 2 * x + 1;
		 -1<x<3	    y = 2 * x;
		 x<=-1		y = 2 * x - 1;
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("请输入x的值：");
		int x = sc.nextInt();
		
		if(x >= 3){
			System.out.println("y的值是：" + (2 * x + 1));
		}else if(x > -1){
			System.out.println("y的值是：" + (2 * x ));
		}else{
			System.out.println("y的值是：" + (2 * x - 1 ));
		}
	}
}
