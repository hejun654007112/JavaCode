class day04_homwork5 {
	/*
		5�������������󣬲��ô���ʵ�֣�
		(1)���������߶�Ϊ8848�ף���һ���㹻���ֽ�����Ϊ0.001�ס�
		(2)���ʣ����۵����ٴΣ����Գ������������ĸ߶ȡ�
	*/
	public static void main(String[] args) {
		//���������߶�Ϊ8848
		int height = 8848;
		//ֽ��ʼ���Ϊ0.001
		double weight = 0.001;
		//������
		int count = 0;
		while(weight < height){
			count++;
			weight *= 2;
			
		}
		System.out.println("�۵�"+count+"�Σ����Գ������������ĸ߶�");
	}
}
