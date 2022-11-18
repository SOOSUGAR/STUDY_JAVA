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
���� )
1. Ű�� ��ȭ��ȣ, ���� Member�� �ν��Ͻ��� ���� HashMap�� map�� �����Ͻÿ�.
2. �ʿ� �����͸� 5�� �Է��Ͻÿ�
Ű : "010-1111-1111"
�� : new Member("123451", "�쿵��", 27)
...
3. �ʿ��� ��ȭ��ȣ�� "010-2222-2222"�� ȸ���� ������ �����Ͻÿ�.
4. �ʿ��� ��ȭ��ȣ�� "010-3333-3333"�� ȸ���� �̸��� �Ѽ������� �����Ͻÿ�.
5. �ʿ��� ��ȭ��ȣ�� "010-4444-4444"�� ȸ���� ���̸� 32�� �����Ͻÿ�.
6. ���� �����͸� 3���� ������� ����Ͻÿ�.
*/
public class HashMapTest03 {
	public static void main(String[] args) {
		// map ����
		HashMap<String, Member> map = new HashMap<>();
		
		// ������ �߰�
		map.put("010-1111-1111", new Member("123451", "�쿵��", 27));
		map.put("010-2222-2222", new Member("123452", "�ּ���", 27));
		map.put("010-3333-3333", new Member("123453", "����", 43));
		map.put("010-4444-4444", new Member("123454", "����ȣ", 30));
		map.put("010-5555-5555", new Member("123455", "�ǹο�", 30));
		//System.out.println(map);
		Set<String> keys = map.keySet();
		Iterator<String> it =keys.iterator();
		while(it.hasNext()) {
			String tel = it.next();
			Member m = map.get(tel);
			System.out.println("��ȭ��ȣ : " + tel + ", ȸ������ : " + m);
		}
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// ȸ�� ���� ����
		//map.remove("010-2222-2222");
		if(map.remove("010-2222-2222") == null) {
			System.out.println("�������� �ʴ� ��ȭ��ȣ �Դϴ�.");
		} else {
			map.remove("010-2222-2222");
			System.out.println("ȸ�� ������ �����Ͽ����ϴ�.");
		}
		System.out.println(map);
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// ȸ�� ���� ����
		// map.put("010-3333-3333", new Member("123453", "�Ѽ���", 43));
		/*it = keys.iterator();
		while(it.hasNext()) {
			String tel = it.next();
			it(tel.equals("010-3333-3333")){
				Member m = map.get(tel);
				m.setSname("�Ѽ���");
				m.put(tel, m);
			}
		}*/
		
		if(map.get("010-3333-3333") == null ) {
			System.out.println("�������� �ʴ� ��ȭ��ȣ �Դϴ�.");
		} else {
			map.get("010-3333-3333").setSname("�Ѽ���");
			System.out.println("ȸ�� ������ �����Ͽ����ϴ�.");
		}
		System.out.println(map);
		System.out.println("������������������������������������������������������������������������������������������������");
		
		//map.put("010-4444-4444", new Member("123454", "����ȣ", 32));
		if(map.get("010-4444-4444") == null ) {
			System.out.println("�������� �ʴ� ��ȭ��ȣ �Դϴ�.");
		} else {
			map.get("010-4444-4444").setAge(32);
			System.out.println("ȸ�� ������ �����Ͽ����ϴ�.");
		}
		System.out.println(map);
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// ���
		// 1 - entrySet()
		for(Entry<String, Member> entry : map.entrySet()) {
			System.out.print(entry.getKey()+ " : " + entry.getValue() + " \n");
		}
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// 2 - keySet()
		for(String i : map.keySet()) {
			System.out.print(i + " : "  + map.get(i) + " \n");
		}
		System.out.println("������������������������������������������������������������������������������������������������");
		
		// 3 - Iterator
		Iterator<Entry<String, Member>> entries = map.entrySet().iterator();
		while(entries.hasNext()) {
			Entry<String, Member> entry = entries.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}

}
