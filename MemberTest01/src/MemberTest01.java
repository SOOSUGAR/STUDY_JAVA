
/*
����) �Ʒ��� ���ǿ� �����ϵ��� �ϴ� ȸ�� Ŭ������ �����ϰ� Ȱ���Ͻÿ�.
1. Ŭ������ : Member
2. ������� : ȸ����ȣ(no), ȸ���̸�(name), ȸ������(age), private�� ����
3. ������ : �ν��Ͻ��� ���� �� ��������� �ʱ�ȭ, public���� ����
4. ����޼ҵ� : getter/setter �޼ҵ� ����, public���� ����
5. main �޼ҵ忡�� Member Ŭ������ �ν��Ͻ��� 5������ �����Ͻÿ�. 3������ ������ �����ڸ� Ȱ���Ͻÿ�.
6. getter �޼ҵ带 ����Ͽ� �ν��Ͻ��� ������ ����Ͻÿ�.

123456, �쿵��, 27
123457, ����ȣ, 29
123458, ����, 43
123459, ���׶��, 27
123460, �ּ���, 27

*/

class Member {
	// ������� ����
	private String no;
	private String name;
	private int age;
	
	// ������
	public Member(String no, String name, int age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	// getter
	public String getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// setter
	public void setNo() {
	}
	
	public void setName() {
	}
	
	public void setAge() {
	}
	
	// ��� �޼ҵ� 1��
	public void printInfo() {
		System.out.println("ȸ�� ��ȣ : " + no);
		System.out.println("ȸ�� �̸� : " + name);
		System.out.println("ȸ�� ���� : " + age);
		System.out.println("����������������������������������������������");
	}
	
	// ��� �޼ҵ� 2�� -> �� �ٷ� ����Ѵ�(���ϰ��̹Ƿ�)
	public String toStirng() {
		return "ȸ�� ��ȣ : " + no + ", �̸� : " + name + ", ���� : " + age; 
	}
	
}

public class MemberTest01 {
	public static void main(String[] args) {
		/* �迭 ���� 1�� ���
		Member[] members = new Member[5];
		members[0] = new Member("123456", "�쿵��", 27);
		members[1] = new Member("123457", "����ȣ", 29);
		members[2] = new Member("123458", "���輮", 43);
		members[3] = new Member("123459", "���׶��", 27);
		members[4] = new Member("123460", "�ּ���", 27); // member[n] -> Member���� �����͸� �����ϴ� ���� ����
		*/
		
		// �迭 ���� 2�� ���
		Member[] members;
		members = new Member[] {
				new Member("123456", "�쿵��", 27),
				new Member("123457", "����ȣ", 29),
				new Member("123458", "���輮", 43),
				new Member("123459", "���׶��", 27),
				new Member("123460", "�ּ���", 27)
		};
		
		System.out.println("������������������������������ ȸ������ �ܦ���������������������������");
		
		/* ��� 1�� ��� - �⺻ for��
		for(int i = 0; i < members.length; i++) {
			System.out.println(members[i]); // toString ���� ����
		}
		*/
		
		// ��� 2�� ��� - Ȯ�� for��
		for(Member m : members) {
			System.out.println(m.toStirng()); // toString ���� ����
		}
		
		
		/*
		Member a = new Member(123456, "�쿵��", 27);
		Member b = new Member(123457, "����ȣ", 29);
		Member c = new Member(123458, "���輮", 43);
		Member d = new Member(123459, "���׶��", 27);
		Member e = new Member(123460, "�ּ���", 27);
		*/
		
		/* 3�� ��� ��� - ��� �޼ҵ� 2�� �̿� - toString() �޼ҵ� Ȱ��, ToString ���� ����
		System.out.println("������������������������������ ȸ������ �ܦ���������������������������");
		System.out.println(a.toStirng());
		System.out.println(b.toStirng());
		System.out.println(c.toStirng());
		System.out.println(d.toStirng());
		System.out.println(e.toStirng());
		*/
		
		/* 2�� ��� ��� - ��� �޼ҵ� 1�� �̿�
		System.out.println("���������������� ȸ������ �ܦ�������������");
		a.printInfo();
		b.printInfo();
		c.printInfo();
		d.printInfo();
		e.printInfo();
		*/
		
		/* 1�� ��� ��� - getter ��� / ª�� ���� ����غ��� -> �޼ҵ� �̿�
		System.out.println("���������������� ȸ������ �ܦ�������������");
		System.out.println("����������������������������������������������");
		
		System.out.println("   ȸ����ȣ : " + a.getNo());
		System.out.println("   �̸� : " + a.getName());
		System.out.println("   ���� : " + a.getAge());
		System.out.println("����������������������������������������������");
		
		System.out.println("   ȸ����ȣ : " + b.getNo());
		System.out.println("   �̸� : " + b.getName());
		System.out.println("   ���� : " + b.getAge());
		System.out.println("����������������������������������������������");
		
		System.out.println("   ȸ����ȣ : " + c.getNo());
		System.out.println("   �̸� : " + c.getName());
		System.out.println("   ���� : " + c.getAge());
		System.out.println("����������������������������������������������");
		
		System.out.println("   ȸ����ȣ : " + d.getNo());
		System.out.println("   �̸� : " + d.getName());
		System.out.println("   ���� : " + d.getAge());
		System.out.println("����������������������������������������������");
		
		System.out.println("   ȸ����ȣ : " + e.getNo());
		System.out.println("   �̸� : " + e.getName());
		System.out.println("   ���� : " + e.getAge());
		System.out.println("����������������������������������������������");
		*/
		
	}

}
