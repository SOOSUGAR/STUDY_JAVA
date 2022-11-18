
// try ~ catch ~ finally
public class ExceptionTest03 {
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		int tot = 0;
		double ave = 0.0;
		
		// try - 예외가 발생할 수 있는 구문을 적는다
		try {
			for(int i=0; i<=a.length; i++) { // 예외 발생
				System.out.println("a[" + i + "] = " + a[i]);
				tot += a[i];
			}
			// ave = (double)tot / a.length; // 예외 발생시 바로 catch로 이동해 try문을 빠져나가기 때문에 계산하지 X
		// catch - 발생할 수 있는 예외에 대한 처리를 적는다, 반드시 1개 이상 기재
		} catch(ArrayIndexOutOfBoundsException e) {
			// e.printStackTrace(); // 예외 메세지를 출력하는 방법
			// System.err.println(e.getMessage() + "번 인덱스에 문제가 발생했습니다."); // 예외가 발생한 인덱스의 번호를 알려줌
			System.err.println("배열의 인덱스를 벗어났습니다."); // 권장 문구
		// finally - 예외의 발생 유무와는 관계없이 반드시 실행해야하는 문장을 적는다, 선택사항
		} finally { 
			ave = (double)tot / a.length; // 평균 계산, 예외의 발생 유무와 관계없이 반드시 실행
		}

		System.out.println("합계 : " + tot);
		System.out.println("평균 : " + ave);
		
		System.out.println("아래에서 학생들의 점수에 대한 처리를 하고 있습니다.");
		// ...
		
		
		
		
	}

}
