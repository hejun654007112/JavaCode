/*
	5�������������󣬲��ô���ʵ�֣�(��װ�ɷ���)
	(1)��ӡ1-m֮�����������������
	(2)ÿ�����n����������������֮���ÿո�ָ�
	ע�⣺����1����ֻ�ܱ�1���䱾������������������
*/
class Homework05 {
	public static void main(String[] args) {
		print(1000,5);
	}

	public static void print(int m,int n){
		//boolean flag = true;
		int count = 0;
		for(int i = 1;i<= m;i++){
			if(judge(i)){
				System.out.print(i + "\t");
				count++;
				if(count % n == 0){
					System.out.println();
				}
			}
		}
		System.out.println();
	}
	
	//�ж��Ƿ�Ϊ����
	public static boolean judge(int num){
		for(int i = 2; i < num ; i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
}
