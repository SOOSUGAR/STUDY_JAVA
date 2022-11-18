import java.util.Scanner;
/*
 문제) 국어, 영어, 수학 점수를 입력하여, 총점과 평균을 계산하는 프로그램을 작성하시오.
< 입력 화면 설계 >
국어 점수 입력: 93
영어 점수 입력: 93
수학 점수 입력: 92

< 출력 화면 설계 >
총점: 278
평균: 92.66666666666667
*/

// ★★★
// Casting(캐스팅) : 강제로 데이터 타입을 변경하는 것
public class Casting01 {
	public static void main(String[] args) {
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		
		// 입력 화면
		System.out.print("국어 점수 입력: ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력: ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력: ");
		int mat = sc.nextInt();
		
		// 계산
		int sum = kor + eng + mat;
		// double ave = sum / 3.0; // *이항수치승격 : 계산식에서 데이터 타입이 서로 다를 때, 더 큰 쪽에 맞추어짐
		double ave = (double)sum / 3; // 캐스팅
		
		// 결과 출력
		//System.out.println("총점: " + sum);
		//System.out.println("평균: " + ave);
		
		//System.out.printf("총점: %d\n", sum);
		//System.out.printf("평균: %6.2f\n", ave);
		System.out.printf("총점: %d\n평균: %6.2f\n", sum, ave);
		
		
		sc.close();
	}

}
