
public class Infiniteloop01 {
	public static void main(String[] args) {
		
		// ���� ���� 1 -> �������� �����ϴ� ���
		int i = 1;
		while(i <=10) {
			System.out.println(i);
			//i++;
		}
		/*
		
		// ���� ���� 1 -> ���ǽ��� �߸� �ۼ��� ���
		int i = 1;
		while(i <=10) {
			System.out.println(i);
			i++;
			
		*/
		
		// �ǵ������� ���� ������ �ۼ��ϴ� ���
		/* 1�� - while�� : ���� ���� ����ϴ� ���
		while(true) {
			System.out.println("*");
		}
		*/
		
		// 2�� - for��
		/*
		for (; true ;) {
			System.out.println("#");
		}
		*/
		
		for (; ;) {
			System.out.println("#");
		}
		
	}
}
