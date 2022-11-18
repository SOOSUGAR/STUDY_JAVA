import java.util.ArrayList;
import java.util.Iterator;

class Member {
	private String no;
	private String name;
	private int age;
	
	public Member(String no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	public String getNO() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return no + " (" + name + ") " + age;
	}
}

public class ArrayListTest02 {
	public static void main(String[] args) {
		
		// 1. 리스트 생성
		ArrayList<Member> list = new ArrayList<Member>();
		
		System.out.println("┎───────────────────────────┒");
		System.out.println(" 한 해 인 체 고 푸 하 하");
		// 2. 데이터 삽입 (순차적 삽입)
		System.out.println("2. 데이터 삽입");
		list.add(new Member("123451", "우영우", 27));
		list.add(new Member("123452", "최수연", 27));
		list.add(new Member("123453", "정명석", 43));
		list.add(new Member("123454", "이준호", 30));
		list.add(new Member("123455", "권민우", 30));
		System.out.println(list);
		System.out.println("────────────────────────────");
		
		// 3. 출력 1 (기본 for문)
		System.out.println("3. 출력 1");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(i+1 + "번째 : " + list.get(i));
		}
		System.out.println("────────────────────────────");
		
		// 3. 출력 2 (확장 for문)
		System.out.println("3. 출력 2");
		for(Object i : list) {
			System.out.println(i);
		}
		System.out.println("────────────────────────────");
		
		// 4. 데이터 삽입 (순차적 삽입)
		// 맨 끝에 데이터 삽입
		System.out.println("4. 데이터 삽입");
		list.add(new Member("123456", "그라미", 27));
		
		for(Object i : list) {
			System.out.println(i);
		}
		System.out.println("────────────────────────────");
		
		// 5. 데이터 삽입 (비순차적 삽입, 중간)
		// 인덱스 3번(정명석)에 데이터 삽입
		// 인덱스가 무수히 많다면?
		// list.add(3, new Member("123457", "한선영", 48));
		System.out.println("5. 데이터 삽입");
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getName().equals("정명석")) {
				list.add(i+1, new Member("123457", "한선영", 48));
			}
		}
		
		for(Object i : list) {
			System.out.println(i);
		}
		System.out.println("────────────────────────────");
		
		// 6. 데이터 수정
		// 최수연 데이터 나이를 29로 수정 -> 값을 입력할 때에는 클래스의 set 메소드를 이용하자
		// 인덱스가 무수히 많다면?
		// list.get(1).setAge(29);
		System.out.println("6. 데이터 수정");
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getName().equals("최수연")) {
				list.get(i).setAge(29);
			}
		}
		
		for(Object i : list) {
			System.out.println(i);
		}
		System.out.println("────────────────────────────");
		
		// 7. 데이터 삭제
		// 인덱스 5번(권민우) 삭제
		// 인덱스가 무수히 많다면?
		// list.remove(5);
		System.out.println("7. 데이터 삭제");
		for(int i = list.size()-1; i>=0; i--) { 		// 삭제할 때에는 뒤에서부터
			if(list.get(i).getName().equals("권민우")) {
				list.remove(i);
			}
		}
		
		for(Object i : list) {
			System.out.println(i);
		}
		System.out.println("────────────────────────────");
		
		// 8. 출력 3번
		System.out.println("8. 출력 3번");
		Iterator<Member> it = list.iterator();
		while(it.hasNext()) {
			Member m = it.next();
			System.out.println(m);
		}
		
		System.out.println("┖───────────────────────────┚");
		
	}

}
