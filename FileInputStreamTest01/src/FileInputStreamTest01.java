import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
< 파일 입출력 스트림의 종류 > 
1. 바이트 기반 스트림 - FileInputStream, FileOutputStream
			   - jpg, mp3, avi, mp4, exe ...
2. 문자 기반 스트림 - FileReader, FileWriter
              - txt
*/

public class FileInputStreamTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("c:/tmp/test01.txt");
			int data = 0;
			while((data = fis.read()) != -1) { // -1 : 파일의 끝, EOF(End Of File)
				char c = (char)data;
				System.out.print(c);
			}
			fis.close();
		} catch(FileNotFoundException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
		} catch(IOException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}

}
