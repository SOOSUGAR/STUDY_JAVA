import java.util.Scanner;

/*
����) ������ �Է��Ͽ� �Է��� ������ �ش��ϴ� �Ǻ���ġ ������ ����Ͻÿ�.
�Ǻ���ġ ���� : ���� �� ���� ���Ͽ� ���� ���� ����� ����

< �Է� ȭ�� ���� >
�Ǻ���ġ ���� ���� �Է� : 13

< ��� ȭ�� ���� >
1 1 2 3 5 8 13 21 34 55 89 144 233

*/
public class ForTest01 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("�Ǻ���ġ ���� ���� �Է� : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n+2];
		
		arr[0] = 1;
		arr[1] = 1;
		
		System.out.print(arr[0] + " " + arr[1] + " ");
		
		for(int i = 0; i < n-2; i++) {
			arr[i+2] = arr[i] + arr[i + 1];
			System.out.print(arr[i+2] + " ");
		}
		
		sc.close();
	}

}
