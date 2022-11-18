import java.util.Vector;

public class VectorTest02 {
	public static void main(String[] args) {
		// ���� ����
		Vector<Integer> v = new Vector<Integer>();
		int[] a = {10, 20, 30, 40, 50};

		System.out.println("�������������������� �߰���������������");
		for(int i = 0; i<a.length; i++) {
			v.add(a[i]);
		}
		
		System.out.println(v);
		
		System.out.println("���������������� ����(1��)����������");
		v.remove(2);
		System.out.println(v);
		
		System.out.println("�������� �߰�(�������, �߰�)��");
		v.add(2, 60);
		System.out.println(v);
		
		System.out.println("�������������������� ���榡������������");
		v.set(3, 80);
		System.out.println(v);
		
		System.out.println("����������ũ��(����) ��¦���������");
		System.out.println("ũ�� : " + v.size());
		
		System.out.println("������������ ���(ù ��° ��)������");
		System.out.println(v.firstElement());
		
		System.out.println("������������ ���(������ ��)������");
		System.out.println(v.lastElement());
		System.out.println(v.get(v.size()-1));
		
		System.out.println("���������� ���(�ش� �ε���)����");
		System.out.println(v.get(3));
		System.out.println(v.elementAt(3));
		
		System.out.println("������������ �ش��ϴ� �ε�����������");
		System.out.println(v.indexOf(80));
		
		System.out.println("�������������������� ���Ԧ�������������");
		v.add(60);
		System.out.println(v);
		
		System.out.println("������ �ش��ϴ� �ε���(�տ���)��"); // �տ������� ���������� ã��
		System.out.println(v.indexOf(60));
		
		System.out.println("������ �ش��ϴ� �ε���(�ڿ���)��");
		System.out.println(v.lastIndexOf(60));
		
		System.out.println("������ �ش��ϴ� �ε���(��ġ ����)��");
		System.out.println(v.indexOf(60)); 		// ù ��°�� ������ 60�� �ε���
		System.out.println(v.indexOf(60, 3));	// 3�� ° �ε������� ������� 60�� ���� ã��
		
		System.out.println("������ �ش��ϴ� �ε���(���� ��)��");
		System.out.println(v.indexOf(30)); 		// -1
		
		System.out.println("�������� �߰�(�������, �߰�)��");
		//v.add(4,70)
		v.insertElementAt(70, 4); // add() �޼ҵ� ��� ����
		System.out.println(v);
		
		System.out.println("ũ�� : " + v.size());
		System.out.println("�������������� ������ ���榡��������");
		v.setSize(5); // �������� �����ϸ� ������ �����͸� ����
		System.out.println("ũ�� : " + v.size());
		System.out.println(v);
		
		System.out.println("������������ ��� ������ ����������");
		v.removeAllElements();
		System.out.println("ũ�� : " + v.size());
		System.out.println(v);
		
	}

}
