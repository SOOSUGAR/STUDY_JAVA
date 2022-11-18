import java.util.StringTokenizer;

public class StringTokenizerTest02 {
	public static void main(String[] args) {
		String words = "lion,hyena,elephant,cheetah/zeebra/giraffe/monkey";
		
		// 1번 방법 - split() 메소드 사용
		words = words.replace("/", ",");
		System.out.println(words);
		System.out.println("───────────────────────");
		String[] animals = words.split(",");
		System.out.println("animals의 개수(배열) : " + animals.length);
		for(int i = 0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println("───────────────────────");
		
		// 2번 방법 
		words = "lion,hyena,elephant,cheetah/zeebra/giraffe/monkey"; // 재정의
		System.out.println(words);
		System.out.println("───────────────────────");
		// StringTokenizer st1 = new StringTokenizer(words, ",/");    // false 생략, 구분자를 토큰으로 사용하지 않음
		StringTokenizer st1 = new StringTokenizer(words, ",/", true); // 구분자를 토큰으로 사용
		System.out.println("animals의 개수(토큰) : " + st1.countTokens());
		while(st1.hasMoreTokens()) {
			String s = st1.nextToken();
			System.out.println(s);
		}
		System.out.println("───────────────────────");
		System.out.println("animals의 개수(토큰) : " + st1.countTokens());
		
		
	}

}
