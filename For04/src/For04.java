import java.util.Scanner;

// ����) ���� 1���� �Է��ϰ�, �Է��� ���� ����� ����ϰ�,
// ����� ������ �հ踦 ����Ͻÿ�.
public class For04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int n = sc.nextInt();		
		int sum = 0, count = 0;
		
		for(int i = 1; i <= n ; i++) { // for( �ʱⰪ ; ���� ; ������ )
			if(n % i == 0) {
				System.out.print(i + " ");
				count++;
				sum += i;
			}
		}
		
		System.out.printf("\n%d�� ����� ������ %d�̰�, �հ�� %d�Դϴ�.", n, count, sum);
		
		sc.close();
	}
	
}
