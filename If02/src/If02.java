
// 문제1) 정수 1개를 입력하여 홀수인지, 짝수인지를 판별하시오.
import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 : ");
		int n = sc.nextInt();
		
		if(n % 2 == 1) {
			System.out.print("입력하신 정수는 홀수입니다.");
		} else if (n % 2 == 0) {
			System.out.print("입력하신 정수는 짝수입니다.");
		} else {
			System.out.print("정수를 입력해주세요.");
		}
		
		sc.close();
		
		
	}

}
