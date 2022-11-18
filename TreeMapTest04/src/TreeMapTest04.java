import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest04 {
	public static void main(String[] args) {
		// Ű : ����, �� : �л��̸�
		TreeMap<Integer, String> map = new TreeMap<>();
		
		// ������ �߰�
		map.put(87, "�쿵��");
		map.put(98, "����ȣ");
		map.put(75, "�ּ���");
		map.put(95, "����");
		map.put(80, "�ǹο�");
		System.out.println("�������� ���� : " + map);
		
		NavigableMap<Integer, String> map2 = map.descendingMap();
		System.out.println("�������� ���� : " + map2);
		System.out.println("��������������������������������������������������������������������������������������������������������");
		
		// 95������ ���� ���� ���� �κи� ����(�ش� ���� ������)
		SortedMap<Integer, String> map3 = map.headMap(95);
		System.out.println("95������ ���� ���� ���� �κи� : " + map3);
		// 95������ ū ���� ���� �κи� ���� (�ش� ���� ����)
		SortedMap<Integer, String> map4 = map.tailMap(95);
		System.out.println("95������ ū ���� ���� �κи� : " + map4);
		
		System.out.println("��������������������������������������������������������������������������������������������������������");
		
		// 95������ ���� ���� ���� �κи� ���� (�ش� ���� ����)
		SortedMap<Integer, String> map5 = map.headMap(95, true);
		System.out.println("95������ ���� ���� ���� �κи� : " + map5);
		// 95������ ū ���� ���� �κи� ���� (�ش� ���� ������)
		SortedMap<Integer, String> map6 = map.tailMap(95, false);
		System.out.println("95������ ū ���� ���� �κи� : " + map6);
	}

}
