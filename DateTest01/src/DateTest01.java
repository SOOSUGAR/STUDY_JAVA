import java.util.Date;

/*
Date Ŭ���� - java 1.0�������� ���
Calendar Ŭ���� - Date Ŭ������ ����� �����ϰ� �����Ͽ� ������ ����Ų Ŭ����, java 1.1�������� ���

*/
public class DateTest01 {
	public static void main(String[] args) {
		// 1. Date Ȱ�� 1�� - ���� �ý����� ��¥
		Date d1 = new Date();
		
		// �����
		int year = d1.getYear() + 1900;	 // 1900�⵵������ ����, 1900�� ���ؼ� ����
		int month = d1.getMonth() + 1;   // 0 ~ 11 ������ ��, 1�� ���ؼ� ����
		int date = d1.getDate();
		
		// �ú���
		int hour = d1.getHours();
		int minute = d1.getMinutes();
		int second = d1.getSeconds();
		
		// GMT - Greenwich Mean Time
		System.out.println(year + "�� " + month + "�� " + date + "�� " + hour + "�� " + minute + "�� " + second + "��");
		System.out.println("����������������������������������������������");
		System.out.println(d1.toGMTString());
		System.out.println("����������������������������������������������");
		System.out.println(d1.toLocaleString());
		System.out.println("����������������������������������������������");
		
		// 2. Date �ν��Ͻ��� ��¥ �� �ð� ����
		// 2023�� ȣ�� ���� ������ ������ : 7�� 10��
		Date d2 = new Date();
		
		d2.setYear(2023 - 1900); // 1900�⵵���� �����̱� ������ 1900�� ���� ����
		d2.setMonth(6); // 0 ~ 11 ������ ��, 7���� 6
		d2.setDate(10);
		d2.setHours(19);
		d2.setMinutes(30);
		d2.setSeconds(35);
		
		int y = d2.getYear() + 1900;
		int m = d2.getMonth() + 1; // ���� +1
		int d = d2.getDate();
		int h = d2.getHours();
		int mi = d2.getMinutes();
		int s = d2.getSeconds();
		
		System.out.print(y + "�� ȣ�� ���� ������ ������ : " + m + "�� " + d + "�� ");
		System.out.println(h + "�� " + mi + "�� " + s + "��");
		System.out.println("����������������������������������������������");
		System.out.println(d2.toGMTString());
		System.out.println("����������������������������������������������");
		System.out.println(d2.toLocaleString());
		
	}

}
