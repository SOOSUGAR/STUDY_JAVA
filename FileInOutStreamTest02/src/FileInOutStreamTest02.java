import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
문제점 : 파일 스트림으로 대용량의 파일을 읽고 쓸 때 시간이 오래 소요됨
해결책 : 입출력에 대해 보조 스트림을 사용함

*/
public class FileInOutStreamTest02 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("c:/tmp/data01.zip");
			fos = new FileOutputStream("c:/tmp/data01_copy.zip");
			
			int data = 0;
			int cnt = 0;
			System.out.println("───── 데이터 복사 시간 측정 ─────");
			System.out.println("─────────────────────────");
			long startTime = System.currentTimeMillis();
			while((data = fis.read()) != -1) {
				fos.write(data);
				/*
				System.out.print("*");
				if(cnt ++ % 100 == 0) System.out.println();
				*/
			}
			long endTime = System.currentTimeMillis();
			System.out.println("─────────────────────────");
			System.out.println("─── 데이터 복사 시간 측정 완료 ───");
			long resultTime = endTime - startTime;
			System.out.println("──── 복사 시간 : " + resultTime/1000.0 + "초 ────");
			
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
