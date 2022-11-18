
// StringBuffer Ŭ������ �޼ҵ�
public class StringBufferTest02 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("ABC");
		StringBuffer sb2 = new StringBuffer("ABC"); // �Ȱ��� ���ڶ� �ν��Ͻ��� 2��
		
		System.out.println(sb1); // toString�� ���ǵǾ� ����
		System.out.println(sb2);
		System.out.println("����������������������������������������������������");
		System.out.println(System.identityHashCode(sb1));
		System.out.println(System.identityHashCode(sb2));
		System.out.println("����������������������������������������������������");
		// < StringBuffer ���� ���ڿ��� �� >
		// 1. == : �� ���ڿ��� ������ ��
		if(sb1 == sb2) {
			System.out.println("�� ���ڿ��� �����մϴ�");
		} else {
			System.out.println("�� ���ڿ��� �������� �ʽ��ϴ�.");
		}
		
		// 2. equals() : StringBuffer�� equals() �޼ҵ�� ���� �ƴ϶�, ������ ��
		// - ������ : ������ �� -> ������ ��
		if(sb1.equals(sb2)) {
			System.out.println("�� ���ڿ��� �����մϴ�");
		} else {
			System.out.println("�� ���ڿ��� �������� �ʽ��ϴ�.");
		}
		
		// 3. 2�� ������ �ذ�å : ���� ���ϵ��� �ϴ� ���
		// String Ŭ������ equals() �޼ҵ�� Object Ŭ������ equals() �޼ҵ带 �������̵��Ͽ� ���ڿ��� ���� ���ϵ��� ��
		// StringBuffer�� ���� ������ ���ڿ���  ���� ��� String Ŭ������ �����Ͽ� ���ϵ��� ��
		String s1 = sb1.toString(); // sb1�� String������ �������
		String s2 = sb2.toString();
		if(s1.equals(s2)) {
			System.out.println("�� ���ڿ��� �����մϴ�");
		} else {
			System.out.println("�� ���ڿ��� �������� �ʽ��ϴ�.");
		}
		
		
	}

}
