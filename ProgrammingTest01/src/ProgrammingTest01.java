
public class ProgrammingTest01 {
	public static void main(String[] args) {
		String data = "����,93,84,77,ī�Ḯ��";
		
		System.out.println("- 1�� -");
		String data1 = data + ",�˻�";
		System.out.println(data1);
		
		System.out.println("- 2�� -");
		data1 = data1.replace(",", "/");
		System.out.println(data1);
		
		System.out.println("- 3�� -");
		if(data1.contains("ī�Ḯ��") == true) {
			System.out.println("ī�Ḯ�� ���ڿ��� �����ϰ� �ֽ��ϴ�.");
		} else {
			System.out.println("ī�Ḯ�� ���ڿ��� �����ϰ� ���� �ʽ��ϴ�.");
		}
		
		
		System.out.println("- 4�� -");
		String data4 = data.substring(3, 11); 
		System.out.println(data4);
		
		System.out.println("- 5�� -");
		String[] data5 = data4.split(",");
		int sum = 0;
		for(int i = 0; i < data5.length; i++) {
			int n = Integer.parseInt(data5[i]);
			sum += n;
		}
		System.out.println("�հ� : " + sum);

	}
}
