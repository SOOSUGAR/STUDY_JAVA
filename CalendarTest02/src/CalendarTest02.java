import java.util.Calendar;

public class CalendarTest02 {
	public static void main(String[] args) {
		// 2. Calendar 클래스의 인스턴스를 생성 - 사용자가 직접 날짜와 시간을 설정하는 방법
		Calendar c = Calendar.getInstance();
		
		// 2023년 여자 월드컵 개막일시 : 7월 10일 19시 30분 35초 설정
		// 월은 0 ~ 11까지의 값, 월은 6으로 설정 -> 그래야 7번째인 7월이 됨
		c.set(2023, 6, 10, 19, 30, 35);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR); // 12시간
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(year + "-" + month + "-" + date + " " + hour + ":" + minute + ":" + second);
		System.out.printf("%04d-%02d-%02d %02d:%02d:%02d\n", year, month,date,hour,minute,second);
		
		// 1. 시간에서 오전, 오후를 설정하는 방법 1
		// am(오전):0, pm(오후):1
		int ampm = c.get(Calendar.AM_PM);
		System.out.println(ampm);
		
		String[] ap = {"오전", "오후"};
		System.out.printf("%s %02d:%02d:%02d\n", ap[ampm],hour,minute,second);
		
		// 2. 시간에서 오전, 오후를 설정하는 방법 2
		String ampm2 = "";
		switch(ampm) {
		case Calendar.AM: ampm2 = "오전"; break;
		case Calendar.PM: ampm2 = "오후"; break;
		}
		System.out.printf("%s %02d:%02d:%02d\n", ampm2,hour,minute,second);
		
		// 3. 시간으로 오전, 오후를 설정하는 방법
		hour = c.get(Calendar.HOUR_OF_DAY);
		String ampm3 = "";
		if(hour < 12) {
			ampm3 = "AM";
		} else {
			ampm3 = "PM";
		}
		System.out.printf("%s %02d:%02d:%02d\n", ampm3,hour,minute,second);
		
		// 4. 시간을 24시간으로 설정하는 방법
		hour = c.get(Calendar.HOUR_OF_DAY);
		System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
		
	}

}
