/*
< ���ܸ� ó���ϴ� ��� >
- try�� 1���� ����ϸ� �ʼ� / catch�� 1�� �ʼ� , �� �̻� ����
- try �� : ���ܰ� �߻��� �� �ִ� ����
- catch �� : ���ܰ� �߻����� ���� ó��
- finally �� : catch �� �Ʒ��� 1���� ��� �����ϸ� ���� ����, ������ �߻� �����ʹ� ������� �׻� ����

1. try ~ catch
2. try ~ catch ~ catch ~
-> catch�� �߻��ϴ� ������ ������ŭ �� �� ����, ������ �������� �ٸ� ó���� �ϰ� �ʹٸ� ���
3. try ~ catch ( ����  | ���� | ���� ... ) 
-> catch �ȿ��� | �� �����ϴ� ������ ������ ���� ����
-> �پ��� ������ ���ܿ� ���ؼ� ó���� �� ����, ��� ���ܿ� ���� ó������� �� ������ �� ���
-> ������ ������ ��Ȯ�ϰ� �� �� ����
-> ��Ƽ catch ��, �ڹ� 7�������� ����
4. try ~ catch(Exception e)
-> catch �ȿ� Exception�� ����ϸ� ��� �ڽ� ���ܵ��� ó���� �� ���� 
-> ��� ���ܸ� ó�� �� �� ������, ��Ȯ�ϰ� � ���ܰ� �߻��ߴ����� ���ؼ��� �� �� ����
5. try ~ catch(�ڽ�) ~ catch(�ڽ�) ~ ... ~ catch(Exception) // ������ catch�ȿ� Exception ����

6. try ~ catch ~ finally
*����*
try { 

// ���ܹ߻��� ���ɼ��� �ִ� ����
 
} catch(Exception1 e1) {

 //Exception1�� �߻����� ���, �̸� ó���ϱ� ���� �������´�.

 //���� �̰��� ���ܸ޼����� ����ϰ� �α׷� ����.
  
} catch(ExceptionN eN) {

 //ExceptionN�� �߻����� ���, �̸� ó���ϱ� ���� �������´�.
  
} finally {

 //���ܹ߻����ο� ������� �׻�, �ݵ�� ����Ǿ�� �ϴ� �������´�.
  
} 

*/
public class ExceptionTest02 {
	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40, 50};
		int tot = 0;
		
		try {
			for(int i=0; i<=a.length; i++) { // ���� �߻�
				System.out.println("a[" + i + "] = " + a[i]);
				tot += a[i];
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		System.out.println("�հ� : " + tot);
		
		System.out.println("�Ʒ����� �л����� ������ ���� ó���� �ϰ� �ֽ��ϴ�.");
		// ...
		
	}

}
