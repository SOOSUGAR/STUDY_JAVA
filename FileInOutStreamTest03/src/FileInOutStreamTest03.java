import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
������ : ���� ��Ʈ������ ��뷮�� ������ �а� �� �� �ð��� ���� �ҿ��
�ذ�å : ����¿� ���� ���� ��Ʈ���� �����

< ���� ����� ��Ʈ���� �ӵ��� �����ϴ� ������Ʈ�� >
1. BufferedInputStream : �Է� �ӵ� ����
2. BufferedOutputStream : ��� �ӵ� ����
- �⺻ ������ ũ�� : 8KB(8192B)
*/
public class FileInOutStreamTest03 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		
		try {
			// ���� ũ�� : 12MB
			fis = new FileInputStream("c:/tmp/data01.zip");
			fos = new FileOutputStream("c:/tmp/data01_copy.zip");
			
			/*
			// 1�� - �⺻ ���� ũ��, 8192, �ӵ� 0.32��
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			*/
			
			/*
			// 2�� - 4096B, 0.47��
			bis = new BufferedInputStream(fis, 4096);
			bos = new BufferedOutputStream(fos, 4095);
			*/
			
			// 3�� - 16384B, 0.��
			bis = new BufferedInputStream(fis, 16384);
			bos = new BufferedOutputStream(fos, 16384);
			
			int data = 0;
			int cnt = 0;
			System.out.println("���������� ������ ���� �ð� ���� ����������");
			System.out.println("��������������������������������������������������");
			long startTime = System.currentTimeMillis();
			while((data = bis.read()) != -1) {
				bos.write(data);
				/*
				System.out.print("*");
				if(cnt ++ % 100 == 0) System.out.println();
				*/
			}
			long endTime = System.currentTimeMillis();
			System.out.println("��������������������������������������������������");
			System.out.println("������ ������ ���� �ð� ���� �Ϸ� ������");
			long resultTime = endTime - startTime;
			System.out.println("�������� ���� �ð� : " + resultTime/1000.0 + "�� ��������");
			
			bis.close();
			bos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
