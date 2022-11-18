import java.util.HashSet;
import java.util.Iterator;

/*
< Set �迭 >
1. ����(�ε���)�� ����
2. �ߺ� �����͸� ������� �ʴ´�
3. HashSet, TreeSet ...
*/
public class HashSetTest01 {
	public static void main(String[] args) {
		// 1. �ؽü� ����
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.println(set);
		
		// 2. ������ �߰� - �����͸� ���� ������� ������ ����
		set.add(66); set.add(75); set.add(57); set.add(96); set.add(45);
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// 3. ������ �߰� - �ߺ� ������
		set.add(57); // �ߺ� �����ʹ� ������� ����
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// 4. ������ �߰� - �ߺ����� ���� �������� �߰�
		set.add(83);
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// 5. ������ ���� - �����ϴ� ������
		set.remove(96);
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// 6. ������ ���� - �������� �ʴ� ������
		set.remove(30); // ���� X (����ó���� �Ǿ�����)
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		
		// 7. ��� 1 - Ȯ�� for��
		int tot = 0;
		for(int i : set) {
			tot += i;
			System.out.println(i);
		}
		System.out.println("���� : " + tot);
		System.out.println("��������������������������������������������������������");
		
		// 8. ��� 2 - Iterator
		tot = 0;
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int n = it.next();
			tot += n;
			System.out.println(n);
		}
		System.out.println("���� : " + tot);
		
	}

}
