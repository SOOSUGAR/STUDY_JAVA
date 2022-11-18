package player;

/*
< 인터페이스 규칙 > 
1. 인터페이스는 추상 메소드만을 가진다
2. 인터페이스의 추산 메소드는 public abstract를 생략할 수 있다
3. 인터페이스는 인스턴스를 생성할 수 없다
4. 인터페이스의 배열은 생성할 수 있다 -> 다형성 구현 목적

*/

public interface Player {
	
	void play();
	//public void play();
	//abstract void play();
	//public abstract void play(); // 4가지 방법으로 표현 가능
	
	public abstract void stop();
	
}
