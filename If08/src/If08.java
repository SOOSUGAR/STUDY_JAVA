import java.util.Scanner;

/*
���� 1) ���� �Է��Ͽ� �ϼ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
-if���� switch������ ���� �ۼ��Ͻÿ�.

< �Է� ȭ�� ���� >
�� �Է� : 3

< ��� ȭ�� ���� >
3���� �ϼ��� 31�� �Դϴ�.

*/
public class If08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int month = sc.nextInt();
		
		String day = "";
		
		/*
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			day = "30";
		} else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
			day = "31";
		} else if (month == 2) {
			day = "28";
		} else {
			day = "�߸���";
		}
		
		System.out.println(month + "���� �ϼ��� " + day + "�� �Դϴ�.");
		
		sc.close();
		*/
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = "31";
			break;
		case 4: case 6: case 9: case 11:
			day = "30";
			break;
		case 2:
			day = "28";
			break;
		default:
			day ="�߸� �Է���";
		} 
		
		System.out.println(month + "���� �ϼ��� " + day + "�� �Դϴ�.");
		
		sc.close();
	}

}
