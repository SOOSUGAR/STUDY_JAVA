import java.util.ArrayList;
import java.util.Collections;

/*
< ArrayList >
1. Vector Ŭ������ ��� �� ������ ���� ������.
2. Vector���� �������� ����ȭ ����� �־ ������ ���ϰ� �߻�
-> ArrayList������ �������� ����ȭ ����� �����Ͽ� ������ ����
3. Vector�� capacity() �޼ҵ�� ArrayList���� ����

���� ) �Ʒ��� ���ǿ� �ش��ϴ� ����Ʈ�� �����ϰ� Ȱ���Ͻÿ�.
1. ����Ʈ�� �л����� ���� scores �迭�� ���� �����ϰ� Ȯ���Ͻÿ�.
2. ����Ʈ���� 60�� �̸��� ������ ���� �л��� �����ϰ� Ȯ���Ͻÿ�.
3. ����Ʈ�� ������ ����� ���Ͻÿ�.
4. ����Ʈ�� �ְ������� ���������� ���Ͻÿ�.
5. ����Ʈ�� 2���� ������� ����Ͻÿ�. (�⺻/Ȯ�� for��)
 
*/
public class ArrayListTest01 {
	public static void main(String[] args) {
		int[] scores = {95, 88, 75, 63, 77, 47, 48, 93, 91}; // 100���̶�� ����
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		System.out.println("1. ����Ʈ ����");
		for(int i = 0; i<scores.length; i++) {
			list.add(scores[i]);
		}
		System.out.println("list : " + list);
		System.out.println("��������������������������������������������������������");
		
		System.out.println("2. 60�� �̸� �л� ���� ����");
		// 4, 6, 7 �ε��� ����
		// �ε����� ����Ͽ� ���� - �⺻ for��
		// ������ �߻� : [95, 88, 75, 63, 77, 48, 93, 91] -> �ε����� �����Ǹ� ������ ������� ������ ���̾� �ش��ϴ� ���� ������ �� ����
		/*
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i) < 60) {
				list.remove(i);
			}
		}
		*/
		// �ذ�å : �ε����� �ڿ������� Ȯ���ϸ� ����
		for(int i = list.size()-1; i >= 0 ; i--) {
			if(list.get(i) < 60) {
				list.remove(i);
			}
		}
		System.out.println("list : " + list);
		System.out.println("��������������������������������������������������������");
		
		System.out.println("3. ����, ���");
		int sum = 0;
		double ave = 0.0;
		for(int i : list) {
			sum += i;
		}
		ave = sum/list.size();
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + ave);
		System.out.println("��������������������������������������������������������");
		
		System.out.println("4. �ְ�/���� ����");
		int max = list.get(0);
		int min = list.get(0);
		for(int i=1; i<list.size(); i++) {
			if(max < list.get(i)) {
				max = list.get(i);
			}
			if(min > list.get(i)) {
				min = list.get(i);
			}
		}
		System.out.println("�ְ� ���� : " + max);
		System.out.println("���� ���� : " + min);
		System.out.println("��������������������������������������������������������");
		
		System.out.println("5. ��� 1");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("��������������������������������������������������������");
		
		System.out.println("6. ��� 2");
		for(Object o: list) {
			System.out.println(o);
		}
		System.out.println("��������������������������������������������������������");
		
		System.out.println("7. �ְ�/���� ���� 2");
		Collections.sort(list); // �������� ����
		System.out.println(list);
		System.out.println("�ְ� ���� : " + list.get(0));
		System.out.println("���� ���� : " + list.get(list.size()-1));
		
		
		
	}

}
