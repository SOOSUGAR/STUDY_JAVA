import java.util.StringTokenizer;

// 문제) 학생들의 점수가 들어있는 str 문자열을 사용하여 학생들의 총점, 평균, 최고점수, 최저점수를 구하시오.
public class WrapperTest02 {
	public static void main(String[] args) {
		String str = "85,88,72,91,56,73,66,87,68,95";
		int sum = 0, max = 0, min = 100;
		double ave = 0.0;
		
		/*
		// 1번 방법 - String의 split() 메소드 사용
		String[] sc = str.split(",");
		int[] scores = new int[sc.length];
		for(int i = 0; i < sc.length; i++) {
			scores[i] = Integer.parseInt(sc[i]);
			sum += scores[i];
		}
		ave = (double)sum / scores.length; 
		
		max = min = scores[0];
		for(int i = 0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
			}
			if(min > scores[i]) {
				min = scores[i];
			}
		}
		
		System.out.printf("총점 : %d\n평균 : %.2f\n최고점수 : %d\n최저점수 : %d", sum, ave, max, min);
		*/
		
		
		// 2번 방법 - String의 StringTokenizer 클래스 사용
		StringTokenizer st = new StringTokenizer(str, ",");
		int count = st.countTokens();
		
		while(st.hasMoreElements()) {
			int n = Integer.parseInt(st.nextToken());
			sum += n;
			if(max < n) {
				max = n;
			}
			if(min > n) {
				min = n;
			}
		}
		ave = (double)sum / count;
		System.out.printf("총점 : %d\n평균 : %.2f\n최고점수 : %d\n최저점수 : %d", sum, ave, max, min);
		
	}

}
