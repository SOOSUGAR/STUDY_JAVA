
/*
< Math Ŭ���� >
- ���п� ���� �پ��� ������ ���ǵǾ� �ִ� Ŭ����
- Ŭ���� �޼ҵ�� Ŭ���� ��������� �����Ǿ� �ִ� Ŭ����
- public final class Math�� ���ǵǾ� �־ �ν��Ͻ��� ������ �� ���� Ŭ����
- ��� Ŭ���� �޼ҵ�� Ŭ���� ����� Math. ���� ���

*/

public class MathTest01 {
	public static void main(String[] args) {
		System.out.println(Math.abs(-11)); 		// ���밪
		System.out.println(Math.sqrt(9));  		// ��Ʈ
		System.out.println(Math.PI);	        // ������
		System.out.println(Math.ceil(10.1)); 	// ������ �ø�
		System.out.println(Math.floor(10.9)); 	// ������ ����
		System.out.println(Math.round(10.4));	// �ݿø�
		System.out.println(Math.round(10.5));
		System.out.println("����������������������������������������������");
		
		double n = 34567.5678;
		System.out.println(Math.round(n)); 		// 1�� �ڸ��� �ݿø�
		double a = Math.round(n*10) / 10.0; 	// �Ҽ��� ù°�ڸ����� �ݿø�
		System.out.println(a);
		
		double b = Math.round(n*100) / 100.0; 	// �Ҽ��� ��°�ڸ����� �ݿø�
		System.out.println(b);
		
		double c = Math.round(n*1000) / 1000.0;	// �Ҽ��� ��°�ڸ����� �ݿø�
		System.out.println(c);
		
		System.out.println(Math.max(10, 20));				// ���� �ΰ�
		System.out.println(Math.max(3.5, 7.78));			// �Ǽ� �ΰ�
		System.out.println(Math.max(Math.max(30, 10), 20)); // ���� 3�� ���� �ִ밪
		
		System.out.println(Math.min(10, 20));
		System.out.println(Math.min(3.5, 7.78));
		System.out.println(Math.min(Math.min(30, 10), 20)); // ���� 3�� ���� �ּڰ�
		System.out.println("����������������������������������������������");
		
		System.out.println(Math.rint(1.4)); // ���� ����� ������ -> 1
		System.out.println(Math.rint(1.6)); // ���� ����� ������ -> 2
		System.out.println("����������������������������������������������");
		// Math.rint() : �Ǽ����� ����� �������� ���, �� �� �߰��� ���� ¦������ ����
		System.out.println(Math.rint(1.5));
		System.out.println(Math.rint(2.5));
		System.out.println(Math.rint(3.5));
		System.out.println(Math.rint(4.5));
		System.out.println(Math.rint(5.5));
		System.out.println(Math.rint(6.5));
		System.out.println(Math.rint(7.5));
		System.out.println(Math.rint(8.5));
		System.out.println(Math.rint(9.5));
		System.out.println(Math.rint(10.5));
		System.out.println("����������������������������������������������");
		System.out.println(Math.pow(2, 3)); 	// �¼� -> 2�� 3���� �Ǽ��� ǥ��
		
		
		
		
	}

}
