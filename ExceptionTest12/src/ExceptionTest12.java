
class Member {
	private String sno;
	private String sname;
	private int age;
	
	public Member(String sno, String sname, int age) {
		this.sno = sno;
		this.sname = sname;
		this.age = age;
	}
	
	public String getSno() {
		return sno;
	}
	
	public String getSname() {
		return sname;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setSno(String sno) {
		this.sno = sno;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return sno + "(" + sname + ")" + age;
	}
}

class SpecialMember extends Member {
	private String privilege;
	
	public SpecialMember(String sno, String sname, int age, String privilege) {
		super(sno, sname, age);
		this.privilege = privilege;
	}
	
	public String getPrivilege() {
		return privilege;
	}
	
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}
	
	public String toString() {
		return super.toString() + ", " + privilege + "����";
	}
}

class AdditionalMember extends Member {
	private int bonus;
	
	public AdditionalMember(String sno, String sname, int age, int bonus) {
		super(sno, sname, age);
		this.bonus = bonus;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public String toString() {
		return super.toString() + " | " + bonus + "��";
	}
	
}

public class ExceptionTest12 {
	public static void main(String[] args) {
		Member m1 = new Member("123451", "�쿵��", 27);
		SpecialMember m2 = new SpecialMember("123452", "����ȣ", 30, "30% ����");
		AdditionalMember m3 = new AdditionalMember("123453", "����", 43, 100);
		SpecialMember m4 = null;
		
		/* 
		// 1�� ��� -> ����, ������ ���ܿ� ���� ��Ȯ�ϰ� ���ϰ� ó����
		try {
			m4 = (SpecialMember)m1; // ���� �߻� -> ClassCastException
		} catch(ClassCastException e) {
			//e.printStackTrace();
			System.err.println("�ٿ� ĳ���� �� �� �����ϴ�.");
		}
		
		try {
			System.out.println(m4.toString()); // ���� �߻� -> NullPointerException
		} catch(NullPointerException e) {
			//e.printStackTrace();
			System.err.println("Null ���� �Ұ�");
		}
		*/
		
		/*
		// 2�� ��� -> ��� ���ܿ� ���� ó���� �Ͽ�����, ���� ��Ȳ�� ��� �������� ����
		// ���� catch ���
		try {
			m4 = (SpecialMember)m1; // ���� �߻� -> ClassCastException
			System.out.println(m4.toString()); // ���� �߻� -> NullPointerException
		} catch(ClassCastException e) {
			//e.printStackTrace();
			System.err.println("�ٿ� ĳ���� �� �� �����ϴ�.");
		} catch(NullPointerException e) {
			//e.printStackTrace();
			System.err.println("Null ���� �Ұ�");
		}
		
		System.out.println("- �Ʒ����� �����ؾ� �ϴ� ������ �� �ֽ��ϴ�. -");
		*/
		
		/*
		// 3�� ��� -> ��� ���ܸ� ó���Ͽ�����, ��� ��Ȳ�� �������� ����
		// ��Ƽ catch ���
		try {
			m4 = (SpecialMember)m1; // ���� �߻� -> ClassCastException
			System.out.println(m4.toString()); // ���� �߻� -> NullPointerException
		} catch(ClassCastException |NullPointerException e) {
			//e.printStackTrace();
			System.err.println("�ٿ� ĳ����, Null ������ ���� ���� �߻�");
		}
		
		System.out.println("- �Ʒ����� �����ؾ� �ϴ� ������ �� �ֽ��ϴ�. -");
		*/
		
		
		// 4�� ��� -> ��� ���ܸ� �ϳ��� ������� ó���Ͽ�����, ��� ���� ��Ȳ�� ������ ����
		try { 
			m4 = (SpecialMember)m1; // ���� �߻� -> ClassCastException
			System.out.println(m4.toString()); // ���� �߻� -> NullPointerException
		} catch(Exception e) {
			//e.printStackTrace();
			System.err.println("���� �߻�");
		}
		
		System.out.println("- �Ʒ����� �����ؾ� �ϴ� ������ �� �ֽ��ϴ�. -");
		
	}
}
