package player;

public class CDPlayer implements Player {
	
	@Override
	public void play() {
		System.out.println("�� CD �÷��̾� ��� ��");
	}
	
	@Override
	public void stop() {
		System.out.println("�� CD �÷��̾� ���� ��");
	}
	
	public void clean() {
		System.out.println("�� CD �÷����� ��� û���մϴ� ��");
	}
	
	
}
