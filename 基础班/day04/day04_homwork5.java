class day04_homwork5 {
	/*
		5、分析以下需求，并用代码实现：
		(1)珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.001米。
		(2)请问，我折叠多少次，可以超过珠穆朗玛峰的高度。
	*/
	public static void main(String[] args) {
		//珠穆朗玛峰高度为8848
		int height = 8848;
		//纸初始厚度为0.001
		double weight = 0.001;
		//计数器
		int count = 0;
		while(weight < height){
			count++;
			weight *= 2;
			
		}
		System.out.println("折叠"+count+"次，可以超过珠穆朗玛峰的高度");
	}
}
