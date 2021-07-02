class Demo04 {
	
	public static void main(String[] args) {
		String str = "aaa bbb ccc";
		String newStr = "";
		for(int i = 0;i < str.length() ;i++){
			if(str.charAt(i) == ' ' ){
				continue;
			}
			newStr += str.charAt(i);
			
		}
		System.out.println(newStr);
	}
}
