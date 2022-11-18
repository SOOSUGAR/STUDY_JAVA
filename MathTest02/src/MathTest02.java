import java.util.Random;

public class MathTest02 {
	public static void main(String[] args) {
		// Math.random() : 0 ~ 1 미만(0.999999....) 사이의 난수
		System.out.println(Math.random());
		
		// 1. 0 ~ 9 사이의 난수
		int a = (int)(Math.random() * 10);
		System.out.println(a);
		
		// 2. 1 ~ 10 사이의 난수
		int b = (int)(Math.random() * 10 + 1);
		System.out.println(b);
		
		// 3. 1 ~ 45 사이의 난수 - 로또 번호
		int c = (int)(Math.random() * 45 + 1);
		System.out.println(c);
		
		// 4. -30 ~ 30 사이의 난수
		int d = (int)(Math.random() * 61 - 30);
		System.out.println(d);
		
		// Random 클래스 활용
		Random r = new Random();
		int n = r.nextInt();
		System.out.println(n);
		
		// 1-1. 0 ~ 9 사이의 난수
		int n1 = r.nextInt(10); // 씨드값을 줌
		System.out.println(n1);
		
		// 2-1. 1 ~ 10 사이의 난수
		int n2 = r.nextInt(10)+1; // 씨드값을 줌
		System.out.println(n2);
		
		// 3-1. 1 ~ 45 사이의 난수
		int n3 = r.nextInt(45)+1; // 씨드값을 줌
		System.out.println(n3);
		
		// 4-1. -30 ~ 30 사이의 난수
		int n4 = r.nextInt(61)-30;
		System.out.println(n4);
	}

}
