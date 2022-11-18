
/*
< 클래스 메소드와 인스턴스 메소드의 사용 가능 범위 >
1. 인스턴스 메소드에서는 자신의 인스턴스 변수, 인스턴스 메소드, 공유하는 클래스 변수, 클래스 메소드 어디에나 접근 가능
2. 클래스 메소드 에서는 공유하는 클래스 변수, 클래스 메소드에는 접근이 가능하나, 인스턴스 변수, 인스턴스 메소드에는 접근이 불가능
*/

// 클래스 메소드, 인스턴스 메소드에서 클래스 변수, 인스턴스 변수, 클래스 메소드, 인스턴스 메소드의 사용 가능 방법
class Static {
	private static int s; // 클래스 변수, 정적 필드
	private int i; // 인스턴스 변수, 비정적 필드
	
	public static void sm1() { } // 클래스 메소드
	public void im1() { } // 인스턴스 메소드
	
	// 클래스 메소드, 정적 메소드
	public static void sm2(int x) { 
		s = x;
		// i = x; // 클래스 메소드에서 인스턴스 변수르 접근이 불가 -> 인스턴스 변수는 인스턴스의 수만큼 생성이 되어있기 때문에, 접근해야하는 변수가 어떤 변수인지 판단 불가
		sm1();
		// im1(); // 클래스 메소드에서 인스턴스 변수르 접근이 불가 -> im1도 인스턴스의 수만큼 생성이 되어있기 때문에, 값을 대입할 변수가 어떤 변수인지 판단 불가
	}
	
	// 인스턴스 메소드, 비정적 메소드
	public void im2(int x) {
		s = x;
		i = x;
		sm1();
		im1();
	}
	
	// getter
	public static int gets() {
		return s;
	}
	
	public int getI() {
		return i;
	}
	
}

public class StaticTest01 {
	public static void main(String[] args) {
		Static s1 = new Static();
		Static s2 = new Static();
		Static s3 = new Static();
		
		s1.im2(10);
		Static.sm2(30);
		
		System.out.println("s1 : " + s1.getI());
		System.out.println("s2 : " + s2.getI());
		System.out.println("s3 : " + s3.getI());
		
		// System.out.println("static : " + s3.gets()); // 지양
		System.out.println("static : " + Static.gets()); // 지향
		
	}

}
