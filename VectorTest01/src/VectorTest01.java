import java.util.Vector;

/*
< List 계열 >
1. 크기가 고정되지 않은 가변적인 배열 구조
2. 순서가 있고, 데이터의 중복을 허용
3. Vector, ArratList, LinkedList, Stack, Queue ...
*/
public class VectorTest01 {
	public static void main(String[] args) {
		// 1. 벡터 생성
		// raw 타입 - 원시 타입, 여러가지 데이터를 넣어서 사용하는 것(지양)
		// -> generic 타입 - 구체화된 타입, 한 가지 종류의 데이터만 넣어서 사용(권장)
		Vector v1 = new Vector();
		
		// 2. 데이터 삽입
	      v1.add("30");   // 문자열
	      v1.add(10);      // 정수
	      v1.add("오백");   // 문자열
	      // v1.add(true);   // boolean
	      v1.add(3.14);   // 실수
	      
	    // 3. 출력 1번 - 기본 for문
	    double tot = 0.0;
	    for(int i = 0; i<v1.size(); i++) {
	    	//tot += v1.get(i);
	    	System.out.println(v1.get(i));
	    }
		System.out.println("──────────────");
    
	    // 4. 출력 2번- 확장 for문
		/*
		for(Object o : v1) {
			System.out.println(o);
		}
		System.out.println("──────────────");
		*/
		
		// 1. 벡처 생성 -> generic 타입
		Vector<Integer> v2 = new Vector<Integer>();
		// Vector(Integer> v2 = new Vector<>(); // 허용
		
		v2.add(new Integer(10));	// 박싱
		v2.add(10);					// 오토방식
		v2.add(30);
		v2.add(40);
		//v2.add(3.14); // 에러 : int형의 데이터를 저장하는 벡터 v2에 double형의 데이터를 저장할 수 없음
		v2.add(50);
		
		// 3. 출력 - 기본 for문
		int sum = 0;
		for(int i = 0; i<v2.size(); i++) {
			sum += v2.get(i);
			System.out.println(v2.get(i));
		}
		System.out.println("합계 : " + sum);
		System.out.println("──────────────");
		
		// 4. 출력
		for(int i : v2) {
			System.out.println(i);
		}
		System.out.println("──────────────");
		
		// 5. 벡터 확인
		System.out.println(v2.toString());
		System.out.println(v2); // toString 생략가능
		
	}

}
