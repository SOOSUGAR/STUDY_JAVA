package pet;

// �κ� �ֿϵ��� Ŭ����
// Pet���κ��� ��ӹ޴� �ڽ� Ŭ����
public class RobotPet extends Pet{
	
	public RobotPet(String name, String masterName) {
		super(name, masterName);
	}
	
	// �������̵�
	public void introduce() {
		System.out.println("������ �κ��Դϴ�. �̸��� " + getName() + "�Դϴ�.");
		System.out.println("�����δ��� " + getMasterName() + "�Դϴ�.");
	}
	
	public void work(int w) {
		switch(w) {
			case 1:
				System.out.println("û�Ҹ� �մϴ�.");
				break;
			case 2:
				System.out.println("������ �մϴ�.");
				break;
			case 3:
				System.out.println("�Ļ縦 �غ��մϴ�");
				break;
		}
	}
	
	
	
}
