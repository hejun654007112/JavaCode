import java.util.Scanner;
class Demo01 {
	/*
	猜数字小游戏案例:系统产生一个1-100之间的随机数，通过键盘录入要猜测的数字，请猜出这个数是多少，一共10次机会。
	猜大了就提示"大了"之后继续猜，猜小了就提示"小了"之后继续猜,猜对了就提示"对了"，之后结束猜测。
	最后输出打印一共猜了几次。
	*/
	public static void main(String[] args) {
		int random = (int)(Math.random()*100 + 1);
		Scanner sc = new Scanner(System.in);
		

		for(int i = 1; i <= 10;i++){
			System.out.println("请猜出这个数是多少:");
			int num = sc.nextInt();
			if(num == random){
				System.out.println("恭喜你猜对了，共猜了" + i + "次");
				break;
			}else if(num < random && num >= 1){
				System.out.println("小了");
			}else if(num > random && num < 100){
				System.out.println("大了");
			}else{
				System.out.println("1-100之间的随机数");
				continue;
			}
			if(i == 10){
				System.out.println("10次机会已用完");
			}
		}


	}
}
