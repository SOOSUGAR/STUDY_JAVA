package test;

import pet.Pet;
import pet.RobotPet;

public class PetTest02 {
	public static void main(String[] args) {
		Pet[] pets = new Pet[4];
		pets[0] = new Pet("����", "�쿵��");
		pets[1] = new RobotPet("��ũ", "���׶��");
		pets[2] = new Pet("����", "����ȣ");
		pets[3] = new RobotPet("ȣ��", "����");
		/*
		Pet[] pets = new Pet[] {
				new Pet("����", "�쿵��"),
				new RobotPet("��ũ", "���׶��"),
				new Pet("����", "����ȣ"),
				new RobotPet("ȣ��", "����")
		};
		*/
		
		// �� ���� for���� ����Ͽ� �������� �����Ͻÿ�.
		/*
		for(int i = 1; i<pets.length; i++) {
			pets[i].introduce();
			// pet[i]�� RobotPet���� �����Ѵٸ� true, �ƴ϶�� false
			// pet[i]�� RobotPet���� �ν��Ͻ��̸� true, �ƴ϶�� false
			if(pets[i] instanceof RobotPet) {
				((RobotPet)pets[i]).work(1);
			}
			System.out.println();
		}
		*/
		
		
		for(Pet a : pets) {
			a.introduce();
			if(a instanceof RobotPet) {
				((RobotPet)a).work(2); // RobotPet������ ĳ���� -> work�� ���� ����
			}
			System.out.println();
		}
		
		
		/*
		Pet navi = new Pet("����", "�쿵��");
		RobotPet mark = new RobotPet("��ũ", "���׶��");
		
		mark.introduce();
		System.out.println();
		navi.introduce();
		*/
		
	}

}
