import java.util.Scanner;

/*
문제) 정수를 입력하여 입력한 개수에 해당하는 피보나치 수열을 출력하시오.
피보나치 수열 : 앞의 두 수를 더하여 다음 수를 만드는 수열

< 입력 화면 설계 >
피보나치 수열 개수 입력 : 13

< 출력 화면 설계 >
1 1 2 3 5 8 13 21 34 55 89 144 233

*/
public class ForTest01 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.print("피보나치 수열 개수 입력 : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n+2];
		
		arr[0] = 1;
		arr[1] = 1;
		
		System.out.print(arr[0] + " " + arr[1] + " ");
		
		for(int i = 0; i < n-2; i++) {
			arr[i+2] = arr[i] + arr[i + 1];
			System.out.print(arr[i+2] + " ");
		}
		
		sc.close();
	}

}
