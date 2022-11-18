import java.util.ArrayList;
import java.util.Iterator;

class Account {
	private String name;
	private String no;
	private int balance;
	
	public Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
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
	
	@Override
	public String toString() {
		return "[���¸��� : " + name + ", ���¹�ȣ : " + no + ", �����ܰ� : " + balance + "]";
	}
}

public class ProgrammingTest03 {
	public static void main(String[] args) {
		Account[] Account = new Account[] {
				new Account("����", "123-456", 5000),
				new Account("Ȳ���", "654-321", 3500),
				new Account("������", "789-478", 6700),
				new Account("����ī", "852-741", 2600),
				new Account("�����", "369-852", 8400)
		};
		
		ArrayList<Account> accountList = new ArrayList<Account>();
		for(int i = 0; i<Account.length; i++) {
			accountList.add(Account[i]);
		}
		
		System.out.println("--- ������ �Է��ϰ� ��� ---");
		for(int i = 0; i<accountList.size(); i++) {
			System.out.println(accountList.get(i));
		}
		
		System.out.println("--- ������ �����ϰ� ��� ---");
		for(int i =0; i<accountList.size(); i++) {
			if(accountList.get(i).getName().equals("Ȳ���")) {
				accountList.get(i).setBalance(4800);
			}
		}
		for(int i = 0; i<accountList.size(); i++) {
			System.out.println(accountList.get(i));
		}
		
		System.out.println("--- ������ �����ϰ� ��� ---");
		for(int i =0; i<accountList.size(); i++) {
			if(accountList.get(i).getName().equals("����ī")) {
				accountList.remove(i);
			}
		}
		for(int i = 0; i<accountList.size(); i++) {
			System.out.println(accountList.get(i));
		}
		
		System.out.println("--- Iterator�� �̿��Ͽ� ��� ---");
		Iterator<Account> it = accountList.iterator();
		while(it.hasNext()) {
			Account a = it.next();
			System.out.println(a);
		}
		
	}
}
