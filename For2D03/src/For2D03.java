import java.util.Scanner;

/* ���簢�� �����
< �Է� ȭ�� ���� >
���� �Է� : 6
���� �Է� : 4

< ��� ȭ�� ����  >
******
******
******
******

*/
public class For2D03 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.print("���� �Է� : ");
		 int width = sc.nextInt();
		 System.out.print("���� �Է� : ");
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
