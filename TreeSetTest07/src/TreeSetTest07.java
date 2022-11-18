import java.util.TreeSet;

class Fruit implements Comparable<Fruit>{
	private String name;
	private int price;
	private int volume;
	
	public Fruit(String name, int price, int volume) {
		this.name = name;
		this.price = price;
		this.volume = volume;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getVolume() {
		return volume;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public String toString() {
		return name + " (" + price + ") : " + volume; 
	}
	
	public void print() {
		System.out.println(name + " (" + price + ") : " + volume );
	}
	
	
	// 1 - 가격 순으로 오름차순 정렬
	@Override
	public int compareTo(Fruit f) {
		if(this.price > f.price) return 1;
		else if(this.price < f.price) return -1;
		else return 0;
	}
	
	
	/*
	// 2 - 가격 순으로 내림차순 정렬
	@Override
	public int compareTo(Fruit f) {
		if(this.price < f.price) return 1;
		else if(this.price > f.price) return -1;
		else return 0;
	}
	*/
	
	/*
	// 3 - 수량 순으로 오름차순 정렬
	@Override
	public int compareTo(Fruit f) {
		if(this.volume > f.volume) return 1;
		else if(this.volume < f.volume) return -1;
		else return 0;
	}
	*/
	
	/*
	// 4 - 수량 순으로 내림차순 정렬
	@Override
	public int compareTo(Fruit f) {
		if(this.volume < f.volume) return 1;
		else if(this.volume > f.volume) return -1;
		else return 0;
	}
	*/
	
	/*
	// 5 - 과일 이름 순으로 오름차순 정렬
	@Override
	public int compareTo(Fruit f) {
		if(this.name.compareTo(f.name) > 0) return 1;
		else if(this.name.compareTo(f.name) < 0) return -1;
		else return 0;
	}
	*/
	
	/*
	// 6 - 과일 이름 순으로 내림차순 정렬
	@Override
	public int compareTo(Fruit f) {
		if(this.name.compareTo(f.name) < 0) return 1;
		else if(this.name.compareTo(f.name) > 0) return -1;
		else return 0;
	}
	*/
	
}

public class TreeSetTest07 {
	public static void main(String[] args) {
		// TreeSet 생성
		// TreeSet 사용할 때는 Comparable 인터페이스를 구현하지 않으면 에러 발생
		TreeSet<Fruit> set = new TreeSet<Fruit>();
		
		// 데이터 추카
		set.add(new Fruit("사과", 2000, 35));
		set.add(new Fruit("포도", 9000, 27));
		set.add(new Fruit("망고", 8800, 22));
		set.add(new Fruit("자두", 5500, 43));
		set.add(new Fruit("참외", 7700, 32));
		
		System.out.println(set);
		/*
		for(Fruit f : set) {
			System.out.println(f);
		}
		*/
		
		// < 중복 데이터 추가 >
		// compareTo() 메소드에서 사용한 멤버변수를 기준으로 데이터를 중복 유무를 확인
		// 1. 데이터 추가 - 이름만 같은 경우
		// compareTo()에서 과일 이름을 기준으로 사용했다면 동일한 과일 이름만 중복을 허용하지 않음
		set.add(new Fruit("포도", 8700, 12));
		System.out.println(set);
		
		// 2. compareTo()에서 가격을 기준으로 사용했다면 동일한 가격만 중복을 허용하지 않음
		set.add(new Fruit("바나나", 9000, 12));
		System.out.println(set);
		
		// 3. compareTo()에서 수량을 기준으로 사용했다면 동일한 수량만 중복을 허용하지 않음
		set.add(new Fruit("바나나", 8300, 32));
		System.out.println(set);
		
		// < 중복 데이터 삭제 >
		// compareTo() 메소드에서 사용한 멤버변수를 기준으로 데이터를 중복 유무를 확인
		// compareTo()에서 과일 이름을 기준으로 사용했다면 동일한 과일 이름만 중복을 허용하지 않음
		set.remove(new Fruit("멜론", 5500, 20));
		System.out.println(set);
		
		// 2. compareTo()에서 가격을 기준으로 사용했다면 동일한 가격만 중복을 허용하지 않음
		set.remove(new Fruit("바나나", 7700, 20));
		System.out.println(set);
		
		// 3. compareTo()에서 수량을 기준으로 사용했다면 동일한 수량만 중복을 허용하지 않음
		set.remove(new Fruit("바나나", 5500, 27));
		System.out.println(set);
	}

}
