
/*
< ����� ���� >
1. ��� ������ ����
static�� �ִ� ������� - Ŭ���� ����, static field(���� �ʵ�)
static�� ���� ������� - �ν��Ͻ� ����, non-static field(������ �ʵ�)

2. ��� �޼ҵ��� ����
static�� �ִ� �޼ҵ� - Ŭ���� �޼ҵ�, static method(���� �޼ҵ�)
static�� ���� �޼ҵ� - �ν��Ͻ� �޼ҵ�, non-static method(������ �޼ҵ�)

Ŭ���� ����, Ŭ���� �޼ҵ� - �ش� Ŭ������ ����ϴ� ������ �� �� ���� ���������, ��� �ν��Ͻ� ���̿��� �����ϴ� �޼ҵ�
�ν��Ͻ� ����, �ν��Ͻ� �޼ҵ� - �ν��Ͻ��� ������ ������ ��������� ����, �޼ҵ�

3. static �޼ҵ� ���� ���
Ŭ������.Ŭ�����޼ҵ��

*/
// ����) �ν��Ͻ��� ������ �� ������� id�� �ڵ����� 1�� �����ϴ� ��ȣ�� �߰��ϰ� ����Ͻÿ�.
class Account {
	// Ŭ���� ����, ���� �ʵ�
	private static int count = 0;
	// ��� ����, ��� �ʵ�
	private int id; // ������ �Ϸù�ȣ(�߱޼���)
	private String name;
	private String no;
	private int balance;
	
	public Account() {
		
	}
	
	// ������
	public Account(String name, String no, int balance) {
		// ��� ����(�Ķ���), �Ű� ����(����), this(���� ����)
		this.id = ++count;
		this.name = name;
		this.no = no;
		this.balance = balance;
		// ���ϰ��� ����
	}
	
	// ��� �޼ҵ�
	// Ŭ���� �޼ҵ�, ���� �޼ҵ�
	public static int getCount() {
		return count;
	}
	
	//�ν��Ͻ� �޼ҵ�, ������ �޼ҵ�
	public String getName() {
		return name; // this. ���� ���� -> �Ű� ������ ��� ������ �̸��� ���Ƽ� ��� ������ �ֱ� ����
	}
	
	public String getNo() {
		return no;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	// ��� �޼ҵ�
	public void withdraw(int money) {
		balance -= money; 
	}
	
	// �Ա� �޼ҵ�
	public void deposit(int money) {
		balance += money;
	}
	
}

public class AccountTest04 {
	public static void main(String[] args) {
		Account john = new Account("John", "123456", 1000);
		Account mary = new Account("Mary", "654321", 500);
		Account tomy = new Account("Tomy", "147852", 3000);
		
		System.out.println("��John�� ���¡�");
		System.out.println("      ID : " + john.getId());
		System.out.println("   ���¸��� : " + john.getName());
		System.out.println("   ���¹�ȣ : " + john.getNo());
		System.out.println("   �����ܰ� : " + john.getBalance());
		System.out.println();
		System.out.println("��Mary�� ���¡�");
		System.out.println("      ID : " + mary.getId() );
		System.out.println("   ���¸��� : " + mary.getName());
		System.out.println("   ���¹�ȣ : " + mary.getNo());
		System.out.println("   �����ܰ� : " + mary.getBalance());
		System.out.println();
		System.out.println("��tomy�� ���¡�");
		System.out.println("      ID : " + tomy.getId());
		System.out.println("   ���¸��� : " + tomy.getName());
		System.out.println("   ���¹�ȣ : " + tomy.getNo());
		System.out.println("   �����ܰ� : " + tomy.getBalance());
		
		// System.out.println("���ݱ��� ������ �Ϸù�ȣ : " + tomy.getCount());
		System.out.println("\n���ݱ��� ������ �Ϸù�ȣ : " + Account.getCount());
		
		
	}

}
