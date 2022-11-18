import java.util.Scanner;

/*
문제) x의 y승을 구하는 프로그램을 작성하시오.
x는 실수 입력, y는 정수 입력을 하도록 하시오.
x의 y승을 계산하는 부분을 메소드로 정의하여 구현하시오. 메소드명 : calcPower
*/
public class Method03 {
	
	// x의 y승을 구하는 메소드
	static double calcPower(double x, int y) {
		double power = 1.0;
		for(int i = 0; i < y; i++) {
			power *= x;
		}
		return power;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x의 y승을 계산합니다.");
		System.out.print("실수 x 입력 : ");
		double x = sc.nextDouble();
		System.out.print("정수 y 입력 : ");
		int y = sc.nextInt();
		
		double power = calcPower(x, y);
		
		System.out.printf("%.2f승의 %d승은 %.4f\n", x, y, power);
		
		sc.close();
	}

}
