
// �߻� Ŭ���� - �߰� �޼ҵ尡 �ִٸ�, �ݵ�� �߻� Ŭ�������� ��
abstract class A {
	public abstract void a(); // �߻� �޼ҵ��̱� ������ Ŭ������ �߻� Ŭ�������� ��
	
	
}

// ���߻� Ŭ����
abstract class B extends A {
	// 1��
	public void a() { // ���߻� �޼ҵ� - �θ� Ŭ������ �߻� �޼ҵ带 �������̵�
	}
}

class C extends B {
	// 1��
	//public void a() { // ���߻� �޼ҵ� - �θ� Ŭ������ ���߻� �޼ҵ带 �������̵�
	
	public void a() { } // ���߻� �޼ҵ� - �θ� Ŭ������ �߻� �޼ҵ带 �������̵�
	
	}




public class AbstractTest01 {
	public static void main(String[] args) {
		
	}

}
