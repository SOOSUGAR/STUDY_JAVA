import java.util.StringTokenizer;

// ����) �л����� ������ ����ִ� str ���ڿ��� ����Ͽ� �л����� ����, ���, �ְ�����, ���������� ���Ͻÿ�.
public class WrapperTest02 {
	public static void main(String[] args) {
		String str = "85,88,72,91,56,73,66,87,68,95";
		int sum = 0, max = 0, min = 100;
		double ave = 0.0;
		
		/*
		// 1�� ��� - String�� split() �޼ҵ� ���
		String[] sc = str.split(",");
		int[] scores = new int[sc.length];
		for(int i = 0; i < sc.length; i++) {
			scores[i] = Integer.parseInt(sc[i]);
			sum += scores[i];
		}
		ave = (double)sum / scores.length; 
		
		max = min = scores[0];
		for(int i = 0; i < scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
			}
			if(min > scores[i]) {
				min = scores[i];
			}
		}
		
		System.out.printf("���� : %d\n��� : %.2f\n�ְ����� : %d\n�������� : %d", sum, ave, max, min);
		*/
		
		
		// 2�� ��� - String�� StringTokenizer Ŭ���� ���
		StringTokenizer st = new StringTokenizer(str, ",");
		int count = st.countTokens();
		
		while(st.hasMoreElements()) {
			int n = Integer.parseInt(st.nextToken());
			sum += n;
			if(max < n) {
				max = n;
			}
			if(min > n) {
				min = n;
			}
		}
		ave = (double)sum / count;
		System.out.printf("���� : %d\n��� : %.2f\n�ְ����� : %d\n�������� : %d", sum, ave, max, min);
		
	}

}
