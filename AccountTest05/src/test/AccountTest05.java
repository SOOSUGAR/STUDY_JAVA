package test;

import account.Account;
import account.TimeAccount;

public class AccountTest05 {
	public static void main(String[] args) {
		/*
		Account[] accounts = new Account[4];
		accounts[0] = new Account("우영우" , "123456", 600);
		accounts[1] = new TimeAccount("이준호", "654321", 5000, 100);
		accounts[2] = new Account("최수연", "123457", 8000);
		accounts[3] = new TimeAccount("동그라미", "654322", 3000, 50);
		*/
		
		Account[] accounts = new Account[] {
				new Account("우영우" , "123456", 600),
				new TimeAccount("이준호", "654321", 5000, 100),
				new Account("최수연", "123457", 8000),
				new TimeAccount("동그라미", "654322", 3000, 50)
		};
		
		/*
		// 출력 1번 - 기본 for문
		for(int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i].toStirng()); // accounts.toString()
		}
		*/
		
		// 출력 2번
		for(Account a : accounts) {
			System.out.println(a.toStirng());
		}
		
		
		/*
		Account a1 = new Account("우영우" , "123456", 600);
		TimeAccount a2 = new TimeAccount("이준호", "654321", 5000, 100);
		Account a3 = new Account("최수연", "123457", 8000);
		TimeAccount a4 = new TimeAccount("동그라미", "654322", 3000, 50);
		
		//다형성 구현에 대한 중요한 예
		Account x;
		x = a1;
		x = a2; // 부모의 참조변수로는 자식의 인스턴스를 참조할 수 있다.
		
		TimeAccount y;
		y = a1; // 자식의 참조변수로는 부모의 인스턴스를 참조할 수 없다.
		y = a2;
		
		System.out.println(a1.toStirng());
		System.out.println(a2);
		*/
	}

}
