import java.util.Calendar;

class DateId{
	private static long count;
	private long id;
	
	// Ŭ���� �ʱ�ȭ ��, Ŭ���� �ʱ���
	static {
		Calendar c = Calendar.getInstance();   // ��¥ Ŭ����
		long year = c.get(Calendar.YEAR); 	   // �⵵
		long month = c.get(Calendar.MONTH) + 1; // ��, 0 ~ 11 -> +1�Ͽ� �����ؼ� ����
		long date = c.get(Calendar.DATE);	   // ��
		count = year*10000000 + month*100000 + date*1000;
	}
	
	public DateId() {
		id = ++count;
	}
	
	public long getId() {
		return id;
	}
	
}

public class DateIdTest01 {
	public static void main(String[] args) {
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();
		
		System.out.println("a : " + a.getId());
		System.out.println("b : " + b.getId());
		System.out.println("c : " + c.getId());
	}

}
