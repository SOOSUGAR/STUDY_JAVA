
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
		return "�̸� : " + name + ", ���� : " + score;
	}
}


/*
���� )
1. �̸�(name)�� ����(score)�� ��������� ���� MemberŬ������ �����Ͻÿ�.
2. names�� scores�� ����Ͽ� members�� �����Ͻÿ�.
3. members�� ����� ������ ����Ͻÿ�.
4. ��� �߿� �߻��ϴ� ���ܸ� Ȯ���ϰ�, ����ó���� �Ͻÿ�.
*/
public class ExceptionTest11 {
	public static void main(String[] args) {
		String[] names = {"�쿵��", "����ȣ", "�ּ���", "����"};
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
			System.err.println("���ܸ� ó���Ͽ����ϴ�.");
		} finally {
			ave = tot/cnt;
			System.out.println("���� : " + tot);
			System.out.println("��� : " + ave);
		}
		
	}

}
