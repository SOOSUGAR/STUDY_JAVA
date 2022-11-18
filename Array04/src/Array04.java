
/*
1차원 배열 활용
문제1) A반 5명의 학생 점수 85, 93, 71, 63, 82점을 저장하는 int형의 1차원 배열 scores를 생성하고,
A반 각 학생의 점수를 출력한 뒤, 총점과 평균을 계산하시오.
*/
public class Array04 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[]{85, 93, 71, 63, 82};
		int sum = 0;
		double ave = 0.0;
		
		for(int i = 0; i<scores.length; i++) {
			System.out.printf("A반 %d번 째 학생의 점수 : %d\n", i+1, scores[i]);
			sum += scores[i];
		}
		
		ave = (double)sum/scores.length;
		
		System.out.printf("\n총점은 %d, 평균은 %.2f 입니다.", sum, ave);
		
	}

}
