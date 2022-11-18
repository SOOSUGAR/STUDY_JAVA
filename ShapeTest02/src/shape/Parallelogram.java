package shape;

public class Parallelogram extends AbstractPolygon {
	
	public Parallelogram(int width, int height) {
		super(width, height);
	}
	
	@Override
	public void draw() {
		for(int i = 0; i < getHeight() ; i++) {
			for(int j = 0; j < getHeight()-i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < getWidth(); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		return "Parallelogram (width : " + getWidth() + ", height : " + getHeight() + ")";
	}
	
	@Override
	public int getArea() {
		return getWidth() * getHeight();
	}
	
}
