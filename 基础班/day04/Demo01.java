import java.util.Scanner;
/*
	1、键盘录入一个整数，输出该数字是偶数还是奇数
	2、键盘录入两个整数，求出两个整数的和
	3、键盘录入三个整数，求出三个整数的最小值
*/
class Demo01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个整数：");
		int num1 = sc.nextInt();
		System.out.println(num1 + "是：" +(num1 % 2 == 0? "偶数":"奇数"));
		
		System.out.println("请输入两个整数：");
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println(num2 + "+" + num3  + "=" + (num2 + num3));
		
		System.out.println("请输入三个整数：");
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		int num6 = sc.nextInt();
		int temp = num4 > num5 ? num5:num4;
		int min = temp > num6 ? num6:temp;
		System.out.println(num4 +" " + num5 +" " +num6 +"中最小的数是：" + min);
		


	}
}
