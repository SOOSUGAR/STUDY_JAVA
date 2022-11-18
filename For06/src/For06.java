import java.util.Scanner;

/* 문제) 실수 x와 정수 y를 입력하여, x의 y승을 구하는 프로그램을 작성하시오.
< 입력 화면 설계 >
x의 y승을 출력합니다.
x 실수 입력 : 5.5
y 실수 입력 : 3

< 출력 화면 설계 >
5.5의 3승은 1663.375입니다.
 
*/
public class For06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x의 y승을 출력합니다.");
		System.out.print("실수 x 입력 : ");
		double x = sc.nextDouble();
		System.out.print("정수 y 입력 : ");
		int y = sc.nextInt();
		
		double power = 1.0;
		
		System.out.print(x + "의 " + y + "승은 ");
		
		for( int i = 1 ; i <= y ; i++ ) {
			power *= x;
		}
		
		System.out.print(power + "입니다."); // System.out.printf("%.1f의 %d승은 %.3f입니다.", x, y, power); 
		
		sc.close();
	}

}
