import java.util.Scanner;

/*
문제2) A반 학생수를 입력하고, 입력한 학생 수 크기의 scores 배열을 생성한 뒤,
각 학생의 점수를 입력하여 각 학생의 점수를 출력, A반의 총점과 평균을 계산하시오.
*/
public class Array05 {
	public static void main(String[] args) {
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double ave = 0.0;
		
		// 입력 화면 1 - 학생 수
		System.out.print("A반 학생 수를 입력하세요 : ");
		int n = sc.nextInt();
		
		// 1차원 배열 생성
		int[] scores = new int[n];
		
		// 입력 화면 2 - 점수
		for(int i = 0; i<scores.length; i++) {
			System.out.print(i+1 + "번 째 학생의 점수를 입력하세요 : ");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		
		// 출력 화면 1 - 각 학생의 점수 출력
		System.out.println("\n─────────────────────");
		for(int i =0; i<scores.length; i++) {
			System.out.println(i+1 + "번 째 학생의 점수는 " + scores[i] + "입니다.");
		}
		
		// 출력 화면 2 - 총점, 평균
		ave = (double)sum/scores.length;
		
		System.out.printf("\n총점은 %d, 평균은 %.2f 입니다.", sum, ave);
		
		sc.close();
	}

}
