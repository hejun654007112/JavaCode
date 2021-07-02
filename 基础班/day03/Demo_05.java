class Demo_05 {
	//随意定义一个四位数的变量，分别获取这个四位数上的个位 十位 百位 千位数字并输出。
	public static void main(String[] args) {
		int num = 3576;

		int unit = num % 10;
		int decade = num / 10 % 10;
		int hundreds = num / 100 % 10;
		int KiloBit = num / 1000;

		System.out.println("个位数是：" + unit );
		System.out.println("十位数是：" + decade );
		System.out.println("百位数是：" + hundreds );
		System.out.println("千位数是：" + KiloBit );
	}
}
