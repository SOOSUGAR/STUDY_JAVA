
class XY {
	private static int count = 0;
	private int id;
	private int x = 0;
	private int y = 0;
	
	// 인스턴스 초기화 블럭, 인스턴스 초기자
	// 비정적 초기화 블럭, 비정적 초기자
	// 모든 생성자가 호출되기 *바로 직전*에 호출되는 초기자
	{
		id = ++count;
	}
	
	// 생성자 오버로딩
	public XY() {
		
	}
	
	public XY(int x) {
		this.x = x;
	}
	
	public XY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 복사 생성자
	public XY(XY a) {
		this.x = a.x;
		this.y = a.y;
	}
	
	// 출력 메소드
	public String toStirng() {
		return "ID." + id + " (x:" + x + ", y:" + y + ")";
	}
}

// 문제) 인스턴스에 맞게 생성자를 생성하고, 각 인스턴스의 id와 x좌표, y좌표를 출력하시오.
public class XYTest01 {
	public static void main(String[] args) {
		XY p1 = new XY();
		XY p2 = new XY(10);
		XY p3 = new XY(30, 40);
		XY p4 = new XY(p3);
		
		System.out.println(p1.toStirng());
		System.out.println(p2.toStirng());
		System.out.println(p3.toStirng());
		System.out.println(p4.toStirng());
		
	}

}
