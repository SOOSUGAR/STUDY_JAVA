package test;

import pet.Pet;
import pet.RobotPet;

public class PetTest02 {
	public static void main(String[] args) {
		Pet[] pets = new Pet[4];
		pets[0] = new Pet("나비", "우영우");
		pets[1] = new RobotPet("마크", "동그라미");
		pets[2] = new Pet("벌이", "이준호");
		pets[3] = new RobotPet("호이", "정명석");
		/*
		Pet[] pets = new Pet[] {
				new Pet("나비", "우영우"),
				new RobotPet("마크", "동그라미"),
				new Pet("벌이", "이준호"),
				new RobotPet("호이", "정명석")
		};
		*/
		
		// 두 가지 for문을 사용하여 다형성을 구현하시오.
		/*
		for(int i = 1; i<pets.length; i++) {
			pets[i].introduce();
			// pet[i]가 RobotPet형을 참조한다면 true, 아니라면 false
			// pet[i]가 RobotPet형의 인스턴스이면 true, 아니라면 false
			if(pets[i] instanceof RobotPet) {
				((RobotPet)pets[i]).work(1);
			}
			System.out.println();
		}
		*/
		
		
		for(Pet a : pets) {
			a.introduce();
			if(a instanceof RobotPet) {
				((RobotPet)a).work(2); // RobotPet형으로 캐스팅 -> work를 쓰기 위해
			}
			System.out.println();
		}
		
		
		/*
		Pet navi = new Pet("나비", "우영우");
		RobotPet mark = new RobotPet("마크", "동그라미");
		
		mark.introduce();
		System.out.println();
		navi.introduce();
		*/
		
	}

}
