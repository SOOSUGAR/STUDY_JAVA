import java.util.Vector;

public class VectorTest04 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println("�뷮 : " + v.capacity());	// �ʱ� �뷮 : 10
		System.out.println("ũ�� : " + v.size());		// ũ�� : 0
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("����������5���� ������ �߰�����������");
		System.out.println("�뷮 : " + v.capacity());
		System.out.println("ũ�� : " + v.size());	
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("����������5���� ������ �߰�����������");
		System.out.println("�뷮 : " + v.capacity());
		System.out.println("ũ�� : " + v.size());	
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("����������5���� ������ �߰�����������");
		System.out.println("�뷮 : " + v.capacity());
		System.out.println("ũ�� : " + v.size());	
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("����������5���� ������ �߰�����������");
		System.out.println("�뷮 : " + v.capacity());
		System.out.println("ũ�� : " + v.size());	
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("����������5���� ������ �߰�����������");
		System.out.println("�뷮 : " + v.capacity());
		System.out.println("ũ�� : " + v.size());	
		
		System.out.println("�������뷮�� ũ��� ���� ���㦡����");
		v.trimToSize();
		System.out.println("�뷮 : " + v.capacity());	// 25
		System.out.println("ũ�� : " + v.size());		// 25
		
		v.add(10); v.add(20); v.add(30); v.add(40); v.add(50);
		System.out.println("����������5���� ������ �߰�����������");
		System.out.println("�뷮 : " + v.capacity()); // 50 -> �뷮�� ����� �ڵ����� ������
		System.out.println("ũ�� : " + v.size());		// 30
		
	}

}
