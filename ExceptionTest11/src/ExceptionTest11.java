
class Member {
	private String name;
	private int score;
	
	public Member(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return "이름 : " + name + ", 점수 : " + score;
	}
}


/*
문제 )
1. 이름(name)과 점수(score)를 멤버변수로 갖는 Member클래스를 생성하시오.
2. names와 scores를 사용하여 members에 저장하시오.
3. members에 저장된 내용을 출력하시오.
4. 출력 중에 발생하는 예외를 확인하고, 예외처리를 하시오.
*/
public class ExceptionTest11 {
	public static void main(String[] args) {
		String[] names = {"우영우", "이준호", "최수연", "정명석"};
		int[] scores = {95, 87, 78, 92};
		Member[] members = new Member[5];
		int tot = 0;
		double ave = 0.0;
		int cnt = 0;
		
		try {
			for(int i = 0; i<names.length; i++) {
				members[i] = new Member(names[i], scores[i]);
			}
			
			for(int i = 0; i<members.length; i++) {
				System.out.println(members[i]);
				tot += members[i].getScore();
				++cnt;
			}
			
		} catch(NullPointerException e) {
			//e.printStackTrace();
			System.err.println("예외를 처리하였습니다.");
		} finally {
			ave = tot/cnt;
			System.out.println("총점 : " + tot);
			System.out.println("평균 : " + ave);
		}
		
	}

}
