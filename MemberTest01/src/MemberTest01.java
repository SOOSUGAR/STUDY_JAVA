
/*
문제) 아래의 조건에 부합하도록 하는 회원 클래스를 생성하고 활용하시오.
1. 클래스명 : Member
2. 멤버변수 : 회원번호(no), 회원이름(name), 회원나이(age), private로 선언
3. 생성자 : 인스턴스를 만들 대 멤버변수를 초기화, public으로 선언
4. 멤버메소드 : getter/setter 메소드 생성, public으로 선언
5. main 메소드에서 Member 클래스의 인스턴스를 5명으로 생성하시오. 3번에서 생성한 생성자를 활용하시오.
6. getter 메소드를 사용하여 인스턴스의 정보를 출력하시오.

123456, 우영우, 27
123457, 이준호, 29
123458, 정명석, 43
123459, 동그라미, 27
123460, 최수연, 27

*/

class Member {
	// 멤버변수 선언
	private String no;
	private String name;
	private int age;
	
	// 생성자
	public Member(String no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	// getter
	public String getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter
	public void setNo() {
	}
	
	public void setName() {
	}
	
	public void setAge() {
	}
	
	// 출력 메소드 1번
	public void printInfo() {
		System.out.println("회원 번호 : " + no);
		System.out.println("회원 이름 : " + name);
		System.out.println("회원 나이 : " + age);
		System.out.println("───────────────────────");
	}
	
	// 출력 메소드 2번 -> 한 줄로 출력한다(리턴값이므로)
	public String toStirng() {
		return "회원 번호 : " + no + ", 이름 : " + name + ", 나이 : " + age; 
	}
	
}

public class MemberTest01 {
	public static void main(String[] args) {
		/* 배열 생성 1번 방법
		Member[] members = new Member[5];
		members[0] = new Member("123456", "우영우", 27);
		members[1] = new Member("123457", "이준호", 29);
		members[2] = new Member("123458", "정멱석", 43);
		members[3] = new Member("123459", "동그라미", 27);
		members[4] = new Member("123460", "최수연", 27); // member[n] -> Member형의 데이터를 참조하는 참조 변수
		*/
		
		// 배열 생성 2번 방법
		Member[] members;
		members = new Member[] {
				new Member("123456", "우영우", 27),
				new Member("123457", "이준호", 29),
				new Member("123458", "정멱석", 43),
				new Member("123459", "동그라미", 27),
				new Member("123460", "최수연", 27)
		};
		
		System.out.println("──────────────● 회원정보 ●──────────────");
		
		/* 출력 1번 방법 - 기본 for문
		for(int i = 0; i < members.length; i++) {
			System.out.println(members[i]); // toString 생략 가능
		}
		*/
		
		// 출력 2번 방법 - 확장 for문
		for(Member m : members) {
			System.out.println(m.toStirng()); // toString 생략 가능
		}
		
		
		/*
		Member a = new Member(123456, "우영우", 27);
		Member b = new Member(123457, "이준호", 29);
		Member c = new Member(123458, "정멱석", 43);
		Member d = new Member(123459, "동그라미", 27);
		Member e = new Member(123460, "최수연", 27);
		*/
		
		/* 3번 출력 방법 - 출력 메소드 2번 이용 - toString() 메소드 활용, ToString 생략 가능
		System.out.println("──────────────● 회원정보 ●──────────────");
		System.out.println(a.toStirng());
		System.out.println(b.toStirng());
		System.out.println(c.toStirng());
		System.out.println(d.toStirng());
		System.out.println(e.toStirng());
		*/
		
		/* 2번 출력 방법 - 출력 메소드 1번 이용
		System.out.println("───────● 회원정보 ●───────");
		a.printInfo();
		b.printInfo();
		c.printInfo();
		d.printInfo();
		e.printInfo();
		*/
		
		/* 1번 출력 방법 - getter 사용 / 짧게 적어 출력해보자 -> 메소드 이용
		System.out.println("───────● 회원정보 ●───────");
		System.out.println("───────────────────────");
		
		System.out.println("   회원번호 : " + a.getNo());
		System.out.println("   이름 : " + a.getName());
		System.out.println("   나이 : " + a.getAge());
		System.out.println("───────────────────────");
		
		System.out.println("   회원번호 : " + b.getNo());
		System.out.println("   이름 : " + b.getName());
		System.out.println("   나이 : " + b.getAge());
		System.out.println("───────────────────────");
		
		System.out.println("   회원번호 : " + c.getNo());
		System.out.println("   이름 : " + c.getName());
		System.out.println("   나이 : " + c.getAge());
		System.out.println("───────────────────────");
		
		System.out.println("   회원번호 : " + d.getNo());
		System.out.println("   이름 : " + d.getName());
		System.out.println("   나이 : " + d.getAge());
		System.out.println("───────────────────────");
		
		System.out.println("   회원번호 : " + e.getNo());
		System.out.println("   이름 : " + e.getName());
		System.out.println("   나이 : " + e.getAge());
		System.out.println("───────────────────────");
		*/
		
	}

}
