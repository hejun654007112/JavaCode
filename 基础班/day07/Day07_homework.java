import java.util.Scanner;
/*
	题目：利用函数实现模块化编程的实践
	题目:仿ATM的操作
	要求: 1.利用如下方法在类中指定一个变量,作为用户的账户:
	public static double z = 0;  声明在类中,和函数是平级关系，在所有的方法中都能使用。
	2. 分别声明三个函数,用于表示存钱/取钱/查询余额 三种操作
	函数的要求如下:
	存:public static void savemoney(double money){}
	取:public static void catchmoney(double money){}
	查:public static void showmoney(){}
	3.设计用户交互:
	3.1 设计一个欢迎界面,可参考下述方式:
	*****************************************
		欢迎使用**银行ATM自动操作柜员机     
	*****************************************
	3.2 设计功能选项提示,可参考下述方式:         
	 
	请选择功能:  1.存钱 -调用存钱的方法，接受键盘录入的数字作为钱数
				 2.取钱 -调用取钱的方法，接受键盘录入的数字作为取出的钱数（判断钱是否够，不够提示余额不足不让取）
				 3.查询余额 -调用查询的方法，显示余额。
				 4.退出-停止循环，退出程序。
	3.3 结合循环,分支,函数, 实现上述功能
*/
class Day07_homework {
	public static double z = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		showMain();
		while(loop){
			System.out.println("请输入选择功能的编号：");
			int insertNum = sc.nextInt();
			switch(insertNum){
				case 1:
					System.out.println("请输入存储的金额：");
					savemoney(sc.nextDouble());
					
					break;
				case 2:
					System.out.println("请输入取出的金额：");
					catchmoney(sc.nextDouble());
					
					break;
				case 3:
					showmoney();
					break;
				case 4:
					sc.close();
					loop = false;
					break;
				default:
					System.out.println("编号错误");
					showMain();
					break;

			}
			System.out.println("~~已退出系统~~");
		}
		
	}
	//主页面
	public static void showMain(){
		System.out.println("*****************************************");
		System.out.println("      欢迎使用**银行ATM自动操作柜员机    ");
		System.out.println("*****************************************");
		System.out.println("请选择功能:");
		System.out.println("1.存钱");
		System.out.println("2.取钱");
		System.out.println("3.查询余额");
		System.out.println("4.退出");
		
	}
	//存钱
	public static void savemoney(double money){
		z += money;
		System.out.println("~~~存储成功~~~");
	}
	//取钱
	public static void catchmoney(double money){
		if(z < money ){
			System.out.println("~~您的余额不足~~");
			return;
		}
		z -= money;
		System.out.println("~~~取出成功~~~");
	}
	//查询余额
	public static void showmoney(){
		System.out.println("您的余额为：" +z+" 元" );
	}
}
