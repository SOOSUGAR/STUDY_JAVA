import java.util.Vector;

/*
����) �Ʒ��� ���ǿ� �ش��ϴ� ���͸� �����ϰ� Ȱ���Ͻÿ�.
1. ���� v�� ���ڿ� �迭 names�� ��� Ȯ���Ͻÿ�.
2. ���� v���� �̽¿� ������ ������� �߰��ϰ� Ȯ���Ͻÿ�.
3. ���� v���� ����ȣ�� �����ϰ� Ȯ���Ͻÿ�.
4. ���� v���� �迬���� ���������� �����ϰ� Ȯ���Ͻÿ�.
5. ���� v�� ������ 2���� ������� ����Ͻÿ�. (�⺻/Ȯ�� for��)
*/
public class VectorTest06 {
	public static void main(String[] args) {
		String[] names = {"�迬��", "����ȣ", "�̽¿�", "�迬��", "�����"};
		Vector<String> v = new Vector<String>();
		
		System.out.println("1. ���� Ȯ��");
		for(int i = 0; i<names.length; i++) {
			v.add(names[i]);
		}
		System.out.println("v : " + v);
		System.out.println("��������������������������������������������������������");
		
		System.out.println("2. �̽¿� ������ ������� �߰�");
		v.add(3, "�����");
		System.out.println("v : " + v);
		System.out.println("��������������������������������������������������������");
		
		System.out.println("3. ����ȣ ����");
		//v.remove(1);
		v.remove("����ȣ");
		System.out.println("v : " + v);
		System.out.println("��������������������������������������������������������");
		
		System.out.println("4. �迬���� ���������� ����");
		v.set(3, "������");
		System.out.println("v : " + v);
		System.out.println("��������������������������������������������������������");
		
		System.out.println("5. ��� 1��");
		for(int i = 0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println("��������������������������������������������������������");
		
		System.out.println("6. ��� 2��");
		for(Object o : v) {
			System.out.println(o);
		}
		
	}

}
