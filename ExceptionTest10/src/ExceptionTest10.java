
public class ExceptionTest10 {
	public static void main(String[] args) {
		// 예외를 던지는 방법
		try {
			method1();
		} catch (Exception e) {
			//e.printStackTrace();
			System.err.println("main()에서 예외 처리");
		}
		
	}
	
	public static void method1() throws Exception {
		try {
			method2();
		} catch(Exception e) {
			//e.printStackTrace();
			System.err.println("method1()에서 예외 처리");
			throw e;
		}
	}
	
	public static void method2() throws Exception {
		try {
			throw new Exception("method2()에서 예외가 발생");
		} catch(Exception e) {
			//e.printStackTrace();
			System.err.println("method2()에서 예외 처리");
			throw e;
		}
		
	}

}
