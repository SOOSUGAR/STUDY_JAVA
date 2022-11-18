
/*
Car Ŭ����
- ���� Ư¡ : �̸�, ũ��(�ʺ�, ����, ����), �̵��Ÿ�(x, y), ����
- ������� : name, width, height, length, x, y, fuel
- ������ : ��������� ���� �ʱ�ȭ
- ��� �޼ҵ� : getter/setter, �ʿ��� �޼ҵ� �߰�
- ���� ��� �޼ҵ�

*/
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
	
	
}

public class CarTest01 {
	public static void main(String[] args) {
		Car car1 = new Car("�ҳ�Ÿ ���̺긮��", 1500, 500, 2500, 100);
		Car car2 = new Car("���׽ý� 2023" , 1600, 550, 2600, 150);
		
		car1.putSpec();
		System.out.println();
		car2.putSpec();
	}

}
