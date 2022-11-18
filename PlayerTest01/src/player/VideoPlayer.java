package player;

public class VideoPlayer implements Player {
	private static int count = 0; // static 변수 -> 한 번만 만들어진다, 공유한다
	private int id;
	
	public VideoPlayer() {
		id = ++count;
	}
	
	public int getid() {
		return id;
	}
	
	public void printInfo() {
		System.out.println("비디오 일련번호 : " + id);
	}
	
	@Override
	public void play() {
		System.out.println("■ 비디오 재생 시작 ■");
	}
	
	@Override
	public void stop() {
		System.out.println("■ 비디오 재생 중지 ■");
	}
}
