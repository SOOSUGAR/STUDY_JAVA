import java.util.Calendar;

// �� ���� ��¥ ������ ����
public class CalendarTest03 {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance(); // �ý����� ��¥, ���� ��¥(2022-08-17)
		Calendar c2 = Calendar.getInstance(); // ������ ��¥, ���� ������ ������(2023-07-10)
		
		c2.set(2023, 6, 10); // 2023-07-10, ���� 1�� ���� ����
		
		long difference = Math.abs(c1.getTimeInMillis() - c2.getTimeInMillis());
		
		System.out.println("�� ��¥�� ���� : " + difference + "ms"); 					// 28252800014
		System.out.println("�� ��¥�� ���� : " + difference/1000 + "��"); 				// 28252800
		System.out.println("�� ��¥�� ���� : " + difference/1000/60 + "��");			// 470880
		System.out.println("�� ��¥�� ���� : " + difference/1000/60/60 + "�ð�");		// 7848
		System.out.println("�� ��¥�� ���� : " + difference/1000/60/60/24 + "��");		// 327
		
	}

}
