import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
문제 )
1. 한영 사전 역할을 하는 HashMap, map을 생성하시오.
2. 맵에 아래의 데이터를 추가하고 확인하시오.
[키 : 값] -> 사과:apple , 호랑이:tiger, 학생:student, 학교:school, 코끼리:elephant, 수박:watermeron, 비행기:airplane  
3. 수박의 값을 watermelon으로 수정하시오.
4. 맵에서 코끼리 데이터를 삭제하시오.
5. 맵에서 사자 데이터를 삭제하시오.
6. 맵의 데이터를 3가지 방법으로 출력하시오.
*/
public interface HashMapTest02 {
	public static void main(String[] args) {
		// 1. map 생성
		HashMap<String, String> map = new HashMap<String, String>();
		
		// 2. 데이터 추가
		map.put("사과", "apple"); map.put("호랑이", "tiger"); map.put("학생", "student"); 
		map.put("코끼리", "elephant"); map.put("수박", "watermeron"); map.put("비행기", "airplane");
		System.out.println(map);
		System.out.println("────────────────────────────────────────────────");
		
		// 3. 수박 값 변경
		map.put("수박", "watermelon");
		System.out.println(map);
		System.out.println("────────────────────────────────────────────────");
		
		// 4. 코끼리 삭제
		//map.remove("코끼리");
		//map.remove("코끼리", "elephant");
		if(map.remove("코끼리") == null) {
			System.out.println("입력한 단어는 존재하지 않습니다.");
		} else {
			System.out.println("단어를 수정하였습니다.");
		}
		System.out.println(map);
		System.out.println("────────────────────────────────────────────────");
		
		// 5. 사자 삭제
		//map.remove("사자");
		if(map.remove("사자") == null) {
			System.out.println("입력한 단어는 존재하지 않습니다.");
		} else {
			System.out.println("단어를 삭제하였습니다.");
		}
		System.out.println(map);
		System.out.println("────────────────────────────────────────────────");
		
		// 6. 출력
		// 출력 1 - 확장 for문
		for(Entry<String, String> entry : map.entrySet()) {
			System.out.print(entry.getKey()+ ":" + entry.getValue() + " \n");
		}
		System.out.println("────────────────────────────────────────────────");
		
		for(String i : map.keySet()) {
			System.out.print(i + " : "  + map.get(i) + " \n");
		}
		System.out.println("────────────────────────────────────────────────");
		
		// 출력 2 - Iterator
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()){
			String k = keys.next();
			System.out.print(k + " : " + map.get(k) + " \n");
		}
		System.out.println("────────────────────────────────────────────────");
		
		// 출력 3 - entrySet()
		Set<Map.Entry<String, String>> en = map.entrySet();
		for(Map.Entry<String, String> e : en) {
			String k = e.getKey();
			String eng = e.getValue();
			System.out.println(k + " : " + eng);
		}
		System.out.println("────────────────────────────────────────────────");
		
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
