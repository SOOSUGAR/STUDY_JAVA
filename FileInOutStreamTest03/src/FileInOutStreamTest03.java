import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
문제점 : 파일 스트림으로 대용량의 파일을 읽고 쓸 때 시간이 오래 소요됨
해결책 : 입출력에 대해 보조 스트림을 사용함

< 파일 입출력 스트림의 속도를 개선하는 보조스트림 >
1. BufferedInputStream : 입력 속도 개선
2. BufferedOutputStream : 출력 속도 개선
- 기본 버퍼의 크기 : 8KB(8192B)
*/
public class FileInOutStreamTest03 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		try {
			// 파일 크기 : 12MB
			fis = new FileInputStream("c:/tmp/data01.zip");
			fos = new FileOutputStream("c:/tmp/data01_copy.zip");
			
			/*
			// 1번 - 기본 버퍼 크기, 8192, 속도 0.32초
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			*/
			
			/*
			// 2번 - 4096B, 0.47초
			bis = new BufferedInputStream(fis, 4096);
			bos = new BufferedOutputStream(fos, 4095);
			*/
			
			// 3번 - 16384B, 0.초
			bis = new BufferedInputStream(fis, 16384);
			bos = new BufferedOutputStream(fos, 16384);
			
			int data = 0;
			int cnt = 0;
			System.out.println("───── 데이터 복사 시간 측정 ─────");
			System.out.println("─────────────────────────");
			long startTime = System.currentTimeMillis();
			while((data = bis.read()) != -1) {
				bos.write(data);
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
			
			bis.close();
			bos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
