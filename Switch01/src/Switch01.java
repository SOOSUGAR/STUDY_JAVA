import java.util.Scanner;

/*
< switch ~ case문의 형식 >
- switch문의 조건에는 반드시 정수, 문자열만 사용 가능. 실수는 사용 불가
- switch문으로 만들 수 있는 모든 것은 if문으로 만들 수 있지만, if문으로 만들 수 있는 모든 것은 switch문으로 만들 수는 없음 (실수는 사용 불가하기 때문에)
- switch문은 정수로 값이 떨어지고 가지수가 여러가지로 나누어지는 경우에 사용하면 명확하고 효율적인  코드를 작성할 수 있음


switch(조건) {
case 정수: // *콜론 -> label
	실행문;
	...
	break;
case 정수:
	실행문;
	...
	break;
case 정수:
	실행문;
	...
	break;
	.
	.
	.
	
default:
	실행문;
	...;
	break;
}

 */

public class Switch01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴 선택(1-4): ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("파일 열기");
			break;
		case 2:
			System.out.println("파일 읽기");
			break;
		case 3:
			System.out.println("파일 쓰기");
			break;
		case 4:
			System.out.println("파일 닫기");
			break;
		default:
			System.out.println("다시 입력");
			break;
		}
		
		sc.close();
		
	}

}
