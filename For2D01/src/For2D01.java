
/*
< 2차원 반복문 >
- 중첩 반복문, 2중 반복문
- 반복문 안에 반복문이 포함되어 있는 형태의 반복문
- 2차원 형태의 데이터를 다룰 수 있게 됨
*/
public class For2D01 {
	public static void main(String[] args) {
		
		// 1번 - 2차원 for문 
		/*
		for(int i = 2 ; i <= 9; i ++) {
			for(int j = 2 ; j <= 9; j ++) {
				System.out.printf("%d * %d = %2d\n", i, j, i*j);
			}
			System.out.println();
		}
		*/
		
		// 2번 - 2차원 while문
		/*
		int i = 2; // 초기값
		while(i <= 9) {
			int j = 1; // j의 초기값 *j가 반복문 밖에 있으면 1로 초기화 되지 않고 10 그대로, 위치 주의 
			while(j <= 9) { // 조건
				System.out.printf("%d * %d = %2d\n" , i, j, i*j);
				
				j++; // 증감값
			}
			System.out.println();
			
			i++;
		}
		*/
		
		// 3번 - do ~ while문
		int i = 2;
		do {
			int j = 1; // 초기값 위치 주의
			do {
			System.out.printf("%d * %d = %2d\n" , i, j, i*j);
			
			j++;
			} while( j <= 9 );
			
			i++;
			System.out.println();
		} while( i <= 9 );
		
	}

}
