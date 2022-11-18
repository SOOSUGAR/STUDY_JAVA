
/*
< Ŭ���� �޼ҵ�� �ν��Ͻ� �޼ҵ��� ��� ���� ���� >
1. �ν��Ͻ� �޼ҵ忡���� �ڽ��� �ν��Ͻ� ����, �ν��Ͻ� �޼ҵ�, �����ϴ� Ŭ���� ����, Ŭ���� �޼ҵ� ��𿡳� ���� ����
2. Ŭ���� �޼ҵ� ������ �����ϴ� Ŭ���� ����, Ŭ���� �޼ҵ忡�� ������ �����ϳ�, �ν��Ͻ� ����, �ν��Ͻ� �޼ҵ忡�� ������ �Ұ���
*/

// Ŭ���� �޼ҵ�, �ν��Ͻ� �޼ҵ忡�� Ŭ���� ����, �ν��Ͻ� ����, Ŭ���� �޼ҵ�, �ν��Ͻ� �޼ҵ��� ��� ���� ���
class Static {
	private static int s; // Ŭ���� ����, ���� �ʵ�
	private int i; // �ν��Ͻ� ����, ������ �ʵ�
	
	public static void sm1() { } // Ŭ���� �޼ҵ�
	public void im1() { } // �ν��Ͻ� �޼ҵ�
	
	// Ŭ���� �޼ҵ�, ���� �޼ҵ�
	public static void sm2(int x) { 
		s = x;
		// i = x; // Ŭ���� �޼ҵ忡�� �ν��Ͻ� ������ ������ �Ұ� -> �ν��Ͻ� ������ �ν��Ͻ��� ����ŭ ������ �Ǿ��ֱ� ������, �����ؾ��ϴ� ������ � �������� �Ǵ� �Ұ�
		sm1();
		// im1(); // Ŭ���� �޼ҵ忡�� �ν��Ͻ� ������ ������ �Ұ� -> im1�� �ν��Ͻ��� ����ŭ ������ �Ǿ��ֱ� ������, ���� ������ ������ � �������� �Ǵ� �Ұ�
	}
	
	// �ν��Ͻ� �޼ҵ�, ������ �޼ҵ�
	public void im2(int x) {
		s = x;
		i = x;
		sm1();
		im1();
	}
	
	// getter
	public static int gets() {
		return s;
	}
	
	public int getI() {
		return i;
	}
	
}

public class StaticTest01 {
	public static void main(String[] args) {
		Static s1 = new Static();
		Static s2 = new Static();
		Static s3 = new Static();
		
		s1.im2(10);
		Static.sm2(30);
		
		System.out.println("s1 : " + s1.getI());
		System.out.println("s2 : " + s2.getI());
		System.out.println("s3 : " + s3.getI());
		
		// System.out.println("static : " + s3.gets()); // ����
		System.out.println("static : " + Static.gets()); // ����
		
	}

}
