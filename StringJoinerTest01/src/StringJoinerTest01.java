import java.util.StringJoiner;

public class StringJoinerTest01 {
	public static void main(String[] args) {
		String words = "lion,hyena,elephant,cheetah,zeebra,giraffe,monkey";
		
		String[] animals = words.split(",");
		for(String a : animals) {
			System.out.println(a);
		}
		System.out.println("����������������������������������������������");
		
		// 1. String Ŭ������ Join() �޼ҵ� ���
		String str = String.join("-", animals);
		System.out.println(str);
		
		// 2. StringJoiner Ŭ���� ��� 1
		StringJoiner sj1 = new StringJoiner("~");
		for(String a : animals) {
			sj1.add(a);
		}
		System.out.println(sj1);
		
		// 3. StringJoiner Ŭ���� ��� 2
		StringJoiner sj2 = new StringJoiner("~", "[", "]");
		for(String a : animals) {
			sj2.add(a);
		}
		System.out.println(sj2);
	}

}
