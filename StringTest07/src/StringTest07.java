
public class StringTest07 {
	public static void main(String[] args) {
		String s1 = "Hello Java World!";
		
		// 8. length() : 문자열의 길이를 리턴
		System.out.println("길이 : " + s1.length());
		
		// 9. replace() : 문자열에서 특정 문자열을 새로운 문자열로 모두 다 변경
		s1 = s1.replace("!", "?");
		System.out.println(s1);
		s1 = s1.replace("Java", "Python");
		System.out.println(s1);
		s1 = s1.replace("l", "L"); // 모든 소문자 l을 대문자 L로 변경함
		System.out.println(s1);
		
		// 10. replaceFirst() : 문자열에서 특정 문자열을 첫 번째로 나오는 문자열만 변경
		s1 = s1.replaceFirst("o", "O");
		System.out.println(s1);
		
		// 11. toUpperCase() : 문자열의 모든 문자를 대문자로 변경
		s1 = s1.toUpperCase();
		System.out.println(s1);
		
		// 12. toLowerCase() : 문자열의 모든 문자를 소문자로 변경
		s1 = s1.toLowerCase();
		System.out.println(s1);
		
		// 13. trim() : 문자열의 앞뒤의 공백을 제거
		String s2 = "    Hello   Java     ";
		System.out.println(s2 + "*");
		s2 = s2.trim();
		System.out.println(s2 + "*");
		
		// 14. equals() : 문자열의 값을 비교하여 동일한지를 판단
		String s3 = new String("ABC");
		String s4 = new String("XYZ");
		String s5 = new String("ABC");
		
		System.out.println(s3 == s5);  		// false, 값이 아니라 참조를 비교
		System.out.println(s3.equals(s5));  // true, 값을 비교
		System.out.println(s3.equals(s4));  // false, 값을 비교
		
		// 15. equalsIgnoreCase() : 문자열의 값을 대소문자 구분없이 비교
		String s6 = "abc";
		System.out.println(s3.equals(s6));   		 // false, 대소문자를 구분
		System.out.println(s3.equalsIgnoreCase(s6)); // true, 대소문자 구분없이 판별
		
	}

}
