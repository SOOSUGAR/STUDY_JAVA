import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest01 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("c:/tmp/alphabet.txt");
			bos = new BufferedOutputStream(fos, 10); // 버퍼 크기 : 10B -> 10B가 찼을 때 한꺼번에 출력으로 이동
			
			for(int i = 'A'; i <= 'Z'; i++) {
				bos.write(i);
			}
			
			bos.flush(); // flush : 버퍼에 남아있는 데이터를 출력으로 밀어주는 작업
			System.out.println("─── 데이터 쓰기를 완료하였습니다 ───");
			bos.close(); // close : flush를 먼저 진행하고 버퍼는 닫는다.
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
