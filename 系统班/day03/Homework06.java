import java.util.Scanner;
/*
	6������֧�ṹ�ͷ�������ϰ����д������Ƴ�һ������ƽ��ͼ������Ĺ��ܣ�
		ͨ��������������ѡ��ͬ��ͼ��
		(1 ����  2������  3Բ��  4�˳�ϵͳ),��ͨ�����������Ӧ�ļ�������,
		�������Ӧͼ�ε������ѡ��4�˳�����Ч�����£�
		ע�� : 
		������Ҫ���볤�Ϳ�, �����ʽ : �� * ��
		��������Ҫ����׺͸�,�����ʽ : (��*��)/2
		Բ����Ҫ����뾶r, �����ʽ : 3.14 * r * r

*/
class Homework06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("��������ѡ��ͬ��ͼ��  1����  2������  3Բ��  4�˳�ϵͳ");
			double area = 0;
			switch(sc.nextInt()){
			case 1:
				System.out.println("�ֱ�¼����εĳ��Ϳ�");
				area =rectangle(sc.nextDouble(),sc.nextDouble());
				break;
			case 2:
				System.out.println("�ֱ�¼�������εĵ׺͸ߣ�");
				area =triangle(sc.nextDouble(),sc.nextDouble());
				break;
			case 3:
				System.out.println("¼��Բ�εİ뾶��");
				area =circle(sc.nextDouble());
				break;
			case 4:
				System.exit(0);
			}
			System.out.println("����ǣ�" + area);
		}
		
	}
	public static double rectangle(double l,double w){
		if(l <= 0 || w<= 0){
			return 0;
		}
		return l*w;
	}
	public static double triangle(double b,double h){
		if(b <= 0 || h <= 0){
			return 0;
		}
		return (b*h)/2;
	}
	public static double circle(double r){
		if(r <= 0){
			return 0;
		}
		return 3.14*r*r;
	}
}
