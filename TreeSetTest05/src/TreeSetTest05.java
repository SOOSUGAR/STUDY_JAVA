import java.util.SortedSet;
import java.util.TreeSet;

// ���ڿ��� �ٷ�� �κм�
public class TreeSetTest05 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("abc"); set.add("alien"); set.add("bat"); set.add("car"); set.add("Car"); 
		set.add("disco"); set.add("dance"); set.add("dZZZZ"); set.add("dzzzz"); set.add("elephant");
		set.add("elevator"); set.add("fun"); set.add("flower"); set.add("d"); set.add("a");
		set.add("�ٴ�"); set.add("�ϴ�"); set.add("����"); set.add("��"); set.add("?");
		System.out.println(set);
		
		// 1. a���� d�������� �κм� (a ~ c, d�� ������) 
		SortedSet<String> set2 = set.subSet("a", "d");
		System.out.println(set2);
		
		// 2. a���� d������ �κм�(d ����)
		// SortedSet<String> set3 = set.subSet("a", "e");
		SortedSet<String> set3 = set.subSet("a", "dzzzzzzz");
		System.out.println(set3);
		
		// 3. a���� d������ �κм�(d�� ����)
		SortedSet<String> set4 = set.subSet("a", true, "d", true);
		System.out.println(set4);
		
		// 4. �ѱ��� ���, �ѱ��ڸ� �⺻������ �ν��� - "��"���� "��"���� -> "��"���� "��"�������� ����Ͽ��� ��(�� ������)
		// SortedSet<String> set5 = set.subSet("��", "��"); -> �ƹ� ����� ������� ����
		SortedSet<String> set5 = set.subSet("��", "��");
		System.out.println(set5);
		
	}

}
