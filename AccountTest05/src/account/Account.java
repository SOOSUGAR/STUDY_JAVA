package account;

// ���� ���� Ŭ����
// TimeAccount Ŭ������ �θ� Ŭ����
public class Account {
	// ��� ����, ��� �ʵ�
	private String name;
	private String no;
	private int balance;
	
	// ������
	public Account(String name, String no, int balance) {
		// ��� ����(�Ķ���), �Ű� ����(����), this(���� ����)
		this.name = name;
		this.no = no;
		this.balance = balance;
		// ���ϰ��� ����
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
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// ��� �޼ҵ�
	public void withdraw(int money) {
		balance -= money; 
	}
	
	// �Ա� �޼ҵ�
	public void deposit(int money) {
		balance += money;
	}
	
	// ��� �޼ҵ� 1��
	public void showInfo() {
		System.out.println("���¸��� : " + name);
		System.out.println("���¹�ȣ : " + no);
		System.out.println("�����ܰ� : " + balance);
	}
	
	// ��� �޼ҵ� 2��
	public String toStirng() {
		return "���¸��� : " + name + ", ���¹�ȣ : " + no + ", �����ܰ� : " + balance;
	}
	
}
