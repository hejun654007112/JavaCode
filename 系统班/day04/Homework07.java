/*
	7�������������󣬲��ô���ʵ�֣�
	(1)���մӴ�С��˳�������λ���еĸ�λ+��λ=ʮλ+ǧλ(3553,2332,1166,8228,3773)�����ּ�����
	(2)ÿ�����5����������������֮���ÿո�ָ�
	(3)�磺9999 9988 9977 9966 9955 
*/
class Homework07 {
	public static void main(String[] args) {
		int count = 0;
		for(int i = 9999; i >= 1000;i--){
			if(judge(i)){
				System.out.print(i +"\t");
				count++;
				if(count % 5 == 0){
					System.out.println("");
					
				}
			}
		}
		System.out.println("���У�" + count + "��");
	}

	public static boolean judge(int num){
		if(num >= 1000 && num < 10000){
			int unit = num % 10;
			int ten = num / 10 % 10;
			int hundred = num / 100 % 10;
			int thousand = num / 1000;
			if(unit + hundred  == ten + thousand )
				return true;
		}
		return false;
	}
}
