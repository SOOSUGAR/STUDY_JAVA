import java.util.Scanner;

/*
���� �ﰢ�� �����
< �Է� ȭ�� ���� >
���� �Է� : 5

< ��� ȭ�� ���� >
*
**
***
****
*****

*/

public class For2D04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		
		/*
		for( int i = 1 ; i <= n ; i++ ) {
			for( int j = 1 ; j <= i ; j++ ) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		*/
		
		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
		sc.close();
	}

}
