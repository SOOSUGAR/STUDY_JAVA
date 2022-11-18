
class XY {
	private static int count = 0;
	private int id;
	private int x = 0;
	private int y = 0;
	
	// �ν��Ͻ� �ʱ�ȭ ��, �ν��Ͻ� �ʱ���
	// ������ �ʱ�ȭ ��, ������ �ʱ���
	// ��� �����ڰ� ȣ��Ǳ� *�ٷ� ����*�� ȣ��Ǵ� �ʱ���
	{
		id = ++count;
	}
	
	// ������ �����ε�
	public XY() {
		
	}
	
	public XY(int x) {
		this.x = x;
	}
	
	public XY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// ���� ������
	public XY(XY a) {
		this.x = a.x;
		this.y = a.y;
	}
	
	// ��� �޼ҵ�
	public String toStirng() {
		return "ID." + id + " (x:" + x + ", y:" + y + ")";
	}
}

// ����) �ν��Ͻ��� �°� �����ڸ� �����ϰ�, �� �ν��Ͻ��� id�� x��ǥ, y��ǥ�� ����Ͻÿ�.
public class XYTest01 {
	public static void main(String[] args) {
		XY p1 = new XY();
		XY p2 = new XY(10);
		XY p3 = new XY(30, 40);
		XY p4 = new XY(p3);
		
		System.out.println(p1.toStirng());
		System.out.println(p2.toStirng());
		System.out.println(p3.toStirng());
		System.out.println(p4.toStirng());
		
	}

}
