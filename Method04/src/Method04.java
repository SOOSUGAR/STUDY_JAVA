import java.util.Scanner;

/*
����) ���� 1���� ���� 1���� �Է��Ͽ� ���Ϻ��� ������ �ﰢ���� �Է��� ���ڷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
- �� ���� ����ϴ� �κ��� �޼ҵ�� ����� ����Ͻÿ�. �޼ҵ�� : putChar

< �Է� ȭ�� ���� >
���� �Է� : 5
���� �Է� : @

< ��� ȭ�� ���� >
@
@@
@@@
@@@@
@@@@@

*/
public class Method04 {
	
	// �޼ҵ� ����
	static void putChar(int n, char c) { // ��ȯ�Ǵ� ���� ���� �� static void ����
		 for(int i = 0; i < n; i++) {
				System.out.print(c);
		} 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �Է�â
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		System.out.print("���� �Է� : ");
		char c = sc.next().charAt(0);
		
		// ���â
		for(int i = 0; i < n; i++) {
			putChar(i+1, c);
			System.out.println();
		}
		
		
		/*
		 * for(int i = 0; i < n; i++) {
		 * 		for(int j = 0; j < i+1; j++) {
		 * 			Sytem.out.print(c);
		 * 		}
		 * 		System.out.println();
		 * }
		*/
		
		sc.close();
	}

}
