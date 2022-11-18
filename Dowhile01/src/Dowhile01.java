
/*
 < do ~ while문의 형식 >
 초기값;
 
 do {
 	실행문;
 	...
 	증감값;
 } while(조건식); // while문이 아님을 강조하기 위해 ;을 붙임
 
 
 */
public class Dowhile01 {
	public static void main(String[] args) {
		
		int i = 1; // 초기값
		
		do {
			System.out.println(i + " Little Indian.");
			
			i++; // 증감값
		} while(i <= 10); // 조건식
		
		
	}

}
