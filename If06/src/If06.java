
// 문제) 정수 1개를 입력하여 1자리 수인지, 2자리 수 이상인지를 판별하시오.

import java.util.Scanner; // 단축키 : Ctrl + Shift + O 

public class If06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 참조형 변수 선언
		
		System.out.print("정수를 입력하시오 : ");
		int n = sc.nextInt(); // 정수형 입력창. 문자열일 땐, next 사용
		
		// 1번 째 방법 : 범위
		if(n >= 10 || n <= -10 ) {
			System.out.print("입력하신 정수는 2자리 수 이상입니다.");
		} else if ( n < 10 && n > -10 ) {
			System.out.print("입력하신 정수는 1자리 수 입니다.");
		} else {
			System.out.print("정수를 입력해주세요.");
		}
		
		/* 2번 째 방법 : 나누기 몫 -> n을 10으로 나누었을 때, 몫이 0이라면 1자리 수
		 if(n/10 == 0) {
		 	System.out.println("입력하신 정수는 1자리 수 입니다.");
		 } else {
		 	System.out.println("입력하신 정수는 2자리 수 이상입니다.");
		 }
		 */
		
		sc.close(); // 입력 시 import 자동 생성
		
	}

}