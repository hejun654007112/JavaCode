import java.util.Scanner;
class day05_homework {
	//1、编写一个方法，能够将一个字符串进行反转
	public static void main(String[] args) {

		//测试字符串进行反转
		String str = "abcdefghijk";
		System.out.println("字符串进行反转后：" + reverseStr(str));
		System.out.println();

		//测试返回一个[20,40]范围内的随机数
		System.out.println("返回一个[20,40]范围内的随机数：" +getRandom() );
		System.out.println();


		//测试猜数字游戏
		numberGuessingGame(getRandom(),10);
	}

	//1、编写一个方法，能够将一个字符串进行反转
	public static String reverseStr(String str){
		String newStr = "";
		for(int i = str.length()- 1;i >= 0;i--){
				newStr += str.charAt(i);
		}
		return newStr;
	}

	//编写一个方法，能够返回一个[20,40]范围内的随机数
	public static int getRandom(){
		
		return (int)(Math.random()*21 + 20);
	}

	/*
		3、利用题目2中定义的方法获取一个随机数，实现猜数字游戏，
			共给玩家10次机会，若第一次就猜对了，显示‘您真是个天才’，
			若10也没猜对，显示“您太笨了，下次努力吧！”,
			若是第2-10次猜对了，只简单的显示：“恭喜您猜对了”。
		要求	《1》每次猜测前提示用户还有几次机会。10 ,9,8,7,6,5,4,3,2,1
				《2》若第10次猜完了也没猜对，就不用显示太大了或太小了。
				《3》统计玩家一共猜了多少次猜对
	*/
	public static void numberGuessingGame(int random,int chance){
		System.out.println("~~~~~~~猜数字游戏,[20,40]范围内的随机数~~~~~~~~" );
		Scanner sc = new Scanner(System.in);
		int restChance = chance;
		for(int i = 1;i <= chance;i++){
			System.out.println("你还有"+restChance+"次机会，请输入您猜测的数字：" );
			int num = sc.nextInt();
			restChance--;
			if(num == random){
				if(i == 1){
					System.out.println("您真是个天才,第一次就猜对了" );
				}else{
					System.out.println("恭喜您猜对了，共猜了" + i +"次" );
				}	
				break;
			}else if(i == chance){
				System.out.println("您太笨了，下次努力吧！" );
				break;
			}else if(num > random ){
				System.out.println("太大了" );
			}else if(num < random ){
				System.out.println("太小了" );
			}else{
				System.out.println("仔细阅读题目哦~~~" );
			}
		}
	}
}
