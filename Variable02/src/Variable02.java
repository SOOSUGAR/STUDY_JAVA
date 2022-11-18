
/*
변수(variable)의 상수
1. 변수 - 값을 변경할 수 있음

2. 상수 - 값을 변경할 수 없음
final 상수 - 변수를 상수로 만드는 명령, 변경불가한 값으로 설정, 상수명은 전체를 대문자로 표기형,
선언하고 최초로 넣은 값을 변경하지 못함 , 

 */
public class Variable02 {
	public static void main (String[] args) {
		double redies = 5.5; 
		//final double p1 = 3.14;
		//final double P1 = 3.14;
		final double P1;

		P1 = 3.14;
		//P1 = 3.5; 에러 발생, 최초의 값을 변경하려고했기 때문
		
		
		//p1 =3.5;
		
		System.out.println("반지름: " + redies);
		System.out.println("원주율: " + P1);
	};
}
