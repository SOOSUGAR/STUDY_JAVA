import java.util.Scanner;

/* 문제1) 국어, 영어, 수학 점수를 입력한 후, 총점, 평균, 학점을 계산하는 프로그램을 작성하시오.
- 학점은 평균을 기준으로 90점 이상하면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 그 미만이면 F
- switch문으로 작성하시오.

< 입력 화면 설계 > 
 국어 점수 입력: 93
 영어 점수 입력: 93
 수학 점수 입력: 92 


 < 출력 화면 설계 >
 총점: 278
 평균: 92.67
 학점: A
 */
public class Switch04 {
	public static void main(String[] args) {
	        // 변수 선언
			Scanner sc = new Scanner(System.in);
			
			// 입력 화면
			System.out.println("국어, 영어, 수학 점수를 입력하시오.");
			System.out.print("국어 점수 입력:");
			int a = sc.nextInt();
			System.out.print("영어 점수 입력:");
			int b = sc.nextInt();
			System.out.print("수학 점수 입력:");
			int c = sc.nextInt();
			
			// 계산 - 총점, 평균
			int sum = a + b + c; 
			double ave = (double)sum / 3;

			// 계산 - 학점
			char grade;
			switch((int)ave/10) {
			case 9: case 10: 
				grade = 'A';
				break;
			case 8: 
				grade = 'B';
				break;
			case 7: 
				grade = 'C';
				break;
			case 6: 
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
			}
			
			// 출력 화면
			System.out.printf("총점: %d\n평균: %.2f\n학점: %c\n", sum, ave, grade);
			
			sc.close();
	}

}
