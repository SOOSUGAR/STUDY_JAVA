import java.util.Scanner;

public class StringTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 1 입력 : ");
		String s1 = sc.next();
		System.out.print("문자열 2 입력 : ");
		String s2 = sc.next();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("──────────────────");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("──────────────────");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println("──────────────────");
		
		// 문자배열을 비골하는
		// 1. == 연산전 특징 : 문자열의 참조를 비교함, 콘솔에 입력하며 항상 다른 인스턴스가 되고 형성이 다르다는 결과를 출력함
		// --> 문제점 : 일반적으로 문자열이나 값을 비요하게 됨 -> 해결책 : 문자열 메소드를 통하여 값을 비교하도록 함
		if(s1 == s2) {
			System.out.println("두 개의 문자열이 같습니다.");
		} else{
			System.out.println("두 개의 문자열이 같습니다.");
		}
		
		// 2. equals() 메소드 : 두 개의 내용을 비교함, 영어 대소문자를 구분하여 비교
		// -> 해결책 : 문자열 메소드를 통해서 값을 비교하도록 함
		if(s1.equals(s2)) {
			System.out.println("두 개의 문자열의 내용이 같습니다.");
		} else {
			System.out.println("두 개의 문자열의 내용이 다릅니다.");
		}
		
		// 3. equalsIgnoreCase() : 두 문자열의 내용을 대소문자를 구별하지 않고 비교
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("두 개의 문자열의 내용이 대소문자 구별없이 같습니다.");
		} else {
			System.out.println("두 개의 문자열의 내용이 대소문자 구별없이 다릅니다..");
		}
		
		sc.close();
		
		
	}

}
