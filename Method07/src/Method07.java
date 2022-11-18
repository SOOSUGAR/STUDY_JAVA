import java.util.Scanner;

/*
< �޼ҵ�� 1���� �迭�� Ȱ�� >
����) A�� �л� ���� �Է��Ͽ� int�� �迭 scores�� �����ϰ�, ����/���/�ְ�����/���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
- �л����� �Է��Ͽ� �迭�� �����ϴ� �κ��� �޼ҵ�� ����� �����Ͻÿ�.
- �� �л��� ������ �Է��ϴ� �κ��� �޼ҵ�� ����� �����Ͻÿ�.
- ����, ���, �ְ�����, ���������� ���ϴ� �κ��� ���� �޼ҵ�� ����� �����Ͻÿ�.
- �� �л��� ������ ����ϴ� �޼ҵ带 ����� �����Ͻÿ�.
- �޼ҵ��: putCount, intputScore, calcTot, calcAve, caleMax, calcMin. outputScore
*/
public class Method07 {
	static Scanner sc = new Scanner(System.in);
	
	// 1. �л� ��
	static int[] putCount(Scanner sc) {
		System.out.print("A�� �л��� �Է� : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		return a;
	}
	
	// 2. ����
	static void intputScore(int[] a, Scanner sc) {
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%d�� �л� ���� : ", i+1);
			a[i] = sc.nextInt();
		}
	}
	
	// 3. ����
	static int calcTot(int[] a) {
		int tot = 0;
		for(int i = 0; i < a.length; i++) {
			tot += a[i];
		}
		return tot;
	}
	
	// 4. ���
	/*static double calcAve(int tot, int n) {
		double ave = (double)tot / n;
		return ave;
	}
	*/
	static double calcAve(int[] a) {
		int tot = 0;
		for(int i = 0; i<a.length; i++) {
			tot += a[i];
		}
		return (double)tot / a.length;
	}
	
	// 5. �ְ� ����
	static int calcMax(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	
	// 6. ���� ����
	static int calcMin(int[] a) {
		int min = a[0];
		for(int i = 1; i<a.length; i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}
	
	// 7. �� �л��� ���� ���
	static void outputScore(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.printf("%2d�� �л� ���� : %3d��\n", i+1, a[i]);
		}
	}
	
	public static void main(String[] args) {
		
		// �л��� �Է�
		int[] scores = putCount(sc);
		
		// �� �л��� ���� �Է�
		intputScore(scores, sc);
		
		// ���� ���
		int tot = calcTot(scores);
		
		// ���
		double ave = calcAve(scores);
		
		// �ְ� ����
		int max = calcMax(scores);
		
		// ���� ����
		int min = calcMin(scores);
		
		// ���� ���
		outputScore(scores);
		
		// ����, ���, �ְ�/���� ���� ���
		System.out.printf("���� : %d\n��� : %.2f\n�ְ� ���� : %d\n���� ���� : %d\n", tot, ave, max, min);
		
	}
}
