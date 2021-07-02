import java.util.Scanner;
/*
	5、定义方法功能,根据输入的学生成绩, 验证其是否及格, 方法返回字符串结果
	 例如：键盘输入成绩59，调用方法将成绩传递给方法，返回结果："不及格"
*/
class Homework05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个的学生成绩:");
		System.out.println(checkScore(sc.nextDouble()));
	}

	public static String checkScore(double score){
		if(score <0 || score > 100){
			return "录入错误~~";
		}
		return score >= 60?"及格":"不及格";
	}
}
