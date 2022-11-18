
/*
< while문의 특징 >
- 반복 횟수를 파악하기 어렵고, 조건이 중심이 될 때 사용하면 효울적
*/

// 문제) 1부터 1씩 누적하여 더해서 그 합이 100이 되기 전까지를 출력하는 프로그램을 작성하시오.
public class While03 {
	public static void main(String[] args) {
		int n = 1, sum = 0;
		
		while(sum+n < 100) {
			sum += n; // 누적 함수식
			System.out.printf("1부터 %d까지의 합은 %d\n", n, sum);
			n++;
		}
		
	}

}
