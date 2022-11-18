package member;

//부모 클래스
public class Member {
	private String name;
	private String no;
	private int age;
	
	public Member(String name, String no, int age) {
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public String getNO() {
		return no;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// 출력 메소드 1번
	public void showInfo() {
		System.out.println("회원 이름 : " + name);
		System.out.println("회원 번호 : " + no);
		System.out.println("회원 나이 : " + age);
	}
	// 출력 메소드 2번
	public String toString() {
		return "회원 이름 : " + name + ", 회원 번호 : " + no + ", 회원 나이 : " + age;
	}
	
}

