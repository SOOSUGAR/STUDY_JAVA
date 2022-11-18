import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/*
���� ) 
1. Ű�� �л��̸�, ���� ������ �ϴ� TreeMap, map�� �����Ͻÿ�.
2. �ʿ� ������ 5���� �߰��Ͻÿ�.
3. �ʿ��� �ߺ� Ű�� ��뿡 ���� Ȯ���Ͻÿ�.
4. �ʿ��� �ߺ� ���� ��뿡 ���� Ȯ���Ͻÿ�.
5. ���� 3���� ������� ����Ͻÿ�.
*/

public class TreeMapTest02 {
	public static void main(String[] args) {
		// 1. map ����
		TreeMap<String, Integer> map = new TreeMap<>();
		
		// 2. ������ �߰�
		map.put("�쿵��", 95);
		map.put("�ּ���", 90);
		map.put("����", 85);
		map.put("����ȣ", 80);
		map.put("�ǹο�", 75);
		//System.out.println(map);
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String s = it.next();
			int score = map.get(s);
			System.out.println("�̸� : " + s + ", ���� : " + score);
		}
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// 3. �ߺ� Ű Ȯ��
		map.put("�쿵��", 100);
		System.out.println(map);
		
		// 4. �ߺ� �� Ȯ��
		map.put("�¼���", 90);
		System.out.println(map);
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// 5. ���
		// 1) for - entrySet()
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.print("�̸� : " + entry.getKey() + ", ���� : " + entry.getValue() + "\n");
		}
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// 2) for - keySet()
		for(String i : map.keySet()) {
			System.out.print("�̸� : " + i + ", ���� : "  + map.get(i) + " \n");
		}
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// 3) Iterator
		Iterator<Entry<String, Integer>> entries = map.entrySet().iterator();
		while(entries.hasNext()) {
			Entry<String, Integer> entry = entries.next();
			System.out.println("�̸� : " + entry.getKey() + ", ���� : " + entry.getValue());
		}
		
	}

}
