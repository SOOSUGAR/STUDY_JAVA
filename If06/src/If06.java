
// ����) ���� 1���� �Է��Ͽ� 1�ڸ� ������, 2�ڸ� �� �̻������� �Ǻ��Ͻÿ�.

import java.util.Scanner; // ����Ű : Ctrl + Shift + O 

public class If06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ������ ���� ����
		
		System.out.print("������ �Է��Ͻÿ� : ");
		int n = sc.nextInt(); // ������ �Է�â. ���ڿ��� ��, next ���
		
		// 1�� ° ��� : ����
		if(n >= 10 || n <= -10 ) {
			System.out.print("�Է��Ͻ� ������ 2�ڸ� �� �̻��Դϴ�.");
		} else if ( n < 10 && n > -10 ) {
			System.out.print("�Է��Ͻ� ������ 1�ڸ� �� �Դϴ�.");
		} else {
			System.out.print("������ �Է����ּ���.");
		}
		
		/* 2�� ° ��� : ������ �� -> n�� 10���� �������� ��, ���� 0�̶�� 1�ڸ� ��
		 if(n/10 == 0) {
		 	System.out.println("�Է��Ͻ� ������ 1�ڸ� �� �Դϴ�.");
		 } else {
		 	System.out.println("�Է��Ͻ� ������ 2�ڸ� �� �̻��Դϴ�.");
		 }
		 */
		
		sc.close(); // �Է� �� import �ڵ� ����
		
	}

}