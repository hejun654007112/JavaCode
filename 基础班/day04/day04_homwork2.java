import java.util.Scanner;
class day04_homwork2 {
	/*
		ģ���û���¼
		��ȷ���û�����123��������987
		��ʾ�û�¼���û��������룬�����жϣ����¼����ȷ����ʾ����¼�ɹ�����������¼��
		���¼��������ʾ����¼ʧ�ܣ�������¼�롱
		һ�����λ��ᣬ������λ����������Զ�ֹͣ
	*/
	public static void main(String[] args) {
		int userName = 123;
		int password = 987;

		Scanner sc = new Scanner(System.in);

		for(int i = 3 ; i > 0; i--){
			System.out.println("�������û�����");
			int getName = sc.nextInt();
			System.out.println("���������룺");
			int getPassword = sc.nextInt();

			if(getName == userName && getPassword == password){
				System.out.println("��¼�ɹ�");
				break;
			}else{
				System.out.println("��¼ʧ�ܣ�������¼��");
			}
		
		}

		
	}
}
