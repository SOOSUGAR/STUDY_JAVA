import java.util.Scanner;

/* ����) ���� �Է��Ͽ� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
< �Է� ȭ�� ���� >
�� �Է�(1~12) : 7

< ��� ȭ�� ���� >
7���� �����Դϴ�.

3��, 4��, 5�� : ��
6��, 7�� , 8�� : ����
9��, 10��, 11�� : ����
12��, 1��, 2�� : �ܿ�
*/
public class Switch03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //���� ���� ����
		
		System.out.print("�� �Է�(1~12) : ");
		int month = sc.nextInt();
		
		/*
		  String season = "";
		  
		  switch(month) {
		  case n:
		  	season = "��";
		  	}
		  
		  System.out.prinfln(month + "���� " + season + "�Դϴ�.");
		 */
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println(month + "���� ���Դϴ�.");
			break;
		case 6: case 7: case 8:
			System.out.println(month + "���� �����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "���� �����Դϴ�.");
			break;
		case 12: case 1: case 2:
			System.out.println(month + "���� �ܿ��Դϴ�.");
			break;
		default:
			System.out.println("��Ȯ�� �Է����ּ���.");
			break;
		}
		
		sc.close();
	}

}
