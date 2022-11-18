
/*
null - 참조 변수가 아무것도 참조하지 않은 상태, null 참조
.(점) 연산자 - 멤버 접근(access) 연산자, 클래스 멤버 변수를 사용할 수 있도록 하는 연산자 

< 클래스로 만들지 않았을 때의 문제점 중에서 해결된 것> 
1. 계좌의 정보를 변수명, 주석으로 알 수 있다 -> O
2. 한 사람의 계좌라면 하나로 묶어서 처리할 수 있어야 하나, 그렇지 않다 -> O
3. 아무나 변수를 통해 출금, 입금이 가능하고 계좌정보를 변경할 수 있다 > X

< 아직 남아있는 문제점 > 
문제점 1 - 확실한 초기화에 대한 보장이 되지 않고 있다. 은행 계좌라면 반드시 초기화가 되어야 한다
문제점 2 - 아무나 변수를 통해 계좌정보를 변경할 수 있다

*/

// 은행 계좌 클래스 - 계좌명의, 계좌번호, 예금잔고
class Account {
	// 멤버 변수
	String name;
	String no;
	int balance;
	
	// 기본 생성자 (default 생성자)
	// 1. *기재하지 않아도 모든 클래스 안에 기존으로 존재
	// 2. 다른 생성자를 만들면 기본 생성자는 사라짐
	Account() {
		
	}
}

public class AccoutTest02 {
	public static void main(String[] args) {
		// 1번 방법
		//Account john = new Account(); // 인스턴스(instance, 실체), 객체
		
		// 2번 방법
		Account john; // Account형의  클래스형의 참조변수
		john = new Account(); // Account 클래스의 실체가 생성되고, 이를 john이 참조한다
		
		Account mary = new Account(); // 생성자 호출
		
		//초기화
		john.name = "John";
		john.no = "123456";
		john.balance = 1000;
		
		mary.name = "Mary";
		mary.no = "654321";
		mary.balance = 500;
		
		john.balance -= 200; // 출금
		mary.balance += 100; // 입금
		
		// 계좌정보 출력
		System.out.println("● John의 은행 계좌");
		System.out.println("   계좌명의 : " + john.name);
		System.out.println("   계좌번호 : " + john.no);
		System.out.println("   예금잔고 : " + john.balance);
		
		System.out.println();
		
		System.out.println("● Mary의 은행 계좌");
		System.out.println("   계좌명의 : " + mary.name);
		System.out.println("   계좌번호 : " + mary.no);
		System.out.println("   예금잔고 : " + mary.balance);
		
		/*
		System.out.println("● Mary의 은행 계좌");
		System.out.println("   계좌명의 : " + );
		System.out.println("   계좌번호 : " + );
		System.out.println("   예금잔고 : " + );
		*/
	}

}
