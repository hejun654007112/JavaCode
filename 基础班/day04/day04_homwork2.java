import java.util.Scanner;
class day04_homwork2 {
	/*
		模拟用户登录
		正确的用户名是123，密码是987
		提示用户录入用户名和密码，进行判断，如果录入正确就提示“登录成功”；并结束录入
		如果录入错误就提示“登录失败，请重新录入”
		一共三次机会，如果三次机会用完则自动停止
	*/
	public static void main(String[] args) {
		int userName = 123;
		int password = 987;

		Scanner sc = new Scanner(System.in);

		for(int i = 3 ; i > 0; i--){
			System.out.println("请输入用户名：");
			int getName = sc.nextInt();
			System.out.println("请输入密码：");
			int getPassword = sc.nextInt();

			if(getName == userName && getPassword == password){
				System.out.println("登录成功");
				break;
			}else{
				System.out.println("登录失败，请重新录入");
			}
		
		}

		
	}
}
