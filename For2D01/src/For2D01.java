
/*
< 2���� �ݺ��� >
- ��ø �ݺ���, 2�� �ݺ���
- �ݺ��� �ȿ� �ݺ����� ���ԵǾ� �ִ� ������ �ݺ���
- 2���� ������ �����͸� �ٷ� �� �ְ� ��
*/
public class For2D01 {
	public static void main(String[] args) {
		
		// 1�� - 2���� for�� 
		/*
		for(int i = 2 ; i <= 9; i ++) {
			for(int j = 2 ; j <= 9; j ++) {
				System.out.printf("%d * %d = %2d\n", i, j, i*j);
			}
			System.out.println();
		}
		*/
		
		// 2�� - 2���� while��
		/*
		int i = 2; // �ʱⰪ
		while(i <= 9) {
			int j = 1; // j�� �ʱⰪ *j�� �ݺ��� �ۿ� ������ 1�� �ʱ�ȭ ���� �ʰ� 10 �״��, ��ġ ���� 
			while(j <= 9) { // ����
				System.out.printf("%d * %d = %2d\n" , i, j, i*j);
				
				j++; // ������
			}
			System.out.println();
			
			i++;
		}
		*/
		
		// 3�� - do ~ while��
		int i = 2;
		do {
			int j = 1; // �ʱⰪ ��ġ ����
			do {
			System.out.printf("%d * %d = %2d\n" , i, j, i*j);
			
			j++;
			} while( j <= 9 );
			
			i++;
			System.out.println();
		} while( i <= 9 );
		
	}

}
