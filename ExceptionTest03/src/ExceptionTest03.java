
// try ~ catch ~ finally
public class ExceptionTest03 {
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		int tot = 0;
		double ave = 0.0;
		
		// try - ���ܰ� �߻��� �� �ִ� ������ ���´�
		try {
			for(int i=0; i<=a.length; i++) { // ���� �߻�
				System.out.println("a[" + i + "] = " + a[i]);
				tot += a[i];
			}
			// ave = (double)tot / a.length; // ���� �߻��� �ٷ� catch�� �̵��� try���� ���������� ������ ������� X
		// catch - �߻��� �� �ִ� ���ܿ� ���� ó���� ���´�, �ݵ�� 1�� �̻� ����
		} catch(ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace(); // ���� �޼����� ����ϴ� ���
			// System.err.println(e.getMessage() + "�� �ε����� ������ �߻��߽��ϴ�."); // ���ܰ� �߻��� �ε����� ��ȣ�� �˷���
			System.err.println("�迭�� �ε����� ������ϴ�."); // ���� ����
		// finally - ������ �߻� �����ʹ� ������� �ݵ�� �����ؾ��ϴ� ������ ���´�, ���û���
		} finally { 
			ave = (double)tot / a.length; // ��� ���, ������ �߻� ������ ������� �ݵ�� ����
		}

		System.out.println("�հ� : " + tot);
		System.out.println("��� : " + ave);
		
		System.out.println("�Ʒ����� �л����� ������ ���� ó���� �ϰ� �ֽ��ϴ�.");
		// ...
		
		
		
		
	}

}
