package wearable;

public class WearableRobot implements Wearable, Color{
	private int color;
	
	public WearableRobot(int color) {
		this.color = color;
	}
	
	@Override
	public void putOn() {
		System.out.println(toString() + " 장착 !!");
	}
	
	@Override
	public void putOff() {
		System.out.println(toString() + " 탈착 !!");
	}
	
	@Override
	public void changeColor(int color) {
		this.color = color;
		System.out.println(toString() + "으로 변신");
	}
	
	public String toString() {
		switch(color) {
		case RED : return "빨강 로봇";
		case GREEN : return "초록 로봇";
		case BLUE : return "파랑 로봇";
		case BLACK : return "검정 로봇";
		case WHITE : return "하양 로봇";
		default : return "깡통 로봇"; // toString - > 디폴트값이 꼭  있어야함 !
		}
	}
	
}
