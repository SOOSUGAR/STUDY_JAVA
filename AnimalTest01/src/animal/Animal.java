package animal;

/*
1. 추상 메소드
(1) 추상 메소드의 특징
- 메소드의 구현부분(본체)이 없다
- 메소드 앞에 abstract를 쓴다
(2) 추상 메소드의 목적
- 자식 클래스에서 부모 클래스의 추상 메소드를 오버라이딩해야만 인스턴스를 생성할 수 있다
- 만약, 자식 클래스에서 부모 클래스의 추상 메소드를 오버라이딩하지 않으면 추상 메소드를 가지게 되고,
     추상 메소드를 가지면 추상 클래스가 되어야 하며, 추상 클래스가 되면 인스턴스를 생성할 수 없게 된다

2. 추상 클래스
(1) 추상 클래스의 특징
- 클래스 이름 앞에 abstract를 쓴다

(2) 추상 클래스의 규칙
- 추상 메소드를 가지면 무조건 추상 클래스가 되어야 한다
- 추상 메소드가 없어도 추상 클래스는 될 수 있다 -> 인스턴스는 생성할 수 없다
- 추상 클래스는 인스턴스를 만들 수 없다 -> 부모 클래스로 동작하여 다형성을 구현할 목적
*/

// 추상 클래스 -> 다형성을 구현할 목적
// 부모 클래스 
public abstract class Animal {
	private String name;
	
	public Animal() { } // default 생산자 -> Cat 클래스 오류를 처리하기 위해
	
	public Animal(String name) {
		this.name = name;
	}
	
	// 추상 메소드
	public abstract void bark();
	
	// 추상 메소드
	public abstract String toString(); // Object로부터 오버라이딩
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void introduce() {
		System.out.println(toString());
		bark();
	}
	
}
