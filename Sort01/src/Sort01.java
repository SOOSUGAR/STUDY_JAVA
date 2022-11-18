import java.util.Scanner;

public class Sort01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 개수 입력 : ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		//int[] a = {50, 70, 20, 10, 30};
		
		// 배열의 값을 0 ~ 100 사이의 난수로 저장, 0 ~ 99까지의 난수
		for(int i = 0; i<a.length; i++) {
			a[i] = (int)(Math.random() * 100);
			for(int j = 0; j >i; j++) {
				if(a[i] == a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
		
		// 출력
		System.out.print("선택 정렬 전 : ");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// 선택 정렬(Selection Sort)
		for(int i = 0; i < a.length-1; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
			System.out.printf("%d번 회전 후 : " , i+1);
			for(int j =0; j<a.length; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}
		
		// 출력
		System.out.print("선택정렬 후 : ");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	
	sc.close();
	}
}
