import java.util.LinkedList;

public class LinkedListTest01 {
	public static void main(String[] args) {
		// 1. ���ڿ��� �����ϴ� LinkedList ����
		LinkedList<String> list = new LinkedList<String>();
		
		// 2. ������ �߰� (������ �߰�)
		System.out.println("�ǡաաաաաաաա�LinkedList�աաաաաաաազ�");
		list.add("�쿵��");
		list.add("����ȣ");
		list.add("�ּ���");
		list.add("����");
		list.add("�Ѽ���");
		System.out.println(list);
		System.out.println("��������������������������������������������������������");
		
		// 3. ������ �߰� (������� �߰�, �߰�)
		list.add(3, "�ǹο�");
		System.out.println(list);
		System.out.println("��������������������������������������������������������");
		
		// 4. ������ ����
		list.set(5, "���׶��");
		System.out.println(list);
		System.out.println("��������������������������������������������������������");
		
		// 5. ������ ����
		list.remove(4);
		System.out.println(list);
		System.out.println("��������������������������������������������������������");
		
		// LinkedList���� �ִ� ���(�޼ҵ�)
		System.out.println("1. �� �տ� ������ �߰�");
		list.addFirst("�¼���");
		System.out.println(list);
		System.out.println("2. �� �ڿ� ������ �߰�");
		list.addLast("�汸��");
		System.out.println(list);
		System.out.println("3. �� ���� ������ ����");
		list.removeFirst();
		System.out.println(list);
		System.out.println("4. �� �ڿ� ������ ����");
		list.removeLast();
		System.out.println(list);
		System.out.println("5. �� ���� ������ Ȯ��");
		System.out.println(list.getFirst());
		System.out.println(list);
		System.out.println("6. �� ���� ������ Ȯ��");
		System.out.println(list.getLast());
		System.out.println(list);
		
		
		System.out.println("�šաաաաաաաաաաաաաաաաաաաաաաաաաազ�");
		
	}

}
