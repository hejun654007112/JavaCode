class Demo_05 {
	//���ⶨ��һ����λ���ı������ֱ��ȡ�����λ���ϵĸ�λ ʮλ ��λ ǧλ���ֲ������
	public static void main(String[] args) {
		int num = 3576;

		int unit = num % 10;
		int decade = num / 10 % 10;
		int hundreds = num / 100 % 10;
		int KiloBit = num / 1000;

		System.out.println("��λ���ǣ�" + unit );
		System.out.println("ʮλ���ǣ�" + decade );
		System.out.println("��λ���ǣ�" + hundreds );
		System.out.println("ǧλ���ǣ�" + KiloBit );
	}
}
