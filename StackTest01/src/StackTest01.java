import java.util.Stack;

/*
< Stack(스택) >
- 밑이 막혀 있는 통처럼 생긴 데이터 구조
- 선입후출 구조, FILO(First in Last Out)
- push : 데이터 삽입
- pop : 데이터 추출
*/
public class StackTest01 {
	public static void main(String[] args) {
		// 스택 생성
		Stack<Integer> st1 = new Stack<Integer>();
		System.out.println(st1);
		
		// 데이터 삽입
		st1.push(10); st1.push(20); st1.push(30); st1.push(40); st1.push(50);
		System.out.println(st1);
		
		// 데이터 추출
		while(!st1.isEmpty()) { // turn(비었다면), false(비지않았다면)로 반환 -> ! 부정해서 반대로 적용
			System.out.println(st1.pop()); // 마지막에 넣은 것부터 추출됨
		}
		
		System.out.println(st1); // 모두 추출했기 때문에 남은 것이 없음
		System.out.println("────────────────────────────");
		
		// 스택 생성
		Stack<String> st2 = new Stack<String>();
		System.out.println(st2);
		
		// 데이터 삽입
		st2.push("우영우"); st2.push("최수연"); st2.push("정명석"); st2.push("이준호"); st2.push("권민우");
		System.out.println(st2);
		
		// 데이터 추출
		while(!st2.isEmpty()) {
			System.out.println(st2.pop());
		}
		
		System.out.println(st2);
		
	}

}
