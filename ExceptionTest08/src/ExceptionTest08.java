import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		// 1��
		try	{
			System.out.print("������ : ");
			int a = sc.nextInt();
			System.out.print("������ : ");
			int b = sc.nextInt();
			
			int c = a / b;
		} catch(InputMismatchException | ArithmeticException e) {
			//e.printStackTrace();
			System.err.println("���� �� ���ܰ� �߻��Ͽ����ϴ�.");
		}
		*/
		
		/*
		// 2��
		try	{
			System.out.print("������ : ");
			int a = sc.nextInt();
			System.out.print("������ : ");
			int b = sc.nextInt();
			
			int c = a / b;
		} catch(InputMismatchException e) {
			//e.printStackTrace();
			System.err.println("�߸��� ���� Ÿ���� �Է��Ͽ����ϴ�.");
		} catch(ArithmeticException e) {
			System.err.println("���� �� ���ܰ� �߻��Ͽ����ϴ�.");
		}
		*/
		
		// 3��
		try	{
			System.out.print("������ : ");
			int a = sc.nextInt();
			System.out.print("������ : ");
			int b = sc.nextInt();
			
			int c = a / b;
		} catch(Exception e) {
			//e.printStackTrace();
			System.err.println("���� �� ���ܰ� �߻��Ͽ����ϴ�.");
		} 
		
		System.out.println("���ܸ� ó���ϰ� �� �Ŀ� ���α׷��� �����մϴ�.");
		
		sc.close();
	}

}
