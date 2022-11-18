
/*
< for문의 종류 2가지>
1. 기본 for문 : 배열 또는 컬렉션의 인덱스를 활용하여 접근하는 방식
2. enhanced for문(향상된 for문), 확장 for문, for-in문, for-each문
- 특징 : 인덱스가 없음, 특정 범위에 해당하는 값을 다룰 수 없음
- 무조건 처음부터 끝까지의 값을 다루게 됨
- 인덱스가 없으므로, 특정 인덱스에 해당하는 값에 변화를 줄 수 없음
*/
public class Forin01 {
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		
		// 1번 -기본 for문
		for(int i = 0; i < a.length; i++) { // i -> 인덱스
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// 2번 - 확장 for문, for-in문
		for(int i : a) { // i -> a 배열 안의 값
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		
	}

}
