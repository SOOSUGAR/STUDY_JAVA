
// String 클래스의 다양한 메소드 사용법
public class StringTest05 {
	public static void main(String[] args) {
		// 글자수(공백포함) : 17글자, 인덱스 : 0 ~ 16
		String s1 = "Hello Java World!";
		
		// 1. charAt(idx) : 인덱스에 해당하는 한 문자를 리턴
		char c1 = s1.charAt(6);
		System.out.println(c1);
		char c2 = s1.charAt(11);
		System.out.println(c2);
		
		// 2. concat(s) : 문자열을 연결하여 새로운 문자를 생성하는 메소드
		// String s2 = s1.concat(" Korea ~ ");
		String s2 = s1 + " Korea ~ ";
		System.out.println(s2);
		
		// 3. contains() : 문자열에서 찾고자하는 문자열이 존재하는지의 여부, 존재하면 true, 존재하지 않으면 false / 대소문자를 구별함
		System.out.println(s1.contains("J"));
		System.out.println(s1.contains("Java"));
		System.out.println(s1.contains("JAVA"));
		System.out.println(s2.contains("Korea"));
		System.out.println(s2.contains("KOREA"));
		
	}

}
