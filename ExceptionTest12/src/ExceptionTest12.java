
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
		return super.toString() + ", " + privilege + "혜택";
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
		return super.toString() + " | " + bonus + "점";
	}
	
}

public class ExceptionTest12 {
	public static void main(String[] args) {
		Member m1 = new Member("123451", "우영우", 27);
		SpecialMember m2 = new SpecialMember("123452", "이준호", 30, "30% 할인");
		AdditionalMember m3 = new AdditionalMember("123453", "정명석", 43, 100);
		SpecialMember m4 = null;
		
		/* 
		// 1번 방법 -> 권장, 각각의 예외에 대해 정확하게 명세하고 처리함
		try {
			m4 = (SpecialMember)m1; // 예외 발생 -> ClassCastException
		} catch(ClassCastException e) {
			//e.printStackTrace();
			System.err.println("다운 캐스팅 할 수 없습니다.");
		}
		
		try {
			System.out.println(m4.toString()); // 예외 발생 -> NullPointerException
		} catch(NullPointerException e) {
			//e.printStackTrace();
			System.err.println("Null 참조 불가");
		}
		*/
		
		/*
		// 2번 방법 -> 모든 예외에 대해 처리는 하였으나, 예외 상황을 모두 명세하지는 못함
		// 다중 catch 사용
		try {
			m4 = (SpecialMember)m1; // 예외 발생 -> ClassCastException
			System.out.println(m4.toString()); // 예외 발생 -> NullPointerException
		} catch(ClassCastException e) {
			//e.printStackTrace();
			System.err.println("다운 캐스팅 할 수 없습니다.");
		} catch(NullPointerException e) {
			//e.printStackTrace();
			System.err.println("Null 참조 불가");
		}
		
		System.out.println("- 아래에는 실행해야 하는 내용이 더 있습니다. -");
		*/
		
		/*
		// 3번 방법 -> 모든 예외를 처리하였으나, 모든 상황을 명세하지는 못함
		// 멀티 catch 사용
		try {
			m4 = (SpecialMember)m1; // 예외 발생 -> ClassCastException
			System.out.println(m4.toString()); // 예외 발생 -> NullPointerException
		} catch(ClassCastException |NullPointerException e) {
			//e.printStackTrace();
			System.err.println("다운 캐스팅, Null 참조에 대한 예외 발생");
		}
		
		System.out.println("- 아래에는 실행해야 하는 내용이 더 있습니다. -");
		*/
		
		
		// 4번 방법 -> 모든 예외를 하나의 방법으로 처리하였으나, 모든 예외 상황을 명세하지 못함
		try { 
			m4 = (SpecialMember)m1; // 예외 발생 -> ClassCastException
			System.out.println(m4.toString()); // 예외 발생 -> NullPointerException
		} catch(Exception e) {
			//e.printStackTrace();
			System.err.println("예외 발생");
		}
		
		System.out.println("- 아래에는 실행해야 하는 내용이 더 있습니다. -");
		
	}
}
