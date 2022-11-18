package test;

import pet.Pet;
import pet.RobotPet;
// -> import pet.*

public class PetTest01 {
	public static void main(String[] args) {
		Pet happy = new Pet("해피", "우영우");
		RobotPet mark = new RobotPet("마크", "이준호");
		
		happy.introduce();
		System.out.println();
		mark.introduce();
		System.out.println();
		
		/*
		Pet p1;
		p1 = happy;
		p1 = mark; 	// 가능 - 부모의 참조 변수는 자식의 인스턴스를 참조할 수 있다. -> 다형성 구현
		
		RobotPet p2;
		p2 = happy; // 불가능 - 자식의 참조 변수는 부모의 인스턴르르 참조할 수 없다.
		p2 = mark;
		*/
		
		// 동적 바인딩 - Pet형의 introduce를 출력하는 것이 아니라, 
		// Pet형인 navi가 참조하는 실체인 RobotPet형의 introduce()를 출력 
		Pet navi = mark; // navi(부모) = mark(자식)
		navi.introduce(); // 누구?, 동적 바인딩 
		
		
	}

}
