
// String Ŭ������ StringBuffer Ŭ������ ������
public class StringBufferTest01 {
	public static void main(String[] args) {
		// 1. String�� ������
		// - String Ŭ�������� ���� �߰�, ����, ������ �ϰ� �Ǹ� �ν��Ͻ��� �����
		// - ���� ���� �ؽ��ڵ�� ���� ���� �ؽ��ڵ尡 �ٸ�
		// - String Ŭ������ Ư¡ : immutable�� Ư��
		String s1 = "ABC";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
		// s1 += "DEF"; // ���ڿ��϶��� ����
		s1 = s1.concat("DEF");
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		System.out.println("����������������������������������������������");
		
		// 2. StringBuffer
		// - String Ŭ������ immutable�� Ư���� �������� �ذ�, ����
		// - ���� �߰�, �����ÿ� �ڽ��� �ν��Ͻ��� �״�� ����, ���ҽ��� ���
		// - ���� �߰�, ������ �ϱ� ���� ���� �ν��Ͻ��� �ؽ��ڵ尡 ����
		// - StringBuffer�� Ư�� : mutable�� Ư��
		
		StringBuffer sb1 = new StringBuffer("ABC");
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		
		sb1.append("DEF"); // ���ڿ��� �ƴ϶� �ٷ� ����� �� ���� 
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		
		
	}

}
