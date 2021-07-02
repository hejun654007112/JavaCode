/*
	5、分析以下需求，并用代码实现：(封装成方法)
	(1)打印1-m之间的所有素数及个数
	(2)每行输出n个满足条件的数，之间用空格分隔
	注意：大于1的且只能被1和其本身整除的数叫素数。
*/
class Homework05 {
	public static void main(String[] args) {
		print(1000,5);
	}

	public static void print(int m,int n){
		//boolean flag = true;
		int count = 0;
		for(int i = 1;i<= m;i++){
			if(judge(i)){
				System.out.print(i + "\t");
				count++;
				if(count % n == 0){
					System.out.println();
				}
			}
		}
		System.out.println();
	}
	
	//判断是否为素数
	public static boolean judge(int num){
		for(int i = 2; i < num ; i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
}
