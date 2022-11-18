/*
< 예외를 처리하는 방법 >
- try는 1번만 사용하며 필수 / catch는 1개 필수 , 그 이상 선택
- try 블럭 : 예외가 발생할 수 있는 구문
- catch 블럭 : 예외가 발생했을 때의 처리
- finally 블럭 : catch 블럭 아래에 1번만 사용 가능하며 선택 사항, 예외의 발생 유무와는 관계없이 항상 실행

1. try ~ catch
2. try ~ catch ~ catch ~
-> catch는 발생하는 예외의 종류만큼 쓸 수 있음, 예외의 종류마다 다른 처리를 하고 싶다면 사용
3. try ~ catch ( 예외  | 예외 | 예외 ... ) 
-> catch 안에서 | 로 연결하는 예외의 갯수는 제한 없음
-> 다양한 종류의 예외에 대해서 처리할 수 있음, 모든 예외에 대해 처리방식이 한 가지일 때 사용
-> 예외의 종류를 명확하게 알 수 있음
-> 멀티 catch 블럭, 자바 7버전부터 지원
4. try ~ catch(Exception e)
-> catch 안에 Exception을 사용하면 모든 자식 예외들을 처리할 수 있음 
-> 모든 예외를 처리 할 수 있지만, 정확하게 어떤 예외가 발생했는지에 대해서는 알 수 없음
5. try ~ catch(자식) ~ catch(자식) ~ ... ~ catch(Exception) // 마지막 catch안에 Exception 적기

6. try ~ catch ~ finally
*구조*
try { 

// 예외발생할 가능성이 있는 문장
 
} catch(Exception1 e1) {

 //Exception1이 발생했을 경우, 이를 처리하기 위한 문장적는다.

 //보통 이곳에 예외메세지를 출력하고 로그로 남김.
  
} catch(ExceptionN eN) {

 //ExceptionN이 발생했을 경우, 이를 처리하기 위한 문장적는다.
  
} finally {

 //예외발생여부에 관계없이 항상, 반드시 수행되어야 하는 문장적는다.
  
} 

*/
public class ExceptionTest02 {
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		int tot = 0;
		
		try {
			for(int i=0; i<=a.length; i++) { // 예외 발생
				System.out.println("a[" + i + "] = " + a[i]);
				tot += a[i];
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		System.out.println("합계 : " + tot);
		
		System.out.println("아래에서 학생들의 점수에 대한 처리를 하고 있습니다.");
		// ...
		
	}

}
