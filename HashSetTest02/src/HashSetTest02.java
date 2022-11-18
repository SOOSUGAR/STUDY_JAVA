import java.util.HashSet;
import java.util.Iterator;

/*
���� )
1. ���ڿ��� �����ϴ� �ؽü� set�� �����ϰ� Ȯ���Ͻÿ�.
2. �¿� �쿵��, ����ȣ, �ּ���, ����, �ǹο츦 �߰��ϰ� Ȯ���Ͻÿ�.
3. �¿� �ߺ� �����͸� �߰��ϰ� Ȯ���Ͻÿ�.
4. �¿��� ���� �����͸� �����ϰ� Ȯ���Ͻÿ�.
5. ���� ��� �����͸� ����Ͻÿ�. ( Ȯ�� for��, Iterator )

*/
public class HashSetTest02 {
	public static void main(String[] args) {
		// 1. �� ����
		HashSet<String> set = new HashSet<String>();
		
		System.out.println("�ǡաաաաաաաաաա�HashSet�աաաաաաաաաազ�");
		// 2. �¿� ������ �߰�
		set.add("�쿵��"); set.add("����ȣ"); set.add("�ּ���"); set.add("����"); set.add("�ǹο�");
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		System.out.println("������������������������������������������������������������");
		
		// 3. �¿� �ߺ� ������ �߰�
		set.add("�ּ���");
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		System.out.println("������������������������������������������������������������");
		
		// 4. ���� ������ ����
		set.remove("����");
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		System.out.println("������������������������������������������������������������");
		
		System.out.println(" - ��� 1 �� - ");
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("ũ�� : " + set.size());
		System.out.println("������������������������������������������������������������");
		
		System.out.println(" - ��� 2 �� - ");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("ũ�� : " + set.size());
		System.out.println("�šաաաաաաաաաաաաաաաաաաաաաաաաաաազ�");
		
	}

}
