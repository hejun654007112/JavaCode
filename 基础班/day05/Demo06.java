class Demo06 {
	/*
		����һ������isEqual�������ж�����С���Ƿ����
		���������У���������С�������÷����Ƚ������Ƿ����
	*/
	public static void main(String[] args) {
		double a = 1.11111111111111111;
		double b = 1.11111111111111111;
		isEqual(a,b);
	}

	public static void isEqual(double a,double b){
		if(a == b){
			System.out.println("���");
			return;
		}
		System.out.println("�����");
	}
}
