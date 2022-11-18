import java.util.Random;

public class MathTest02 {
	public static void main(String[] args) {
		// Math.random() : 0 ~ 1 �̸�(0.999999....) ������ ����
		System.out.println(Math.random());
		
		// 1. 0 ~ 9 ������ ����
		int a = (int)(Math.random() * 10);
		System.out.println(a);
		
		// 2. 1 ~ 10 ������ ����
		int b = (int)(Math.random() * 10 + 1);
		System.out.println(b);
		
		// 3. 1 ~ 45 ������ ���� - �ζ� ��ȣ
		int c = (int)(Math.random() * 45 + 1);
		System.out.println(c);
		
		// 4. -30 ~ 30 ������ ����
		int d = (int)(Math.random() * 61 - 30);
		System.out.println(d);
		
		// Random Ŭ���� Ȱ��
		Random r = new Random();
		int n = r.nextInt();
		System.out.println(n);
		
		// 1-1. 0 ~ 9 ������ ����
		int n1 = r.nextInt(10); // ���尪�� ��
		System.out.println(n1);
		
		// 2-1. 1 ~ 10 ������ ����
		int n2 = r.nextInt(10)+1; // ���尪�� ��
		System.out.println(n2);
		
		// 3-1. 1 ~ 45 ������ ����
		int n3 = r.nextInt(45)+1; // ���尪�� ��
		System.out.println(n3);
		
		// 4-1. -30 ~ 30 ������ ����
		int n4 = r.nextInt(61)-30;
		System.out.println(n4);
	}

}
