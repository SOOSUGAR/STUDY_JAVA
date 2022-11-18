package pet;

public class RobotPet extends Pet {
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	
	/*
	< 애노테이션(Annotation) >
	1. 메소드 위(앞)에 @기호를 붙여서 적어두는 것 
	2. 컴파일러에게 알리는 주석
	
	< Override 애노테이션 >
	1. 아래의 메소드가 오버라이딩한 메소드임을 알려주는 애노테이션
	2. 오버라이딩을 잘못 하는 경우를 방지할 수 있는 방법
	*/
	// 오버라이딩
	@Override // @ -> 컴파일러에서 알려주는 주석, 부모의 인스턴스를 참조했다는 증명
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
