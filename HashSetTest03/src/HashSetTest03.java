import java.util.HashSet;

public class HashSetTest03 {
	public static void main(String[] args) {
		// 1. 해시셋 생성
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		
		// 2. 데이터 추가
		set1.add("우영우"); set1.add("최수연"); set1.add("이준호"); set1.add("정명석"); set1.add("권민우");
		set2.add("우영우"); set2.add("이준호"); set2.add("동그라미"); 
		System.out.println("set 1 : " + set1);
		System.out.println("set 1의 크기 : " + set1.size());
		System.out.println("set 2 : " + set2);
		System.out.println("set 2의 크기 : " + set2.size());
		System.out.println();
		
		// 3. contains() : 셋에 해당 데이터가 있는지의 여부 판별 (데이터 1개 확인)
		System.out.println(set1.contains("정명석"));
		System.out.println(set1.contains("방구뿡"));
		System.out.println();
		
		// 4. containsAll() : 셋에 다른 셋의 데이터를 모두 포함하는지의 여부 판별(set끼리 비교)
		System.out.println(set1.containsAll(set2));
		System.out.println();
		
		// 5. addAll() : 셋에 다른 셋의 모든 데이터를 추가(중복 데이터는 허용하지 않음)
		set1.addAll(set2);
		System.out.println("set1 : " + set1);
		System.out.println("set 1의 크기 : " + set1.size());
		System.out.println();
		
		// 6. 셋에 해당 데이터가 있는지의 여부 판별
		System.out.println(set1.containsAll(set2));
		System.out.println();
		
		// 7. removeAll() : 셋에서 다른 셋의 모든 데이터를 모두 삭제
		set1.removeAll(set2);
		System.out.println("set1 : " + set1);
		System.out.println("set 1의 크기 : " + set1.size());
		
		// 8. clear() : 셋의 모든 데이터 삭제
		set1.clear();
		System.out.println("set1 : " + set1);
		System.out.println("set 1의 크기 : " + set1.size());
		
	}

}
