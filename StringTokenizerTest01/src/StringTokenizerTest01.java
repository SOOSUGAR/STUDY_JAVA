import java.util.StringTokenizer;

public class StringTokenizerTest01 {
	public static void main(String[] args) {
		String words = "lion,hyena,elephant,cheetah,zeebra,giraffe,monkey";
		
		// 1. String 클래스 split() 메소드를 사용하여 문자열을 분리한 뒤 문자열의 배열을 생성
		String[] animals = words.split(",");
		
		// 출력 1번
		for(int i = 0; i<animals.length ; i++) {
			System.out.println(animals[i]);
		}
		System.out.println("─────────────────────");
		
		// 출력 2번
		for(String a : animals) {
			System.out.println(a);
		}
		System.out.println("─────────────────────");
		
		// 2. StringTokenizer 클래스를 사용하여 문자열을 토큰을 분리
		StringTokenizer st1 = new StringTokenizer(words, ","); // import를 추가해야 함 , ctrl + Shift + O
		System.out.println("토큰의 수 : " + st1.countTokens());
		System.out.println("─────────────────────");
		while(st1.hasMoreTokens()) { // 토큰이 있느냐, 토큰이 없으면 false로 빠져나감
			String s = st1.nextToken();
			System.out.println(s);
		}
		System.out.println("─────────────────────");
		System.out.println("토큰의 수 : " + st1.countTokens()); // 토큰을 다 분리하여 없음
		
		
	}

}
