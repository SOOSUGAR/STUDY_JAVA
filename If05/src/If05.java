
/* ����1) ����, ����, ���� ������ �Է��� ��, ����, ���, ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
- ������ ����� �������� 90�� �̻��ϸ� A, 80�� �̻��̸� B, 70�� �̻��̸� C, 60�� �̻��̸� D, �� �̸��̸� F
- if������ �ۼ��Ͻÿ�.

< �Է� ȭ�� ���� > 
 ���� ���� �Է�: 93
 ���� ���� �Է�: 93
 ���� ���� �Է�: 92 


 < ��� ȭ�� ���� >
 ����: 278
 ���: 92.67
 ����: A
*/
import java.util.Scanner;
public class If05 {
	public static void main(String[] args) {
		// ���� ����
		Scanner sc = new Scanner(System.in);
		
		// �Է� ȭ��
		System.out.println("����, ����, ���� ������ �Է��Ͻÿ�.");
		System.out.print("���� ���� �Է�:");
		int a = sc.nextInt();
		System.out.print("���� ���� �Է�:");
		int b = sc.nextInt();
		System.out.print("���� ���� �Է�:");
		int c = sc.nextInt();
		
		// ��� - ����, ���
		int sum = a + b + c; 
		double ave = (double)sum / 3;
		
		// ��� - ����
		char grade;
		if (ave >= 90) {
			grade = 'A';
		} else if (ave >= 80) {
			grade = 'B';
		} else if (ave >= 70) {
			grade = 'C';
		} else if (ave >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		// ��� ȭ��
		System.out.printf("����: %d\n���: %.2f\n����: %c\n", sum, ave, grade);
		
		sc.close();
	}
	
}
