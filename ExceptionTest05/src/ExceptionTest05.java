
// ���� 3)
// NullPointException : null���� ������� �����ڷ� ����Ϸ�ExceptionTest05�� �� �߻��ϴ� ����
// ������ ���� ���� �߻��ϴ� ����, �߰߰� ó���� ��ٷο�
public class ExceptionTest05 {
	public static void main(String[] args) {
		String data = null;
		
		try {
			System.out.println(data.toString());
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		System.out.println("ó���ؾ� �ϴ� �����Ͱ� �ϴܿ� ����...");
		
	}

}
