
// java 안에 util 패키지의 Scanner 클래스를 import 함
// Scanner 클래스 : 콘솔(키보드)로부터 값을 입력받는 클래스
// Scanner 클래스를 사용함으로써 대화식 프로그램을 작성할 수 있음
// System.in : 입력 스트림
// System.out : 출력 스트림
import java.util.Scanner; 

// 문제) 반지름을 입력하여 원의 면적과 둘레를 구하는 프로그램을 작성하시오.
public class Scanner01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // *sc = 참조 변수, Scanner 클래스 안의 메소드
		
		System.out.print("반지름 입력: ");
		double radius = sc.nextDouble();
		final double PI = 3.141592;
		
		double area = PI * radius * radius;
		double perimeter = 2 * PI * radius;
		
		System.out.println("원의 면적: " + area);
		System.out.println("원의 둘레: " + perimeter);
		
		sc.close();
	}

}
