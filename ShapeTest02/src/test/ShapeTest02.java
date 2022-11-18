package test;

import shape.HorizontalLine;
import shape.Point;
import shape.Rectangle;
import shape.Shape;
import shape.VerticalLine;
import shape.Parallelogram;
import shape.Plane2D;

/*
����) 
1. �������̽� Plane2D�� �����ϰ�, ������ ����ϴ� �޼ҵ� getArea()//�߻�޼ҵ�, ��ȯ�� ����*���� int//�� �߰��Ͻÿ�.
2. Rectangle Ŭ������ Plane2D �������̽��� �����ϵ��� �����Ͻÿ�.
3. Parallelogram(����纯��) Ŭ������ �����ϰ�, Shape�� ����Ͽ� Plane2D�� �����ϵ��� �����Ͻÿ�.
4. main() �޼ҵ忡�� 5���� �ν��Ͻ� �迭�� �����Ͽ� �������� �����ϰ� ����Ͻÿ�.
5. ������ ���� �� �ִ� �ν��Ͻ��� ����(area)�� �Բ� ����ϵ��� �Ͻÿ�. 

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
