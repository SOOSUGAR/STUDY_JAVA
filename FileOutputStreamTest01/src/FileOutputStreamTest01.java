import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("c:/tmp/test02.txt");
			
			for(int i = 'A'; i<='Z'; i++) {
				fos.write(i);
				
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
