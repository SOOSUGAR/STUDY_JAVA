import java.util.Stack;

/*
< Stack(����) >
- ���� ���� �ִ� ��ó�� ���� ������ ����
- �������� ����, FILO(First in Last Out)
- push : ������ ����
- pop : ������ ����
*/
public class StackTest01 {
	public static void main(String[] args) {
		// ���� ����
		Stack<Integer> st1 = new Stack<Integer>();
		System.out.println(st1);
		
		// ������ ����
		st1.push(10); st1.push(20); st1.push(30); st1.push(40); st1.push(50);
		System.out.println(st1);
		
		// ������ ����
		while(!st1.isEmpty()) { // turn(����ٸ�), false(�����ʾҴٸ�)�� ��ȯ -> ! �����ؼ� �ݴ�� ����
			System.out.println(st1.pop()); // �������� ���� �ͺ��� �����
		}
		
		System.out.println(st1); // ��� �����߱� ������ ���� ���� ����
		System.out.println("��������������������������������������������������������");
		
		// ���� ����
		Stack<String> st2 = new Stack<String>();
		System.out.println(st2);
		
		// ������ ����
		st2.push("�쿵��"); st2.push("�ּ���"); st2.push("����"); st2.push("����ȣ"); st2.push("�ǹο�");
		System.out.println(st2);
		
		// ������ ����
		while(!st2.isEmpty()) {
			System.out.println(st2.pop());
		}
		
		System.out.println(st2);
		
	}

}
