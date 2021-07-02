import java.util.Scanner;
/*
	6、【分支结构和方法的练习】编写程序，设计出一个计算平面图形面积的功能，
		通过键盘输入数字选择不同的图形
		(1 矩形  2三角形  3圆形  4退出系统),再通过键盘输入对应的计算条件,
		计算出对应图形的面积，选择4退出程序。效果如下：
		注意 : 
		矩形需要输入长和宽, 面积公式 : 长 * 宽
		三角形需要输入底和高,面积公式 : (底*高)/2
		圆形需要输入半径r, 面积公式 : 3.14 * r * r

*/
class Homework06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("输入数字选择不同的图形  1矩形  2三角形  3圆形  4退出系统");
			double area = 0;
			switch(sc.nextInt()){
			case 1:
				System.out.println("分别录入矩形的长和宽：");
				area =rectangle(sc.nextDouble(),sc.nextDouble());
				break;
			case 2:
				System.out.println("分别录入三角形的底和高：");
				area =triangle(sc.nextDouble(),sc.nextDouble());
				break;
			case 3:
				System.out.println("录入圆形的半径：");
				area =circle(sc.nextDouble());
				break;
			case 4:
				System.exit(0);
			}
			System.out.println("面积是：" + area);
		}
		
	}
	public static double rectangle(double l,double w){
		if(l <= 0 || w<= 0){
			return 0;
		}
		return l*w;
	}
	public static double triangle(double b,double h){
		if(b <= 0 || h <= 0){
			return 0;
		}
		return (b*h)/2;
	}
	public static double circle(double r){
		if(r <= 0){
			return 0;
		}
		return 3.14*r*r;
	}
}
