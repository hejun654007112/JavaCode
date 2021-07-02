/*
	1、一球从100米高度自由落下，每次落地后反跳回原高度的一半；
		再落下，求它第10次落地时，共经过多少米？第10次反弹多高？
*/
class Homework01 {
	public static void main(String[] args) {
		//定义sum记录小球运动的总距离
		double sum = 0;
		//落地高度初始化为100
		double fallHeight = 100;
		//反弹高度
		double reboundHeight = 0;
		//反弹次数
		int count = 0;
		while(count < 10){
			reboundHeight = fallHeight / 2;
			if(count != 9){
				sum += fallHeight + reboundHeight;
			}else{
				sum += fallHeight;
			}
			fallHeight = reboundHeight;
			count ++; 
			//System.out.println(reboundHeight);
		}
		System.out.println("第10次落地时,共经过"+ sum+"米\n"+"第10次反弹" + reboundHeight + "米");
	}
}
