/*
	4�������������󣬲��ô���ʵ�֣�(��װ�ɷ���)
	(1)��ӡ1��100֮�ڵ��������������а���m��Ҫ����
	(2)ÿ�����n����������������֮���ÿո�ָ�
	(3)�磺
		1 2 3 4  5
		6 7 8 10 11
*/
class Homework04 {
	public static void main(String[] args) {
		print(5,5);
	}

	public static void print(int m,int n) {
		int count = 0;
		for(int i = 1;i<= 100;i++){
			if(i % 10 != m && i / 10 != m){
				System.out.print(i+"   ");
				count++;
				if(count  == n){
					System.out.println();
					count = 0;
				}
				
			}
			
		}
			
	}

}
