import java.util.StringTokenizer;

public class StringTokenizerTest02 {
	public static void main(String[] args) {
		String words = "lion,hyena,elephant,cheetah/zeebra/giraffe/monkey";
		
		// 1�� ��� - split() �޼ҵ� ���
		words = words.replace("/", ",");
		System.out.println(words);
		System.out.println("����������������������������������������������");
		String[] animals = words.split(",");
		System.out.println("animals�� ����(�迭) : " + animals.length);
		for(int i = 0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		System.out.println("����������������������������������������������");
		
		// 2�� ��� 
		words = "lion,hyena,elephant,cheetah/zeebra/giraffe/monkey"; // ������
		System.out.println(words);
		System.out.println("����������������������������������������������");
		// StringTokenizer st1 = new StringTokenizer(words, ",/");    // false ����, �����ڸ� ��ū���� ������� ����
		StringTokenizer st1 = new StringTokenizer(words, ",/", true); // �����ڸ� ��ū���� ���
		System.out.println("animals�� ����(��ū) : " + st1.countTokens());
		while(st1.hasMoreTokens()) {
			String s = st1.nextToken();
			System.out.println(s);
		}
		System.out.println("����������������������������������������������");
		System.out.println("animals�� ����(��ū) : " + st1.countTokens());
		
		
	}

}
