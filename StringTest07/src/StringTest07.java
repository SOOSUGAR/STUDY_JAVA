
public class StringTest07 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// 8. length() : ���ڿ��� ���̸� ����
		System.out.println("���� : " + s1.length());
		
		// 9. replace() : ���ڿ����� Ư�� ���ڿ��� ���ο� ���ڿ��� ��� �� ����
		s1 = s1.replace("!", "?");
		System.out.println(s1);
		s1 = s1.replace("Java", "Python");
		System.out.println(s1);
		s1 = s1.replace("l", "L"); // ��� �ҹ��� l�� �빮�� L�� ������
		System.out.println(s1);
		
		// 10. replaceFirst() : ���ڿ����� Ư�� ���ڿ��� ù ��°�� ������ ���ڿ��� ����
		s1 = s1.replaceFirst("o", "O");
		System.out.println(s1);
		
		// 11. toUpperCase() : ���ڿ��� ��� ���ڸ� �빮�ڷ� ����
		s1 = s1.toUpperCase();
		System.out.println(s1);
		
		// 12. toLowerCase() : ���ڿ��� ��� ���ڸ� �ҹ��ڷ� ����
		s1 = s1.toLowerCase();
		System.out.println(s1);
		
		// 13. trim() : ���ڿ��� �յ��� ������ ����
		String s2 = "    Hello   Java     ";
		System.out.println(s2 + "*");
		s2 = s2.trim();
		System.out.println(s2 + "*");
		
		// 14. equals() : ���ڿ��� ���� ���Ͽ� ���������� �Ǵ�
		String s3 = new String("ABC");
		String s4 = new String("XYZ");
		String s5 = new String("ABC");
		
		System.out.println(s3 == s5);  		// false, ���� �ƴ϶� ������ ��
		System.out.println(s3.equals(s5));  // true, ���� ��
		System.out.println(s3.equals(s4));  // false, ���� ��
		
		// 15. equalsIgnoreCase() : ���ڿ��� ���� ��ҹ��� ���о��� ��
		String s6 = "abc";
		System.out.println(s3.equals(s6));   		 // false, ��ҹ��ڸ� ����
		System.out.println(s3.equalsIgnoreCase(s6)); // true, ��ҹ��� ���о��� �Ǻ�
		
	}

}
