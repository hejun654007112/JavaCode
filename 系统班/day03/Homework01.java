/*
	1��һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
		�����£�������10�����ʱ�������������ף���10�η�����ߣ�
*/
class Homework01 {
	public static void main(String[] args) {
		//����sum��¼С���˶����ܾ���
		double sum = 0;
		//��ظ߶ȳ�ʼ��Ϊ100
		double fallHeight = 100;
		//�����߶�
		double reboundHeight = 0;
		//��������
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
		System.out.println("��10�����ʱ,������"+ sum+"��\n"+"��10�η���" + reboundHeight + "��");
	}
}
