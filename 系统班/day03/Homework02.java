/*
	��1-100�ܱ�3�������ǲ��ܱ�7���������ĺ�, ʹ��whileѭ��ʵ��
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
		System.out.println("1-100�ܱ�3�������ǲ��ܱ�7���������ĺ�:"+ sum);
	}
}
