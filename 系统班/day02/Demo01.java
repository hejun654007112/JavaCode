import java.util.Scanner;
class Demo01  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("录入三个整数：");
		System.out.println("最大值为：" + getMax(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		
		System.out.println("录入一个个整数：");
		System.out.println(judge(sc.nextInt()));

	}
	//练习1: 键盘录入三整数求最大值
	public static int getMax(int num1,int num2,int num3){
		int max = num1 > num2 ? num1:num2;
		return max>num3?max:num3;
	}
	//键盘录入一整数,判断奇偶
	public static String judge(int num){
		return num%2==0?"偶数":"奇数";
	}
}
