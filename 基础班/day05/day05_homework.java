import java.util.Scanner;
class day05_homework {
	//1����дһ���������ܹ���һ���ַ������з�ת
	public static void main(String[] args) {

		//�����ַ������з�ת
		String str = "abcdefghijk";
		System.out.println("�ַ������з�ת��" + reverseStr(str));
		System.out.println();

		//���Է���һ��[20,40]��Χ�ڵ������
		System.out.println("����һ��[20,40]��Χ�ڵ��������" +getRandom() );
		System.out.println();


		//���Բ�������Ϸ
		numberGuessingGame(getRandom(),10);
	}

	//1����дһ���������ܹ���һ���ַ������з�ת
	public static String reverseStr(String str){
		String newStr = "";
		for(int i = str.length()- 1;i >= 0;i--){
				newStr += str.charAt(i);
		}
		return newStr;
	}

	//��дһ���������ܹ�����һ��[20,40]��Χ�ڵ������
	public static int getRandom(){
		
		return (int)(Math.random()*21 + 20);
	}

	/*
		3��������Ŀ2�ж���ķ�����ȡһ���������ʵ�ֲ�������Ϸ��
			�������10�λ��ᣬ����һ�ξͲ¶��ˣ���ʾ�������Ǹ���š���
			��10Ҳû�¶ԣ���ʾ����̫���ˣ��´�Ŭ���ɣ���,
			���ǵ�2-10�β¶��ˣ�ֻ�򵥵���ʾ������ϲ���¶��ˡ���
		Ҫ��	��1��ÿ�β²�ǰ��ʾ�û����м��λ��ᡣ10 ,9,8,7,6,5,4,3,2,1
				��2������10�β�����Ҳû�¶ԣ��Ͳ�����ʾ̫���˻�̫С�ˡ�
				��3��ͳ�����һ�����˶��ٴβ¶�
	*/
	public static void numberGuessingGame(int random,int chance){
		System.out.println("~~~~~~~��������Ϸ,[20,40]��Χ�ڵ������~~~~~~~~" );
		Scanner sc = new Scanner(System.in);
		int restChance = chance;
		for(int i = 1;i <= chance;i++){
			System.out.println("�㻹��"+restChance+"�λ��ᣬ���������²�����֣�" );
			int num = sc.nextInt();
			restChance--;
			if(num == random){
				if(i == 1){
					System.out.println("�����Ǹ����,��һ�ξͲ¶���" );
				}else{
					System.out.println("��ϲ���¶��ˣ�������" + i +"��" );
				}	
				break;
			}else if(i == chance){
				System.out.println("��̫���ˣ��´�Ŭ���ɣ�" );
				break;
			}else if(num > random ){
				System.out.println("̫����" );
			}else if(num < random ){
				System.out.println("̫С��" );
			}else{
				System.out.println("��ϸ�Ķ���ĿŶ~~~" );
			}
		}
	}
}
