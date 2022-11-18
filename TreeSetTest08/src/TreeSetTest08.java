import java.util.Iterator;
import java.util.TreeSet;

/*
1. 학번(sno), 이름(name), 점수(score)를 멤버변수로 가지는 Student 클래스를 생성하시오.
2. Student의 인스터스 5개를 저장하는 TreeSet인 set을 생성하시오.
3. 셋의 정렬 기능이 구현되도록 코드를 수정하시오.
4. 셋에서 중복 데이터의 허용 여부와 데이터 삭제 여부를 확인하시오.
5. 셋의 내용을 3가지 방법으로 출력하시오. ( 확장 for문, Iterator, isEmpty() )
*/

class Student implements Comparable<Student>{
	private String sno;
	private String name;
	private int score;
	
	public Student (String sno, String name, int score) {
		this.sno = sno;
		this.name = name;
		this.score =score;
	}
	
	// getter
	public String getSno() {
		return sno;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	// setter
	public void setSno(String sno) {
		this.sno = sno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "[학번 : " + sno + ", 이름 : " + name + ", 점수 : " + score + "]";
	}
	
	public void print() {
		System.out.println("학번 : " + sno + ", 이름 : " + name + ", 점수 : " + score);
	}
	
	/*
	@Override
	public int compareTo(Student s) {
		if(this.score > s.score) return 1;
		else if(this.score < s.score) return -1;
		else return 0;
	}
	*/
	
	/*
	@Override
	public int compareTo(Student s) {
		if(this.name.compareTo(s.name) > 0) return 1;
		else if(this.name.compareTo(s.name) < 0) return -1;
		else return 0;
	}
	*/
	
	@Override
	public int compareTo(Student s) {
		if(this.sno.compareTo(s.sno) > 0) return 1;
		else if(this.sno.compareTo(s.sno) < 0) return -1;
		else return 0;
	}
	
}

public class TreeSetTest08 {
	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<Student>();
		
		
		set.add(new Student("123451" , "우영우", 100));
		set.add(new Student("123452" , "최수연", 95));
		set.add(new Student("123453" , "정명석", 90));
		set.add(new Student("123454" , "이준호", 85));
		set.add(new Student("123455" , "권민우", 80));
		System.out.println(set);
		
		// 중복 데이터 허용 여부
		set.add(new Student("123451", "김보미", 80));
		System.out.println(set);
		
		
		// 출력 1 - 확장 for문
		for(Student s : set) {
			System.out.println(s);
		}
		
		// 출력 2 - Iterator
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		
		// 출력 3 - isEmpty()
		while(!set.isEmpty()) {
			System.out.print(set.pollFirst() + " ");
		}
		System.out.println();
		
	}

}
