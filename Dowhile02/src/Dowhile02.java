import java.util.Scanner;

/*
< do ~ while���� Ư¡ >
- do ~ while���� ������ �������� �ʾƵ� �ݵ�� �� ���� �����ؾ� �� �� �����
 ex) �Է�ȭ�� ����...

*/

// ����) 1 ~ 4������ �޴��� �����ϰ� �����ϴ� ���α׷��� �ۼ�
// 1 ~ 4�������� �޴��� �ƴ϶��, ��� �޴�ȭ���� �����ִ� ���α׷�
public class Dowhile02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		
		do {
			System.out.println("### �޴� ���� ###");
			System.out.println("1 - ���� ����");
			System.out.println("2 - ���� �б�");
			System.out.println("3 - ���� ����");
			System.out.println("4 - ���� �ݱ�");
			System.out.print("�޴� �Է�(1 ~ 4) : ");
			menu = sc.nextInt();
		} while(menu > 4 || menu <= 0); 
		// while(!(menu <= 4 && menu > 0)); -> �� �𸣰��� ��Ģ
		
		switch(menu) {
		case 1:
			System.out.println("���� ���⸦ �Ͽ����ϴ�.");
			break;
		case 2:
			System.out.println("���� �б⸦ �Ͽ����ϴ�.");
			break;
		case 3:
			System.out.println("���� ���⸦ �Ͽ����ϴ�.");
			break;
		case 4:
			System.out.println("���� �ݱ⸦ �Ͽ����ϴ�.");
			break;
		}
		
		
		sc.close();
	}

}
