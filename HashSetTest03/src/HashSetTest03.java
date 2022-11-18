import java.util.HashSet;

public class HashSetTest03 {
	public static void main(String[] args) {
		// 1. �ؽü� ����
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		
		// 2. ������ �߰�
		set1.add("�쿵��"); set1.add("�ּ���"); set1.add("����ȣ"); set1.add("����"); set1.add("�ǹο�");
		set2.add("�쿵��"); set2.add("����ȣ"); set2.add("���׶��"); 
		System.out.println("set 1 : " + set1);
		System.out.println("set 1�� ũ�� : " + set1.size());
		System.out.println("set 2 : " + set2);
		System.out.println("set 2�� ũ�� : " + set2.size());
		System.out.println();
		
		// 3. contains() : �¿� �ش� �����Ͱ� �ִ����� ���� �Ǻ� (������ 1�� Ȯ��)
		System.out.println(set1.contains("����"));
		System.out.println(set1.contains("�汸��"));
		System.out.println();
		
		// 4. containsAll() : �¿� �ٸ� ���� �����͸� ��� �����ϴ����� ���� �Ǻ�(set���� ��)
		System.out.println(set1.containsAll(set2));
		System.out.println();
		
		// 5. addAll() : �¿� �ٸ� ���� ��� �����͸� �߰�(�ߺ� �����ʹ� ������� ����)
		set1.addAll(set2);
		System.out.println("set1 : " + set1);
		System.out.println("set 1�� ũ�� : " + set1.size());
		System.out.println();
		
		// 6. �¿� �ش� �����Ͱ� �ִ����� ���� �Ǻ�
		System.out.println(set1.containsAll(set2));
		System.out.println();
		
		// 7. removeAll() : �¿��� �ٸ� ���� ��� �����͸� ��� ����
		set1.removeAll(set2);
		System.out.println("set1 : " + set1);
		System.out.println("set 1�� ũ�� : " + set1.size());
		
		// 8. clear() : ���� ��� ������ ����
		set1.clear();
		System.out.println("set1 : " + set1);
		System.out.println("set 1�� ũ�� : " + set1.size());
		
	}

}
