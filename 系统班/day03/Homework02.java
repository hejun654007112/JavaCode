/*
	求1-100能被3整除但是不能被7整除的数的和, 使用while循环实现
*/
class Homework02 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while(i <= 100){
			if(i%3 == 0 && i%7 != 0){
				sum += i;
				//System.out.println(i);
			}
			i++;
		}
		System.out.println("1-100能被3整除但是不能被7整除的数的和:"+ sum);
	}
}
