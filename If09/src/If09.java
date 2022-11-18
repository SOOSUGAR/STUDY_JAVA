import java.util.Scanner;

/*
���� 2) ���� 2���� ��� �����ڸ� �Է��Ͽ� ��� ������ �ϴ� ���α׷��� �ۼ��Ͻÿ�.

< �Է� ȭ�� ���� >
���� 1�� �Է� : 10
���� 2�� �Է� : 5
��� ������ �Է� : +

< ��� ȭ�� ���� >
10 + 5 = 5
*/
public class If09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 1�� �Է� : ");
		int a = sc.nextInt();
		System.out.print("���� 2�� �Է� : ");
		int b = sc.nextInt();
		System.out.print("��� ������ �Է� : ");
		char op = sc.next().charAt(0); // charAt(0) -> �� ���ڸ� �Է¹���
		
		// 1�� - if��
		/*
		if(op == '+') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a+b);
		} else if (op == '-') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a-b);
		} else if (op == '%') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a/b);
		} else if (op == '/') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a/b);
		} else if (op == '*') {
			System.out.printf("%d %c %d = %d\n", a, op, b, a*b);
		} else {
			System.out.print("�߸��� �Է��Դϴ�.");
		}
		*/
		// 2�� - switch��
		
		switch(op) {
		case '+':
			System.out.printf("%d %c %d = %d\n", a, op, b, a+b);
			break;
		case '-':
			System.out.printf("%d %c %d = %d\n", a, op, b, a-b);
			break;
		case '%':
			System.out.printf("%d %c %d = %d\n", a, op, b, a%b);
			break;
		case '/':
			System.out.printf("%d %c %d = %d\n", a, op, b, a/b);
			break;
		case '*':
			System.out.printf("%d %c %d = %d\n", a, op, b, a*b);
			break;
		default:
			System.out.print("�߸��� �Է��Դϴ�.");
		}
		
		sc.close();
	}

}
