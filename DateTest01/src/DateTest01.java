import java.util.Date;

/*
Date 클래스 - java 1.0버전부터 사용
Calendar 클래스 - Date 클래스의 기능을 보완하고 개선하여 성능을 향상시킨 클래스, java 1.1버전부터 사용

*/
public class DateTest01 {
	public static void main(String[] args) {
		// 1. Date 활용 1번 - 현재 시스템의 날짜
		Date d1 = new Date();
		
		// 년월일
		int year = d1.getYear() + 1900;	 // 1900년도가부터 시작, 1900을 더해서 보정
		int month = d1.getMonth() + 1;   // 0 ~ 11 사이의 값, 1을 더해서 보정
		int date = d1.getDate();
		
		// 시분초
		int hour = d1.getHours();
		int minute = d1.getMinutes();
		int second = d1.getSeconds();
		
		// GMT - Greenwich Mean Time
		System.out.println(year + "년 " + month + "월 " + date + "일 " + hour + "시 " + minute + "분 " + second + "초");
		System.out.println("───────────────────────");
		System.out.println(d1.toGMTString());
		System.out.println("───────────────────────");
		System.out.println(d1.toLocaleString());
		System.out.println("───────────────────────");
		
		// 2. Date 인스턴스의 날짜 및 시간 설정
		// 2023년 호주 여자 월드컵 개막일 : 7월 10일
		Date d2 = new Date();
		
		d2.setYear(2023 - 1900); // 1900년도부터 시작이기 때문에 1900을 빼서 보정
		d2.setMonth(6); // 0 ~ 11 사이의 값, 7월은 6
		d2.setDate(10);
		d2.setHours(19);
		d2.setMinutes(30);
		d2.setSeconds(35);
		
		int y = d2.getYear() + 1900;
		int m = d2.getMonth() + 1; // 보정 +1
		int d = d2.getDate();
		int h = d2.getHours();
		int mi = d2.getMinutes();
		int s = d2.getSeconds();
		
		System.out.print(y + "년 호주 여자 월드컵 개막일 : " + m + "월 " + d + "일 ");
		System.out.println(h + "시 " + mi + "분 " + s + "초");
		System.out.println("───────────────────────");
		System.out.println(d2.toGMTString());
		System.out.println("───────────────────────");
		System.out.println(d2.toLocaleString());
		
	}

}
