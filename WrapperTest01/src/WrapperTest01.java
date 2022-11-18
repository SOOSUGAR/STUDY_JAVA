
/*
Wrapper Ŭ����
1. Byte, Short, Integer, Long, Char, Float, Double, Boolean�� 8�� Ŭ������ ��Ī�Ͽ� ����ϴ� �̸�
2. �ڹٿ��� �⺻���� ���������� ��ȯ�Ͽ� ����ϱ� ���� ���� 8���� �⺻���� ���� Ŭ����
3. ���� 1 : �⺻���� ������(Ŭ������)���� ����� ����
4. ���� 2 : ���ڿ��� �⺻������ ��ȯ�ϱ� ����
5. 8���� Wrapper Ŭ���� �߿��� �⺻������ Integer, Double�� ���� ���� ���
6. Collection(�÷���)������ �ݵ�� Wrapper Ŭ������ ����ؾ� ��

# �ڽ�(Boxing) - �⺻���� ���������� ����� ��
# ��ڽ�(UnBoxing) - �������� �⺻������ ����� ��
# ����ڽ�(Auto-Boxing) - �⺻���� ���������� �ڵ� �����ϴ� �� 
# �����ڽ�(Auto-UnBoxing) - �������� �⺻������ �ڵ� �����ϴ� ��
*/
public class WrapperTest01 {
	public static void main(String[] args) {
		// 1�� ����
		int i = 10; 					// �⺻��
		Integer ii = new Integer(i);	// ������(Ŭ������), �ڽ�
		int i2 = ii.intValue();			// ��ڽ�
		i2 += 20;
		System.out.println(i2);			
		System.out.println("����������������������������������");
		
		int j = 10;			// �⺻��
		Integer jj = j;		// ������, ����ڽ�
		jj += 30; 			// �����ڽ�
		System.out.println(jj);
		System.out.println("����������������������������������");
		
		
		// 2�� ����
		String s1 = "10";				// ���� ���ڿ�
		System.out.println(s1 + 20);	// ���ڿ� 1020
		
		int a = Integer.parseInt(s1) + 20; 
		System.out.println(a);
		System.out.println("����������������������������������");
		
		String s2 = "3.14"; 	// �Ǽ� ���ڿ�
		double radius = 5.5;
		// System.out.println(s2 * radius * radius); // ���� : ���ڿ��� ��� �Ұ�
		
		double area = Double.parseDouble(s2) * radius * radius;
		System.out.println(area);
		
	}

}
