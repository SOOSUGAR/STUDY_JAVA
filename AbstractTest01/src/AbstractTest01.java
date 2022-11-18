
// 추상 클래스 - 추가 메소드가 있다면, 반드시 추상 클래스여야 함
abstract class A {
	public abstract void a(); // 추상 메소드이기 때문에 클레스도 추상 클래스여야 함
	
	
}

// 비추상 클래스
abstract class B extends A {
	// 1번
	public void a() { // 비추상 메소드 - 부모 클래스의 추상 메소드를 오버라이딩
	}
}

class C extends B {
	// 1번
	//public void a() { // 비추상 메소드 - 부모 클래스의 비추상 메소드를 오버라이딩
	
	public void a() { } // 비추상 메소드 - 부모 클래스의 추상 메소드를 오버라이딩
	
	}




public class AbstractTest01 {
	public static void main(String[] args) {
		
	}

}
