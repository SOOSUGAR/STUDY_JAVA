import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutStreamTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			/*
			// 1번 - 문서 파일 (용량이 아주 작음)
			fis = new FileInputStream("c:/tmp/goods01.txt");
			fos = new FileOutputStream("c:/tmp/goods01_copy.txt");
			*/
			
			/*
			// 2번 - 이미지 파일 (용량이 261KB)
			fis = new FileInputStream("c:/tmp/woo01.jpg");
			fos = new FileOutputStream("c:/tmp/woo01_copy.jpg");
			*/
			
			// 3번 - 압축 파일 (용량이 27MB) -> 긴 시간 소요
			fis = new FileInputStream("c:/tmp/python.zip");
			fos = new FileOutputStream("c:/tmp/python_copy.zip");
			
			
			int data = 0;
			while((data = fis.read()) != -1) {
				char c = (char)data;
				fos.write(c);
			}
			
			System.out.println("파일을 읽고 썼습니다 ... ");
			fis.close();
			fos.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
