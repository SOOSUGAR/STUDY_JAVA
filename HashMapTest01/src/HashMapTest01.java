import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
< Map의 특징 >
1. 키(key)와 값(value)의 쌍이 하나의 데이터를 이루는 구조
2. 순서가 없음
3. 키는 중복을 허용하지 않음
4. 값은 중복을 허용
Hashtable : HashMap의 이전 버전, 쓰레드의 동기화 부분이 있어서 성능 저하
HashMap : 쓰레드의 동기화 부분을 제거하여 성능 개선
*/
public class HashMapTest01 {
	public static void main(String[] args) {
		// HashMap 생성
		// 키 : 이름, 값 : 값
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		// 데이터 추가 - 순서 없음
		map.put("우영우", 95); 
		map.put("이준호", 87);
		map.put("정명석", 75);
		map.put("최수연", 68);
		map.put("권민우", 82);
		System.out.println(map);
		
		// 키 확인 - 새로운 키
		map.put("태수미", 77);
		
		// 키 확인 - 중복된 키를 삽입 -> 중복 키는 허용하지 않음(값은 나중의 값으로 대체)
		map.put("최수연", 93);
		System.out.println(map);
		
		// 값 확인 - 중복된 값 -> 허용
		map.put("한선영", 95);
		System.out.println(map);
		
		// 데이터를 삭제하는 방법
		// 1. 키 만으로 데이터를 삭제
		map.remove("권민우");
		System.out.println(map);
		
		// 2. 키와 값을 모두 만족할 때 삭제 -> 키는 같아도 값이 다르면 삭제되지 않음
		map.remove("이준호", 87);
		System.out.println(map);
		
		// 모든 학생에 대하여 총점과 평균을 구하시오
		int tot = 0;
		double ave = 0.0;
		
		// 3. 데이터를 출력하는 방법
		// 출력 1 - Iterator
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next(); // key
			int score = map.get(name); // value
			tot += score;
			System.out.println(name + " : " + score);
		}
		ave = (double)tot / keys.size();
		System.out.println("크기 : " + map.size());
		System.out.printf("총점 : %d , 평균 : %.2f\n", tot, ave);
		System.out.println("───────────────");
		
		// 출력 2 - Iterator
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<String, Integer> entry = it2.next();
			String name = entry.getKey();
			int score = entry.getValue();
			System.out.println(name + " : " + score);
		}
		System.out.println("크기 : " + map.size());
		System.out.println("───────────────");
		
		// 출력 3 - 확장 for문, entrySet()
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		for(Map.Entry<String, Integer> e : entrys) {
			String name = e.getKey();
			int score = e.getValue();
			System.out.println(name + " : " + score);
		}
		System.out.println("───────────────");
		
		// 출력 4
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("───────────────");
		
		
		
		
		
	}

}
