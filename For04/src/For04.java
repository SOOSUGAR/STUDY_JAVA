import java.util.Scanner;

// 문제) 정수 1개를 입력하고, 입력한 수의 약수를 출력하고,
// 약수의 개수와 합계를 출력하시오.
public class For04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();		
		int sum = 0, count = 0;
		
		for(int i = 1; i <= n ; i++) { // for( 초기값 ; 조건 ; 증감값 )
			if(n % i == 0) {
				System.out.print(i + " ");
				count++;
				sum += i;
			}
		}
		
		System.out.printf("\n%d의 약수의 개수는 %d이고, 합계는 %d입니다.", n, count, sum);
		
		sc.close();
	}
	
}
