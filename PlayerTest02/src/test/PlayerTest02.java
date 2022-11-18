package test;

import player.PortablePlayer;
import player.Skinnable;

// 문제) PortablePlayer 클래스 인스턴스를 생성하여 플레이어의 기능을 확인하시오.
public class PlayerTest02 {
	public static void main(String[] args) {
		PortablePlayer p = new PortablePlayer();
		
		p.play();
		p.stop();
		//p.changeSkin(1);
		p.changeSkin(Skinnable.LEOPARD);
		
		
	}

}
