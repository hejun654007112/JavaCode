import java.util.Scanner;
/*
	��Ŀ�����ú���ʵ��ģ�黯��̵�ʵ��
	��Ŀ:��ATM�Ĳ���
	Ҫ��: 1.�������·���������ָ��һ������,��Ϊ�û����˻�:
	public static double z = 0;  ����������,�ͺ�����ƽ����ϵ�������еķ����ж���ʹ�á�
	2. �ֱ�������������,���ڱ�ʾ��Ǯ/ȡǮ/��ѯ��� ���ֲ���
	������Ҫ������:
	��:public static void savemoney(double money){}
	ȡ:public static void catchmoney(double money){}
	��:public static void showmoney(){}
	3.����û�����:
	3.1 ���һ����ӭ����,�ɲο�������ʽ:
	*****************************************
		��ӭʹ��**����ATM�Զ�������Ա��     
	*****************************************
	3.2 ��ƹ���ѡ����ʾ,�ɲο�������ʽ:         
	 
	��ѡ����:  1.��Ǯ -���ô�Ǯ�ķ��������ܼ���¼���������ΪǮ��
				 2.ȡǮ -����ȡǮ�ķ��������ܼ���¼���������Ϊȡ����Ǯ�����ж�Ǯ�Ƿ񹻣�������ʾ���㲻��ȡ��
				 3.��ѯ��� -���ò�ѯ�ķ�������ʾ��
				 4.�˳�-ֹͣѭ�����˳�����
	3.3 ���ѭ��,��֧,����, ʵ����������
*/
class Day07_homework {
	public static double z = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		showMain();
		while(loop){
			System.out.println("������ѡ���ܵı�ţ�");
			int insertNum = sc.nextInt();
			switch(insertNum){
				case 1:
					System.out.println("������洢�Ľ�");
					savemoney(sc.nextDouble());
					
					break;
				case 2:
					System.out.println("������ȡ���Ľ�");
					catchmoney(sc.nextDouble());
					
					break;
				case 3:
					showmoney();
					break;
				case 4:
					sc.close();
					loop = false;
					break;
				default:
					System.out.println("��Ŵ���");
					showMain();
					break;

			}
			System.out.println("~~���˳�ϵͳ~~");
		}
		
	}
	//��ҳ��
	public static void showMain(){
		System.out.println("*****************************************");
		System.out.println("      ��ӭʹ��**����ATM�Զ�������Ա��    ");
		System.out.println("*****************************************");
		System.out.println("��ѡ����:");
		System.out.println("1.��Ǯ");
		System.out.println("2.ȡǮ");
		System.out.println("3.��ѯ���");
		System.out.println("4.�˳�");
		
	}
	//��Ǯ
	public static void savemoney(double money){
		z += money;
		System.out.println("~~~�洢�ɹ�~~~");
	}
	//ȡǮ
	public static void catchmoney(double money){
		if(z < money ){
			System.out.println("~~��������~~");
			return;
		}
		z -= money;
		System.out.println("~~~ȡ���ɹ�~~~");
	}
	//��ѯ���
	public static void showmoney(){
		System.out.println("�������Ϊ��" +z+" Ԫ" );
	}
}
