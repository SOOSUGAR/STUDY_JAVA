
// System.out.println() : �� �ٲ��ؼ� ���
// System.out.print() : �� �ٲ� ���� ���
// �������Ͽ� ����ϴ� ��� : formatting
// �������� �� ����ϴ� ���� : ���� ����, ���� ����
// System.out.printf() : ��� ���Ŀ� ���߾� ���
public class Printf01 {
	public static void main(String[] args) {
		// 1. ���� ������
		// ���� ���� : %d:���� ���, decimal
		int a = 34567;
		System.out.printf("%d\n", a);
		System.out.printf("%7d\n", a);
		System.out.printf("%10d\n", a);
		System.out.printf("%-10d*\n", a);
		
		// 2. �Ǽ� ������
		// ���� ���� : %f:�Ǽ� ���, float
		double b = 3.141592;
		System.out.printf("%f\n", b);
		System.out.printf("%.2f\n", b);
		System.out.printf("%.4f\n", b);
		System.out.printf("%7.2f\n", b);
		System.out.printf("%-7.2f*\n", b);
		
		// 3. ���� ������
		// ���� ���� : %c:���� ���, character
		char c = 'A';
		System.out.printf("%c\n", c);
		System.out.printf("%5c\n", c);
		System.out.printf("%-5c*\n", c);
		
		// 4. ���ڿ� ������
		// ���� ���� : %s:���ڿ� ���, string
		String s = "Hello";
		System.out.printf("%s\n", s);
		System.out.printf("%10s\n", s);
		System.out.printf("%-10s*\n", s);
		
		// 5. 8����, 10����, 16���� ���
		// %d : decimal(10����), %o : octal(8����), %x : hexadecimal(16����)
		int x = 182;
		System.out.printf("%d\n", x);
		System.out.printf("%o\n", x); 
		System.out.printf("%x\n", x);
		System.out.printf("%X\n", x);
		
		// �߰� : 8����, 16����, 2������ ����ϴ� �� �ٸ� ���
		System.out.println(Integer.toOctalString(x)); // 8����
		System.out.println(Integer.toHexString(x)); // 16����
		System.out.println(Integer.toBinaryString(x)); // 2����
		
		
		
	}

}
