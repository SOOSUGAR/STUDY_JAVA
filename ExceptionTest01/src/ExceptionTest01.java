
/*
< ������ ���� >
1. error(����) : �����Ͻ� �߻��ϴ� ����
2. exception(����) : ����ÿ� �߻��ϴ� ����
3. ����ó�� - ���ܸ� ó���Ͽ� ���α׷��� ���������� ����ǵ��� �ϴ� ��
4. Exception Ŭ���� - ��� ������ �θ� Ŭ����, java.lang ��Ű�� �ȿ� ����

ArrayIndexOutOfBoundsExcetion : �迭�� �ε����� ������ �ʰ��� �� �߻��ϴ� ����
*/
public class ExceptionTest01 {
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		int tot = 0;
		
		for(int i = 0; i <= a.length; i++) { // ���� �߻�
			System.out.println("a[" + i + "] = " + a[i]);
			tot += a[i];
		}
		System.out.println("�հ� : " + tot);
	}

}
