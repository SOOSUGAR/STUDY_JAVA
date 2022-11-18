import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest02 {
	public static void main(String[] args) {
		// TreeSet ����
		TreeSet<String> set = new TreeSet<String>();
		
		// ������ �߰� - ������ ����, ������������ ����
		set.add("�쿵��"); set.add("����ȣ"); set.add("�ּ���"); set.add("����"); set.add("�ǹο�");
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// �ٸ� ������ �߰� - �ߺ����� ���� ������ ���
		set.add("�¼���");
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// �ٸ� ������ �߰� - �ߺ� ������ ��� �Ұ�
		set.add("����");
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// ������ ����
		set.remove("����ȣ");
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// ��� 1 - Ȯ�� for��
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("������������������������������������������������������������");
		
		// ��� 2 - Iterator
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
	}

}
