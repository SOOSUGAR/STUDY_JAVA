import java.util.Scanner;

// ����) ������ �Է��Ͽ�, 1���� 1�� �����Ͽ� �Է��� �������� ���� �߿��� Ȧ���� ����ϰ�, 
// Ȧ���� ������ �հ踦 ����Ͻÿ�.
public class For2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int n = sc.nextInt();
		
		int sum = 0, count = 0;
		
		/*
		for(int i = 1 ; i%2 != 0 && i <= n; i += 2) { // for( �ʱⰪ ; ���� ; ������ )
			System.out.println(i);
			sum += i;
			count += 1;
		}
		
		System.out.printf("������ %d��, �հ�� %d�Դϴ�.", count, sum);
		*/
	
		for(int i = 1; i <= n; i++){
			if(i%2 == 1) {
				System.out.print(i + " ");
				++count;
				sum += i;
			}
		}
		
		System.out.printf("\n������ %d��, �հ�� %d�Դϴ�.\n", count, sum);
		
		sc.close();
	}

}
