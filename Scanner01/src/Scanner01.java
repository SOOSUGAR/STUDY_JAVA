
// java �ȿ� util ��Ű���� Scanner Ŭ������ import ��
// Scanner Ŭ���� : �ܼ�(Ű����)�κ��� ���� �Է¹޴� Ŭ����
// Scanner Ŭ������ ��������ν� ��ȭ�� ���α׷��� �ۼ��� �� ����
// System.in : �Է� ��Ʈ��
// System.out : ��� ��Ʈ��
import java.util.Scanner; 

// ����) �������� �Է��Ͽ� ���� ������ �ѷ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class Scanner01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // *sc = ���� ����, Scanner Ŭ���� ���� �޼ҵ�
		
		System.out.print("������ �Է�: ");
		double radius = sc.nextDouble();
		final double PI = 3.141592;
		
		double area = PI * radius * radius;
		double perimeter = 2 * PI * radius;
		
		System.out.println("���� ����: " + area);
		System.out.println("���� �ѷ�: " + perimeter);
		
		sc.close();
	}

}
