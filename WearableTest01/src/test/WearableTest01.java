package test;

import wearable.Color;
import wearable.Wearable;
import wearable.WearableComputer;
import wearable.WearableRobot;

// 문제 1) Wearable 인터페이스를 구현한 클래스 2개의 인스턴스를 각각 2개씩 생성하고 다형성을 구현하여 출력하시오. 
// 문제 2) WearableRobot의 인스턴스는 자신의 기능을 구현하도록 하시오.
public class WearableTest01 {
	public static void main(String[] args) {
		// 인스턴스 배열 1번
		/*
		Wearable[] wearables = new Wearable[4];
				wearables[0] = new WearableRobot(Color.RED);
				wearables[1] = new WearableComputer("우엉");
				wearables[2] = new WearableRobot(Color.BLACK);
				wearables[3] = new WearableComputer("토란");
		*/
		
		// 인스턴스 배열 2번
		Wearable[] wearables = new Wearable[] {
				new WearableRobot(1),
				new WearableComputer("우엉"),
				new WearableRobot(3),
				new WearableComputer("토란"),
		};
		
		
		
		// 출력 1번  - 기본 for문
		for(int i = 0; i< wearables.length ; i++) {
			wearables[i].putOn();
			wearables[i].putOff();
			if(wearables[i] instanceof Color) {
				((Color)wearables[i]).changeColor(Color.WHITE);
			}
			System.out.println();
		}
		
		/*
		// 출력 2번 - 확장 for문	
		for(Wearable w : wearables) {
			w.putOn();
			w.putOff();
			if(w instanceof Color) {
				((WearableRobot)w).changeColor(Color.BLACK);;
		}
		*/
	}

}
