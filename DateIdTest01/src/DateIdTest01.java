import java.util.Calendar;

class DateId{
	private static long count;
	private long id;
	
	// 클래스 초기화 블럭, 클래스 초기자
	static {
		Calendar c = Calendar.getInstance();   // 날짜 클래스
		long year = c.get(Calendar.YEAR); 	   // 년도
		long month = c.get(Calendar.MONTH) + 1; // 월, 0 ~ 11 -> +1하여 보정해서 쓰자
		long date = c.get(Calendar.DATE);	   // 일
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
