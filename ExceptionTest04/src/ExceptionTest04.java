
// 예외 2)
// ArithmeticException : 0으로 나누었을 때 발생하는 예외
public class ExceptionTest04 {
	public static void main(String[] args) {
		int a = 10, b = 0, c = 0;
		
		try {
			c = a / b;
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("결과 : " + c);
	}

}
