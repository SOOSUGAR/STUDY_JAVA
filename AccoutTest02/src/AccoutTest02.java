
/*
null - ���� ������ �ƹ��͵� �������� ���� ����, null ����
.(��) ������ - ��� ����(access) ������, Ŭ���� ��� ������ ����� �� �ֵ��� �ϴ� ������ 

< Ŭ������ ������ �ʾ��� ���� ������ �߿��� �ذ�� ��> 
1. ������ ������ ������, �ּ����� �� �� �ִ� -> O
2. �� ����� ���¶�� �ϳ��� ��� ó���� �� �־�� �ϳ�, �׷��� �ʴ� -> O
3. �ƹ��� ������ ���� ���, �Ա��� �����ϰ� ���������� ������ �� �ִ� > X

< ���� �����ִ� ������ > 
������ 1 - Ȯ���� �ʱ�ȭ�� ���� ������ ���� �ʰ� �ִ�. ���� ���¶�� �ݵ�� �ʱ�ȭ�� �Ǿ�� �Ѵ�
������ 2 - �ƹ��� ������ ���� ���������� ������ �� �ִ�

*/

// ���� ���� Ŭ���� - ���¸���, ���¹�ȣ, �����ܰ�
class Account {
	// ��� ����
	String name;
	String no;
	int balance;
	
	// �⺻ ������ (default ������)
	// 1. *�������� �ʾƵ� ��� Ŭ���� �ȿ� �������� ����
	// 2. �ٸ� �����ڸ� ����� �⺻ �����ڴ� �����
	Account() {
		
	}
}

public class AccoutTest02 {
	public static void main(String[] args) {
		// 1�� ���
		//Account john = new Account(); // �ν��Ͻ�(instance, ��ü), ��ü
		
		// 2�� ���
		Account john; // Account����  Ŭ�������� ��������
		john = new Account(); // Account Ŭ������ ��ü�� �����ǰ�, �̸� john�� �����Ѵ�
		
		Account mary = new Account(); // ������ ȣ��
		
		//�ʱ�ȭ
		john.name = "John";
		john.no = "123456";
		john.balance = 1000;
		
		mary.name = "Mary";
		mary.no = "654321";
		mary.balance = 500;
		
		john.balance -= 200; // ���
		mary.balance += 100; // �Ա�
		
		// �������� ���
		System.out.println("�� John�� ���� ����");
		System.out.println("   ���¸��� : " + john.name);
		System.out.println("   ���¹�ȣ : " + john.no);
		System.out.println("   �����ܰ� : " + john.balance);
		
		System.out.println();
		
		System.out.println("�� Mary�� ���� ����");
		System.out.println("   ���¸��� : " + mary.name);
		System.out.println("   ���¹�ȣ : " + mary.no);
		System.out.println("   �����ܰ� : " + mary.balance);
		
		/*
		System.out.println("�� Mary�� ���� ����");
		System.out.println("   ���¸��� : " + );
		System.out.println("   ���¹�ȣ : " + );
		System.out.println("   �����ܰ� : " + );
		*/
	}

}
