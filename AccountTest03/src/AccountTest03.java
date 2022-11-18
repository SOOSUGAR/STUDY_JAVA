
/*
< 접근 제한자 > 접근 한정자
1. private - 자신으 클래스에서만 접근 가능
2. default - 접근 제한자를 쓰지 않은 상태, 같은 패키지에서만 접근 가능
3. protected - 같은 패키지에서, 또는 다른 패키지라도 상속을 받았다면 접근 가능
4. public - 누구에게나, 어디에서나 접근 가능

# this - 모든 인스턴스 앞에 존재하고, 자신의 인스턴스의 멤버 변수를 참조하는 용도로 사용 
*/
class Account {
	// 멤버 변수, 멤버 필드
	// private - 자신의 클래스 내의 멤버에서만 접근 가능(메인 안에서는 메소드로 접근해보자)
	private String name;
	private String no;
	private int balance;
	
	//★★★★★
	/*
	생성자(Constructor)
	< 생성자의 특징 >
	1. 클래스 이름과 같다. 2. 리턴타입이 없다.
	< 생성자의 역할 >
	1. 확실한 초기화에 대한 보장을 해준다.
	< 생성자의 호출 시기 >
	1. 인스턴스를 생성할 때 호출한다. -> 확실한 초기화에 대한 보장이 된다.
	*/
	
	
	// 기본 생성자 (default 생성자)
	// 1. *기재하지 않아도 모든 클래스 안에 기존으로 존재
	// 2. 다른 생성자를 만들면 기본 생성자는 사라짐 -> 생성자를 오버로딩하면 기본 생성자는 사라짐
	// 생성자 오버로딩
	public Account() {
		
	}
	
	public Account(String name, String no, int balance) {
		// 멤버 변수(파란색), 매개 변수(갈색), this(참조 변수)
		this.name = name;
		this.no = no;
		this.balance = balance;
		// 리턴값이 없음
	}
	
	// 클래스에 대한 멤버 메소드
	// public - 어디에서나, 누구에게나 접근 가능
	// getter / setter 메소드 생성 - 반드시 생성해야하는 것이 아니라, 필요에 따라 만들어 쓰면 됨
	// getter - 멤버 변수의 값을 리턴(확인)하는 메소드
	public String getName() {
		return name; // this. 생략 가능 -> 매개 변수와 멤버 변수의 이름이 같아서 멤버 변수만 있기 때문
	}
	
	public String getNo() {
		return no;
	}
	
	public int getBalance() {
		return balance;
	}
	
	// setter - 멤버 변수의 값을 설정(변경)하는 메소드
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
	
}

public class AccountTest03 {
	public static void main(String[] args) {
		Account john = new Account("John" , "123456", 1000); 
		Account mary = new Account("Mary" , "654321", 500); 
		Account jane = new Account();
		
		john.withdraw(100); // 출금 메소드 호출
		mary.deposit(200); // 입금 메소드 호출
		
		System.out.println("● John의 은행 계좌");
		System.out.println("   계좌명의 : " + john.getName());
		System.out.println("   계좌번호 : " + john.getNo());
		System.out.println("   예금잔고 : " + john.getBalance());
		
		System.out.println();
		
		System.out.println("● Mary의 은행 계좌");
		System.out.println("   계좌명의 : " + mary.getName());
		System.out.println("   계좌번호 : " + mary.getNo());
		System.out.println("   예금잔고 : " + mary.getBalance());
		
	}

}
