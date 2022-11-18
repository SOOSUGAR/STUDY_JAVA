
// 문제) 6개의 난수를 중복되지 않게 생상하여 로또번호를 담는 int형 1차원 배열 lotto에 저장하고,
// 오름차순으로 정렬하여 출력하시오.
public class RandomNumber02 {
	public static void main(String[] args) {
		// 배열 생성
		int[] lotto = new int[6];
		
		// 배열에 중복되지 않은 난수 6개 저장
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1; // 1 ~ 45까지의 난수
			for(int j = 0; j < i; j++) { // 같은 수 방지
				if(lotto[i] == lotto[j]) { // 이전의 값들과 현재의 값들이 같다면 --i
					--i;
				}
			}
		}
		
		// 선택 정렬
		for(int i = 0; i < lotto.length-1; i++) {
			for(int j = i+1; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int t = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = t;
				}
			}
		}
		
		//출력
		for(int i = 0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	}

}
