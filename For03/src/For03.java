import java.util.Scanner;

// 문제) 정수를 입력하여, 1부터 1씩 증가하여 입력한 수까지에서 3의 배수이면서 4의 배수인 수를 출력하고,
// 개수와 합계를 구하시오.
public class For03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();
		
		int sum = 0, count = 0;
		
		for( int i = 1; i <= n; i++) {
			if(i%3 == 0 && i%4 ==0) {
				System.out.print(i + " ");
				count++;
				sum += i;
			}	
		}
		
		System.out.printf("\n개수는 %d, 합계는 %d 입니다.", count, sum);
		
		sc.close();
	}

}
