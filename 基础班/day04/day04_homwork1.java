import java.util.Scanner;
class day04_homwork1 {
	//1、通过键盘录入库存手机数量, 再通过键盘录入需要购买的手机数量
	//	 如果库存量足够, 输出购买成功, 并显示手机剩余数量
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入剩余手机数量：");
		int  inventory = sc.nextInt();
		
		System.out.println("请输入要购买手机数量：");
		int num = sc.nextInt();

		if(num <= inventory){
			System.out.println("购买成功,剩余手机数量：" + (inventory - num));
		}else if(num > inventory){
			System.out.println("库存量不足，无法购买");
		}else{
			System.out.println("输入错误");
		}
		
	}
}
