import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTest02 {
	public static void main(String[] args) {
		// 3번 방법 - try ~ with ~ resource문 사용
		try(BufferedReader br = new BufferedReader(new FileReader("c:/Windows/system.ini"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("c:/tmp/system3.txt")); ) {
			int data = 0;
			while((data = br.read()) != -1) {
				bw.write(data);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		/*
		// 2번 방법
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			br = new BufferedReader(new FileReader("c:/Windows/system.ini"));
			bw = new BufferedWriter(new FileWriter("c:/tmp/system2.txt"));
			
			int data = 0;
			while((data = br.read()) != -1) {
				bw.write(data);
			}
			
			// 보조 스트림을 닫으면 파일 스트림도 함께 닫힌다.
			// 보조 스트림을 닫지 않는다면, 파일이 제대로 쓰이지 않는다.
			br.close();
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		*/
		
		/*
		// 1번 방법 
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		
		try {
			fr = new FileReader("c:/Windows/system.ini");
			fw = new FileWriter("c:/tmp/system.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			int data = 0;
			while((data = br.read()) != -1) {
				bw.write(data);
			}
			
			br.close();
			bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		*/
		
	}

}
