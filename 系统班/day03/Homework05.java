import java.util.Scanner;
/*
	5�����巽������,���������ѧ���ɼ�, ��֤���Ƿ񼰸�, ���������ַ������
	 ���磺��������ɼ�59�����÷������ɼ����ݸ����������ؽ����"������"
*/
class Homework05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ����ѧ���ɼ�:");
		System.out.println(checkScore(sc.nextDouble()));
	}

	public static String checkScore(double score){
		if(score <0 || score > 100){
			return "¼�����~~";
		}
		return score >= 60?"����":"������";
	}
}
