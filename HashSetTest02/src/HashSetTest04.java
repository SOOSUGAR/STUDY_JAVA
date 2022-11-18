import java.util.HashSet;

class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age =age;
	}
	
	public String toString() {
		return name + " (" + age + ")";
	}
	
	// HashSet에서 사용자가 직접 만든 클래스의 인스턴스가 중복을 허용하지 않도록 하기 위해서는
	// Object 클래스의 2개의 메소드를 오버라이딩 해야한다 -> hashCode(), equals()
	
	// 1. hashCode()
	@Override
	public int hashCode() {
		return (name + age).hashCode();
	}
	
	// 2. equals()
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			return this.name.equals(m.name) && this.age == m.age;
		}
		return false;
	}
	
	
}

public class HashSetTest04 {
	public static void main(String[] args) {
		// 해시셋 생성
		HashSet<Member> set = new HashSet<Member>();
		
		// 데이터 추가
		set.add(new Member("우영우", 27));
		set.add(new Member("이준호", 30));
		set.add(new Member("최수연", 28));
		set.add(new Member("정명석", 43));
		set.add(new Member("권민우", 31));
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 중복 데이터 추가 1 - 이름만 같은 경우(허용)
		set.add(new Member("권민우", 37));
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 중복 데이터 추가 2 - 나이만 같은 경우(허용)
		set.add(new Member("동그라미", 27));
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 중복 데이터 추가 3 - 모두 같은 경우
		// 문제점 : 이름과 나이가 모둔 같은 경우는 중복 데이터이므로 set에서는 허용 불가여야만 함
		// 해결책 : 셋에서 사용하는 클래스에 Object 클래스의 hashCode(), equals() 메소드를 오버라이딩하여
		// 실제의 값을 비교함으로써 중복 데이터를 방지함
		set.add(new Member("최수연", 28));
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 데이터 삭제 1 - 이름만 같은 경우
		set.remove(new Member("이준호", 28));
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 데이터 삭제 2 - 나이만 같은 경우
		set.remove(new Member("배수미", 27));
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		// 데이터 삭제 3 - 모두 같은 경우
		// 문제점: 이름과 나이가 모두 같다면 삭제가 되어야 함
		// 해결첵 :  Object 클래스의 hashCode(), equals() 메소드를 오버라이딩하여 문제 해결
		set.remove(new Member("이준호", 30));
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		
		
	}

}
