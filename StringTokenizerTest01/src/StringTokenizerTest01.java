import java.util.StringTokenizer;

public class StringTokenizerTest01 {
	public static void main(String[] args) {
		String words = "lion,hyena,elephant,cheetah,zeebra,giraffe,monkey";
		
		// 1. String Ŭ���� split() �޼ҵ带 ����Ͽ� ���ڿ��� �и��� �� ���ڿ��� �迭�� ����
		String[] animals = words.split(",");
		
		// ��� 1��
		for(int i = 0; i<animals.length ; i++) {
			System.out.println(animals[i]);
		}
		System.out.println("������������������������������������������");
		
		// ��� 2��
		for(String a : animals) {
			System.out.println(a);
		}
		System.out.println("������������������������������������������");
		
		// 2. StringTokenizer Ŭ������ ����Ͽ� ���ڿ��� ��ū�� �и�
		StringTokenizer st1 = new StringTokenizer(words, ","); // import�� �߰��ؾ� �� , ctrl + Shift + O
		System.out.println("��ū�� �� : " + st1.countTokens());
		System.out.println("������������������������������������������");
		while(st1.hasMoreTokens()) { // ��ū�� �ִ���, ��ū�� ������ false�� ��������
			String s = st1.nextToken();
			System.out.println(s);
		}
		System.out.println("������������������������������������������");
		System.out.println("��ū�� �� : " + st1.countTokens()); // ��ū�� �� �и��Ͽ� ����
		
		
	}

}
