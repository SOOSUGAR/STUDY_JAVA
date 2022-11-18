
/*
2���� �迭 Ȱ��
����) A�� �л� 5���� ����, ����, ���� ������ �����ϴ� 2���� �迭 scores�� ����Ͽ�,
�� �л��� ���� ������ ����, ����� ����Ͻÿ�.

- 5�� 3���� ������
- �� �� : �л�, �� �� : ����
93, 93, 92
85, 85, 86
71, 71, 72
68, 68, 67
83, 83, 82

*/
public class Array2D03 {
	public static void main(String[] args) {
		// �л����� ���� ����, int�� 2���� �迭 ����, �ʱ�ȭ(���ʷ� ���� �ִ� ��)
		// ���� ���� ���� ���� ����
		// ������ 1�� �ʱ�ȭ�Ͽ� ���, ������ �̿��Ͽ� ���
		int[][] scores = {
				{93, 93, 92, 0, 1},
				{85, 85, 86, 0, 1},
				{71, 71, 72, 0, 1},
				{68, 68, 67, 0, 1},
				{83, 83, 82, 0, 1}
				
		};
		
		// �л����� ����� ����, double���� 1���� �迭 ����
		double[] aves = new double[5]; // -> {0, 0, 0, 0, 0}
		
		// �л����� ������ ����, char���� 1���� �迭 ���� 
		char[] grades = new char[5];
		
		// ���� ��� �� ����, ��� ��� �� ����, ���� ��� �� ����, ���� ��� �� ����
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length-2; j++) {
				scores[i][3] += scores[i][j]; // 1. i.3�� ������ ����, �� �л��� ����
			}
			// 2. �� �л��� ���
			aves[i] = (double)scores[i][3]/3;
			// 3. �� �л��� ����
			switch((int)aves[i]/10) {
			case 10: case 9: grades[i] = 'A'; break;
			case 8: grades[i] = 'B'; break;
			case 7: grades[i] = 'C'; break;
			case 6: grades[i] = 'D'; break;
			default: grades[i] = 'F'; break;
			}
		}
		
		// ���� ��� �� ����, i : �� , j : �񱳴��
		for(int i = 0; i<scores.length; i++) {
			for(int j = 0; j<scores.length; j++) {
				if(scores[i][3] < scores[j][3]) {
					++scores[i][4];
				}
			}
		}
		
		// ���
		System.out.print("          ����   ����   ����  ����      ���      ����  ����\n");
		System.out.println("����������������������������������������������������������������������");
		
		for(int i = 0; i<scores.length; i++ ) {
			System.out.print(" " + (i+1) + "�� ");
			for(int j = 0; j<scores[i].length-1; j++ ) {
				System.out.printf("%4d", scores[i][j]);
			}
			System.out.printf("  %.2f  %c  %d\n" , aves[i], grades[i], scores[i][4]);
		}
	}
}
