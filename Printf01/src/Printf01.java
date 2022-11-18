
// System.out.println() : 줄 바꿈해서 출력
// System.out.print() : 줄 바꿈 없이 출력
// 포매팅하여 출력하는 방법 : formatting
// 포매팅할 때 사용하는 문자 : 형식 문자, 서식 문자
// System.out.printf() : 출력 형식에 맞추어 출력
public class Printf01 {
	public static void main(String[] args) {
		// 1. 정수 포매팅
		// 형식 문자 : %d:정수 출력, decimal
		int a = 34567;
		System.out.printf("%d\n", a);
		System.out.printf("%7d\n", a);
		System.out.printf("%10d\n", a);
		System.out.printf("%-10d*\n", a);
		
		// 2. 실수 포매팅
		// 형식 문자 : %f:실수 출력, float
		double b = 3.141592;
		System.out.printf("%f\n", b);
		System.out.printf("%.2f\n", b);
		System.out.printf("%.4f\n", b);
		System.out.printf("%7.2f\n", b);
		System.out.printf("%-7.2f*\n", b);
		
		// 3. 문자 포매팅
		// 형식 문자 : %c:문자 출력, character
		char c = 'A';
		System.out.printf("%c\n", c);
		System.out.printf("%5c\n", c);
		System.out.printf("%-5c*\n", c);
		
		// 4. 문자열 포매팅
		// 형식 문자 : %s:문자열 출력, string
		String s = "Hello";
		System.out.printf("%s\n", s);
		System.out.printf("%10s\n", s);
		System.out.printf("%-10s*\n", s);
		
		// 5. 8진수, 10진수, 16진수 출력
		// %d : decimal(10진수), %o : octal(8진수), %x : hexadecimal(16진수)
		int x = 182;
		System.out.printf("%d\n", x);
		System.out.printf("%o\n", x); 
		System.out.printf("%x\n", x);
		System.out.printf("%X\n", x);
		
		// 추가 : 8진수, 16진수, 2진수를 출력하는 또 다른 방법
		System.out.println(Integer.toOctalString(x)); // 8진수
		System.out.println(Integer.toHexString(x)); // 16진수
		System.out.println(Integer.toBinaryString(x)); // 2진수
		
		
		
	}

}
