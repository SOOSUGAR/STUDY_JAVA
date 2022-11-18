
public class Array2D01 {
	public static void main(String[] args) {
		// 1번 방법 - 각 행에 대한 열의 개수가 가변적일 때도 사용 가능
		/*
		int[][] a; // int형의 1차원 배열을 참조하는 참조 뱐수 a 선언
		a = new int[3][]; // 앞이 행, 뒤가 열, int형의 1차원 배열을 참조하는 참조 변수 a[0]. a[1], a[2]을 선언 -> 행의 개수가 3개
		a[0] = new int[4]; // 0번 행의 열의 개수 : 4개
		a[1] = new int[4]; // 1번 행의 열의 개수 : 4개;
		a[2] = new int[4]; // 2번 행의 열의 개수 : 4개;
		*/
		
		// 2번 방법 - 각 행에 대한 열의 개수가 고정일 때만 사용
		int[][] a = new int[3][4];
		
		// 2차원 배열에 값을 대입
		a[0][1] = 10;
		a[1][2] = 20;
		a[2][3] = 30;
		
		

		// 2차원 배열의 값 출력
		for(int i = 0; i<a.length; i++) { // a.length -> 행의 개수
			for(int j = 0; j<a[i].length; j++) { // a[i].length, a[1].length, a[2].length -> 각 행에 대한 열의 개수
				System.out.printf( "%4d", a[i][j]);
		}
			System.out.println();
	}
	
 }	

}
