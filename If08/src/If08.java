import java.util.Scanner;

/*
문제 1) 월을 입력하여 일수를 출력하는 프로그램을 작성하시오.
-if문과 switch문으로 각각 작성하시오.

< 입력 화면 설계 >
월 입력 : 3

< 출력 화면 설계 >
3월의 일수는 31일 입니다.

*/
public class If08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
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
			day = "잘못된";
		}
		
		System.out.println(month + "월의 일수는 " + day + "일 입니다.");
		
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
			day ="잘못 입력한";
		} 
		
		System.out.println(month + "월의 일수는 " + day + "일 입니다.");
		
		sc.close();
	}

}
