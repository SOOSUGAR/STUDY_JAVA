import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest03 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		set.add(87); set.add(98); set.add(75); set.add(95); set.add(80);
		System.out.println(set);
		System.out.println();
		
		System.out.println("가장 작은 점수 : " + set.first());
		System.out.println("가장 큰 점수    : " + set.last());
		
		// lower()/higher() - 해당 점수를 포함하지 않음
		System.out.println("95점 바로 아래 점수 : " + set.lower(95));
		System.out.println("95점 바로 위의 점수 : " + set.higher(95));
		
		// floor()/ceiling() - 해당 점수를 포함
		System.out.println("95점이거나 바로 아래 점수 : " + set.floor(95));
		System.out.println("95점이거나 바로 위의 점수 : " + set.ceiling(95));
		
		// 출력 1 - 확장 for문
		for(int i : set) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("크기 : " + set.size());
		
		
		// 출력 2 - Iterator
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		System.out.println("크기 : " + set.size());
		
		// 출력 3 - isEmpty() 사용
		// - 주의 : 이 방법은 출력하며 데이터를 삭제함 
		// - pollFirst() - 데이터를 앞에서부터 꺼내고 삭제
		// - pollLast() - 데이터를 뒤에서부터 꺼내고 삭제
		while(!set.isEmpty()) {
			System.out.print(set.pollFirst() + " ");
			//System.out.print(set.pollLast() + " ");
		}
		System.out.println();
		System.out.println("크기 : " + set.size());
		
	}

}
