package test;

import shape.HorizontalLine;
import shape.Point;
import shape.Rectangle;
import shape.VerticalLine;
import shape.Shape;

// 문제) Shape 클래스로부터 상속받은 자식 클래스 4개의 인스턴스를 생성하고, 다형성을 구현하여 출력하시오.
public class ShapeTest01 {
	public static void main(String[] args) {
		// 인스턴스 배열 1열
		/*
		Shape[] shape = new Shape[4];
		shape[0] = new Point();
		shape[1] = new Rectangle(7, 5);
		shape[2] = new HorizontalLine(9);
		shape[3] = new VerticalLine(6);
		*/

		// 인스턴스 배열 2번
		Shape[] shape = new Shape[] {
			new Point(),
			new Rectangle(7, 5),
			new HorizontalLine(9),
			new VerticalLine(6),
		};
		
		// 출력 1번 - 기본 for문
		for(int i = 1 ; i<shape.length; i++) {
			shape[i].print();
			System.out.println();
		}
		
		// 출력 2번 - 확장 for문
		for(Shape a : shape) {
			a.print();
			System.out.println();
		}
		
	}

}
