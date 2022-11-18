import java.util.Iterator;
import java.util.LinkedList;

/*
���� ) 
1. Point Ŭ������ ��� LinkedList�� list�� �����Ͻÿ�.
2. ����Ʈ�� Point Ŭ������ �ν��Ͻ��� 10�� �����ϰ� Ȯ���Ͻÿ�.
- 10���� 10�� �����Ͽ� 100������ ���� ���� x, y ��ǥ������ �����Ͻÿ�.
3. ����Ʈ�� (10, 10) ������ �ڿ� (11, 11)�� �߰��ϰ� Ȯ���Ͻÿ�.
4. ����Ʈ���� (40, 40)�����͸� �����ϰ� Ȯ���Ͻÿ�.
5. ����Ʈ���� (50, 50) �����͸� (55, 55)�� �����ϰ� Ȯ���Ͻÿ�.
6. ����Ʈ �� ���� (1, 1) �����͸� �߰��ϰ� Ȯ���Ͻÿ�.
7. ����Ʈ�� ��� �����͸� 3���� ������� ����Ͻÿ�. (�⺻/Ȯ�� for��, Iterator)
*/
class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// getter
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	// setter
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + ")" + "," + "(" + y + ")";
	}
	
	// Point �ν��Ͻ��� ���� ���ϴ� �޼ҵ�
	public boolean compare(Point p) {
		return this.x == p.x && this.y == p.y;
	}
	
}

public class LinkedListTest02 {
	public static void main(String[] args) {
		// 1. LinkedList�� list�� ����
		LinkedList<Point> list = new LinkedList<Point>();
		
		// 2. ����Ʈ�� Point Ŭ������ �ν��Ͻ��� 10�� ����(10���� 10�� �����Ͽ� 100������ ���� ���� x, y ��ǥ��)
		System.out.println("�ǡաաաաաաաա�LinkedList�աաաաաաաազ�");
		
		
		for(int i = 1; i <= 10; i++) {
			list.add(new Point(10 * i, 10 * i));
		}
		System.out.println(list);
		System.out.println("��������������������������������������������������������");
		
		// 3. ����Ʈ�� (10, 10) ������ �ڿ� (11, 11)�� �߰�
		list.add(1, new Point(11, 11));
		/*
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getX() == 10 && list.get(i).getY() == 10) {
				list.add(i, new Point(11, 11));
			}
		}
		// compare() �޼ҵ� Ȱ��
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).compare(new Point(10, 10))) {
				list.add(i, new Point(11, 11));
			}
		}
		*/
		System.out.println(list);
		System.out.println("��������������������������������������������������������");
		
		// 4. ����Ʈ���� (40, 40)�����͸� ����
		list.remove(4);
		/*
		for(int i = list.size()-1; i >= 0 ; i--) {
			if(list.get(i).getX() == 40 && list.get(i).getY() == 40 ) {
				list.remove(i);
			}
		}
		
		for(int i = list.size()-1; i >= 0 ; i--) {
			if(list.get(i).compare(new Point(40, 40) {
				list.remove(i);
			}
		}
		*/
		System.out.println(list);
		System.out.println("��������������������������������������������������������");
		
		// 5. ����Ʈ���� (50, 50) �����͸� (55, 55)�� ����
		list.set(4, new Point(55, 55));
		/*
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getX() == 55 && list.get(i).getY() == 55) {
				list.set(i, new Point(55, 55));
			}
		}
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).compare(new Point 50, 50)) {
				list.set(i, new Point(55, 55));
			}
		}		
		*/
		System.out.println(list);
		System.out.println("��������������������������������������������������������");
		
		// 6. ����Ʈ �� ���� (1, 1) �����͸� �߰�
		list.addFirst(new Point(1, 1));
		System.out.println(list);
		System.out.println("��������������������������������������������������������");
		
		// 7. ����Ʈ�� ��� �����͸� 3���� ������� ���
		System.out.println("-ù ��° ��� : �⺻ for��-");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("��������������������������������������������������������");
		
		System.out.println("-�� ��° ��� : Ȯ�� for��-");
		for(Point i : list) {
			System.out.println(i);
		}
		System.out.println("��������������������������������������������������������");
		
		System.out.println("-�� ��° ��� : iterator-");
		Iterator<Point> it = list.iterator();
		while(it.hasNext()) {
			Point po = it.next();
			System.out.println(po);
		}
		
		
		System.out.println("�šաաաաաաաաաաաաաաաաաաաաաաաաաազ�");
	}

}
