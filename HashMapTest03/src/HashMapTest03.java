import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Member{
	private String sno;
	private String sname;
	private int age;
	
	public Member(String sno, String sname, int age) {
		this.sno = sno;
		this.sname = sname;
		this.age = age;
	}
	
	// getter
	public String getSno() {
		return sno;
	}
	
	public String getSname() {
		return sname;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter
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
		return sno + "(" + sname + ") : " + age;
	}
	
}
/*
문제 )
1. 키는 전화번호, 값은 Member의 인스턴스를 갖는 HashMap인 map을 생성하시오.
2. 맵에 데이터를 5개 입력하시오
키 : "010-1111-1111"
값 : new Member("123451", "우영우", 27)
...
3. 맵에서 전화번호가 "010-2222-2222"인 회원의 정보를 삭제하시오.
4. 맵에서 전화번호가 "010-3333-3333"인 회원의 이름을 한선영으로 수정하시오.
5. 맵에서 전화번호가 "010-4444-4444"인 회원의 나이를 32로 수정하시오.
6. 맵의 데이터를 3가지 방법으로 출력하시오.
*/
public class HashMapTest03 {
	public static void main(String[] args) {
		// map 생성
		HashMap<String, Member> map = new HashMap<>();
		
		// 데이터 추가
		map.put("010-1111-1111", new Member("123451", "우영우", 27));
		map.put("010-2222-2222", new Member("123452", "최수연", 27));
		map.put("010-3333-3333", new Member("123453", "정명석", 43));
		map.put("010-4444-4444", new Member("123454", "이준호", 30));
		map.put("010-5555-5555", new Member("123455", "권민우", 30));
		//System.out.println(map);
		Set<String> keys = map.keySet();
		Iterator<String> it =keys.iterator();
		while(it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("전화번호 : " + tel + ", 회원정보 : " + m);
		}
		System.out.println("────────────────────────────────────────────────");
		
		// 회원 정보 삭제
		//map.remove("010-2222-2222");
		if(map.remove("010-2222-2222") == null) {
			System.out.println("존재하지 않는 전화번호 입니다.");
		} else {
			map.remove("010-2222-2222");
			System.out.println("회원 정보를 삭제하였습니다.");
		}
		System.out.println(map);
		System.out.println("────────────────────────────────────────────────");
		
		// 회원 정보 수정
		// map.put("010-3333-3333", new Member("123453", "한선영", 43));
		/*it = keys.iterator();
		while(it.hasNext()) {
			String tel = it.next();
			it(tel.equals("010-3333-3333")){
				Member m = map.get(tel);
				m.setSname("한선영");
				m.put(tel, m);
			}
		}*/
		
		if(map.get("010-3333-3333") == null ) {
			System.out.println("존재하지 않는 전화번호 입니다.");
		} else {
			map.get("010-3333-3333").setSname("한선영");
			System.out.println("회원 정보를 수정하였습니다.");
		}
		System.out.println(map);
		System.out.println("────────────────────────────────────────────────");
		
		//map.put("010-4444-4444", new Member("123454", "이준호", 32));
		if(map.get("010-4444-4444") == null ) {
			System.out.println("존재하지 않는 전화번호 입니다.");
		} else {
			map.get("010-4444-4444").setAge(32);
			System.out.println("회원 정보를 수정하였습니다.");
		}
		System.out.println(map);
		System.out.println("────────────────────────────────────────────────");
		
		// 출력
		// 1 - entrySet()
		for(Entry<String, Member> entry : map.entrySet()) {
			System.out.print(entry.getKey()+ " : " + entry.getValue() + " \n");
		}
		System.out.println("────────────────────────────────────────────────");
		
		// 2 - keySet()
		for(String i : map.keySet()) {
			System.out.print(i + " : "  + map.get(i) + " \n");
		}
		System.out.println("────────────────────────────────────────────────");
		
		// 3 - Iterator
		Iterator<Entry<String, Member>> entries = map.entrySet().iterator();
		while(entries.hasNext()) {
			Entry<String, Member> entry = entries.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}

}
