import java.util.Scanner;
/*
	7、定义一个方法getMax，可以获取两个整数的较大值。
		在主方法中，键盘录入两个整数，调用方法获取两者最大值

	8、定义一个方法isEqual，可以判断两个小数是否相等。
		在主方法中，键盘录入两个整数，自动提升为小数，调用方法比较两者是否相等

	9、定义一个方法，可以打印指定行数和列数的矩形。
		在主方法中，键盘录入两个整数，作为行数和列数，调用方法打印对应规模的矩形
*/
class Homework07_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("录入两个整数,获取两者最大值");
		System.out.println("两者最大值:" + getMax(sc.nextInt(),sc.nextInt()));

		System.out.println("录入两个整数,自动提升为小数，比较两者是否相等");
		System.out.println("是否相等:" + isEqual(sc.nextInt(),sc.nextInt()));

		System.out.println("录入两个整数，作为行数和列数,打印对应规模的矩形");
		printRectangle(sc.nextInt(),sc.nextInt());
	
	}

	public static int getMax(int num1,int num2){
		return num1 > num2 ? num1:num2;
	}

	public static boolean isEqual(double num1,double num2){
		return num1 == num2 ;
	}

	public static void printRectangle(int row,int col){
		for(int i = 1;i <= row;i++){
			for(int j = 1;j<= col;j++){
				System.out.print("☆");
			}
			System.out.println();
		}
	}
}
