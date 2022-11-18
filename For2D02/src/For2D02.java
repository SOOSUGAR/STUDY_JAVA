import java.util.Scanner;


// 정사각형 출력
public class For2D02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정사각형을 출력합니다.");
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++) { // 행을 담당
			for(int j = 1 ; j <= n ; j++) { // 열을 담당
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
	

}
