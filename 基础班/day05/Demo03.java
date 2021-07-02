import java.lang.StringBuilder;


class Demo03 {
	public static void main(String[] args) {
		String str = "fdkjgkjdslfoirjfaoij234fgd23234pgfh";
		String newStr = "";
		for(int i = str.length() -1;i >= 0 ;i--){
			newStr += str.charAt(i);
			
		}
		System.out.println(newStr);

		StringBuilder s = new StringBuilder(str);
		System.out.println(s.reverse());
	}
}
