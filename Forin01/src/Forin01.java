
/*
< for���� ���� 2����>
1. �⺻ for�� : �迭 �Ǵ� �÷����� �ε����� Ȱ���Ͽ� �����ϴ� ���
2. enhanced for��(���� for��), Ȯ�� for��, for-in��, for-each��
- Ư¡ : �ε����� ����, Ư�� ������ �ش��ϴ� ���� �ٷ� �� ����
- ������ ó������ �������� ���� �ٷ�� ��
- �ε����� �����Ƿ�, Ư�� �ε����� �ش��ϴ� ���� ��ȭ�� �� �� ����
*/
public class Forin01 {
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		
		// 1�� -�⺻ for��
		for(int i = 0; i < a.length; i++) { // i -> �ε���
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		// 2�� - Ȯ�� for��, for-in��
		for(int i : a) { // i -> a �迭 ���� ��
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		
	}

}
