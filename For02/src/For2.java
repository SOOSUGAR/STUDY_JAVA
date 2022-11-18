import java.util.Scanner;

// 문제) 정수를 입력하여, 1부터 1씩 증가하여 입력한 수까지의 정수 중에서 홀수를 출력하고, 
// 홀수의 개수와 합계를 출력하시오.
public class For2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();
		
		int sum = 0, count = 0;
		
		/*
		for(int i = 1 ; i%2 != 0 && i <= n; i += 2) { // for( 초기값 ; 조건 ; 증감값 )
			System.out.println(i);
			sum += i;
			count += 1;
		}
		
		System.out.printf("개수는 %d개, 합계는 %d입니다.", count, sum);
		*/
	
		for(int i = 1; i <= n; i++){
			if(i%2 == 1) {
				System.out.print(i + " ");
				++count;
				sum += i;
			}
		}
		
		System.out.printf("\n개수는 %d개, 합계는 %d입니다.\n", count, sum);
		
		sc.close();
	}

}
