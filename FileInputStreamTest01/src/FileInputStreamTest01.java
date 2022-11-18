import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
< ���� ����� ��Ʈ���� ���� > 
1. ����Ʈ ��� ��Ʈ�� - FileInputStream, FileOutputStream
			   - jpg, mp3, avi, mp4, exe ...
2. ���� ��� ��Ʈ�� - FileReader, FileWriter
              - txt
*/

public class FileInputStreamTest01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("c:/tmp/test01.txt");
			int data = 0;
			while((data = fis.read()) != -1) { // -1 : ������ ��, EOF(End Of File)
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
