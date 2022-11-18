import java.util.HashSet;
import java.util.Iterator;

/*
문제 )
1. 학번(sno)과 이름(name)을 멤버변수로 갖는 Student 클래스를 생성하시오. 
- 멤버변수, 생성사, getter/setter, toSring() 생성
2. Student의 인스턴스를 저장하는 HashSet, set을 생성하시오.
3. 셋에 학생 정보 5개를 입력하고 확인하시오.
- 123451 ~ 123455, 우영우, 이준호, 최수연, 정명석, 권민우
4. 셋에 중복 데이터를 입력하여 확인하고, 문제점이 있다면 해결하시오.
5. 셋에서 데이터를 삭제하여 확인하고 문제점이 있다면 해결하시오.
6. 셋의 모든 내용을 2가지 방법으로 출력하시오. (확장 for문, Iterator)
*/

class Student {
	private String sno;
	private String name;

	public Student(String sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	// getter
	public String getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}

	// setter
	public void setSno(String sno) {
		this.sno = sno;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "(학번 : " + sno + ", 이름 : " + name + ")";
	}

	// *hashCode(), equals() 오버라이딩하여 문제점 해결*
	// 1. hashCode()
	@Override
	public int hashCode() {
		return (sno + name).hashCode();
	}

	// 2. equals()
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student a = (Student) obj;
			return this.sno == a.sno && this.name.equals(a.name);
		}
		return false;
	}

}

public class HashSetTest05 {
	public static void main(String[] args) {
		// 2. HashSet 생성
		HashSet<Student> set = new HashSet<Student>();

		// 3. 셋에 학생 정보 5개를 입력
		System.out.println("┎≡≡≡≡≡≡≡≡≡≡HashSet≡≡≡≡≡≡≡≡≡≡┒");
		set.add(new Student("123451", "우영우"));
		set.add(new Student("123452", "이준호"));
		set.add(new Student("123453", "최수연"));
		set.add(new Student("123454", "정명석"));
		set.add(new Student("123455", "권민우"));
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		System.out.println("────────────────────────────");

		// 4. 셋에 중복 데이터를 입력하여 확인
		set.add(new Student("123451", "우영우"));
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		System.out.println("────────────────────────────");

		// 5. 데이터를 삭제하고 확인
		set.remove(new Student("123455", "권민우"));
		System.out.println(set);
		System.out.println("크기 : " + set.size());
		System.out.println("────────────────────────────");

		// 6. 셋의 모든 내용을 2가지 방법으로 출력(확장 for문, Iterator)
		System.out.println(" - 출력 방법 1 : 확장 for문 ");
		for (Object i : set) {
			System.out.println(i);
		}
		System.out.println("────────────────────────────");

		System.out.println(" - 출력 방법 2 : Iterator ");
		Iterator<Student> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("┖≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡┚");

	}

}
