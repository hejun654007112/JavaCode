class Demo06 {
	/*
		定义一个方法isEqual，可以判断两个小数是否相等
		在主方法中，定义两个小数，调用方法比较两者是否相等
	*/
	public static void main(String[] args) {
		double a = 1.11111111111111111;
		double b = 1.11111111111111111;
		isEqual(a,b);
	}

	public static void isEqual(double a,double b){
		if(a == b){
			System.out.println("相等");
			return;
		}
		System.out.println("不相等");
	}
}
