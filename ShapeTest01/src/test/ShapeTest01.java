package test;

import shape.HorizontalLine;
import shape.Point;
import shape.Rectangle;
import shape.VerticalLine;
import shape.Shape;

// ����) Shape Ŭ�����κ��� ��ӹ��� �ڽ� Ŭ���� 4���� �ν��Ͻ��� �����ϰ�, �������� �����Ͽ� ����Ͻÿ�.
public class ShapeTest01 {
	public static void main(String[] args) {
		// �ν��Ͻ� �迭 1��
		/*
		Shape[] shape = new Shape[4];
		shape[0] = new Point();
		shape[1] = new Rectangle(7, 5);
		shape[2] = new HorizontalLine(9);
		shape[3] = new VerticalLine(6);
		*/

		// �ν��Ͻ� �迭 2��
		Shape[] shape = new Shape[] {
			new Point(),
			new Rectangle(7, 5),
			new HorizontalLine(9),
			new VerticalLine(6),
		};
		
		// ��� 1�� - �⺻ for��
		for(int i = 1 ; i<shape.length; i++) {
			shape[i].print();
			System.out.println();
		}
		
		// ��� 2�� - Ȯ�� for��
		for(Shape a : shape) {
			a.print();
			System.out.println();
		}
		
	}

}
