
// ����) A���� �л� ������ �����ϴ� scores �迭���� �ְ�����, ���������� ���Ͻÿ�.
// �ְ������� ���ϴ� �κ�, ���������� ���ϴ� �κ��� ���� �޼ҵ�� ����� �����Ͻÿ�.
// �޼ҵ�� : calcMax, calcMin
public class Method06 {
	
	static int calcMax(int a[]) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
	
	static int calcMin(int b[]) {
		int min = b[0];
		for(int i = 1; i < b.length; i++) {
			if(min > b[i]) {
				min = b[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int [] scores = {55, 77, 83 ,92, 65, 78, 96, 88, 52, 75};
		
		int max = calcMax(scores);
		int min = calcMin(scores);
		
		System.out.printf("�ִ밪 : %d\n�ִ밪 : %d", max, min);
		
	}

}
