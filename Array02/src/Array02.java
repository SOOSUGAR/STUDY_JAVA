
/*
�迭(Array) - ���� Ÿ���� ������ ����
- ������ ���� �Ѳ���(�ϰ�)�� �����ϰ� �ݺ����� ���� �Ѳ���(�ϰ�)�� ó���� ���ְ� ��
- �迭�� �ε���(index) : �迭 ������ n�����, 0 ~ n-1������ ������
- �迭�� �⺻�� : int�� �迭 ��ü�� �⺻���� 0�� ��� ����


*/
public class Array02 {
	public static void main(String[] args) {
		// 1�� ���
		//int[] a; // ���� ���� ����, a -> int���� 1���� �迭�� �����ϴ� ���� ����
		//a = new int[5]; // ���� ���� a�� int�� �迭�� ��ü�� ������
		
		// 2 �� ��� 
		int[] a = new int[5]; // ���� ���� ����� ���ÿ� �迭�� ��ü�� ������
		
		// ���� ����
		a[1] = 10;
		a[3] = 30;
		
		// a.length = 10; -> ���� : �迭�� length�� final����̹Ƿ� ���� �Ұ�
		
		// �ݺ����� ����Ͽ� �迭 ���� ���
		for(int i =0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		/*
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		*/
		//System.out.println(a[5]); -> ���� �߻� : �迭�� ������ 5����� a[0] ~ a[4]���� ����, a[5]�� �������� ����
		
		
	}

}
