
/*
< while���� Ư¡ >
- �ݺ� Ƚ���� �ľ��ϱ� ��ư�, ������ �߽��� �� �� ����ϸ� ȿ����
*/

// ����) 1���� 1�� �����Ͽ� ���ؼ� �� ���� 100�� �Ǳ� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class While03 {
	public static void main(String[] args) {
		int n = 1, sum = 0;
		
		while(sum+n < 100) {
			sum += n; // ���� �Լ���
			System.out.printf("1���� %d������ ���� %d\n", n, sum);
			n++;
		}
		
	}

}
