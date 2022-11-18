import java.util.Vector;

/*
< List �迭 >
1. ũ�Ⱑ �������� ���� �������� �迭 ����
2. ������ �ְ�, �������� �ߺ��� ���
3. Vector, ArratList, LinkedList, Stack, Queue ...
*/
public class VectorTest01 {
	public static void main(String[] args) {
		// 1. ���� ����
		// raw Ÿ�� - ���� Ÿ��, �������� �����͸� �־ ����ϴ� ��(����)
		// -> generic Ÿ�� - ��üȭ�� Ÿ��, �� ���� ������ �����͸� �־ ���(����)
		Vector v1 = new Vector();
		
		// 2. ������ ����
	      v1.add("30");   // ���ڿ�
	      v1.add(10);      // ����
	      v1.add("����");   // ���ڿ�
	      // v1.add(true);   // boolean
	      v1.add(3.14);   // �Ǽ�
	      
	    // 3. ��� 1�� - �⺻ for��
	    double tot = 0.0;
	    for(int i = 0; i<v1.size(); i++) {
	    	//tot += v1.get(i);
	    	System.out.println(v1.get(i));
	    }
		System.out.println("����������������������������");
    
	    // 4. ��� 2��- Ȯ�� for��
		/*
		for(Object o : v1) {
			System.out.println(o);
		}
		System.out.println("����������������������������");
		*/
		
		// 1. ��ó ���� -> generic Ÿ��
		Vector<Integer> v2 = new Vector<Integer>();
		// Vector(Integer> v2 = new Vector<>(); // ���
		
		v2.add(new Integer(10));	// �ڽ�
		v2.add(10);					// ������
		v2.add(30);
		v2.add(40);
		//v2.add(3.14); // ���� : int���� �����͸� �����ϴ� ���� v2�� double���� �����͸� ������ �� ����
		v2.add(50);
		
		// 3. ��� - �⺻ for��
		int sum = 0;
		for(int i = 0; i<v2.size(); i++) {
			sum += v2.get(i);
			System.out.println(v2.get(i));
		}
		System.out.println("�հ� : " + sum);
		System.out.println("����������������������������");
		
		// 4. ���
		for(int i : v2) {
			System.out.println(i);
		}
		System.out.println("����������������������������");
		
		// 5. ���� Ȯ��
		System.out.println(v2.toString());
		System.out.println(v2); // toString ��������
		
	}

}
