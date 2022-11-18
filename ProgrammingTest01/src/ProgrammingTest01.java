
public class ProgrammingTest01 {
	public static void main(String[] args) {
		String data = "동백,93,84,77,카멜리아";
		
		System.out.println("- 1번 -");
		String data1 = data + ",옹산";
		System.out.println(data1);
		
		System.out.println("- 2번 -");
		data1 = data1.replace(",", "/");
		System.out.println(data1);
		
		System.out.println("- 3번 -");
		if(data1.contains("카멜리아") == true) {
			System.out.println("카멜리아 문자열을 포함하고 있습니다.");
		} else {
			System.out.println("카멜리아 문자열을 포함하고 있지 않습니다.");
		}
		
		
		System.out.println("- 4번 -");
		String data4 = data.substring(3, 11); 
		System.out.println(data4);
		
		System.out.println("- 5번 -");
		String[] data5 = data4.split(",");
		int sum = 0;
		for(int i = 0; i < data5.length; i++) {
			int n = Integer.parseInt(data5[i]);
			sum += n;
		}
		System.out.println("합계 : " + sum);

	}
}
