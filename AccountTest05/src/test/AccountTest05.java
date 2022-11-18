package test;

import account.Account;
import account.TimeAccount;

public class AccountTest05 {
	public static void main(String[] args) {
		/*
		Account[] accounts = new Account[4];
		accounts[0] = new Account("�쿵��" , "123456", 600);
		accounts[1] = new TimeAccount("����ȣ", "654321", 5000, 100);
		accounts[2] = new Account("�ּ���", "123457", 8000);
		accounts[3] = new TimeAccount("���׶��", "654322", 3000, 50);
		*/
		
		Account[] accounts = new Account[] {
				new Account("�쿵��" , "123456", 600),
				new TimeAccount("����ȣ", "654321", 5000, 100),
				new Account("�ּ���", "123457", 8000),
				new TimeAccount("���׶��", "654322", 3000, 50)
		};
		
		/*
		// ��� 1�� - �⺻ for��
		for(int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i].toStirng()); // accounts.toString()
		}
		*/
		
		// ��� 2��
		for(Account a : accounts) {
			System.out.println(a.toStirng());
		}
		
		
		/*
		Account a1 = new Account("�쿵��" , "123456", 600);
		TimeAccount a2 = new TimeAccount("����ȣ", "654321", 5000, 100);
		Account a3 = new Account("�ּ���", "123457", 8000);
		TimeAccount a4 = new TimeAccount("���׶��", "654322", 3000, 50);
		
		//������ ������ ���� �߿��� ��
		Account x;
		x = a1;
		x = a2; // �θ��� ���������δ� �ڽ��� �ν��Ͻ��� ������ �� �ִ�.
		
		TimeAccount y;
		y = a1; // �ڽ��� ���������δ� �θ��� �ν��Ͻ��� ������ �� ����.
		y = a2;
		
		System.out.println(a1.toStirng());
		System.out.println(a2);
		*/
	}

}
