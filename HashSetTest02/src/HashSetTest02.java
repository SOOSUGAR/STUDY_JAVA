import java.util.HashSet;
import java.util.Iterator;

/*
문제 )
1. 문자열을 저장하는 해시셋 set을 생성하고 확인하시오.
2. 셋에 우영우, 이준호, 최수연, 정명석, 권민우를 추가하고 확인하시오.
3. 셋에 중복 데이터를 추가하고 확인하시오.
4. 셋에서 정명석 데이터를 삭제하고 확인하시오.
5. 셋의 모든 데이터를 출력하시오. ( 확장 for문, Iterator )

*/
public class HashSetTest02 {
	public static void main(String[] args) {
		// 1. 셋 생성
		HashSet<String> set = new HashSet<String>();
		
		System.out.println("┎≡≡≡≡≡≡≡≡≡≡≡HashSet≡≡≡≡≡≡≡≡≡≡≡┒");
		// 2. 셋에 데이터 추가
		set.add("우영우"); set.add("이준호"); set.add("최수연"); set.add("정명석"); set.add("권민우");
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		System.out.println("──────────────────────────────");
		
		// 3. 셋에 중복 데이터 추가
		set.add("최수연");
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		System.out.println("──────────────────────────────");
		
		// 4. 정명석 데이터 삭제
		set.remove("정명석");
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		System.out.println("──────────────────────────────");
		
		System.out.println(" - 출력 1 번 - ");
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println("크기 : " + set.size());
		System.out.println("──────────────────────────────");
		
		System.out.println(" - 출력 2 번 - ");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("크기 : " + set.size());
		System.out.println("┖≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡┚");
		
	}

}
