import java.util.Scanner;

/* 
< 2���� �ݺ��� ���� - ���� �ﰢ�� ��� >
-> ���ǹ��� Ȱ��
< �Է� ȭ�� ���� >
���� ���� �Է� : 5

< ��� ȭ�� ���� >
1. ���Ϻ��� ������ �ﰢ��
*
**
***
****
******
 
2. �»��� ������ �ﰢ��
*****
****
***
**
*

3. ���Ϻ��� ������ �ﰢ��
    *
   **
  ***
 ****
***** 

4. ����� ������ �ﰢ��
*****
 ****
  ***
   **
    *

*/

public class For2D07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ﰢ���� ����մϴ�.");
		System.out.print("���� ���� �Է� : ");
		int n = sc.nextInt();
		
		/*
		// 1. ���Ϻ��� ������ �ﰢ��
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(j<=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		
		/*
		// 2. �»��� ������ �ﰢ��
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i+j<=n+1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		
		/*
		// 3. ���Ϻ��� ������ �ﰢ��
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i+j>=n+1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		
		
		// 4. ����� ������ �ﰢ��
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(j>=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
