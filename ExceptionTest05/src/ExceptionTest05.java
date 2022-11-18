
// 예외 3)
// NullPointException : null값을 멤버접근 연사자로 사용하려ExceptionTest05할 때 발생하는 예외
// 웹에서 가장 많이 발생하는 예외, 발견과 처리가 까다로움
public class ExceptionTest05 {
	public static void main(String[] args) {
		String data = null;
		
		try {
			System.out.println(data.toString());
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		System.out.println("처리해야 하는 데이터가 하단에 존재...");
		
	}

}
