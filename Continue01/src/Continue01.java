
/*
< continue�� >
1. �ݺ��� �ȿ���  continue���� ������, �ݺ����� ������ �̵�
2. continue���� �ݺ����� �� ���̿� �ִ� ���๮�� ������� ����
3. continue���� �ݺ��� ������ �� ���̿� �ִ� ���๮�� ����, ���� 
*/

// ����) 1���� 10������ ���� �߿��� 3�� ����� �����ϰ� ����Ͻÿ�.
public class Continue01 {
	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 10 ; i++) {
			if(i%3 == 0) {
				continue; // -> 3�� ����� ���� �ݺ����� ���������� �̵�
			}
			System.out.println(i);
			  // �ݺ����� ������
		}
		
	}

}
