import java.util.HashSet;
import java.util.Iterator;

/*
< Set 계열 >
1. 순서(인덱스)가 없다
2. 중복 데이터를 허용하지 않는다
3. HashSet, TreeSet ...
*/
public class HashSetTest01 {
	public static void main(String[] args) {
		// 1. 해시셋 생성
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.println(set);
		
		// 2. 데이터 추가 - 데이터를 넣은 순서대로 나오지 않음
		set.add(66); set.add(75); set.add(57); set.add(96); set.add(45);
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 3. 데이터 추가 - 중복 데이터
		set.add(57); // 중복 데이터는 허용하지 않음
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 4. 데이터 추가 - 중복되지 않은 데이터의 추가
		set.add(83);
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 5. 데이터 삭제 - 존재하는 데이터
		set.remove(96);
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 6. 데이터 삭제 - 존재하지 않는 데이터
		set.remove(30); // 에러 X (예외처리가 되어있음)
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 7. 출력 1 - 확장 for문
		int tot = 0;
		for(int i : set) {
			tot += i;
			System.out.println(i);
		}
		System.out.println("총점 : " + tot);
		System.out.println("────────────────────────────");
		
		// 8. 출력 2 - Iterator
		tot = 0;
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int n = it.next();
			tot += n;
			System.out.println(n);
		}
		System.out.println("총점 : " + tot);
		
	}

}
