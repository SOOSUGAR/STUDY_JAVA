import java.util.Scanner;

/*
����) A�� �л� 5���� ������ �Է��Ͽ�, ������ ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
�� ���α׷��� ������ -> �� �л��� ������ ���� �Է��Ͽ� ���� ����ϰ�, ���� ����ϰ� ����
-> *�ذ�å : �� �л��� ������ �迭�� ����� ó���ؾ� ��

*/
public class Array01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�� �л� ���� �Է� : ");
		int s1 = sc.nextInt();
		
		System.out.print("2�� �л� ���� �Է� : ");
		int s2 = sc.nextInt();
		
		System.out.print("3�� �л� ���� �Է� : ");
		int s3 = sc.nextInt();
		
		System.out.print("4�� �л� ���� �Է� : ");
		int s4 = sc.nextInt();
		
		System.out.print("5�� �л� ���� �Է� : ");
		int s5 = sc.nextInt();
		
		int sum = s1 + s2 + s3 + s4 + s5;
		double ave = (double)sum / 5;
		
		System.out.printf("���� : %d\n��� : %.2f\n", sum, ave);
		
		
		sc.close();
	}

}
