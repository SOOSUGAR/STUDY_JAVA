
// 문제) main 메소드에 Id 클래스의 인스턴스를 3개 만들고, id의 값은 인스턴스를 생성할 때 자동으로 1씩 증가하도록 하시오.
// 각  인스턴스의 id값을 출력하고, 지금까지 생성된 인스턴스의 수를 출력하도록 하시오.
class Id {
	private static int count = 0; // 클래스 변수
	private int id; // 인스턴스 변수
	
	// 생성자
	public Id() {
		this.id = ++count;
	}
	
	// 클래스 메소드
	public static int getCount() {
		return count;
	}
	
	// 인스턴스 메소드
	// getter/setter
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	// 출력 메소드
	public String toString() {
		return "ID : " + id;
	}
	
}

public class IdTest01 {
	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		Id c = new Id();
		
		System.out.println(a); // a.toString() 생략
		System.out.println(b);
		System.out.println(c);
		
		// System.out.println("지금까지 생성한 일련번호 : " + a.getCount()); // 지양 방법
		System.out.println("지금까지 생성한 일련번호 : " + Id.getCount()); // 권장 방법
	}

}
