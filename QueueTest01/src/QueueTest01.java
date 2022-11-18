import java.util.LinkedList;
import java.util.Queue;

/*
< Queue(ť) >
- �� ��������  �����Ͱ� �̵��ϴ� ������ó�� ���� ���� ����
- ���Լ���, FIFO(First In First Out)
- offer : ������ ����
- poll : ������ ����
*/
public class QueueTest01 {
	public static void main(String[] args) {
		// ť ����
		Queue<Integer> q1 = new LinkedList<Integer>();
		
		// ������ �ֱ�
		q1.offer(10); q1.offer(20); q1.offer(30); q1.offer(40); q1.offer(50);
		System.out.println(q1);
		
		// ������ ������
		while(!q1.isEmpty()) {
			System.out.println(q1.poll());
		}
		System.out.println(q1);
		System.out.println("��������������������������������������������������������");
		
		// ť ����
		Queue<String> q2 = new LinkedList<String>();
		
		// ������ �ֱ�
		q2.offer("�쿵��"); q2.offer("�ּ���"); q2.offer("����"); q2.offer("����ȣ"); q2.offer("�ǹο�");
		
		// ������ ������
		while(!q2.isEmpty()) {
			System.out.println(q2.poll());
		}
		System.out.println(q2);
		System.out.println("��������������������������������������������������������");
		
		
	}

}
