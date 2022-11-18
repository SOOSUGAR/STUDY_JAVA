package test;

import player.CDPlayer;
import player.VideoPlayer;
import player.Player;

// ����) Player �������̽��� ������ Ŭ���� 2���� �ν��Ͻ��� ���� 2���� �����Ͽ�, �������� �����ϰ� ����Ͻÿ�.
// �� Ŭ�������� ��ɵ� ����ϵ��� �Ͻÿ�.
public class PlayerTest01 {
	public static void main(String[] args) {
		/*
		// �ν��Ͻ� �迭 1��
		Player[] p = new Player[4];
		p[0] = new CDPlayer();
		p[1] = new VideoPlayer();
		p[2] = new CDPlayer();
		p[4] = new VideoPlayer();
		*/
		
		// �ν��Ͻ� �迭 2��
		Player[] p = new Player[] {
				new CDPlayer(),
				new VideoPlayer(),
				new CDPlayer(),
				new VideoPlayer()
		};
		
		// ��� 1
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
		
		// ��� 2
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
