import java.util.Scanner;

/*
����2) A�� �л����� �Է��ϰ�, �Է��� �л� �� ũ���� scores �迭�� ������ ��,
�� �л��� ������ �Է��Ͽ� �� �л��� ������ ���, A���� ������ ����� ����Ͻÿ�.
*/
public class Array05 {
	public static void main(String[] args) {
		// ���� ����
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double ave = 0.0;
		
		// �Է� ȭ�� 1 - �л� ��
		System.out.print("A�� �л� ���� �Է��ϼ��� : ");
		int n = sc.nextInt();
		
		// 1���� �迭 ����
		int[] scores = new int[n];
		
		// �Է� ȭ�� 2 - ����
		for(int i = 0; i<scores.length; i++) {
			System.out.print(i+1 + "�� ° �л��� ������ �Է��ϼ��� : ");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		
		// ��� ȭ�� 1 - �� �л��� ���� ���
		System.out.println("\n������������������������������������������");
		for(int i =0; i<scores.length; i++) {
			System.out.println(i+1 + "�� ° �л��� ������ " + scores[i] + "�Դϴ�.");
		}
		
		// ��� ȭ�� 2 - ����, ���
		ave = (double)sum/scores.length;
		
		System.out.printf("\n������ %d, ����� %.2f �Դϴ�.", sum, ave);
		
		sc.close();
	}

}
