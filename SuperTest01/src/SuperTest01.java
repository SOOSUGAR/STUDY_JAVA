
// 기본 클래스
class Base {
	protected int x;

	public Base() {
		this.x = x;
	}
	
	public Base(int x) {
		this.x = x;
	}
	
	public void print() {
		System.out.println("Base' x : " + x);
	}
}

// 파생 클래스
class Derived extends Base {
	private int x;
	
	public Derived(int x1, int x2) {
		super.x = x1; // 부모의 변수 x
		this.x = x2; // 현재 클래스의 변수 x
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("Derived' x : " + x);
	}
	
}


public class SuperTest01 {
	public static void main(String[] args) {
		Base a = new Base(10);
		a.print();
		System.out.println();
		
		Derived b = new Derived(20, 30);
		b.print();
		System.out.println();
		
	}

}
