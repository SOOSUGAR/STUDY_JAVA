import java.util.Scanner;

public class StringTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� 1 �Է� : ");
		String s1 = sc.next();
		System.out.print("���ڿ� 2 �Է� : ");
		String s2 = sc.next();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("������������������������������������");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("������������������������������������");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println("������������������������������������");
		
		// ���ڹ迭�� ����ϴ�
		// 1. == ������ Ư¡ : ���ڿ��� ������ ����, �ֿܼ� �Է��ϸ� �׻� �ٸ� �ν��Ͻ��� �ǰ� ������ �ٸ��ٴ� ����� �����
		// --> ������ : �Ϲ������� ���ڿ��̳� ���� ����ϰ� �� -> �ذ�å : ���ڿ� �޼ҵ带 ���Ͽ� ���� ���ϵ��� ��
		if(s1 == s2) {
			System.out.println("�� ���� ���ڿ��� �����ϴ�.");
		} else{
			System.out.println("�� ���� ���ڿ��� �����ϴ�.");
		}
		
		// 2. equals() �޼ҵ� : �� ���� ������ ����, ���� ��ҹ��ڸ� �����Ͽ� ��
		// -> �ذ�å : ���ڿ� �޼ҵ带 ���ؼ� ���� ���ϵ��� ��
		if(s1.equals(s2)) {
			System.out.println("�� ���� ���ڿ��� ������ �����ϴ�.");
		} else {
			System.out.println("�� ���� ���ڿ��� ������ �ٸ��ϴ�.");
		}
		
		// 3. equalsIgnoreCase() : �� ���ڿ��� ������ ��ҹ��ڸ� �������� �ʰ� ��
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("�� ���� ���ڿ��� ������ ��ҹ��� �������� �����ϴ�.");
		} else {
			System.out.println("�� ���� ���ڿ��� ������ ��ҹ��� �������� �ٸ��ϴ�..");
		}
		
		sc.close();
		
		
	}

}
