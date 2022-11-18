import java.util.Iterator;
import java.util.LinkedList;

/*
문제 ) 
1. Point 클래스를 담는 LinkedList인 list를 생성하시오.
2. 리스트에 Point 클래스의 인스턴스를 10개 저장하고 확인하시오.
- 10부터 10씩 증가하여 100까지의 값을 갖는 x, y 좌표값으로 저장하시오.
3. 리스트의 (10, 10) 데이터 뒤에 (11, 11)을 추가하고 확인하시오.
4. 리스트에서 (40, 40)데이터를 삭제하고 확인하시오.
5. 리스트에서 (50, 50) 데이터를 (55, 55)로 수정하고 확인하시오.
6. 리스트 맨 앞의 (1, 1) 데이터를 추가하고 확인하시오.
7. 리스트의 모든 데이터를 3가지 방법으로 출력하시오. (기본/확장 for문, Iterator)
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
	
	// Point 인스턴스의 값을 비교하는 메소드
	public boolean compare(Point p) {
		return this.x == p.x && this.y == p.y;
	}
	
}

public class LinkedListTest02 {
	public static void main(String[] args) {
		// 1. LinkedList인 list를 생성
		LinkedList<Point> list = new LinkedList<Point>();
		
		// 2. 리스트에 Point 클래스의 인스턴스를 10개 저장(10부터 10씩 증가하여 100까지의 값을 갖는 x, y 좌표값)
		System.out.println("┎≡≡≡≡≡≡≡≡≡LinkedList≡≡≡≡≡≡≡≡≡┒");
		
		
		for(int i = 1; i <= 10; i++) {
			list.add(new Point(10 * i, 10 * i));
		}
		System.out.println(list);
		System.out.println("────────────────────────────");
		
		// 3. 리스트의 (10, 10) 데이터 뒤에 (11, 11)을 추가
		list.add(1, new Point(11, 11));
		/*
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getX() == 10 && list.get(i).getY() == 10) {
				list.add(i, new Point(11, 11));
			}
		}
		// compare() 메소드 활용
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).compare(new Point(10, 10))) {
				list.add(i, new Point(11, 11));
			}
		}
		*/
		System.out.println(list);
		System.out.println("────────────────────────────");
		
		// 4. 리스트에서 (40, 40)데이터를 삭제
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
		System.out.println("────────────────────────────");
		
		// 5. 리스트에서 (50, 50) 데이터를 (55, 55)로 수정
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
		System.out.println("────────────────────────────");
		
		// 6. 리스트 맨 앞의 (1, 1) 데이터를 추가
		list.addFirst(new Point(1, 1));
		System.out.println(list);
		System.out.println("────────────────────────────");
		
		// 7. 리스트의 모든 데이터를 3가지 방법으로 출력
		System.out.println("-첫 번째 방법 : 기본 for문-");
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("────────────────────────────");
		
		System.out.println("-두 번째 방법 : 확장 for문-");
		for(Point i : list) {
			System.out.println(i);
		}
		System.out.println("────────────────────────────");
		
		System.out.println("-세 번째 방법 : iterator-");
		Iterator<Point> it = list.iterator();
		while(it.hasNext()) {
			Point po = it.next();
			System.out.println(po);
		}
		
		
		System.out.println("┖≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡┚");
	}

}
