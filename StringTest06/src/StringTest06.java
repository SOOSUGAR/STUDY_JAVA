
public class StringTest06 {
	public static void main(String[] args) {
		// ���� : 20, �ε��� : 0 ~ 19
		String s1 = "Hello_Java_World.hwp";
		
		// 4. endsWith() : ���ڿ��� Ư�� ���ڿ��� �����°��� ���� ����
		System.out.println(s1.endsWith("txt"));
		System.out.println(s1.endsWith("hwp"));
		
		// ������ ���ε��Ͽ� �����ϴ� ���
		if(s1.endsWith("hwp")) {
			System.out.println("���ε� �Ǿ����ϴ�.");
		} else {
			System.out.println("���ε� ���� �ʾҽ��ϴ�.\n������ hwp �������� ��ȯ�ϼ���.");
		}
		
		// 5. startsWith() : ���ڿ��� Ư�� ���ڿ��� �����ϴ°��� ����
		System.out.println(s1.startsWith("Hello"));
		System.out.println(s1.startsWith("hello"));
		
		// 6. indexOf(s) : ���ڿ����� Ư�� ���ڿ��� �ε����� ��(����)���� ã�Ƽ� �˷��� 
		System.out.println(s1.indexOf("J"));
		System.out.println(s1.charAt(6));
		System.out.println(s1.indexOf("Java"));
		System.out.println(s1.indexOf("JAVA")); // -1, ã�� ����, ���ڿ��� �ε����� �������� �ʴ� ��
		
		// 7. lastIndexOf(s) : ���ڿ����� Ư�� ���ڿ��� �ε����� �����ʿ��� ã�Ƽ� �˷���
		System.out.println(s1.indexOf("o"));     // ���ʺ��� ã�Ƽ� ù ��°
		System.out.println(s1.lastIndexOf("o")); // �����ʺ��� ã�Ƽ� ù ��°
		System.out.println(s1.indexOf("."));
		System.out.println(s1.lastIndexOf("."));
		
		
	}

}
