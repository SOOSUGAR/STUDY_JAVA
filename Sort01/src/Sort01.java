import java.util.Scanner;

public class Sort01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭 ���� �Է� : ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		//int[] a = {50, 70, 20, 10, 30};
		
		// �迭�� ���� 0 ~ 100 ������ ������ ����, 0 ~ 99������ ����
		for(int i = 0; i<a.length; i++) {
			a[i] = (int)(Math.random() * 100);
			for(int j = 0; j >i; j++) {
				if(a[i] == a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		
		// ���
		System.out.print("���� ���� �� : ");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// ���� ����(Selection Sort)
		for(int i = 0; i < a.length-1; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
			System.out.printf("%d�� ȸ�� �� : " , i+1);
			for(int j =0; j<a.length; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}
		
		// ���
		System.out.print("�������� �� : ");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	
	sc.close();
	}
}
