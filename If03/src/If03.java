
// ����1) ���� 1���� �Է��Ͽ� 3�� ����̸鼭 4�� ��������� �Ǻ��Ͻÿ�.

import java.util.Scanner;
public class If03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� : ");
		int n = sc.nextInt();
		
		if(n % 3 == 0 && n % 4 == 0) {
			System.out.print(n + "��/�� 3�� ����̰� 4�� ����Դϴ�.");
		} else {
			System.out.print(n + "��/�� 3�� 4�� ����� �ƴմϴ�.");
		}
		
		sc.close();
		
	}

}
