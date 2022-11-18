import java.util.Iterator;
import java.util.TreeSet;

/*
1. �й�(sno), �̸�(name), ����(score)�� ��������� ������ Student Ŭ������ �����Ͻÿ�.
2. Student�� �ν��ͽ� 5���� �����ϴ� TreeSet�� set�� �����Ͻÿ�.
3. ���� ���� ����� �����ǵ��� �ڵ带 �����Ͻÿ�.
4. �¿��� �ߺ� �������� ��� ���ο� ������ ���� ���θ� Ȯ���Ͻÿ�.
5. ���� ������ 3���� ������� ����Ͻÿ�. ( Ȯ�� for��, Iterator, isEmpty() )
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
		return "[�й� : " + sno + ", �̸� : " + name + ", ���� : " + score + "]";
	}
	
	public void print() {
		System.out.println("�й� : " + sno + ", �̸� : " + name + ", ���� : " + score);
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
		
		
		set.add(new Student("123451" , "�쿵��", 100));
		set.add(new Student("123452" , "�ּ���", 95));
		set.add(new Student("123453" , "����", 90));
		set.add(new Student("123454" , "����ȣ", 85));
		set.add(new Student("123455" , "�ǹο�", 80));
		System.out.println(set);
		
		// �ߺ� ������ ��� ����
		set.add(new Student("123451", "�躸��", 80));
		System.out.println(set);
		
		
		// ��� 1 - Ȯ�� for��
		for(Student s : set) {
			System.out.println(s);
		}
		
		// ��� 2 - Iterator
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		
		// ��� 3 - isEmpty()
		while(!set.isEmpty()) {
			System.out.print(set.pollFirst() + " ");
		}
		System.out.println();
		
	}

}
