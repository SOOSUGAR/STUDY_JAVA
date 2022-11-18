
public class StringTest08 {
	public static void main(String[] args) {
		// 16. split() : ���ڿ��� Ư�� �����ڸ� �������� ���ڿ��� �߶� ���ڿ��� �迭�� ������
		String words = "lion,hyena,elephant,cheetah,zeebra,giraffe,monkey";
		String[] animals = words.split(",");
		
		// ��� 1��
		for(int i = 0; i<animals.length; i++) {
			System.out.println("animals[" + i + "] = " + animals[i]);
		}
		System.out.println();
	
		// ��� 2��
		for(String a : animals) {
			System.out.println(a);
		}
		System.out.println("����������������������������������������������");
		
		// 17. substring() : ���ڿ����� Ư�� ���ڿ��� �����Ͽ� ����
		String s1 = "Hello Java World!";
		// Hello ����
		String s2 = s1.substring(0,5); // 0������ 5�� �ձ��� ����
		System.out.println(s2);
		// Java ����
		String s3 = s1.substring(6,10); // 6������ 10�� �ձ��� ����
		System.out.println(s3);
		// World! ����
		String s4 = s1.substring(11,17); // 11������ 17�� �ձ��� ����
		System.out.println(s4);
		String s5 = s1.substring(11); // 11������ ������
		System.out.println(s5);
	}

}
