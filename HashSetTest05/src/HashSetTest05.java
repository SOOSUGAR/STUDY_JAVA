import java.util.HashSet;
import java.util.Iterator;

/*
���� )
1. �й�(sno)�� �̸�(name)�� ��������� ���� Student Ŭ������ �����Ͻÿ�. 
- �������, ������, getter/setter, toSring() ����
2. Student�� �ν��Ͻ��� �����ϴ� HashSet, set�� �����Ͻÿ�.
3. �¿� �л� ���� 5���� �Է��ϰ� Ȯ���Ͻÿ�.
- 123451 ~ 123455, �쿵��, ����ȣ, �ּ���, ����, �ǹο�
4. �¿� �ߺ� �����͸� �Է��Ͽ� Ȯ���ϰ�, �������� �ִٸ� �ذ��Ͻÿ�.
5. �¿��� �����͸� �����Ͽ� Ȯ���ϰ� �������� �ִٸ� �ذ��Ͻÿ�.
6. ���� ��� ������ 2���� ������� ����Ͻÿ�. (Ȯ�� for��, Iterator)
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
		return "(�й� : " + sno + ", �̸� : " + name + ")";
	}

	// *hashCode(), equals() �������̵��Ͽ� ������ �ذ�*
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
		// 2. HashSet ����
		HashSet<Student> set = new HashSet<Student>();

		// 3. �¿� �л� ���� 5���� �Է�
		System.out.println("�ǡաաաաաաաաա�HashSet�աաաաաաաաազ�");
		set.add(new Student("123451", "�쿵��"));
		set.add(new Student("123452", "����ȣ"));
		set.add(new Student("123453", "�ּ���"));
		set.add(new Student("123454", "����"));
		set.add(new Student("123455", "�ǹο�"));
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		System.out.println("��������������������������������������������������������");

		// 4. �¿� �ߺ� �����͸� �Է��Ͽ� Ȯ��
		set.add(new Student("123451", "�쿵��"));
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		System.out.println("��������������������������������������������������������");

		// 5. �����͸� �����ϰ� Ȯ��
		set.remove(new Student("123455", "�ǹο�"));
		System.out.println(set);
		System.out.println("ũ�� : " + set.size());
		System.out.println("��������������������������������������������������������");

		// 6. ���� ��� ������ 2���� ������� ���(Ȯ�� for��, Iterator)
		System.out.println(" - ��� ��� 1 : Ȯ�� for�� ");
		for (Object i : set) {
			System.out.println(i);
		}
		System.out.println("��������������������������������������������������������");

		System.out.println(" - ��� ��� 2 : Iterator ");
		Iterator<Student> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("�šաաաաաաաաաաաաաաաաաաաաաաաաաաազ�");

	}

}
