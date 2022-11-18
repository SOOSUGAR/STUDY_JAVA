import java.util.Calendar;

// 두 개의 날짜 사이의 차이
public class CalendarTest03 {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance(); // 시스템의 날짜, 오늘 날짜(2022-08-17)
		Calendar c2 = Calendar.getInstance(); // 설정한 날짜, 여자 월드컵 개막일(2023-07-10)
		
		c2.set(2023, 6, 10); // 2023-07-10, 월은 1을 빼서 보정
		
		long difference = Math.abs(c1.getTimeInMillis() - c2.getTimeInMillis());
		
		System.out.println("두 날짜의 차이 : " + difference + "ms"); 					// 28252800014
		System.out.println("두 날짜의 차이 : " + difference/1000 + "초"); 				// 28252800
		System.out.println("두 날짜의 차이 : " + difference/1000/60 + "분");			// 470880
		System.out.println("두 날짜의 차이 : " + difference/1000/60/60 + "시간");		// 7848
		System.out.println("두 날짜의 차이 : " + difference/1000/60/60/24 + "일");		// 327
		
	}

}
