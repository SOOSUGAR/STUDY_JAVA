import java.util.ArrayList;
import java.util.Collections;

/*
< ArrayList >
1. Vector 클래스와 기능 및 사용법이 거의 동일함.
2. Vector에는 쓰레드의 동기화 기능이 있어서 성능의 저하가 발생
-> ArrayList에서는 스레드의 동기화 기능을 제거하여 성능을 개선
3. Vector의 capacity() 메소드는 ArrayList에는 없음

문제 ) 아래의 조건에 해당하는 리스트를 생성하고 활용하시오.
1. 리스트에 학생들의 점수 scores 배열의 값을 저장하고 확인하시오.
2. 리스트에서 60점 미만의 점수를 받은 학생은 삭제하고 확인하시오.
3. 리스트의 총점과 평균을 구하시오.
4. 리스트의 최고점수와 최저점수를 구하시오.
5. 리스트를 2가지 방식으로 출력하시오. (기본/확장 for문)
 
*/
public class ArrayListTest01 {
	public static void main(String[] args) {
		int[] scores = {95, 88, 75, 63, 77, 47, 48, 93, 91}; // 100명이라고 가정
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("1. 리스트 생성");
		for(int i = 0; i<scores.length; i++) {
			list.add(scores[i]);
		}
		System.out.println("list : " + list);
		System.out.println("────────────────────────────");
		
		System.out.println("2. 60점 미만 학생 점수 삭제");
		// 4, 6, 7 인덱스 삭제
		// 인덱스를 사용하여 삭제 - 기본 for문
		// 문제점 발생 : [95, 88, 75, 63, 77, 48, 93, 91] -> 인덱스가 삭제되면 앞으로 당겨지기 때문에 뒤이어 해당하는 값을 삭제할 수 없음
		/*
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i) < 60) {
				list.remove(i);
			}
		}
		*/
		// 해결책 : 인덱스를 뒤에서부터 확인하며 삭제
		for(int i = list.size()-1; i >= 0 ; i--) {
			if(list.get(i) < 60) {
				list.remove(i);
			}
		}
		System.out.println("list : " + list);
		System.out.println("────────────────────────────");
		
		System.out.println("3. 총점, 평균");
		int sum = 0;
		double ave = 0.0;
		for(int i : list) {
			sum += i;
		}
		ave = sum/list.size();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + ave);
		System.out.println("────────────────────────────");
		
		System.out.println("4. 최고/최저 점수");
		int max = list.get(0);
		int min = list.get(0);
		for(int i=1; i<list.size(); i++) {
			if(max < list.get(i)) {
				max = list.get(i);
			}
			if(min > list.get(i)) {
				min = list.get(i);
			}
		}
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("────────────────────────────");
		
		System.out.println("5. 출력 1");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("────────────────────────────");
		
		System.out.println("6. 출력 2");
		for(Object o: list) {
			System.out.println(o);
		}
		System.out.println("────────────────────────────");
		
		System.out.println("7. 최고/최저 점수 2");
		Collections.sort(list); // 오름차순 정렬
		System.out.println(list);
		System.out.println("최고 점수 : " + list.get(0));
		System.out.println("최저 점수 : " + list.get(list.size()-1));
		
		
		
	}

}
