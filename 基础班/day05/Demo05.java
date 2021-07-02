import java.util.Scanner;
/*
	定义一个方法getMax，可以获取两个整数的较大值
	在主方法中，键盘录入两个整数，调用方法获取两者最大值
*/
class Demo05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个整数:");
		int num2 = sc.nextInt();
		System.out.println("最大值是：" + getMax(num1,num2));
	}

	public static int getMax(int num1,int num2){
		return num1>num2?num1:num2;
	}
}
