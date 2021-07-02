import java.util.Scanner;
class day04_homwork4 {
	/*
		4、分析以下需求，并用代码实现：
		(1)根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过键盘录入
		(2)涨工资的条件如下：
			[10-15)     +5000
			[5-10)      +2500
			[3~5)       +1000
			[1~3)       +500
			[0~1)       +200
		(3)如果用户输入的工龄为10，基本工资为3000，程序运行后打印格式
			"您目前工作了10年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元"
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("请您的基本工资：");
		int basicSalary = sc.nextInt();
		System.out.println("请您的工龄：");
		int workAge = sc.nextInt();
		
		int increaseSalary = 0;
		int afterSalary = 0;

		if(workAge >= 0 && workAge < 1){
			increaseSalary = 200;
			
		}else if(workAge >= 1 && workAge < 3){
			increaseSalary = 500;
		}else if(workAge >= 3 && workAge < 5){
			increaseSalary = 1000;
		}else if(workAge >= 5 && workAge < 10){
			increaseSalary = 2500;
		}else if(workAge >= 10 && workAge < 15){
			increaseSalary = 5000;
		}
		
		afterSalary = basicSalary + increaseSalary;

		System.out.println("您目前工作了"+workAge+"年，基本工资为 "+basicSalary+"元,应涨工资 "+increaseSalary+"元,涨后工资 "+afterSalary+"元");
	}
}
