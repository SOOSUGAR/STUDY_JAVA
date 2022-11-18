
public class StringTest02 {
	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = new String("XYG");
		String s3 = new String("ABC");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("─────────────────");
		// new를 통해서 새로운 인스턴스를 만들었지만, s1과 s3가 같은 해시코드가 발생
		// - 분명, 새로운 인스턴스를 생성한 것이고, 문자열의 내용이 같을 때 같은 해시코드를 발생하도록 hashCode() 메소드를 오버라이딩 하였기 때문
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("─────────────────");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}

}
