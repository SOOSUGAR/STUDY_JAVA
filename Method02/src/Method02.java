import java.util.Scanner;

// ����) ���� �������� �Է��Ͽ� ���� ������ �ѷ��� ���Ͻÿ�.
// ���� ������ �ѷ��� �޼ҵ带 ����� ����Ͻÿ�.
public class Method02 {
	
	// ���� ������ ���ϴ� �޼ҵ�
	static double calcArea(double r) {
		double area = Math.PI * r * r; 
		return area;
	}
	
	// ���� �ѷ��� ���ϴ� �޼ҵ�
	static double calcPerimeter(double r) {
		double perimeter = 2 * Math.PI * r;
		return perimeter;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �������� �Է��Ͻÿ� : ");
		double radius = sc.nextInt();
		
		double area = calcArea(radius);
		double perimeter = calcPerimeter(radius);
		
		System.out.printf("������ %.2f, �ѷ��� %.2f �Դϴ�.", area, perimeter);
		
		
		sc.close();
	}

}
