
/*
< 멤버의 구분 >
1. 멤버 변수의 구분
static이 있는 멤버변수 - 클래스 변수, static field(정적 필드)
static이 없는 멤버변수 - 인스턴스 변수, non-static field(비정적 필드)

2. 멤버 메소드의 구분
static이 있는 메소드 - 클래스 메소드, static method(정적 메소드)
static이 없는 메소드 - 인스턴스 메소드, non-static method(비정적 메소드)

클래스 변수, 클래스 메소드 - 해당 클래스를 사용하는 시점에 딱 한 개만 만들어지고, 모든 인스턴스 사이에서 공유하는 메소드
인스턴스 변수, 인스턴스 메소드 - 인스턴스를 생성할 때마다 만들어지는 변수, 메소드

3. static 메소드 접근 방법
클래스명.클래스메소드명

*/
// 문제) 인스턴스를 생성할 때 멤버변수 id에 자동으로 1식 증가하는 번호를 추가하고 출력하시오.
class Account {
	// 클래스 변수, 정적 필드
	private static int count = 0;
	// 멤버 변수, 멤버 필드
	private int id; // 계좌의 일련번호(발급순서)
	private String name;
	private String no;
	private int balance;
	
	public Account() {
		
	}
	
	// 생성자
	public Account(String name, String no, int balance) {
		// 멤버 변수(파란색), 매개 변수(갈색), this(참조 변수)
		this.id = ++count;
		this.name = name;
		this.no = no;
		this.balance = balance;
		// 리턴값이 없음
	}
	
	// 멤버 메소드
	// 클래스 메소드, 정적 메소드
	public static int getCount() {
		return count;
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
	
	// 출금 메소드
	public void withdraw(int money) {
		balance -= money; 
	}
	
	// 입금 메소드
	public void deposit(int money) {
		balance += money;
	}
	
}

public class AccountTest04 {
	public static void main(String[] args) {
		Account john = new Account("John", "123456", 1000);
		Account mary = new Account("Mary", "654321", 500);
		Account tomy = new Account("Tomy", "147852", 3000);
		
		System.out.println("◆John의 계좌◆");
		System.out.println("      ID : " + john.getId());
		System.out.println("   계좌명의 : " + john.getName());
		System.out.println("   계좌번호 : " + john.getNo());
		System.out.println("   예금잔고 : " + john.getBalance());
		System.out.println();
		System.out.println("◆Mary의 계좌◆");
		System.out.println("      ID : " + mary.getId() );
		System.out.println("   계좌명의 : " + mary.getName());
		System.out.println("   계좌번호 : " + mary.getNo());
		System.out.println("   예금잔고 : " + mary.getBalance());
		System.out.println();
		System.out.println("◆tomy의 계좌◆");
		System.out.println("      ID : " + tomy.getId());
		System.out.println("   계좌명의 : " + tomy.getName());
		System.out.println("   계좌번호 : " + tomy.getNo());
		System.out.println("   예금잔고 : " + tomy.getBalance());
		
		// System.out.println("지금까지 생성한 일련번호 : " + tomy.getCount());
		System.out.println("\n지금까지 생성한 일련번호 : " + Account.getCount());
		
		
	}

}
