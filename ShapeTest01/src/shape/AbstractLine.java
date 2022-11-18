package shape;

public abstract class AbstractLine extends Shape {
	private int length;
	
	public AbstractLine(int length) {
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	
	public void seatLength(int length) {
		this.length = length;
	}
	
}
