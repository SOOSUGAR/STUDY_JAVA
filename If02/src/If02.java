
// ����1) ���� 1���� �Է��Ͽ� Ȧ������, ¦�������� �Ǻ��Ͻÿ�.
import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� : ");
		int n = sc.nextInt();
		
		if(n % 2 == 1) {
			System.out.print("�Է��Ͻ� ������ Ȧ���Դϴ�.");
		} else if (n % 2 == 0) {
			System.out.print("�Է��Ͻ� ������ ¦���Դϴ�.");
		} else {
			System.out.print("������ �Է����ּ���.");
		}
		
		sc.close();
		
		
	}

}
