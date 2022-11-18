import java.util.Scanner;

/*
문제 2) 정수 2개와 산술 연산자를 입력하여 산술 연산을 하는 프로그램을 작성하시오.

< 입력 화면 설계 >
정수 1번 입력 : 10
정수 2번 입력 : 5
산술 연산자 입력 : +

< 출력 화면 설계 >
10 + 5 = 5
*/
public class If09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1번 입력 : ");
		int a = sc.nextInt();
		System.out.print("정수 2번 입력 : ");
		int b = sc.nextInt();
		System.out.print("산술 연산자 입력 : ");
		char op = sc.next().charAt(0); // charAt(0) -> 한 문자만 입력받음
		
		// 1번 - if문
		/*
		if(op == '+') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a+b);
		} else if (op == '-') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a-b);
		} else if (op == '%') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a/b);
		} else if (op == '/') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a/b);
		} else if (op == '*') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a*b);
		} else {
			System.out.print("잘못된 입력입니다.");
		}
		*/
		// 2번 - switch문
		
		switch(op) {
		case '+':
			System.out.printf("%d %c %d = %d\n", a, op, b, a+b);
			break;
		case '-':
			System.out.printf("%d %c %d = %d\n", a, op, b, a-b);
			break;
		case '%':
			System.out.printf("%d %c %d = %d\n", a, op, b, a%b);
			break;
		case '/':
			System.out.printf("%d %c %d = %d\n", a, op, b, a/b);
			break;
		case '*':
			System.out.printf("%d %c %d = %d\n", a, op, b, a*b);
			break;
		default:
			System.out.print("잘못된 입력입니다.");
		}
		
		sc.close();
	}

}
