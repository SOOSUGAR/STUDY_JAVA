package animal;

/*
1. �߻� �޼ҵ�
(1) �߻� �޼ҵ��� Ư¡
- �޼ҵ��� �����κ�(��ü)�� ����
- �޼ҵ� �տ� abstract�� ����
(2) �߻� �޼ҵ��� ����
- �ڽ� Ŭ�������� �θ� Ŭ������ �߻� �޼ҵ带 �������̵��ؾ߸� �ν��Ͻ��� ������ �� �ִ�
- ����, �ڽ� Ŭ�������� �θ� Ŭ������ �߻� �޼ҵ带 �������̵����� ������ �߻� �޼ҵ带 ������ �ǰ�,
     �߻� �޼ҵ带 ������ �߻� Ŭ������ �Ǿ�� �ϸ�, �߻� Ŭ������ �Ǹ� �ν��Ͻ��� ������ �� ���� �ȴ�

2. �߻� Ŭ����
(1) �߻� Ŭ������ Ư¡
- Ŭ���� �̸� �տ� abstract�� ����

(2) �߻� Ŭ������ ��Ģ
- �߻� �޼ҵ带 ������ ������ �߻� Ŭ������ �Ǿ�� �Ѵ�
- �߻� �޼ҵ尡 ��� �߻� Ŭ������ �� �� �ִ� -> �ν��Ͻ��� ������ �� ����
- �߻� Ŭ������ �ν��Ͻ��� ���� �� ���� -> �θ� Ŭ������ �����Ͽ� �������� ������ ����
*/

// �߻� Ŭ���� -> �������� ������ ����
// �θ� Ŭ���� 
public abstract class Animal {
	private String name;
	
	public Animal() { } // default ������ -> Cat Ŭ���� ������ ó���ϱ� ����
	
	public Animal(String name) {
		this.name = name;
	}
	
	// �߻� �޼ҵ�
	public abstract void bark();
	
	// �߻� �޼ҵ�
	public abstract String toString(); // Object�κ��� �������̵�
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void introduce() {
		System.out.println(toString());
		bark();
	}
	
}
