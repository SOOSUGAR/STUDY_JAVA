
public class Sort02 {
	public static void main(String[] args) {
		int[] a = {50, 70, 20, 10, 30};
		  
		// 정렬 전 출력
		System.out.print("  버블 정렬 전 : ");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		
		// 버블 정렬(Bubble Sort)
		for(int i = 0; i < a.length-1; i++) {
			boolean flag = false;
			for(int j = 0; j < a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					flag = true;
				}
			}
			// flag 기법 : 변화가 생겼을 때 변화를 감지하여 그에 맞는 명령을 하는 방법
			if(!flag) { // flag == false 
				break;
			}
			
			System.out.printf("%2d번 회전 후 : " , i+1);
			for(int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
		}
		
		// 정렬 후 출력
		System.out.print("  버블 정렬 후 : ");
		for(int i = 0; i<a.length; i++) {
			System.out.print(a[i] + " ");    
		}
	}

}
