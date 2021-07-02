/*
	4、分析以下需求，并用代码实现：
	(1)打印1到100之内的整数，但数字中包含9的要跳过
	(2)每行输出5个满足条件的数，之间用空格分隔
*/
class Homework04 {
	public static void main(String[] args) {
			int count = 0;
			for(int i = 1; i<= 100;i++){
				if( i%10 == 9 || i/10 == 9){
					continue;
				}
				System.out.print(i+"\t");
				count++;
				if(count == 5){
					System.out.println();
					count = 0;
				}
		
			}
			System.out.println();
	}
}
