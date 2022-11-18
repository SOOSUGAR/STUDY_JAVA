package member;

// 자식 클래스
public class SpecialMember extends Member {
	private String privilege;
	
	public SpecialMember(String name, String no, int age, String privilege) {
		super(name, no, age);
		this.privilege = privilege;
	}
	
	// getter
	public String getPrivilege() {
		return privilege;
	}
	
	// setter
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("특별 혜택 : " + privilege);
	}
	
	public String toString() {
		return super.toString() + "특별 혜택 : " + privilege;
	}
	
}
