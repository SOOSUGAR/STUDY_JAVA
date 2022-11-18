
/*
Car 클래스
- 차의 특징 : 이름, 크기(너비, 높이, 길이), 이동거리(x, y), 연료
- 멤버변수 : name, width, height, length, x, y, fuel
- 생산자 : 멤버변수의 값을 초기화
- 멤버 메소드 : getter/setter, 필요한 메소드 추가
- 정보 출력 메소드

*/
class Car {
	// 멤버변수
	String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;
	
	// 생성자
	public Car(String name, int width, int height, int lenght, double fuel) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = lenght;
		this.fuel = fuel;
		x = y = 0.0;
	}
	
	//멤버 메소드
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
	
	// 차의 정보 출력 메소드
	public void putSpec() {
		System.out.println("차 이름 : " + name);
		System.out.println("차 너비 : " + width);
		System.out.println("차 높이 : " + height);
		System.out.println("차 길이 : " + length);
	}
	
	
}

public class CarTest01 {
	public static void main(String[] args) {
		Car car1 = new Car("소나타 하이브리드", 1500, 500, 2500, 100);
		Car car2 = new Car("제네시스 2023" , 1600, 550, 2600, 150);
		
		car1.putSpec();
		System.out.println();
		car2.putSpec();
	}

}
