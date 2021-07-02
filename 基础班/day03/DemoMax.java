class DemoMax {
	public static void main(String[] args) {
		int a = 15;
		int b = 19;
		int c = 12;
		int max1 = a > b ? a:b;
		int max2 = max1 > c ? max1:c;

		System.out.println(max2);
	}
}
