import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest02 {
	public static void main(String[] args) {
		// TreeSet 생성
		TreeSet<String> set = new TreeSet<String>();
		
		// 데이터 추가 - 순서가 없음, 오름차순으로 정렬
		set.add("우영우"); set.add("이준호"); set.add("최수연"); set.add("정명석"); set.add("권민우");
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 다른 데이터 추가 - 중복되지 않은 데이터 허용
		set.add("태수미");
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 다른 데이터 추가 - 중복 데이터 허용 불가
		set.add("정명석");
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 데이터 삭제
		set.remove("이준호");
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 출력 1 - 확장 for문
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("──────────────────────────────");
		
		// 출력 2 - Iterator
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
	}

}
