
/*
1���� �迭 Ȱ��
����1) A�� 5���� �л� ���� 85, 93, 71, 63, 82���� �����ϴ� int���� 1���� �迭 scores�� �����ϰ�,
A�� �� �л��� ������ ����� ��, ������ ����� ����Ͻÿ�.
*/
public class Array04 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[]{85, 93, 71, 63, 82};
		int sum = 0;
		double ave = 0.0;
		
		for(int i = 0; i<scores.length; i++) {
			System.out.printf("A�� %d�� ° �л��� ���� : %d\n", i+1, scores[i]);
			sum += scores[i];
		}
		
		ave = (double)sum/scores.length;
		
		System.out.printf("\n������ %d, ����� %.2f �Դϴ�.", sum, ave);
		
	}

}
