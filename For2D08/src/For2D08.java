import java.util.Scanner;

/*
2���� �ݺ��� Ȱ�� - �Ҽ� �Ǻ�(Prime Number)
����) ���� 1���� �Է��Ͽ�, �Է��� ���� �������� ��� �Ҽ��� �߷��ϰ�,
�Ҽ��� ������ �հ踦 ���Ͻÿ�.

< �Է� ȭ�� ���� >
���� �Է� : 10

< ��� ȭ�� ����>
2 3 5 7
1���� 10���� ������ �Ҽ� ���� : 4
1���� 10���� ������ �Ҽ� �հ� : 17

*/
public class For2D08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է��� ���� ���� �ȿ��� �Ҽ��� ���մϴ�.");
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		
		int sum = 0, count = 0;
		
		for(int i = 2; i <= n; i++) {
			for(int j = 2; j <= i; j++) {
				if(i == j) { // �Ʒ��� break���� �ɸ��� �ʰ� ������ �Դٸ�, �� ���� �Ҽ� -> i=j�� �� ������, �ڱ� �ڽ����θ� ������ ������
					++count;
					sum += i;
					System.out.print(i + " ");
				}
				if(i%j == 0) { // �ڽ��� �Ǳ� ���� ������ �������� break�� ���� 1���� �ٱ� for������ �Ѿ -> �Ҽ��� �ƴ�
					break;
				}
			}
		}
		
		System.out.printf("\n1���� %d���� ������ �Ҽ� ���� : %d\n", n, count);
		System.out.printf("1���� %d���� ������ �Ҽ� �հ� : %d\n", n, sum);
		
		sc.close();
	}

}
