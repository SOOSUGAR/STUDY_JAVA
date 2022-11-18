package player;

public class DVDPlayer implements ExtendedPlayer {

	@Override
	public void play() {
		System.out.println("● DVD 플레이어 재생 ───");
	}

	@Override
	public void stop() {
		System.out.println("● DVD 플레이어 중지 ───");
	}

	@Override
	public void showFast() {
		System.out.println("● DVD 2배속 재생 ───");
	}

	@Override
	public void showSlow() {
		System.out.println("● DVD 0.5배속 재생 ───");
	}
	
}
