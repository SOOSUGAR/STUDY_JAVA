
/* 문제) 월을 입력하여, 월별 탄생화를 출력하는 프로그램을 작성하시오.
< 입력 화면 설계 >
탄생월 입력(1~12) : 6

< 출력 화면 설계 >
6월의 탄생화는 백합 입니다.

*/
import java.util.Scanner;

public class Switch02 {
	public static void main(String[] args) {
		// 변수 선언
		Scanner sc = new Scanner(System.in); 
		
		// 입력 화면
		System.out.print("탄생월 입력(1~12) : "); 
		int month = sc.nextInt();
		
		/* 
		String flower = "";
		switch(month) {
		case 1:
			flower = "카네이션";
			}
			.
			.
			
			System.out.println(month + "월의 탄생화는 " + flower + "입니다.");
		*/
		
		switch(month) {
		case 1:
			System.out.println("1월의 탄생화는 카네이션 입니다.");
			break;
		case 2:
			System.out.println("2월의 탄생화는 제비꽃 입니다.");
			break;
		case 3:
			System.out.println("3월의 탄생화는 수선화 입니다.");
			break;
		case 4:
			System.out.println("4월의 탄생화는 스위트피 입니다.");
			break;
		case 5:
			System.out.println("5월의 탄생화는 은방울꽃 입니다.");
			break;
		case 6:
			System.out.println("6월의 탄생화는 백합 입니다.");
			break;
		case 7:
			System.out.println("7월의 탄생화는 미나리아재비 입니다.");
			break;
		case 8:
			System.out.println("8월의 탄생화는 글라디올러스 입니다.");
			break;
		case 9:
			System.out.println("9월의 탄생화는 물방초 입니다.");
			break;
		case 10:
			System.out.println("10월의 탄생화는 금잔화 입니다.");
			break;
		case 11:
			System.out.println("11월의 탄생화는 국화 입니다.");
			break;
		case 12:
			System.out.println("12월의 탄생화는 포인세티아 입니다.");
			break;
		default:
			System.out.println("정확한 월을 입력해주세요..");
			break;
		
		}
		
		sc.close();
	}

}
