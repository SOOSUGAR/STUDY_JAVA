
// StringBuffer Ŭ������ �޼ҵ�
public class StringBufferTest03 {
	public static void main(String[] args) {
		//
		String s1 = "ABC";
		s1 = s1.concat("DEF");
		System.out.println(s1);
		System.out.println("��������������������������������");
		
		// 1. append() : ���ڿ��� �߰�
		StringBuffer sb1 = new StringBuffer("ABC");
		System.out.println("�ʱ� �뷮 : " + sb1.capacity());
		System.out.println("ũ�� : " + sb1.length());
		System.out.println("��������������������������������");
		/*
		sb1.append("DEF");
		sb1.append(10);
		sb1.append(3.14);
		sb1.append(true);
		*/
		// �޼ҵ� ü�̴�(chaining)
		sb1.append("DEF").append(10).append(3.14).append(true);
		System.out.println(sb1);
		
		// 2. capacity() : �뷮�� Ȯ���ϴ�  �뵵
		// 3. length() : ���� �������� ũ�⸦ Ȯ���ϴ� �뵵
		StringBuffer sb2 = new StringBuffer();
		System.out.println("�ʱ� �뷮 : " + sb2.capacity());
		System.out.println("ũ�� : " + sb2.length());
		System.out.println("��������������������������������");
		sb2.append("Hello Java World");
		System.out.println("�߰� �� �뷮 : " + sb2.capacity());
		System.out.println("ũ�� : " + sb2.length());
		System.out.println("��������������������������������");
		sb2.append("!");
		System.out.println("�߰� �� �뷮 : " + sb2.capacity());
		System.out.println("ũ�� : " + sb2.length());
		System.out.println("��������������������������������");
		
		StringBuffer sb3 = new StringBuffer(10);
		System.out.println("�ʱ� �뷮 : " + sb3.capacity());
		System.out.println("ũ�� : " + sb3.length());
		System.out.println("��������������������������������");
		
	}

}
