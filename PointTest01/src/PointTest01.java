
/*
< 상속의 관계에서 클래스의 이름 >
1. 상속을 하는 클래스 - 부모, 기본(기반, 기저), 상위, 슈퍼
2. 상속을 받는 클래스 - 자식, 파생,	                  하위, 서브

< super를 사용하는 방법 >
1. super() : 자식 클래스의 생성자 내에서 부모 클래스의 생성자를 호출하여 상속받은 멤버변수의 값을 확실하게 초기화하는 방법
2. super. : 자식 클래스에서 부모 클래스의 멤버에 접근하는 방법

< 멤버변수의 접근 제한자 > 
1. private : 자신의 클래스 내에서만 접근 가능
2. default : 같은 패기지 내에서만 접근 가능
3. protected : 같은 패키지 내에서는 물론, 상속을 받았다면(자식 클래스) 다른 패키지에서도 접근 가능
4. public : 어디에서나 접근 가능

# 접근 범위 #
private < default < protected < public

★★★★★
< 오버라이딩(Overriding) >
1. 메소드의 재정의
2. 상속의 관계에서 부모 클래스의 메소드를 자식 클래스에서 완전히 동일하게 정의하는 것
- 메소드명, 매개변수의 개수와 타입, 리턴타입까지 완전하게 일치해야 함
3. 접근 제한자는 부모와 

*/

// 부모 클래스
class Point2D{
	// 1번 방법
	//protected int x;
	//protected int y;
	
	private int x;
	private int y;
	
	// 디폴트 생성자
	public Point2D() { }
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// getter
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	// setter
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	
}

// Point3D 클래스는 Point2D 클래스를 확장한다.
// Point3D 클래스는 Point2D 클래스로부터 모든 것을 상속받는다.
// 자식 클래스
class Point3D extends Point2D {
	private int z;
	
	// super() : 자식의 생성자에서 부모 클래스의 생성자를 호출하는 방법
	// - 상속받은 부모의 private 변수의 값을 초기화하는 목적
	public Point3D(int x, int y, int z) {
		// 불가한 방법
		//this.x = x; //private 맴버에 접근 불가 -> 다른 클래스이기 때문
		//this.y = y;
		
		// 1번 방법 : 부모의 멤버변수의 접근 권한을 protected로 완화하는 방법
		// - 일반적으로 권장하지 않는 방법 -> 기본적인 캡슐화의 원리를 위반
		//this.x = x;
		//this.y = y;
		
		// 2번 방법
		super(x,  y);
		this.z = z;
	}
	
	// getter
	public int gatZ() {
		return z;
	}
	
	// setter
	public void setZ(int z) {
		this.z = z;
	}
	
	// super. : 부모의 멤버에 접근하는 방법
	// 오버라이딩(Over riding)
	public String toString() {
		return super.toString() + ", z = " + z;
		//return "x = " + getX() + ", y = " + getY() + ", z = " + z;
	}
	
}

public class PointTest01 {
	public static void main(String[] args) {
		Point2D p1 = new Point2D(10, 20);
		Point3D p2 = new Point3D(50, 60, 70);
		
		System.out.println(p1.toString()); // toString 생략 가능
		System.out.println(p2);
		
	}

}
