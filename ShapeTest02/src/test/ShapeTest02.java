package test;

import shape.HorizontalLine;
import shape.Point;
import shape.Rectangle;
import shape.Shape;
import shape.VerticalLine;
import shape.Parallelogram;
import shape.Plane2D;

/*
문제) 
1. 인터페이스 Plane2D를 생성하고, 면적을 계산하는 메소드 getArea()//추상메소드, 반환값 가로*세로 int//를 추가하시오.
2. Rectangle 클래스는 Plane2D 인터페이스를 구현하도록 설정하시오.
3. Parallelogram(평행사변형) 클래스를 생성하고, Shape를 상속하여 Plane2D를 구현하도록 설정하시오.
4. main() 메소드에서 5개의 인스턴스 배열을 생성하여 다형성을 구현하고 출력하시오.
5. 면적을 구할 수 있는 인스턴스는 면적(area)을 함께 출력하도록 하시오. 

*/

public class ShapeTest02 {
	public static void main(String[] args) {
		Shape[] shape = new Shape[] {
				new Point(),
				new Rectangle(7, 5),
				new HorizontalLine(9),
				new VerticalLine(6),
				new Parallelogram(7, 5)
			};
		
		/*
		for(int i = 0 ; i<shape.length; i++) {
			shape[i].print();
			if(shape[i] instanceof Plane2D) {
				System.out.println("Area : " + ((Plane2D)shape[i]).getArea());
			}
			System.out.println();
		}
		*/
		
		for(Shape a : shape) {
			a.print();
			System.out.println();
			System.out.println("Area : " + ((Plane2D)a).getArea());
		}
		
		
	}

}
