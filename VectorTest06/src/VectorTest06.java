import java.util.Vector;

/*
문제) 아래의 조건에 해당하는 벡터를 생성하고 활용하시오.
1. 벡터 v에 문자열 배열 names를 담고 확인하시오.
2. 벡터 v에서 이승엽 다음에 우상혁을 추가하고 확인하시오.
3. 벡터 v에서 박찬호를 삭제하고 확인하시오.
4. 벡터 v에서 김연경을 문지윤으로 변경하고 확인하시오.
5. 벡터 v의 내용을 2가지 방법으로 출력하시오. (기본/확장 for문)
*/
public class VectorTest06 {
	public static void main(String[] args) {
		String[] names = {"김연아", "박찬호", "이승엽", "김연경", "손흥민"};
		Vector<String> v = new Vector<String>();
		
		System.out.println("1. 벡터 확인");
		for(int i = 0; i<names.length; i++) {
			v.add(names[i]);
		}
		System.out.println("v : " + v);
		System.out.println("────────────────────────────");
		
		System.out.println("2. 이승엽 다음에 우상혁을 추가");
		v.add(3, "우상혁");
		System.out.println("v : " + v);
		System.out.println("────────────────────────────");
		
		System.out.println("3. 박찬호 삭제");
		//v.remove(1);
		v.remove("박찬호");
		System.out.println("v : " + v);
		System.out.println("────────────────────────────");
		
		System.out.println("4. 김연경을 문지윤으로 변경");
		v.set(3, "문지윤");
		System.out.println("v : " + v);
		System.out.println("────────────────────────────");
		
		System.out.println("5. 출력 1번");
		for(int i = 0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println("────────────────────────────");
		
		System.out.println("6. 출력 2번");
		for(Object o : v) {
			System.out.println(o);
		}
		
	}

}
