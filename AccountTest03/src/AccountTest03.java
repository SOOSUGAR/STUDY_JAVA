
/*
< ���� ������ > ���� ������
1. private - �ڽ��� Ŭ���������� ���� ����
2. default - ���� �����ڸ� ���� ���� ����, ���� ��Ű�������� ���� ����
3. protected - ���� ��Ű������, �Ǵ� �ٸ� ��Ű���� ����� �޾Ҵٸ� ���� ����
4. public - �������Գ�, ��𿡼��� ���� ����

# this - ��� �ν��Ͻ� �տ� �����ϰ�, �ڽ��� �ν��Ͻ��� ��� ������ �����ϴ� �뵵�� ��� 
*/
class Account {
	// ��� ����, ��� �ʵ�
	// private - �ڽ��� Ŭ���� ���� ��������� ���� ����(���� �ȿ����� �޼ҵ�� �����غ���)
	private String name;
	private String no;
	private int balance;
	
	//�ڡڡڡڡ�
	/*
	������(Constructor)
	< �������� Ư¡ >
	1. Ŭ���� �̸��� ����. 2. ����Ÿ���� ����.
	< �������� ���� >
	1. Ȯ���� �ʱ�ȭ�� ���� ������ ���ش�.
	< �������� ȣ�� �ñ� >
	1. �ν��Ͻ��� ������ �� ȣ���Ѵ�. -> Ȯ���� �ʱ�ȭ�� ���� ������ �ȴ�.
	*/
	
	
	// �⺻ ������ (default ������)
	// 1. *�������� �ʾƵ� ��� Ŭ���� �ȿ� �������� ����
	// 2. �ٸ� �����ڸ� ����� �⺻ �����ڴ� ����� -> �����ڸ� �����ε��ϸ� �⺻ �����ڴ� �����
	// ������ �����ε�
	public Account() {
		
	}
	
	public Account(String name, String no, int balance) {
		// ��� ����(�Ķ���), �Ű� ����(����), this(���� ����)
		this.name = name;
		this.no = no;
		this.balance = balance;
		// ���ϰ��� ����
	}
	
	// Ŭ������ ���� ��� �޼ҵ�
	// public - ��𿡼���, �������Գ� ���� ����
	// getter / setter �޼ҵ� ���� - �ݵ�� �����ؾ��ϴ� ���� �ƴ϶�, �ʿ信 ���� ����� ���� ��
	// getter - ��� ������ ���� ����(Ȯ��)�ϴ� �޼ҵ�
	public String getName() {
		return name; // this. ���� ���� -> �Ű� ������ ��� ������ �̸��� ���Ƽ� ��� ������ �ֱ� ����
	}
	
	public String getNo() {
		return no;
	}
	
	public int getBalance() {
		return balance;
	}
	
	// setter - ��� ������ ���� ����(����)�ϴ� �޼ҵ�
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
	
}

public class AccountTest03 {
	public static void main(String[] args) {
		Account john = new Account("John" , "123456", 1000); 
		Account mary = new Account("Mary" , "654321", 500); 
		Account jane = new Account();
		
		john.withdraw(100); // ��� �޼ҵ� ȣ��
		mary.deposit(200); // �Ա� �޼ҵ� ȣ��
		
		System.out.println("�� John�� ���� ����");
		System.out.println("   ���¸��� : " + john.getName());
		System.out.println("   ���¹�ȣ : " + john.getNo());
		System.out.println("   �����ܰ� : " + john.getBalance());
		
		System.out.println();
		
		System.out.println("�� Mary�� ���� ����");
		System.out.println("   ���¸��� : " + mary.getName());
		System.out.println("   ���¹�ȣ : " + mary.getNo());
		System.out.println("   �����ܰ� : " + mary.getBalance());
		
	}

}
