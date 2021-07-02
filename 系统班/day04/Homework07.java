/*
	7、分析以下需求，并用代码实现：
	(1)按照从大到小的顺序输出四位数中的个位+百位=十位+千位(3553,2332,1166,8228,3773)的数字及个数
	(2)每行输出5个满足条件的数，之间用空格分隔
	(3)如：9999 9988 9977 9966 9955 
*/
class Homework07 {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 9999; i >= 1000;i--){
			if(judge(i)){
				System.out.print(i +"\t");
				count++;
				if(count % 5 == 0){
					System.out.println("");
					
				}
			}
		}
		System.out.println("共有：" + count + "个");
	}

	public static boolean judge(int num){
		if(num >= 1000 && num < 10000){
			int unit = num % 10;
			int ten = num / 10 % 10;
			int hundred = num / 100 % 10;
			int thousand = num / 1000;
			if(unit + hundred  == ten + thousand )
				return true;
		}
		return false;
	}
}
