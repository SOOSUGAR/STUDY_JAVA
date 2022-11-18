import java.util.Scanner;

/*
직각 삼각형 만들기
< 입력 화면 설계 >
가로 입력 : 5

< 출력 화면 설계 >
*
**
***
****
*****

*/

public class For2D04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 입력 : ");
		int n = sc.nextInt();
		
		/*
		for( int i = 1 ; i <= n ; i++ ) {
			for( int j = 1 ; j <= i ; j++ ) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		*/
		
		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
		sc.close();
	}

}
