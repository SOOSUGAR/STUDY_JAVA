package player;

public class VideoPlayer implements Player {
	private static int count = 0; // static ���� -> �� ���� ���������, �����Ѵ�
	private int id;
	
	public VideoPlayer() {
		id = ++count;
	}
	
	public int getid() {
		return id;
	}
	
	public void printInfo() {
		System.out.println("���� �Ϸù�ȣ : " + id);
	}
	
	@Override
	public void play() {
		System.out.println("�� ���� ��� ���� ��");
	}
	
	@Override
	public void stop() {
		System.out.println("�� ���� ��� ���� ��");
	}
}
