
// StringBuffer 클래스의 메소드
public class StringBufferTest02 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("ABC");
		StringBuffer sb2 = new StringBuffer("ABC"); // 똑같은 문자라도 인스턴스가 2개
		
		System.out.println(sb1); // toString이 정의되어 있음
		System.out.println(sb2);
		System.out.println("──────────────────────────");
		System.out.println(System.identityHashCode(sb1));
		System.out.println(System.identityHashCode(sb2));
		System.out.println("──────────────────────────");
		// < StringBuffer 안의 문자열을 비교 >
		// 1. == : 두 문자열의 참조를 비교
		if(sb1 == sb2) {
			System.out.println("두 문자열이 동일합니다");
		} else {
			System.out.println("두 문자열이 동일하지 않습니다.");
		}
		
		// 2. equals() : StringBuffer의 equals() 메소드는 값이 아니라, 참조를 비교
		// - 문제점 : 참조를 비교 -> 주의할 것
		if(sb1.equals(sb2)) {
			System.out.println("두 문자열이 동일합니다");
		} else {
			System.out.println("두 문자열이 동일하지 않습니다.");
		}
		
		// 3. 2번 문제의 해결책 : 값을 비교하도록 하는 방법
		// String 클래스의 equals() 메소드는 Object 클래스의 equals() 메소드를 오버라이딩하여 문자열의 값을 비교하도록 함
		// StringBuffer를 통해 생성한 문자열을  비교할 대는 String 클래스로 변경하여 비교하도록 함
		String s1 = sb1.toString(); // sb1을 String형으로 만들어줌
		String s2 = sb2.toString();
		if(s1.equals(s2)) {
			System.out.println("두 문자열이 동일합니다");
		} else {
			System.out.println("두 문자열이 동일하지 않습니다.");
		}
		
		
	}

}
