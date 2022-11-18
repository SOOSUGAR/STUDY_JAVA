package test;

import animal.Animal;
import animal.Dog;
import animal.Cat;

// 문제) Cat과 Dog의 인스턴스를 각 2개씩 생성하여, 다형성을 구현하여 출력하시오.
public class AnimalTest01 {
	public static void main(String[] args) {
		// Animal a = new Animal(); // 추상 클래스는 인스턴스를 생성할 수 없다
		// 추상 클래스의 배열은 가능 -> 자식 클래스의 인스턴스를 담아 다형성을 구현할 목적
		// 배열 1번
		Animal[] animals = new Animal[4];
		animals[0] = new Cat("토란", 1);
		animals[1] = new Dog("쫑", "포메라니안");
		animals[2] = new Cat("우엉", 8);
		animals[3] = new Dog("왕자", "진도");
		
		/* 배열 2번
		Animal[] animals = new Animal[] {
				new Cat("토란", 1),
				new Dog("쫑", "포메라니안"),
				new Cat("우엉", 8),
				new Dog("왕자", "진도")
		};
		*/
		
		// 출력 1번
		/*
		for(int i = 1; i<animals.length; i++) {
			animals[i].introduce();
			//System.out.println(animals[i].toString());
			//animals[i].bark();
			System.out.println();
		}
		*/
		
		// 출력 2번
		for(Animal a : animals) {
			if(a instanceof Dog) {
				((Dog)a).introduce(); // RobotPet형으로 캐스팅 -> work를 쓰기 위해
			} else if(a instanceof Cat) {
				((Cat)a).introduce();
			} 
			System.out.println();
		}
		
		
		/*
		Dog dogs = new Dog("쫑", "포메라니안");
		System.out.println(dogs.toString());
		
		Cat cats = new Cat("우엉", 8);
		System.out.println(cats.toString());
		*/
		
	}

}
