package pet;

// 로봇 애완동물 클래스
// Pet으로부터 상속받는 자식 클래스
public class RobotPet extends Pet{
	
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	
	// 오버라이딩
	public void introduce() {
		System.out.println("◎저는 로봇입니다. 이름은 " + getName() + "입니다.");
		System.out.println("◎주인님은 " + getMasterName() + "입니다.");
	}
	
	public void work(int w) {
		switch(w) {
			case 1:
				System.out.println("청소를 합니다.");
				break;
			case 2:
				System.out.println("빨래를 합니다.");
				break;
			case 3:
				System.out.println("식사를 준비합니다");
				break;
		}
	}
	
	
	
}
