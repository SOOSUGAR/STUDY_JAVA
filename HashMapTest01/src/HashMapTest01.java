import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
< Map�� Ư¡ >
1. Ű(key)�� ��(value)�� ���� �ϳ��� �����͸� �̷�� ����
2. ������ ����
3. Ű�� �ߺ��� ������� ����
4. ���� �ߺ��� ���
Hashtable : HashMap�� ���� ����, �������� ����ȭ �κ��� �־ ���� ����
HashMap : �������� ����ȭ �κ��� �����Ͽ� ���� ����
*/
public class HashMapTest01 {
	public static void main(String[] args) {
		// HashMap ����
		// Ű : �̸�, �� : ��
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		// ������ �߰� - ���� ����
		map.put("�쿵��", 95); 
		map.put("����ȣ", 87);
		map.put("����", 75);
		map.put("�ּ���", 68);
		map.put("�ǹο�", 82);
		System.out.println(map);
		
		// Ű Ȯ�� - ���ο� Ű
		map.put("�¼���", 77);
		
		// Ű Ȯ�� - �ߺ��� Ű�� ���� -> �ߺ� Ű�� ������� ����(���� ������ ������ ��ü)
		map.put("�ּ���", 93);
		System.out.println(map);
		
		// �� Ȯ�� - �ߺ��� �� -> ���
		map.put("�Ѽ���", 95);
		System.out.println(map);
		
		// �����͸� �����ϴ� ���
		// 1. Ű ������ �����͸� ����
		map.remove("�ǹο�");
		System.out.println(map);
		
		// 2. Ű�� ���� ��� ������ �� ���� -> Ű�� ���Ƶ� ���� �ٸ��� �������� ����
		map.remove("����ȣ", 87);
		System.out.println(map);
		
		// ��� �л��� ���Ͽ� ������ ����� ���Ͻÿ�
		int tot = 0;
		double ave = 0.0;
		
		// 3. �����͸� ����ϴ� ���
		// ��� 1 - Iterator
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next(); // key
			int score = map.get(name); // value
			tot += score;
			System.out.println(name + " : " + score);
		}
		ave = (double)tot / keys.size();
		System.out.println("ũ�� : " + map.size());
		System.out.printf("���� : %d , ��� : %.2f\n", tot, ave);
		System.out.println("������������������������������");
		
		// ��� 2 - Iterator
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<String, Integer> entry = it2.next();
			String name = entry.getKey();
			int score = entry.getValue();
			System.out.println(name + " : " + score);
		}
		System.out.println("ũ�� : " + map.size());
		System.out.println("������������������������������");
		
		// ��� 3 - Ȯ�� for��, entrySet()
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		for(Map.Entry<String, Integer> e : entrys) {
			String name = e.getKey();
			int score = e.getValue();
			System.out.println(name + " : " + score);
		}
		System.out.println("������������������������������");
		
		// ��� 4
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("������������������������������");
		
		
		
		
		
	}

}
