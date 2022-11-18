
/*
< ����� ���迡�� Ŭ������ �̸� >
1. ����� �ϴ� Ŭ���� - �θ�, �⺻(���, ����), ����, ����
2. ����� �޴� Ŭ���� - �ڽ�, �Ļ�,	                  ����, ����

< super�� ����ϴ� ��� >
1. super() : �ڽ� Ŭ������ ������ ������ �θ� Ŭ������ �����ڸ� ȣ���Ͽ� ��ӹ��� ��������� ���� Ȯ���ϰ� �ʱ�ȭ�ϴ� ���
2. super. : �ڽ� Ŭ�������� �θ� Ŭ������ ����� �����ϴ� ���

< ��������� ���� ������ > 
1. private : �ڽ��� Ŭ���� �������� ���� ����
2. default : ���� �б��� �������� ���� ����
3. protected : ���� ��Ű�� �������� ����, ����� �޾Ҵٸ�(�ڽ� Ŭ����) �ٸ� ��Ű�������� ���� ����
4. public : ��𿡼��� ���� ����

# ���� ���� #
private < default < protected < public

�ڡڡڡڡ�
< �������̵�(Overriding) >
1. �޼ҵ��� ������
2. ����� ���迡�� �θ� Ŭ������ �޼ҵ带 �ڽ� Ŭ�������� ������ �����ϰ� �����ϴ� ��
- �޼ҵ��, �Ű������� ������ Ÿ��, ����Ÿ�Ա��� �����ϰ� ��ġ�ؾ� ��
3. ���� �����ڴ� �θ�� 

*/

// �θ� Ŭ����
class Point2D{
	// 1�� ���
	//protected int x;
	//protected int y;
	
	private int x;
	private int y;
	
	// ����Ʈ ������
	public Point2D() { }
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// getter
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	// setter
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "x = " + x + ", y = " + y;
	}
	
}

// Point3D Ŭ������ Point2D Ŭ������ Ȯ���Ѵ�.
// Point3D Ŭ������ Point2D Ŭ�����κ��� ��� ���� ��ӹ޴´�.
// �ڽ� Ŭ����
class Point3D extends Point2D {
	private int z;
	
	// super() : �ڽ��� �����ڿ��� �θ� Ŭ������ �����ڸ� ȣ���ϴ� ���
	// - ��ӹ��� �θ��� private ������ ���� �ʱ�ȭ�ϴ� ����
	public Point3D(int x, int y, int z) {
		// �Ұ��� ���
		//this.x = x; //private �ɹ��� ���� �Ұ� -> �ٸ� Ŭ�����̱� ����
		//this.y = y;
		
		// 1�� ��� : �θ��� ��������� ���� ������ protected�� ��ȭ�ϴ� ���
		// - �Ϲ������� �������� �ʴ� ��� -> �⺻���� ĸ��ȭ�� ������ ����
		//this.x = x;
		//this.y = y;
		
		// 2�� ���
		super(x,  y);
		this.z = z;
	}
	
	// getter
	public int gatZ() {
		return z;
	}
	
	// setter
	public void setZ(int z) {
		this.z = z;
	}
	
	// super. : �θ��� ����� �����ϴ� ���
	// �������̵�(Over riding)
	public String toString() {
		return super.toString() + ", z = " + z;
		//return "x = " + getX() + ", y = " + getY() + ", z = " + z;
	}
	
}

public class PointTest01 {
	public static void main(String[] args) {
		Point2D p1 = new Point2D(10, 20);
		Point3D p2 = new Point3D(50, 60, 70);
		
		System.out.println(p1.toString()); // toString ���� ����
		System.out.println(p2);
		
	}

}
