/*
	4、分析以下需求，并用代码实现：(封装成方法)
	(1)打印1到100之内的整数，但数字中包含m的要跳过
	(2)每行输出n个满足条件的数，之间用空格分隔
	(3)如：
		1 2 3 4  5
		6 7 8 10 11
*/
class Homework04 {
	public static void main(String[] args) {
		print(5,5);
	}

	public static void print(int m,int n) {
		int count = 0;
		for(int i = 1;i<= 100;i++){
			if(i % 10 != m && i / 10 != m){
				System.out.print(i+"   ");
				count++;
				if(count  == n){
					System.out.println();
					count = 0;
				}
				
			}
			
		}
			
	}

}
