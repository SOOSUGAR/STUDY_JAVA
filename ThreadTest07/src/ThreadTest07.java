
// ���� ������
class SharePrinter {
	
	// �Ӱ� ���� (critical section) -> ����ȭ�� �������� ����(synchronized section)
	// ��� 1 -> �޼ҵ� ��ü�� ����ȭ�� �������� ����
	/*
	public synchronized void print(String text) {
		for(int i=0; i<text.length(); i++) {
			System.out.print(text.charAt(i));
			Thread.yield(); // �����ڿ��� �纸
		}
		System.out.println();
	}
	*/
	
	// ��� 2 -> �޼ҵ忡�� ����ȭ�� �ʿ��� Ư�� �������� ����ȭ ����
	public void print(String text) {
		
		synchronized(this) {
			for(int i=0; i<text.length(); i++) {
				System.out.print(text.charAt(i));
				Thread.yield(); // �����ڿ��� �纸
			}
			System.out.println();
		}
	}
	
}

// ȸ�� ��� ������
class WorkerThread extends Thread {
	private SharePrinter p;
	private String[] text;
	
	public WorkerThread(SharePrinter p, String[] text) {
		this.p = p;
		this.text = text;
	}
	
	@Override
	public void run() {
		for(int i=0; i<text.length; i++	) {
			p.print(text[i]);
		}
	}
	
}

public class ThreadTest07 {
	public static void main(String[] args) {
		SharePrinter p = new SharePrinter();
		
		String[] eng = {
				"The falling leave drift by the window",
				"the autume leaves of red and gold",
				"I see your lips, the summer kisses",
				"The sunburned hand I used to hold",
				"Since you went away the days grow long",
				"And soon I'll hear old winter's song",
				"But I miss you most of all, my darling",
				"When autum leaves start to fall",
		};
		
		String[] kor = {
				"���ع��� ��λ��� ������ �⵵��",
				"�ϴ����� �����ϻ� �츮���� ����",
				"����ȭ ��õ�� ȭ������",
				"���� ��� �������� ���� �����ϼ�",
				"���� ���� �� �ҳ��� ö���� �θ���",
				"�ٶ����� �Һ����� �츮 ����ϼ�",
				"����ȭ ��õ�� ȭ������",
				"���� ��� �������� ���� �����ϼ�",
		};
		
		WorkerThread worker1 = new WorkerThread(p, eng);
		WorkerThread worker2 = new WorkerThread(p, kor);
		
		worker1.start();
		worker2.start();
		
	}

}
