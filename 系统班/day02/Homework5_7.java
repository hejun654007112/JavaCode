import java.util.Scanner;
class Homework5_7 {
	/*
		5、键盘录入一个月份,输出这个月份对应的季节。
			345月是春季,678是夏季,9、10、11秋季,12、1、2冬季,其他数字,没有任何季节,提示录入错误
		6、x = 2;
			switch(x){ 
			case 1:
				System.out.println(1);
			//从这开始执行
			case 2:
			case 3:
				System.out.println(3); 
			case 4:
				 System.out.println(4);		 
			//右大括号结束					 
			}
			结果输出打印  3
						  4
		7、(1) y=4
		   (2) y=6
		   (3) c
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请录入一个月份：");
		int num = sc.nextInt();
		switch(num){
			case 12:
			case 1:
			case 2:
				System.out.println(num + "月是冬季");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(num + "月是春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(num + "月是夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(num + "月是秋季");
				break;
			default:
				System.out.println("录入错误~~");
		}
		
	}
}
