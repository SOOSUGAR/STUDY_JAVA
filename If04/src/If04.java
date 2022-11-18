
// 문제) a와 b에 각각 정수를 입력하여, 항상 a에는 작은 수가 b에는 큰 수가 저장되도록 프로그램을 작성하시오.
// 스와핑
import java.util.Scanner;
public class If04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력 화면
		System.out.println("정수 a, b를 입력하시오 .");
		System.out.print("a를 입력하시오 : ");
		int a = sc.nextInt();
		System.out.print("b를 입력하시오 : ");
		int b = sc.nextInt();
		
		// 계산
		// swapping(스와핑) - 두 개의 변수의 값을 바꾸는 기본적인 방법
		if(a > b) {
			int t = a;
			a = b;
			b = t;
		}
		
		// 출력 화면
		System.out.printf("a = %d, b= %d\n", a, b);
		
		sc.close();
}

}
