import java.util.Scanner;

/*
2차원 반복문 활용 - 소수 판별(Prime Number)
문제) 정수 1개를 입력하여, 입력한 정수 범위에서 모든 소수를 추력하고,
소수의 개수와 합계를 구하시오.

< 입력 화면 설계 >
정수 입력 : 10

< 출력 화면 설계>
2 3 5 7
1부터 10까지 범위의 소수 개수 : 4
1부터 10까지 범위의 소수 합계 : 17

*/
public class For2D08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력한 수의 범위 안에서 소수를 구합니다.");
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		int sum = 0, count = 0;
		
		for(int i = 2; i <= n; i++) {
			for(int j = 2; j <= i; j++) {
				if(i == j) { // 아래의 break문에 걸리지 않고 끝까지 왔다면, 그 수는 소수 -> i=j가 될 때까지, 자기 자신으로만 나누어 떨어짐
					++count;
					sum += i;
					System.out.print(i + " ");
				}
				if(i%j == 0) { // 자신이 되기 전에 나누어 떨어지면 break를 만나 1개의 바깥 for문으로 넘어감 -> 소수가 아님
					break;
				}
			}
		}
		
		System.out.printf("\n1부터 %d까지 범위의 소수 개수 : %d\n", n, count);
		System.out.printf("1부터 %d까지 범위의 소수 합계 : %d\n", n, sum);
		
		sc.close();
	}

}
