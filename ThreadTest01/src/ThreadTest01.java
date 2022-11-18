
// 1. 쓰레드 생성 방법 1
class MyThread1 extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++ ) {
			System.out.println(this.getName());
		}
	}
}

// 2. 쓰레드 생성 방법 2번 - Runnalbe 인터페이스를 구현하는 방법, 많이 사용
class MyThread2 implements Runnable {
	
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}


public class ThreadTest01 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		//t1.run();
		t1.start();
		
		Thread t2 = new Thread(new MyThread2());
		t2.start();
		
	}

}
