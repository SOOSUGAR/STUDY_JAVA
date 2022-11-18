import java.util.Vector;

public class VectorTest02 {
	public static void main(String[] args) {
		// 벡터 생성
		Vector<Integer> v = new Vector<Integer>();
		int[] a = {10, 20, 30, 40, 50};

		System.out.println("───────데이터 추가───────");
		for(int i = 0; i<a.length; i++) {
			v.add(a[i]);
		}
		
		System.out.println(v);
		
		System.out.println("─────데이터 삭제(1개)─────");
		v.remove(2);
		System.out.println(v);
		
		System.out.println("─데이터 추가(비순차적, 중간)─");
		v.add(2, 60);
		System.out.println(v);
		
		System.out.println("───────데이터 변경───────");
		v.set(3, 80);
		System.out.println(v);
		
		System.out.println("─────크기(갯수) 출력─────");
		System.out.println("크기 : " + v.size());
		
		System.out.println("───데이터 출력(첫 번째 값)───");
		System.out.println(v.firstElement());
		
		System.out.println("───데이터 출력(마지막 값)───");
		System.out.println(v.lastElement());
		System.out.println(v.get(v.size()-1));
		
		System.out.println("──데이터 출력(해당 인덱스)──");
		System.out.println(v.get(3));
		System.out.println(v.elementAt(3));
		
		System.out.println("────값에 해당하는 인덱스────");
		System.out.println(v.indexOf(80));
		
		System.out.println("───────데이터 삽입───────");
		v.add(60);
		System.out.println(v);
		
		System.out.println("─값에 해당하는 인덱스(앞에서)─"); // 앞에서부터 순차적으로 찾음
		System.out.println(v.indexOf(60));
		
		System.out.println("─값에 해당하는 인덱스(뒤에서)─");
		System.out.println(v.lastIndexOf(60));
		
		System.out.println("─값에 해당하는 인덱스(위치 지정)─");
		System.out.println(v.indexOf(60)); 		// 첫 번째로 나오는 60의 인덱스
		System.out.println(v.indexOf(60, 3));	// 3번 째 인덱스부터 순서대로 60의 값을 찾음
		
		System.out.println("─값에 해당하는 인덱스(없을 때)─");
		System.out.println(v.indexOf(30)); 		// -1
		
		System.out.println("─데이터 추가(비순차적, 중간)─");
		//v.add(4,70)
		v.insertElementAt(70, 4); // add() 메소드 사용 권장
		System.out.println(v);
		
		System.out.println("크기 : " + v.size());
		System.out.println("─────벡터 사이즈 변경─────");
		v.setSize(5); // 사이지를 변경하면 나머지 데이터를 삭제
		System.out.println("크기 : " + v.size());
		System.out.println(v);
		
		System.out.println("───벡터의 모든 데이터 삭제───");
		v.removeAllElements();
		System.out.println("크기 : " + v.size());
		System.out.println(v);
		
	}

}
