import java.util.Scanner;

/* ����) �Ǽ� x�� ���� y�� �Է��Ͽ�, x�� y���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
< �Է� ȭ�� ���� >
x�� y���� ����մϴ�.
x �Ǽ� �Է� : 5.5
y �Ǽ� �Է� : 3

< ��� ȭ�� ���� >
5.5�� 3���� 1663.375�Դϴ�.
 
*/
public class For06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x�� y���� ����մϴ�.");
		System.out.print("�Ǽ� x �Է� : ");
		double x = sc.nextDouble();
		System.out.print("���� y �Է� : ");
		int y = sc.nextInt();
		
		double power = 1.0;
		
		System.out.print(x + "�� " + y + "���� ");
		
		for( int i = 1 ; i <= y ; i++ ) {
			power *= x;
		}
		
		System.out.print(power + "�Դϴ�."); // System.out.printf("%.1f�� %d���� %.3f�Դϴ�.", x, y, power); 
		
		sc.close();
	}

}
