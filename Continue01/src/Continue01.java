
/*
< continue문 >
1. 반복문 안에서  continue문을 만나면, 반복문의 끝으로 이동
2. continue문과 반복문의 끝 사이에 있는 실행문이 실행되지 않음
3. continue문과 반복문 사이의 끝 사이에 있는 실행문의 제거, 생략 
*/

// 문제) 1부터 10사이의 정수 중에서 3의 배수만 제외하고 출력하시오.
public class Continue01 {
	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 10 ; i++) {
			if(i%3 == 0) {
				continue; // -> 3의 배수일 때만 반복문의 끝지점으로 이동
			}
			System.out.println(i);
			  // 반복문의 끝지점
		}
		
	}

}
