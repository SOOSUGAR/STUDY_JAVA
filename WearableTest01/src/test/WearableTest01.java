package test;

import wearable.Color;
import wearable.Wearable;
import wearable.WearableComputer;
import wearable.WearableRobot;

// ���� 1) Wearable �������̽��� ������ Ŭ���� 2���� �ν��Ͻ��� ���� 2���� �����ϰ� �������� �����Ͽ� ����Ͻÿ�. 
// ���� 2) WearableRobot�� �ν��Ͻ��� �ڽ��� ����� �����ϵ��� �Ͻÿ�.
public class WearableTest01 {
	public static void main(String[] args) {
		// �ν��Ͻ� �迭 1��
		/*
		Wearable[] wearables = new Wearable[4];
				wearables[0] = new WearableRobot(Color.RED);
				wearables[1] = new WearableComputer("���");
				wearables[2] = new WearableRobot(Color.BLACK);
				wearables[3] = new WearableComputer("���");
		*/
		
		// �ν��Ͻ� �迭 2��
		Wearable[] wearables = new Wearable[] {
				new WearableRobot(1),
				new WearableComputer("���"),
				new WearableRobot(3),
				new WearableComputer("���"),
		};
		
		
		
		// ��� 1��  - �⺻ for��
		for(int i = 0; i< wearables.length ; i++) {
			wearables[i].putOn();
			wearables[i].putOff();
			if(wearables[i] instanceof Color) {
				((Color)wearables[i]).changeColor(Color.WHITE);
			}
			System.out.println();
		}
		
		/*
		// ��� 2�� - Ȯ�� for��	
		for(Wearable w : wearables) {
			w.putOn();
			w.putOff();
			if(w instanceof Color) {
				((WearableRobot)w).changeColor(Color.BLACK);;
		}
		*/
	}

}
