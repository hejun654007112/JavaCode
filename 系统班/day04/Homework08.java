/*
	8、定义一个方法，能打印制定行和列的星星矩阵
*/
class Homework08 {
	public static void main(String[] args) {
		printStar(10,5);
	}

	public static void printStar(int row,int col){
		for(int i = 1;i <= row;i++){
			for(int j = 1;j<= col;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
