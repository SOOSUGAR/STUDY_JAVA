
class MyThread1 extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("-"));
			if(i%50 == 0) System.out.println();
			for(int j=0; j<10000000; j++);
		}
	}
}

class MyThread2 extends Thread{
	
	@Override
	public void run() {
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("|"));
			if(i%50 == 0) System.out.println();
			for(int j=0; j<10000000; j++);
		}
	}
}

public class ThreadTest05 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		
		System.out.println("t1(-) : " + t1.getName());
		System.out.println("t2(|) : " + t2.getName());
		
		// 우선순위 변경
		t1.setPriority(10);
		t2.setPriority(1);
		
		System.out.println("t1 우선순위 : " + t1.getPriority());
		System.out.println("t2 우선순위 : " + t2.getPriority());
		
		t1.start();
		t2.start();
		
	}

}
