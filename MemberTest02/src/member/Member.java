package member;

//�θ� Ŭ����
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
	
	// ��� �޼ҵ� 1��
	public void showInfo() {
		System.out.println("ȸ�� �̸� : " + name);
		System.out.println("ȸ�� ��ȣ : " + no);
		System.out.println("ȸ�� ���� : " + age);
	}
	// ��� �޼ҵ� 2��
	public String toString() {
		return "ȸ�� �̸� : " + name + ", ȸ�� ��ȣ : " + no + ", ȸ�� ���� : " + age;
	}
	
}

