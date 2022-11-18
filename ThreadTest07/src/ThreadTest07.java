
// 공유 프린터
class SharePrinter {
	
	// 임계 영역 (critical section) -> 동기화된 영역으로 변경(synchronized section)
	// 방법 1 -> 메소드 전체를 동기화된 영역으로 설정
	/*
	public synchronized void print(String text) {
		for(int i=0; i<text.length(); i++) {
			System.out.print(text.charAt(i));
			Thread.yield(); // 공유자원을 양보
		}
		System.out.println();
	}
	*/
	
	// 방법 2 -> 메소드에서 동기화가 필요한 특정 영역만을 동기화 설정
	public void print(String text) {
		
		synchronized(this) {
			for(int i=0; i<text.length(); i++) {
				System.out.print(text.charAt(i));
				Thread.yield(); // 공유자원을 양보
			}
			System.out.println();
		}
	}
	
}

// 회사 사원 쓰레드
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
				"동해물과 백두산이 마르고 닳도록",
				"하느님이 보우하사 우리나라 만세",
				"무궁화 삼천리 화려강산",
				"대한 사람 대한으로 길이 보전하세",
				"남산 위에 저 소나무 철갑을 두른듯",
				"바람서리 불변함은 우리 기상일세",
				"무궁화 삼천리 화려강산",
				"대한 사람 대한으로 길이 보전하세",
		};
		
		WorkerThread worker1 = new WorkerThread(p, eng);
		WorkerThread worker2 = new WorkerThread(p, kor);
		
		worker1.start();
		worker2.start();
		
	}

}
