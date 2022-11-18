package test;

import player.CDPlayer;
import player.VideoPlayer;
import player.Player;

// 문제) Player 인터페이스를 구현한 클래스 2개의 인스턴스를 각각 2개씩 생성하여, 다형성을 구현하고 출력하시오.
// 각 클래스만의 기능도 출력하도록 하시오.
public class PlayerTest01 {
	public static void main(String[] args) {
		/*
		// 인스턴스 배열 1번
		Player[] p = new Player[4];
		p[0] = new CDPlayer();
		p[1] = new VideoPlayer();
		p[2] = new CDPlayer();
		p[4] = new VideoPlayer();
		*/
		
		// 인스턴스 배열 2번
		Player[] p = new Player[] {
				new CDPlayer(),
				new VideoPlayer(),
				new CDPlayer(),
				new VideoPlayer()
		};
		
		// 출력 1
		for(int i = 1; i<p.length; i++) {
			p[i].play();
			p[i].stop();
			if(p[i] instanceof CDPlayer) {
				((CDPlayer)p[i]).clean();
			} else if(p[i] instanceof VideoPlayer) {
				((VideoPlayer)p[i]).printInfo();
			}
			System.out.println();
		}
		
		// 출력 2
		for(Player a : p) {
			a.play();
			a.stop();
			if(a instanceof CDPlayer) {
				((CDPlayer)a).clean();
			} else if(a instanceof VideoPlayer) {
				((VideoPlayer)a).printInfo();
			}
			System.out.println();
		}
		
		
	}

}
