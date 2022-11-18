package account;

// 보통 예금 클래스
// TimeAccount 클래스의 부모 클래스
public class Account {
	// 멤버 변수, 멤버 필드
	private String name;
	private String no;
	private int balance;
	
	// 생성자
	public Account(String name, String no, int balance) {
		// 멤버 변수(파란색), 매개 변수(갈색), this(참조 변수)
		this.name = name;
		this.no = no;
		this.balance = balance;
		// 리턴값이 없음
	}
	
	//인스턴스 메소드, 비정적 메소드
	public String getName() {
		return name; // this. 생략 가능 -> 매개 변수와 멤버 변수의 이름이 같아서 멤버 변수만 있기 때문
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
	
	// 출금 메소드
	public void withdraw(int money) {
		balance -= money; 
	}
	
	// 입금 메소드
	public void deposit(int money) {
		balance += money;
	}
	
	// 출력 메소드 1번
	public void showInfo() {
		System.out.println("계좌명의 : " + name);
		System.out.println("계좌번호 : " + no);
		System.out.println("예금잔고 : " + balance);
	}
	
	// 출력 메소드 2번
	public String toStirng() {
		return "계좌명의 : " + name + ", 계좌번호 : " + no + ", 예금잔고 : " + balance;
	}
	
}
