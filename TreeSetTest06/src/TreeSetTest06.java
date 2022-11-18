import java.util.HashSet;
import java.util.TreeSet;
/*
1. Set�� Ư¡ : ������ �ߺ� �����Ͱ� ����
2. HashSet�� Ư¡ : �������� �߰�/������ ����, ���ĵ��� ���� ������
3. TreeSet�� Ư¡ : �����Ͱ� ������������ ���ĵǾ� �־� �������� �˻��� ����, �������� �߰�/������ ����

*/
public class TreeSetTest06 {
	public static void main(String[] args) {
		// Set�� �ζǹ�ȣ 6���� ���� - �ߺ����� �ʾƾ� ��
		HashSet<Integer> set1 = new HashSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		
		// ������ : �ζǹ�ȣ 6���� �������� ���� �� ���� -> �ߺ��� �����͸� ������� �ʱ� ����
		/*
		for(int i = 0; i < 6; i++) {
			int n = (int)(Math.random() * 45) + 1;
			set1.add(n);
		}
		*/
		
		// �ذ�å : set�� ũ�⸦ ����Ͽ� 6���� �ζǹ�ȣ�� ������ ��
		while(set1.size() < 6) {
			int n = (int)(Math.random() * 45) + 1;
			set1.add(n);
		}
		System.out.println("HashSet : " + set1);
		
		while(set2.size() < 6) {
			int n = (int)(Math.random() * 45) + 1;
			set2.add(n);
		}
		System.out.println("TreeSet : " + set2);
		
		
	}

}
