import java.util.Scanner;

/*
< 메소드와 1차원 배열의 활용 >
문제) A반 학생 수를 입력하여 int형 배열 scores를 생성하고, 총점/평균/최고점수/최저점수를 구하는 프로그램을 작성하시오.
- 학생수를 입력하여 배열을 생성하는 부분을 메소드로 만들어 구현하시오.
- 각 학생의 점수를 입력하는 부분을 메소드로 만들어 구현하시오.
- 총점, 평균, 최고점수, 최저점수를 구하는 부분을 각각 메소드로 만들어 구현하시오.
- 각 학생의 점수를 출력하는 메소드를 만들어 구현하시오.
- 메소드명: putCount, intputScore, calcTot, calcAve, caleMax, calcMin. outputScore
*/
public class Method07 {
	static Scanner sc = new Scanner(System.in);
	
	// 1. 학생 수
	static int[] putCount(Scanner sc) {
		System.out.print("A반 학생수 입력 : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		return a;
	}
	
	// 2. 점수
	static void intputScore(int[] a, Scanner sc) {
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%d번 학생 점수 : ", i+1);
			a[i] = sc.nextInt();
		}
	}
	
	// 3. 총점
	static int calcTot(int[] a) {
		int tot = 0;
		for(int i = 0; i < a.length; i++) {
			tot += a[i];
		}
		return tot;
	}
	
	// 4. 평균
	/*static double calcAve(int tot, int n) {
		double ave = (double)tot / n;
		return ave;
	}
	*/
	static double calcAve(int[] a) {
		int tot = 0;
		for(int i = 0; i<a.length; i++) {
			tot += a[i];
		}
		return (double)tot / a.length;
	}
	
	// 5. 최고 점수
	static int calcMax(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	
	// 6. 최저 점수
	static int calcMin(int[] a) {
		int min = a[0];
		for(int i = 1; i<a.length; i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}
	
	// 7. 각 학생의 점수 출력
	static void outputScore(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%2d번 학생 점수 : %3d점\n", i+1, a[i]);
		}
	}
	
	public static void main(String[] args) {
		
		// 학생수 입력
		int[] scores = putCount(sc);
		
		// 각 학생의 점수 입력
		intputScore(scores, sc);
		
		// 총점 계산
		int tot = calcTot(scores);
		
		// 평균
		double ave = calcAve(scores);
		
		// 최고 점수
		int max = calcMax(scores);
		
		// 최저 점수
		int min = calcMin(scores);
		
		// 점수 출력
		outputScore(scores);
		
		// 총점, 평균, 최고/최저 점수 출력
		System.out.printf("총점 : %d\n평균 : %.2f\n최고 점수 : %d\n최저 점수 : %d\n", tot, ave, max, min);
		
	}
}
