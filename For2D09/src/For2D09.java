import java.util.Scanner;

/*
2���� �ݺ��� Ȱ�� - ������ �Ǻ�
������(Perfect Number) - �ڽ��� ������ ����� ���� �ڽŰ� �������� ��
����) ���� 1���� �Է��Ͽ� �Է��� ���� �������� ��� �������� ����ϰ�,
�������� ������ �հ踦 ���Ͻÿ�.

< �Է� ȭ�� ���� >
���� ���� �Է� : 10000

< ��� ȭ�� ���� >
6 28 496 8128
2���� 10000���� ������ ������ ���� : 4
2���� 10000���� ������ ������ �հ� : 8658

*/

public class For2D09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��� ���� ���� �ȿ� �ִ� �������� ����մϴ�.");
		System.out.print("���� ���� �Է� : ");
		int n = sc.nextInt();
		
		int sum = 0, count = 0;
		
		for(int i = 2; i <= n; i++) {
			int x = 0;
			for(int j = 1; j <= i/2; j++) {
				if(i%j == 0) {
					x += j;
				} 
			}
			if(x == n) {
				System.out.print(i + " ");
				count++;
				sum += i;
			} 
		}
		
		System.out.printf("\n1���� %d���� ������ ������ ���� : %d\n", n, count);
		System.out.printf("1���� %d���� ������ ������ �հ� : %d\n", n, sum);
		
		sc.close();
	}

}
