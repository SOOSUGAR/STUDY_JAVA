import java.util.Scanner;

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
	
	// x, y 좌표를 통해 차를 이동하는 메소드, move
	// 연료가 거리보다 크다면 -> 연료는 충분하고, 차가 이동 가능 
	// 연료가 거리보다 작다면 -> 연료는 불충분하고, 차는 이동 불가
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
	
// 문제) 아래의 조건에 부합하도록 인스턴스를 생성하여 확인하시오. 	
// 1. 차의 제원(이름, 너비, 높이, 길이,)과 연료량 입력하여 인스턴스를 생성하시오.
// 2. x, y 좌표와 연료 정보를 활용하여 차가 이동하도록 하는 메소드 
// - x, y 좌표를 입력하여 이동하도록 하시오.
public class CarTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자동차의 제원을 입력하시오.");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("너비 : ");
		int width = sc.nextInt();
		System.out.print("높이 : ");
		int height = sc.nextInt();
		System.out.print("길이 : ");
		int length = sc.nextInt();
		System.out.print("연료량 : ");
		double fuel = sc.nextDouble();
		
		Car myCar = new Car(name, width, height, length, fuel); // 인스턴스
		myCar.putSpec();
		
		// 자동차의 이동 여부 확인, 연료 확인
		
		while(true) {
			System.out.printf("현재 위치 : %.2f, %.2f\n남은 연료량 : %.2f\n", myCar.getX(), myCar.getY(), myCar.getFuel());
			System.out.print("차를 이동시키겠습니까?(YES : 1 / NO : 0) : ");
			int yn = sc.nextInt();
			if(yn == 0) {
				break;
			}
			
			System.out.print("x방향 이동거리 : ");
			double x = sc.nextDouble();
			System.out.print("y방향 이동거리 : ");
			double y = sc.nextDouble();
			
			if(!myCar.move(x, y)) {
				System.out.println("연료가 부족합니다.");
			}
		}
		
		System.out.println("차랑 주행을 종료합니다.");
		sc.close();
	}

}
