import java.util.Calendar;

public class CalendarTest01 {
	public static void main(String[] args) {
		// 1. Calendar Ŭ������ �ν��Ͻ� ����  - �ý����� ��¥�� �����ͼ� ���
		// - �߻� Ŭ�����̹Ƿ� new�� �ƴ϶�, getInstance() �޼ҵ带 ���ؼ� �ν��Ͻ� ����
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1; // 0 ~ 11������ ��, 1�� ���Ͽ� ����
		int date = c.get(Calendar.DATE);
		System.out.println(year + "�� " + month + "�� " + date + "��");
		
		//int hour = c.get(Calendar.HOUR); 		// 12�ð�
		int hour = c.get(Calendar.HOUR_OF_DAY); // 24�ð�
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int millisecond = c.get(Calendar.MILLISECOND); // 1000���� 1��
		System.out.println(hour + ":" + minute + ":" + second + ":" + millisecond);
		
		System.out.println("������������ Calendar Ŭ������ �߰��� ��� ������������");
		System.out.println("������ �� ��° �� : " + c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�̴��� �� ��° �� : " + c.get(Calendar.WEEK_OF_MONTH));
		System.out.println("�̴��� �� ��° �� : " + c.get(Calendar.DATE));
		System.out.println("�̴��� �� ��° �� : " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("������ �� ��° �� : " + c.get(Calendar.DAY_OF_YEAR));
		// DAY_OF_WEEK - 1:�Ͽ���, 2:������, 3:ȭ����, 4:������, 5:�����, 6:�ݿ���, 7:����� 
		System.out.println("������ �� ��° �� : " + c.get(Calendar.DAY_OF_WEEK));
		
		// 1. ������ ����� ���
		String[] dayofweek = {"", "��", "��", "ȭ", "��", "��", "��", "��"};
		System.out.println("������ ���� : " + dayofweek[c.get(Calendar.DAY_OF_WEEK)]);
		
		
		// 2. ������ ����� ���
		switch(c.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.SUNDAY: System.out.println("�Ͽ���"); break;
			case Calendar.MONDAY: System.out.println("������"); break;
			case Calendar.TUESDAY: System.out.println("ȭ����"); break;
			case Calendar.WEDNESDAY: System.out.println("������"); break;
			case Calendar.THURSDAY: System.out.println("�����"); break;
			case Calendar.FRIDAY: System.out.println("�ݿ���"); break;
			case Calendar.SATURDAY: System.out.println("�����"); break;
				
				
		}
		
	}

}
