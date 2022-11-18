import java.util.LinkedList;
import java.util.Queue;

/*
< Queue(큐) >
- 한 방향으로  데이터가 이동하는 파이프처럼 생긴 저장 구조
- 선입선출, FIFO(First In First Out)
- offer : 데이터 삽입
- poll : 데이터 추출
*/
public class QueueTest01 {
	public static void main(String[] args) {
		// 큐 생성
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		// 데이터 넣기
		q1.offer(10); q1.offer(20); q1.offer(30); q1.offer(40); q1.offer(50);
		System.out.println(q1);
		
		// 데이터 꺼내기
		while(!q1.isEmpty()) {
			System.out.println(q1.poll());
		}
		System.out.println(q1);
		System.out.println("────────────────────────────");
		
		// 큐 생성
		Queue<String> q2 = new LinkedList<String>();
		
		// 데이터 넣기
		q2.offer("우영우"); q2.offer("최수연"); q2.offer("정명석"); q2.offer("이준호"); q2.offer("권민우");
		
		// 데이터 꺼내기
		while(!q2.isEmpty()) {
			System.out.println(q2.poll());
		}
		System.out.println(q2);
		System.out.println("────────────────────────────");
		
		
	}

}
