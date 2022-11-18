package shape;

public abstract class Shape {
	
	// 추상 메소드
	public abstract void draw();
	
	// 추상 메소드
	public abstract String toString();
	
	// 비추상 메소드
	public void print() {
		System.out.println(toString());
		draw();
	}
		
}
