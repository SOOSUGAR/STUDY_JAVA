import java.util.Scanner;

class Car {
	// �������
	String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	
	// ������
	public Car(String name, int width, int height, int lenght, double fuel) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = lenght;
		this.fuel = fuel;
		x = y = 0.0;
	}
	
	//��� �޼ҵ�
	// getter - x, y, fuel
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getFuel() {
		return fuel;
	}
	
	// setter - x, y, fuel
	public double setX() {
		return x;
	}
	
	public double setY() {
		return y;
	}
	
	public double setfuel() {
		return fuel;
	}
	
	// ���� ���� ��� �޼ҵ�
	public void putSpec() {
		System.out.println("�� �̸� : " + name);
		System.out.println("�� �ʺ� : " + width);
		System.out.println("�� ���� : " + height);
		System.out.println("�� ���� : " + length);
	}
	
	// x, y ��ǥ�� ���� ���� �̵��ϴ� �޼ҵ�, move
	// ���ᰡ �Ÿ����� ũ�ٸ� -> ����� ����ϰ�, ���� �̵� ���� 
	// ���ᰡ �Ÿ����� �۴ٸ� -> ����� ������ϰ�, ���� �̵� �Ұ�
	public boolean move(double dx, double dy) {
		double distance = Math.sqrt(dx*dx + dy*dy);
		
		if(fuel > distance) {
			x += dx;
			y += dy;
			fuel -= distance;
			return true;
		} else {
			return false;
		}
		
	}
}
	
// ����) �Ʒ��� ���ǿ� �����ϵ��� �ν��Ͻ��� �����Ͽ� Ȯ���Ͻÿ�. 	
// 1. ���� ����(�̸�, �ʺ�, ����, ����,)�� ���ᷮ �Է��Ͽ� �ν��Ͻ��� �����Ͻÿ�.
// 2. x, y ��ǥ�� ���� ������ Ȱ���Ͽ� ���� �̵��ϵ��� �ϴ� �޼ҵ� 
// - x, y ��ǥ�� �Է��Ͽ� �̵��ϵ��� �Ͻÿ�.
public class CarTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ڵ����� ������ �Է��Ͻÿ�.");
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("�ʺ� : ");
		int width = sc.nextInt();
		System.out.print("���� : ");
		int height = sc.nextInt();
		System.out.print("���� : ");
		int length = sc.nextInt();
		System.out.print("���ᷮ : ");
		double fuel = sc.nextDouble();
		
		Car myCar = new Car(name, width, height, length, fuel); // �ν��Ͻ�
		myCar.putSpec();
		
		// �ڵ����� �̵� ���� Ȯ��, ���� Ȯ��
		
		while(true) {
			System.out.printf("���� ��ġ : %.2f, %.2f\n���� ���ᷮ : %.2f\n", myCar.getX(), myCar.getY(), myCar.getFuel());
			System.out.print("���� �̵���Ű�ڽ��ϱ�?(YES : 1 / NO : 0) : ");
			int yn = sc.nextInt();
			if(yn == 0) {
				break;
			}
			
			System.out.print("x���� �̵��Ÿ� : ");
			double x = sc.nextDouble();
			System.out.print("y���� �̵��Ÿ� : ");
			double y = sc.nextDouble();
			
			if(!myCar.move(x, y)) {
				System.out.println("���ᰡ �����մϴ�.");
			}
		}
		
		System.out.println("���� ������ �����մϴ�.");
		sc.close();
	}

}
