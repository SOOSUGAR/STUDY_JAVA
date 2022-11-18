import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
���� )
1. �ѿ� ���� ������ �ϴ� HashMap, map�� �����Ͻÿ�.
2. �ʿ� �Ʒ��� �����͸� �߰��ϰ� Ȯ���Ͻÿ�.
[Ű : ��] -> ���:apple , ȣ����:tiger, �л�:student, �б�:school, �ڳ���:elephant, ����:watermeron, �����:airplane  
3. ������ ���� watermelon���� �����Ͻÿ�.
4. �ʿ��� �ڳ��� �����͸� �����Ͻÿ�.
5. �ʿ��� ���� �����͸� �����Ͻÿ�.
6. ���� �����͸� 3���� ������� ����Ͻÿ�.
*/
public interface HashMapTest02 {
	public static void main(String[] args) {
		// 1. map ����
		HashMap<String, String> map = new HashMap<String, String>();
		
		// 2. ������ �߰�
		map.put("���", "apple"); map.put("ȣ����", "tiger"); map.put("�л�", "student"); 
		map.put("�ڳ���", "elephant"); map.put("����", "watermeron"); map.put("�����", "airplane");
		System.out.println(map);
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// 3. ���� �� ����
		map.put("����", "watermelon");
		System.out.println(map);
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// 4. �ڳ��� ����
		//map.remove("�ڳ���");
		//map.remove("�ڳ���", "elephant");
		if(map.remove("�ڳ���") == null) {
			System.out.println("�Է��� �ܾ�� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("�ܾ �����Ͽ����ϴ�.");
		}
		System.out.println(map);
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// 5. ���� ����
		//map.remove("����");
		if(map.remove("����") == null) {
			System.out.println("�Է��� �ܾ�� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("�ܾ �����Ͽ����ϴ�.");
		}
		System.out.println(map);
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// 6. ���
		// ��� 1 - Ȯ�� for��
		for(Entry<String, String> entry : map.entrySet()) {
			System.out.print(entry.getKey()+ ":" + entry.getValue() + " \n");
		}
		System.out.println("������������������������������������������������������������������������������������������������");
		
		for(String i : map.keySet()) {
			System.out.print(i + " : "  + map.get(i) + " \n");
		}
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// ��� 2 - Iterator
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()){
			String k = keys.next();
			System.out.print(k + " : " + map.get(k) + " \n");
		}
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// ��� 3 - entrySet()
		Set<Map.Entry<String, String>> en = map.entrySet();
		for(Map.Entry<String, String> e : en) {
			String k = e.getKey();
			String eng = e.getValue();
			System.out.println(k + " : " + eng);
		}
		System.out.println("������������������������������������������������������������������������������������������������");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<String, String> entry = it2.next();
			String kor = entry.getKey();
			String eng = entry.getValue();
			System.out.println(kor + " : " + eng);
		}
		
		
	}

}
