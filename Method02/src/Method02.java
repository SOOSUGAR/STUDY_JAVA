import java.util.Scanner;

// 문제) 원의 반지름을 입력하여 원의 면적과 둘레를 구하시오.
// 원의 면적과 둘레는 메소드를 만들어 사용하시오.
public class Method02 {
	
	// 원의 면적을 구하는 메소드
	static double calcArea(double r) {
		double area = Math.PI * r * r; 
		return area;
	}
	
	// 원의 둘레를 구하는 메소드
	static double calcPerimeter(double r) {
		double perimeter = 2 * Math.PI * r;
		return perimeter;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원의 반지름을 입력하시오 : ");
		double radius = sc.nextInt();
		
		double area = calcArea(radius);
		double perimeter = calcPerimeter(radius);
		
		System.out.printf("면적은 %.2f, 둘레는 %.2f 입니다.", area, perimeter);
		
		
		sc.close();
	}

}
