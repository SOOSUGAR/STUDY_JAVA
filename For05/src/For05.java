import java.util.Scanner;

/*
문제) 정수 1개를 입력하여, 입력한 수의 팩토리얼 구하시오.
< 입력 화면 설계 >
정수 입력 : 5

< 출력 화면 설계 > 
5! = 1 * 2 * 3 * 4 * 5 = 120


*/
public class For05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int fact = 1;
		
		System.out.print(n + "! = " );
		
		for(int i = 1; i <= n ; i++) {
			fact = fact * i;
			
			if(i == n) {
				System.out.print(i);
				break;
			}
			
			System.out.print(i + " * ");
		}
		
		/*
		 	System.out.print(i);
			if(i < n) {
				System.out.print(" * "); // n보다 작은 수까지 *를 기재
			}
		*/
		
		System.out.print(" = " + fact);
		
		sc.close();
	}

}
