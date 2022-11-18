import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		// 1번
		try	{
			System.out.print("나뉨수 : ");
			int a = sc.nextInt();
			System.out.print("나눗수 : ");
			int b = sc.nextInt();
			
			int c = a / b;
		} catch(InputMismatchException | ArithmeticException e) {
			//e.printStackTrace();
			System.err.println("연산 중 예외가 발생하였습니다.");
		}
		*/
		
		/*
		// 2번
		try	{
			System.out.print("나뉨수 : ");
			int a = sc.nextInt();
			System.out.print("나눗수 : ");
			int b = sc.nextInt();
			
			int c = a / b;
		} catch(InputMismatchException e) {
			//e.printStackTrace();
			System.err.println("잘못된 숫자 타입을 입력하였습니다.");
		} catch(ArithmeticException e) {
			System.err.println("연산 중 예외가 발생하였습니다.");
		}
		*/
		
		// 3번
		try	{
			System.out.print("나뉨수 : ");
			int a = sc.nextInt();
			System.out.print("나눗수 : ");
			int b = sc.nextInt();
			
			int c = a / b;
		} catch(Exception e) {
			//e.printStackTrace();
			System.err.println("연산 중 예외가 발생하였습니다.");
		} 
		
		System.out.println("예외를 처리하고 난 후에 프로그램을 실행합니다.");
		
		sc.close();
	}

}
