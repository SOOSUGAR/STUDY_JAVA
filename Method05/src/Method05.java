import java.util.Scanner;

// 문제) 정수 3개를 입력하여, 그 중에서 최대값과 최솟값을 구하는 프로그램을 작성하시오.
// 최대값을 구하는 부분, 최솟값을 구하는 부분을 각각 메소드로 만들어 구현하시오.
// 메소드명 : calcMax, calcMin
public class Method05 {
	
	static void calcMax(int a, int b, int c) {
		int max = a;
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		System.out.println("최대값 : " + max);
	}
	
	static void calcMin(int a, int b, int c) {
		int min = a;
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		System.out.println("최소값 : " + min);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("최대값과 최솟값을 산출합니다.");
		System.out.print("정수 1 입력 : ");
		int a = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		int b = sc.nextInt();
		System.out.print("정수 3 입력 : ");
		int c = sc.nextInt();
		
		calcMax(a, b, c);
		calcMin(a, b, c);
		
		sc.close();
	}

}
