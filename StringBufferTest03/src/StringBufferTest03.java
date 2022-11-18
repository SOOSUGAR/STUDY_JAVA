
// StringBuffer 클래스의 메소드
public class StringBufferTest03 {
	public static void main(String[] args) {
		//
		String s1 = "ABC";
		s1 = s1.concat("DEF");
		System.out.println(s1);
		System.out.println("────────────────");
		
		// 1. append() : 문자열을 추가
		StringBuffer sb1 = new StringBuffer("ABC");
		System.out.println("초기 용량 : " + sb1.capacity());
		System.out.println("크기 : " + sb1.length());
		System.out.println("────────────────");
		/*
		sb1.append("DEF");
		sb1.append(10);
		sb1.append(3.14);
		sb1.append(true);
		*/
		// 메소드 체이닝(chaining)
		sb1.append("DEF").append(10).append(3.14).append(true);
		System.out.println(sb1);
		
		// 2. capacity() : 용량을 확인하는  용도
		// 3. length() : 실제 데이터의 크기를 확인하는 용도
		StringBuffer sb2 = new StringBuffer();
		System.out.println("초기 용량 : " + sb2.capacity());
		System.out.println("크기 : " + sb2.length());
		System.out.println("────────────────");
		sb2.append("Hello Java World");
		System.out.println("추가 후 용량 : " + sb2.capacity());
		System.out.println("크기 : " + sb2.length());
		System.out.println("────────────────");
		sb2.append("!");
		System.out.println("추가 후 용량 : " + sb2.capacity());
		System.out.println("크기 : " + sb2.length());
		System.out.println("────────────────");
		
		StringBuffer sb3 = new StringBuffer(10);
		System.out.println("초기 용량 : " + sb3.capacity());
		System.out.println("크기 : " + sb3.length());
		System.out.println("────────────────");
		
	}

}
