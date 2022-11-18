
/*
< �޼ҵ��� �����ε� >
- overloading
- �޼ҵ��� ���� ����
- �޼ҵ��� �̸��� ������, �Ű������� Ÿ�� �Ǵ� ������ �ٸ��� ������ ��
- ����) �Ű������� �̸��̳� ����Ÿ���� �����ε��� ���Ե��� ����

*/
public class Method08 {
	
	static int add(int x, int y) {
		return x + y;
	}
	
	// 2. ���� : �޼ҵ��� �ߺ� ���� - �޼ҵ��� �Ű������� ������ Ÿ���� �Ȱ���
	/*
	static double add(int x, int y) {
		return (double)(x / y);
	}
	*/
	
	// 1. ���� : �޼ҵ��� �ߺ� ���� - �޼ҵ��� �Ű������� ������ Ÿ���� �Ȱ���
	/* 
	static int add(int a, int b) {
		return x + y;
	}
	*/
	
	static double add(double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		
		System.out.println("���� 2�� : " + add(10, 20));
		System.out.println("�Ǽ� 2�� : " + add(3.5, 7.2));
		
	}

}
