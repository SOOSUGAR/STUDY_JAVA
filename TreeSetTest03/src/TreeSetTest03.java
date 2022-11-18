import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest03 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(87); set.add(98); set.add(75); set.add(95); set.add(80);
		System.out.println(set);
		System.out.println();
		
		System.out.println("���� ���� ���� : " + set.first());
		System.out.println("���� ū ����    : " + set.last());
		
		// lower()/higher() - �ش� ������ �������� ����
		System.out.println("95�� �ٷ� �Ʒ� ���� : " + set.lower(95));
		System.out.println("95�� �ٷ� ���� ���� : " + set.higher(95));
		
		// floor()/ceiling() - �ش� ������ ����
		System.out.println("95���̰ų� �ٷ� �Ʒ� ���� : " + set.floor(95));
		System.out.println("95���̰ų� �ٷ� ���� ���� : " + set.ceiling(95));
		
		// ��� 1 - Ȯ�� for��
		for(int i : set) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("ũ�� : " + set.size());
		
		
		// ��� 2 - Iterator
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("ũ�� : " + set.size());
		
		// ��� 3 - isEmpty() ���
		// - ���� : �� ����� ����ϸ� �����͸� ������ 
		// - pollFirst() - �����͸� �տ������� ������ ����
		// - pollLast() - �����͸� �ڿ������� ������ ����
		while(!set.isEmpty()) {
			System.out.print(set.pollFirst() + " ");
			//System.out.print(set.pollLast() + " ");
		}
		System.out.println();
		System.out.println("ũ�� : " + set.size());
		
	}

}
