import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	private String sno; 	// 학생번호
	private String sname;	// 학생이름
	
	public Student(String sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}
	
	// getter
	public String getSno() {
		return sno;
	}
	
	public String getSname() {
		return sname;
	}
	
	// setter
	
	public void setSno(String sno) {
		this.sno = sno;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	public String toString() {
		return sno + "(" + sname + ")";
	}
	
	@Override
	public int hashCode() {
		return (sno+sname).hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student s = (Student)o;
			return this.sno.equals(s.sno) && this.sname.equals(s.sname);
		}
		return false;
	}
	
	
}

/*
문제 )
1. Student의 인스턴스를 키로 사용하고, 학생의 점수를 값으로 사용하는 HashMap인 map을 생성하시오.
2. 맵에 데이터를 5개 추가하시오.
3. 맵에 키에 대한 중복 허용 여부를 확인하시오.
4. 맵의 값에 대한 중복 허용 여부를 확인하시오.
5. 데이터를 3가지 방법으로 출력하시오.
*/

public class HashMapTest04 {
	public static void main(String[] args) {
		// 1.
		HashMap<Student, Integer> map = new HashMap<>();
		
		// 2.
		map.put(new Student("12341", "우영우"), 95);
		map.put(new Student("12342", "최수연"), 90);
		map.put(new Student("12343", "이준호"), 85);
		map.put(new Student("12344", "정명석"), 80);
		map.put(new Student("12345", "권민우"), 75);
		
		Set<Student> keySet = map.keySet();
		Iterator<Student> it = keySet.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			int score = map.get(s);
			System.out.println("학생정보 : " + s + ", 점수 : " + score);
		}
		System.out.println("────────────────────────────────────────────────");
		
		// 3. 키 중복 허용 여부 -> 변수가 모두 같을 때 허용하지 않음 
		// 중복을 방지하기 위해 클레스에서 hashCode(), equals() 메소드를 override 해줄 것
		map.put(new Student("12341", "우영우"), 100);
		System.out.println(map);
		
		// 4. 값 중복 허용 여부
		map.put(new Student("12346", "태수미"), 90);
		System.out.println(map);
		System.out.println("────────────────────────────────────────────────");
		
		// 5. 출력
		// 1) for - entrySet()
		for(Entry<Student, Integer> entry : map.entrySet()) {
			System.out.print("학생정보 : " + entry.getKey() + ", 점수 : " + entry.getValue() + "\n");
		}
		System.out.println("────────────────────────────────────────────────");
		
		// 2) for - keySet()
		for(Student i : map.keySet()) {
			System.out.print("학생정보 : " + i + ", 점수 : "  + map.get(i) + " \n");
		}
		System.out.println("────────────────────────────────────────────────");
		
		// 3) Iterator
		Iterator<Entry<Student, Integer>> entries = map.entrySet().iterator();
		while(entries.hasNext()) {
			Entry<Student, Integer> entry = entries.next();
			System.out.println("학생정보 : " + entry.getKey() + ", 점수 : " + entry.getValue());
		}
		
		
	}

}
