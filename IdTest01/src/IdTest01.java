
// ����) main �޼ҵ忡 Id Ŭ������ �ν��Ͻ��� 3�� �����, id�� ���� �ν��Ͻ��� ������ �� �ڵ����� 1�� �����ϵ��� �Ͻÿ�.
// ��  �ν��Ͻ��� id���� ����ϰ�, ���ݱ��� ������ �ν��Ͻ��� ���� ����ϵ��� �Ͻÿ�.
class Id {
	private static int count = 0; // Ŭ���� ����
	private int id; // �ν��Ͻ� ����
	
	// ������
	public Id() {
		this.id = ++count;
	}
	
	// Ŭ���� �޼ҵ�
	public static int getCount() {
		return count;
	}
	
	// �ν��Ͻ� �޼ҵ�
	// getter/setter
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	// ��� �޼ҵ�
	public String toString() {
		return "ID : " + id;
	}
	
}

public class IdTest01 {
	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();
		Id c = new Id();
		
		System.out.println(a); // a.toString() ����
		System.out.println(b);
		System.out.println(c);
		
		// System.out.println("���ݱ��� ������ �Ϸù�ȣ : " + a.getCount()); // ���� ���
		System.out.println("���ݱ��� ������ �Ϸù�ȣ : " + Id.getCount()); // ���� ���
	}

}
