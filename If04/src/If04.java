
// ����) a�� b�� ���� ������ �Է��Ͽ�, �׻� a���� ���� ���� b���� ū ���� ����ǵ��� ���α׷��� �ۼ��Ͻÿ�.
// ������
import java.util.Scanner;
public class If04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// �Է� ȭ��
		System.out.println("���� a, b�� �Է��Ͻÿ� .");
		System.out.print("a�� �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		System.out.print("b�� �Է��Ͻÿ� : ");
		int b = sc.nextInt();
		
		// ���
		// swapping(������) - �� ���� ������ ���� �ٲٴ� �⺻���� ���
		if(a > b) {
			int t = a;
			a = b;
			b = t;
		}
		
		// ��� ȭ��
		System.out.printf("a = %d, b= %d\n", a, b);
		
		sc.close();
}

}
