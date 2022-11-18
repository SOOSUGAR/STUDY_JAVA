import java.util.Scanner;

/* ����1) ����, ����, ���� ������ �Է��� ��, ����, ���, ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
- ������ ����� �������� 90�� �̻��ϸ� A, 80�� �̻��̸� B, 70�� �̻��̸� C, 60�� �̻��̸� D, �� �̸��̸� F
- switch������ �ۼ��Ͻÿ�.

< �Է� ȭ�� ���� > 
 ���� ���� �Է�: 93
 ���� ���� �Է�: 93
 ���� ���� �Է�: 92 


 < ��� ȭ�� ���� >
 ����: 278
 ���: 92.67
 ����: A
 */
public class Switch04 {
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
			switch((int)ave/10) {
			case 9: case 10: 
				grade = 'A';
				break;
			case 8: 
				grade = 'B';
				break;
			case 7: 
				grade = 'C';
				break;
			case 6: 
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
			}
			
			// ��� ȭ��
			System.out.printf("����: %d\n���: %.2f\n����: %c\n", sum, ave, grade);
			
			sc.close();
	}

}
