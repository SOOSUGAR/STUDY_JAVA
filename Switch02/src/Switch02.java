
/* ����) ���� �Է��Ͽ�, ���� ź��ȭ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
< �Է� ȭ�� ���� >
ź���� �Է�(1~12) : 6

< ��� ȭ�� ���� >
6���� ź��ȭ�� ���� �Դϴ�.

*/
import java.util.Scanner;

public class Switch02 {
	public static void main(String[] args) {
		// ���� ����
		Scanner sc = new Scanner(System.in); 
		
		// �Է� ȭ��
		System.out.print("ź���� �Է�(1~12) : "); 
		int month = sc.nextInt();
		
		/* 
		String flower = "";
		switch(month) {
		case 1:
			flower = "ī���̼�";
			}
			.
			.
			
			System.out.println(month + "���� ź��ȭ�� " + flower + "�Դϴ�.");
		*/
		
		switch(month) {
		case 1:
			System.out.println("1���� ź��ȭ�� ī���̼� �Դϴ�.");
			break;
		case 2:
			System.out.println("2���� ź��ȭ�� ����� �Դϴ�.");
			break;
		case 3:
			System.out.println("3���� ź��ȭ�� ����ȭ �Դϴ�.");
			break;
		case 4:
			System.out.println("4���� ź��ȭ�� ����Ʈ�� �Դϴ�.");
			break;
		case 5:
			System.out.println("5���� ź��ȭ�� ������ �Դϴ�.");
			break;
		case 6:
			System.out.println("6���� ź��ȭ�� ���� �Դϴ�.");
			break;
		case 7:
			System.out.println("7���� ź��ȭ�� �̳�������� �Դϴ�.");
			break;
		case 8:
			System.out.println("8���� ź��ȭ�� �۶��÷��� �Դϴ�.");
			break;
		case 9:
			System.out.println("9���� ź��ȭ�� ������ �Դϴ�.");
			break;
		case 10:
			System.out.println("10���� ź��ȭ�� ����ȭ �Դϴ�.");
			break;
		case 11:
			System.out.println("11���� ź��ȭ�� ��ȭ �Դϴ�.");
			break;
		case 12:
			System.out.println("12���� ź��ȭ�� ���μ�Ƽ�� �Դϴ�.");
			break;
		default:
			System.out.println("��Ȯ�� ���� �Է����ּ���..");
			break;
		
		}
		
		sc.close();
	}

}
