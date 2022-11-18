import java.util.Vector;

public class VectorTest04 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println("용량 : " + v.capacity());	// 초기 용량 : 10
		System.out.println("크기 : " + v.size());		// 크기 : 0
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("─────5개의 데이터 추가─────");
		System.out.println("용량 : " + v.capacity());
		System.out.println("크기 : " + v.size());	
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("─────5개의 데이터 추가─────");
		System.out.println("용량 : " + v.capacity());
		System.out.println("크기 : " + v.size());	
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("─────5개의 데이터 추가─────");
		System.out.println("용량 : " + v.capacity());
		System.out.println("크기 : " + v.size());	
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("─────5개의 데이터 추가─────");
		System.out.println("용량 : " + v.capacity());
		System.out.println("크기 : " + v.size());	
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("─────5개의 데이터 추가─────");
		System.out.println("용량 : " + v.capacity());
		System.out.println("크기 : " + v.size());	
		
		System.out.println("───용량을 크기와 같게 맞춤───");
		v.trimToSize();
		System.out.println("용량 : " + v.capacity());	// 25
		System.out.println("크기 : " + v.size());		// 25
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("─────5개의 데이터 추가─────");
		System.out.println("용량 : " + v.capacity()); // 50 -> 용량의 배수로 자동으로 증가함
		System.out.println("크기 : " + v.size());		// 30
		
	}

}
