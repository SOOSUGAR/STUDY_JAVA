import java.util.Scanner;

// ����) ���� 3���� �Է��Ͽ�, �� �߿��� �ִ밪�� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// �ִ밪�� ���ϴ� �κ�, �ּڰ��� ���ϴ� �κ��� ���� �޼ҵ�� ����� �����Ͻÿ�.
// �޼ҵ�� : calcMax, calcMin
public class Method05 {
	
	static void calcMax(int a, int b, int c) {
		int max = a;
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		System.out.println("�ִ밪 : " + max);
	}
	
	static void calcMin(int a, int b, int c) {
		int min = a;
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		System.out.println("�ּҰ� : " + min);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ִ밪�� �ּڰ��� �����մϴ�.");
		System.out.print("���� 1 �Է� : ");
		int a = sc.nextInt();
		System.out.print("���� 2 �Է� : ");
		int b = sc.nextInt();
		System.out.print("���� 3 �Է� : ");
		int c = sc.nextInt();
		
		calcMax(a, b, c);
		calcMin(a, b, c);
		
		sc.close();
	}

}
