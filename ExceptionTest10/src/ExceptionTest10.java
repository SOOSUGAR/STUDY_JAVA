
public class ExceptionTest10 {
	public static void main(String[] args) {
		// ���ܸ� ������ ���
		try {
			method1();
		} catch (Exception e) {
			//e.printStackTrace();
			System.err.println("main()���� ���� ó��");
		}
		
	}
	
	public static void method1() throws Exception {
		try {
			method2();
		} catch(Exception e) {
			//e.printStackTrace();
			System.err.println("method1()���� ���� ó��");
			throw e;
		}
	}
	
	public static void method2() throws Exception {
		try {
			throw new Exception("method2()���� ���ܰ� �߻�");
		} catch(Exception e) {
			//e.printStackTrace();
			System.err.println("method2()���� ���� ó��");
			throw e;
		}
		
	}

}
