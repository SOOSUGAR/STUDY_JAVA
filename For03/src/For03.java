import java.util.Scanner;

// ����) ������ �Է��Ͽ�, 1���� 1�� �����Ͽ� �Է��� ���������� 3�� ����̸鼭 4�� ����� ���� ����ϰ�,
// ������ �հ踦 ���Ͻÿ�.
public class For03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int n = sc.nextInt();
		
		int sum = 0, count = 0;
		
		for( int i = 1; i <= n; i++) {
			if(i%3 == 0 && i%4 ==0) {
				System.out.print(i + " ");
				count++;
				sum += i;
			}	
		}
		
		System.out.printf("\n������ %d, �հ�� %d �Դϴ�.", count, sum);
		
		sc.close();
	}

}
