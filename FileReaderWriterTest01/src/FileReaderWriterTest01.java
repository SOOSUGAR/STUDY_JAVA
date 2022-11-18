import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTest01 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("c:/tmp/goods02.txt");
			fw = new FileWriter("c:/tmp/goods02_copy.txt");
			
			int data = 0;
			while((data = fr.read()) != -1) {
				fw.write(data);
			}
			
			fr.close();
			fw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
