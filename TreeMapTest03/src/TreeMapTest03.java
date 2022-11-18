import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest03 {
	public static void main(String[] args) {
		// 키 : 점수, 값 : 학생이름
		TreeMap<Integer, String> map = new TreeMap<>();
		
		// 데이터 추가
		map.put(87, "우영우");
		map.put(98, "이준호");
		map.put(75, "최수연");
		map.put(95, "정명석");
		map.put(80, "권민우");
		System.out.println(map);
		
		// 1.
		Map.Entry<Integer, String> entry = map.firstEntry();
		System.out.println("가장 낮은 점수 : " + entry.getKey() + " (" + entry.getValue() + ")");
		
		entry = map.lastEntry();
		System.out.println("가장 높은 점수 : " + entry.getKey() + " (" + entry.getValue() + ")");
		
		System.out.println("가장 낮은 점수 : " + map.firstKey());
		System.out.println("가장 높은 점수 : " + map.lastKey());
		
		// 2.
		entry = map.lowerEntry(95);
		System.out.println("95점 바로 아래 점수 : " + entry.getKey() + " (" + entry.getValue() + ")");
		
		entry = map.higherEntry(95);
		System.out.println("95점 바로 위의 점수 : " + entry.getKey() + " (" + entry.getValue() + ")");
		
		System.out.println("95점 바로 아래 점수 : " + map.lowerKey(95));
		System.out.println("95점 바로 위의 점수 : " + map.higherKey(95));
		
		// 3.
		entry = map.floorEntry(95);
		System.out.println("95점이거나 바로 아래 점수 : " + entry.getKey() + " (" + entry.getValue() + ")");
		
		entry = map.ceilingEntry(95);
		System.out.println("95점이거나 바로 위의 점수 : " + entry.getKey() + " (" + entry.getValue() + ")");
		
		System.out.println("95점이거나 바로 아래 점수 : " + map.floorKey(95));
		System.out.println("95점이거나 바로 위의 점수 : " + map.ceilingKey(95));
		System.out.println("크기 : " + map.size());
		System.out.println("──────────────────────────────────");
		
		// 출력하면서 데이터를 삭제하는 방법
		// pollFirstEntry() : 첫 번째 데이터부터 꺼내어 삭제
		// pollLastEntry() : 마지막 데이터부터 꺼내어 삭제
		while(!map.isEmpty()) {
			//entry = map.pollFirstEntry();
			entry = map.pollLastEntry();
			System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
		}
		System.out.println("크기 : " + map.size());
	}

}
