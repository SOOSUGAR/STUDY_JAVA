package test;

import player.PortablePlayer;
import player.Skinnable;

// ����) PortablePlayer Ŭ���� �ν��Ͻ��� �����Ͽ� �÷��̾��� ����� Ȯ���Ͻÿ�.
public class PlayerTest02 {
	public static void main(String[] args) {
		PortablePlayer p = new PortablePlayer();
		
		p.play();
		p.stop();
		//p.changeSkin(1);
		p.changeSkin(Skinnable.LEOPARD);
		
		
	}

}
