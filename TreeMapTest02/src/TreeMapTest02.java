import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/*
문제 ) 
1. 키를 학생이름, 값을 점수로 하는 TreeMap, map을 생성하시오.
2. 맵에 데이터 5개를 추가하시오.
3. 맵에서 중복 키의 허용에 관해 확인하시오.
4. 맵에서 중복 값의 허용에 관해 확인하시오.
5. 맵을 3가지 방법으로 출력하시오.
*/

public class TreeMapTest02 {
	public static void main(String[] args) {
		// 1. map 생성
		TreeMap<String, Integer> map = new TreeMap<>();
		
		// 2. 데이터 추가
		map.put("우영우", 95);
		map.put("최수연", 90);
		map.put("정명석", 85);
		map.put("이준호", 80);
		map.put("권민우", 75);
		//System.out.println(map);
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String s = it.next();
			int score = map.get(s);
			System.out.println("이름 : " + s + ", 점수 : " + score);
		}
		System.out.println("────────────────────────────────────────────────");
		
		// 3. 중복 키 확인
		map.put("우영우", 100);
		System.out.println(map);
		
		// 4. 중복 값 확인
		map.put("태수미", 90);
		System.out.println(map);
		System.out.println("────────────────────────────────────────────────");
		
		// 5. 출력
		// 1) for - entrySet()
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.print("이름 : " + entry.getKey() + ", 점수 : " + entry.getValue() + "\n");
		}
		System.out.println("────────────────────────────────────────────────");
		
		// 2) for - keySet()
		for(String i : map.keySet()) {
			System.out.print("이름 : " + i + ", 점수 : "  + map.get(i) + " \n");
		}
		System.out.println("────────────────────────────────────────────────");
		
		// 3) Iterator
		Iterator<Entry<String, Integer>> entries = map.entrySet().iterator();
		while(entries.hasNext()) {
			Entry<String, Integer> entry = entries.next();
			System.out.println("이름 : " + entry.getKey() + ", 점수 : " + entry.getValue());
		}
		
	}

}
