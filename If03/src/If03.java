
// 문제1) 정수 1개를 입력하여 3의 배수이면서 4의 배수인지를 판별하시오.

import java.util.Scanner;
public class If03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		int n = sc.nextInt();
		
		if(n % 3 == 0 && n % 4 == 0) {
			System.out.print(n + "은/는 3의 배수이고 4의 배수입니다.");
		} else {
			System.out.print(n + "은/는 3과 4의 배수가 아닙니다.");
		}
		
		sc.close();
		
	}

}
