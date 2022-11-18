import java.util.Random;

class RandomId {
	private static int count;
	private int id;
	
	// 클래스 초기화 블럭, 클래스 초기자
	// 정적 초기화 블럭, 정적 초기자
	// 클래스가 사용되기 바로 직전에 딱 한 번만 호출
	static {
		count = (int)(Math.random() * 10) * 100;
	}
	
	public RandomId() {
		id = ++count;
	}
	
	public int getId() {
		return id;
	}
	
		
	
	
}

// 문제) 매번 실행할 때마다 0에서 900까지 100단위의 난수를 생성하여 모든 인스턴스에서 자동으로 1씩 증가하는 id를 생성하도록 하시오.
// count에 생성된 값이 300일 때 3개의 인스턴스의 id는 301, 302, 303으로 생성하도록 하시오.
// id값의 범위 : 0, 100, 200, 300, 400, 500, 600, 700
public class RandomIdTest01 {
	public static void main(String[] args) {
		RandomId a = new RandomId();
		RandomId b = new RandomId();
		RandomId c = new RandomId();
		
		System.out.println("a : " + a.getId());
		System.out.println("b : " + b.getId());
		System.out.println("c : " + c.getId());
				
	}

}
