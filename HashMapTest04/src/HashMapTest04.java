import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

class Student {
	private String sno; 	// �л���ȣ
	private String sname;	// �л��̸�
	
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
���� )
1. Student�� �ν��Ͻ��� Ű�� ����ϰ�, �л��� ������ ������ ����ϴ� HashMap�� map�� �����Ͻÿ�.
2. �ʿ� �����͸� 5�� �߰��Ͻÿ�.
3. �ʿ� Ű�� ���� �ߺ� ��� ���θ� Ȯ���Ͻÿ�.
4. ���� ���� ���� �ߺ� ��� ���θ� Ȯ���Ͻÿ�.
5. �����͸� 3���� ������� ����Ͻÿ�.
*/

public class HashMapTest04 {
	public static void main(String[] args) {
		// 1.
		HashMap<Student, Integer> map = new HashMap<>();
		
		// 2.
		map.put(new Student("12341", "�쿵��"), 95);
		map.put(new Student("12342", "�ּ���"), 90);
		map.put(new Student("12343", "����ȣ"), 85);
		map.put(new Student("12344", "����"), 80);
		map.put(new Student("12345", "�ǹο�"), 75);
		
		Set<Student> keySet = map.keySet();
		Iterator<Student> it = keySet.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			int score = map.get(s);
			System.out.println("�л����� : " + s + ", ���� : " + score);
		}
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// 3. Ű �ߺ� ��� ���� -> ������ ��� ���� �� ������� ���� 
		// �ߺ��� �����ϱ� ���� Ŭ�������� hashCode(), equals() �޼ҵ带 override ���� ��
		map.put(new Student("12341", "�쿵��"), 100);
		System.out.println(map);
		
		// 4. �� �ߺ� ��� ����
		map.put(new Student("12346", "�¼���"), 90);
		System.out.println(map);
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// 5. ���
		// 1) for - entrySet()
		for(Entry<Student, Integer> entry : map.entrySet()) {
			System.out.print("�л����� : " + entry.getKey() + ", ���� : " + entry.getValue() + "\n");
		}
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// 2) for - keySet()
		for(Student i : map.keySet()) {
			System.out.print("�л����� : " + i + ", ���� : "  + map.get(i) + " \n");
		}
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// 3) Iterator
		Iterator<Entry<Student, Integer>> entries = map.entrySet().iterator();
		while(entries.hasNext()) {
			Entry<Student, Integer> entry = entries.next();
			System.out.println("�л����� : " + entry.getKey() + ", ���� : " + entry.getValue());
		}
		
		
	}

}
