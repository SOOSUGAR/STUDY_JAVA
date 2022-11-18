package test;

import animal.Animal;
import animal.Dog;
import animal.Cat;

// ����) Cat�� Dog�� �ν��Ͻ��� �� 2���� �����Ͽ�, �������� �����Ͽ� ����Ͻÿ�.
public class AnimalTest01 {
	public static void main(String[] args) {
		// Animal a = new Animal(); // �߻� Ŭ������ �ν��Ͻ��� ������ �� ����
		// �߻� Ŭ������ �迭�� ���� -> �ڽ� Ŭ������ �ν��Ͻ��� ��� �������� ������ ����
		// �迭 1��
		Animal[] animals = new Animal[4];
		animals[0] = new Cat("���", 1);
		animals[1] = new Dog("��", "���޶�Ͼ�");
		animals[2] = new Cat("���", 8);
		animals[3] = new Dog("����", "����");
		
		/* �迭 2��
		Animal[] animals = new Animal[] {
				new Cat("���", 1),
				new Dog("��", "���޶�Ͼ�"),
				new Cat("���", 8),
				new Dog("����", "����")
		};
		*/
		
		// ��� 1��
		/*
		for(int i = 1; i<animals.length; i++) {
			animals[i].introduce();
			//System.out.println(animals[i].toString());
			//animals[i].bark();
			System.out.println();
		}
		*/
		
		// ��� 2��
		for(Animal a : animals) {
			if(a instanceof Dog) {
				((Dog)a).introduce(); // RobotPet������ ĳ���� -> work�� ���� ����
			} else if(a instanceof Cat) {
				((Cat)a).introduce();
			} 
			System.out.println();
		}
		
		
		/*
		Dog dogs = new Dog("��", "���޶�Ͼ�");
		System.out.println(dogs.toString());
		
		Cat cats = new Cat("���", 8);
		System.out.println(cats.toString());
		*/
		
	}

}
