import java.util.Scanner;

/*
����) ���� 1���� �Է��Ͽ�, �Է��� ���� ���丮�� ���Ͻÿ�.
< �Է� ȭ�� ���� >
���� �Է� : 5

< ��� ȭ�� ���� > 
5! = 1 * 2 * 3 * 4 * 5 = 120


*/
public class For05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		int fact = 1;
		
		System.out.print(n + "! = " );
		
		for(int i = 1; i <= n ; i++) {
			fact = fact * i;
			
			if(i == n) {
				System.out.print(i);
				break;
			}
			
			System.out.print(i + " * ");
		}
		
		/*
		 	System.out.print(i);
			if(i < n) {
				System.out.print(" * "); // n���� ���� ������ *�� ����
			}
		*/
		
		System.out.print(" = " + fact);
		
		sc.close();
	}

}
