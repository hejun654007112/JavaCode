import java.util.Scanner;
class Homework08 {
/*
	8、键盘录入一个学生的成绩，int类型的分数，根据录入的分数，输出分数等级
		[90, 100]，优秀
		[80,90)，良好
		[60, 80)，及格
		[0, 60)，不及格
	使用两种方式完成：
		1、使用if语句完成
		2、使用switch语句完成
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("录入一个学生的成绩:");

		int score = sc.nextInt();
		
		if(score >= 90 && score <= 100){
			System.out.println("优秀");
		}else if(score >= 80 && score < 90){
			System.out.println("良好");
		}else if(score >= 60 && score < 80){
			System.out.println("及格");
		}else if(score >= 0 && score < 60){
			System.out.println("不及格");
		}else{
			System.out.println("录入错误~");
		}

		switch(score / 10){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("不及格");
				break;
			case 6:
			case 7:
				System.out.println("及格");
				break;
			case 8:
				System.out.println("良好");
				break;
			case 9:
			case 10:
				System.out.println("优秀");
				break;
			default:
				System.out.println("录入错误~");
		}
	}
}
