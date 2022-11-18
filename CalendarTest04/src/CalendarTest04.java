import java.util.Calendar;

/*
< ��¥�� �����ϴ� 2���� �޼ҵ� ������ >
1. add() : ���� ������ ��쿡 ���� ����� �Բ� ���� / ���� ������ ��쿡 ����� �Բ� ����
2. roll() : ���� ������ ��쿡 �ϸ� ���� / ���� ������ ��쿡 ���� ���� / �����ϴ� ��, ��, �ϸ� ������ �� �ٸ� ���� �������� �ʴ´�.
*/
public class CalendarTest04 {
	
	public static void printDate(Calendar c) {
		System.out.println(c.get(Calendar.YEAR) + "�� " + (c.get(Calendar.MONTH)+1) + "�� " + c.get(Calendar.DATE) + "��");
	}
	
	
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		// ��¥ ����
		c.set(2022, 8, 10); // ������ �ƽþ� ���� ������(2022-09-10)
		// ��¥�� ���� ��� ���� Ȯ��
		System.out.println(c.toString());
		// ������ ��¥ ���� Ȯ��(�ܱ� ���)
		System.out.println(c.getTime());
		
		// < ��¥�� �����ϴ� �پ��� ��� >
		System.out.println("�������� ���� ���� ��¥ ��������");
		printDate(c);
		System.out.println("�������� 1�� �� ��������");
		c.add(Calendar.DATE, 1);
		printDate(c);
		System.out.println("�������� 1�� �� ��������");
		c.add(Calendar.DATE, -1);
		printDate(c);
		System.out.println("�������� ������ �� ��������");
		c.add(Calendar.DATE, 7);
		printDate(c);
		System.out.println("�������� 3�� �� ��������");
		c.add(Calendar.DATE, 21);
		printDate(c);
		System.out.println("�������� 6���� �� ��������");
		c.add(Calendar.MONTH, 6);
		printDate(c);
		System.out.println("�������� 4���� �� ��������");
		c.add(Calendar.MONTH, -4);
		printDate(c);
		
		System.out.println();
		
		System.out.println("�������� 40�� �� (roll) ��������");
		c.roll(Calendar.DATE, 40);
		printDate(c);
		System.out.println("�������� 6���� �� (roll) ��������");
		c.roll(Calendar.MONTH, 6);
		printDate(c);
		
		
		
	}
	

}
