import java.util.Random;

class RandomId {
	private static int count;
	private int id;
	
	// Ŭ���� �ʱ�ȭ ��, Ŭ���� �ʱ���
	// ���� �ʱ�ȭ ��, ���� �ʱ���
	// Ŭ������ ���Ǳ� �ٷ� ������ �� �� ���� ȣ��
	static {
		count = (int)(Math.random() * 10) * 100;
	}
	
	public RandomId() {
		id = ++count;
	}
	
	public int getId() {
		return id;
	}
	
		
	
	
}

// ����) �Ź� ������ ������ 0���� 900���� 100������ ������ �����Ͽ� ��� �ν��Ͻ����� �ڵ����� 1�� �����ϴ� id�� �����ϵ��� �Ͻÿ�.
// count�� ������ ���� 300�� �� 3���� �ν��Ͻ��� id�� 301, 302, 303���� �����ϵ��� �Ͻÿ�.
// id���� ���� : 0, 100, 200, 300, 400, 500, 600, 700
public class RandomIdTest01 {
	public static void main(String[] args) {
		RandomId a = new RandomId();
		RandomId b = new RandomId();
		RandomId c = new RandomId();
		
		System.out.println("a : " + a.getId());
		System.out.println("b : " + b.getId());
		System.out.println("c : " + c.getId());
				
	}

}
