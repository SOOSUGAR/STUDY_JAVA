import java.util.Scanner;
/*
 ����) ����, ����, ���� ������ �Է��Ͽ�, ������ ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
< �Է� ȭ�� ���� >
���� ���� �Է�: 93
���� ���� �Է�: 93
���� ���� �Է�: 92

< ��� ȭ�� ���� >
����: 278
���: 92.66666666666667
*/

// �ڡڡ�
// Casting(ĳ����) : ������ ������ Ÿ���� �����ϴ� ��
public class Casting01 {
	public static void main(String[] args) {
		// ���� ����
		Scanner sc = new Scanner(System.in);
		
		// �Է� ȭ��
		System.out.print("���� ���� �Է�: ");
		int kor = sc.nextInt();
		System.out.print("���� ���� �Է�: ");
		int eng = sc.nextInt();
		System.out.print("���� ���� �Է�: ");
		int mat = sc.nextInt();
		
		// ���
		int sum = kor + eng + mat;
		// double ave = sum / 3.0; // *���׼�ġ�°� : ���Ŀ��� ������ Ÿ���� ���� �ٸ� ��, �� ū �ʿ� ���߾���
		double ave = (double)sum / 3; // ĳ����
		
		// ��� ���
		//System.out.println("����: " + sum);
		//System.out.println("���: " + ave);
		
		//System.out.printf("����: %d\n", sum);
		//System.out.printf("���: %6.2f\n", ave);
		System.out.printf("����: %d\n���: %6.2f\n", sum, ave);
		
		
		sc.close();
	}

}
