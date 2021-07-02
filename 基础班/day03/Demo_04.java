class Demo_04 {
	public static void main(String[] args) {
		int i = 2; 
		int j = 3;
		int x = (--i) + (i++) * (j--) - (--j) + (j++) % (++i);
		System.out.printf("i = %d,j = %d,x = %d\n",i,j,x);
	}
}
