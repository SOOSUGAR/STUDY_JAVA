import java.util.Scanner;

/*
2차원 반복문 활용 - 완전수 판별
완전수(Perfect Number) - 자신을 제외한 약수와 합이 자신과 같아지는 수
문제) 정수 1개를 입력하여 입력한 정수 범위에서 모든 완전수를 출력하고,
완전수의 개수와 합계를 구하시오.

< 입력 화면 설계 >
정수 범위 입력 : 10000

< 출력 화면 설계 >
6 28 496 8128
2부터 10000까지 범위의 완전수 개수 : 4
2부터 10000까지 범위의 완전수 합계 : 8658

*/

public class For2D09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력한 수의 범위 안에 있는 완전수를 출력합니다.");
		System.out.print("정수 범위 입력 : ");
		int n = sc.nextInt();
		
		int sum = 0, count = 0;
		
		for(int i = 2; i <= n; i++) {
			int x = 0;
			for(int j = 1; j <= i/2; j++) {
				if(i%j == 0) {
					x += j;
				} 
			}
			if(x == n) {
				System.out.print(i + " ");
				count++;
				sum += i;
			} 
		}
		
		System.out.printf("\n1부터 %d까지 범위의 완전수 개수 : %d\n", n, count);
		System.out.printf("1부터 %d까지 범위의 완전수 합계 : %d\n", n, sum);
		
		sc.close();
	}

}
