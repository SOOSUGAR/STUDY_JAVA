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
		
		// 1. ����Ʈ ����
		ArrayList<Member> list = new ArrayList<Member>();
		
		System.out.println("�Ǧ�������������������������������������������������������");
		System.out.println(" �� �� �� ü �� Ǫ �� ��");
		// 2. ������ ���� (������ ����)
		System.out.println("2. ������ ����");
		list.add(new Member("123451", "�쿵��", 27));
		list.add(new Member("123452", "�ּ���", 27));
		list.add(new Member("123453", "����", 43));
		list.add(new Member("123454", "����ȣ", 30));
		list.add(new Member("123455", "�ǹο�", 30));
		System.out.println(list);
		System.out.println("��������������������������������������������������������");
		
		// 3. ��� 1 (�⺻ for��)
		System.out.println("3. ��� 1");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(i+1 + "��° : " + list.get(i));
		}
		System.out.println("��������������������������������������������������������");
		
		// 3. ��� 2 (Ȯ�� for��)
		System.out.println("3. ��� 2");
		for(Object i : list) {
			System.out.println(i);
		}
		System.out.println("��������������������������������������������������������");
		
		// 4. ������ ���� (������ ����)
		// �� ���� ������ ����
		System.out.println("4. ������ ����");
		list.add(new Member("123456", "�׶��", 27));
		
		for(Object i : list) {
			System.out.println(i);
		}
		System.out.println("��������������������������������������������������������");
		
		// 5. ������ ���� (������� ����, �߰�)
		// �ε��� 3��(����)�� ������ ����
		// �ε����� ������ ���ٸ�?
		// list.add(3, new Member("123457", "�Ѽ���", 48));
		System.out.println("5. ������ ����");
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getName().equals("����")) {
				list.add(i+1, new Member("123457", "�Ѽ���", 48));
			}
		}
		
		for(Object i : list) {
			System.out.println(i);
		}
		System.out.println("��������������������������������������������������������");
		
		// 6. ������ ����
		// �ּ��� ������ ���̸� 29�� ���� -> ���� �Է��� ������ Ŭ������ set �޼ҵ带 �̿�����
		// �ε����� ������ ���ٸ�?
		// list.get(1).setAge(29);
		System.out.println("6. ������ ����");
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getName().equals("�ּ���")) {
				list.get(i).setAge(29);
			}
		}
		
		for(Object i : list) {
			System.out.println(i);
		}
		System.out.println("��������������������������������������������������������");
		
		// 7. ������ ����
		// �ε��� 5��(�ǹο�) ����
		// �ε����� ������ ���ٸ�?
		// list.remove(5);
		System.out.println("7. ������ ����");
		for(int i = list.size()-1; i>=0; i--) { 		// ������ ������ �ڿ�������
			if(list.get(i).getName().equals("�ǹο�")) {
				list.remove(i);
			}
		}
		
		for(Object i : list) {
			System.out.println(i);
		}
		System.out.println("��������������������������������������������������������");
		
		// 8. ��� 3��
		System.out.println("8. ��� 3��");
		Iterator<Member> it = list.iterator();
		while(it.hasNext()) {
			Member m = it.next();
			System.out.println(m);
		}
		
		System.out.println("�Ŧ�������������������������������������������������������");
		
	}

}
