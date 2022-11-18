package player;

public class CDPlayer implements Player {
	
	@Override
	public void play() {
		System.out.println("◎ CD 플레이어 재생 ◎");
	}
	
	@Override
	public void stop() {
		System.out.println("◎ CD 플레이어 정지 ◎");
	}
	
	public void clean() {
		System.out.println("◎ CD 플레이의 렌즈를 청소합니다 ◎");
	}
	
	
}
