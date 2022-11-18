import java.util.Scanner;

/* 직사각형 만들기
< 입력 화면 설계 >
가로 입력 : 6
세로 입력 : 4

< 출력 화면 설계  >
******
******
******
******

*/
public class For2D03 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.print("가로 입력 : ");
		 int width = sc.nextInt();
		 System.out.print("세로 입력 : ");
		 int heigth = sc.nextInt();
		 
		 /*
		 for( int i = 1 ; i <= heigth ; i++) {
			 for( int j = 1 ; j <= width ; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 */
		 
		 int i = 1;
		 while( i <= heigth ) {
			 int j = 1;
			 while( j <= width ) {
				 System.out.print("*");
				 j++;
			 }
			 i++;
			 System.out.println();
		 }
		 
		 sc.close();
	 }

}
