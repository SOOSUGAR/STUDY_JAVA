
// 문제) A반의 학생 점수를 저장하는 scores 배열에서 최고점수, 최저점수를 구하시오.
// 최고점수를 구하는 부분, 최저점수를 구하는 부분을 각각 메소드로 만들어 구현하시오.
// 메소드명 : calcMax, calcMin
public class Method06 {
	
	static int calcMax(int a[]) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	
	static int calcMin(int b[]) {
		int min = b[0];
		for(int i = 1; i < b.length; i++) {
			if(min > b[i]) {
				min = b[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int [] scores = {55, 77, 83 ,92, 65, 78, 96, 88, 52, 75};
		
		int max = calcMax(scores);
		int min = calcMin(scores);
		
		System.out.printf("최대값 : %d\n최대값 : %d", max, min);
		
	}

}
