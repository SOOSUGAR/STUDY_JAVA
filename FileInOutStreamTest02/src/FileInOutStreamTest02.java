import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
������ : ���� ��Ʈ������ ��뷮�� ������ �а� �� �� �ð��� ���� �ҿ��
�ذ�å : ����¿� ���� ���� ��Ʈ���� �����

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
			System.out.println("���������� ������ ���� �ð� ���� ����������");
			System.out.println("��������������������������������������������������");
			long startTime = System.currentTimeMillis();
			while((data = fis.read()) != -1) {
				fos.write(data);
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
			
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
