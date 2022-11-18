import java.io.File;
import java.io.IOException;

public class FileTest02 {
	public static void main(String[] args) {
		File f1 = new File("c:/tmp/woo01.jpg");  // ���� -> ����
		File f2 = new File("c:/tmp/sample");	 // ����(���丮) -> ����
		File f3 = new File("c:/tmp"); 			 // ����(���丮) -> ����
		File f4 = new File("c:/tmp/file01.txt"); // ���� -> ���� 
		File f5 = new File("c:/tmp/system.txt"); // ���� -> ����
		File f6 = new File("c:/tmp/sample2"); 	 // ����(���丮) -> ���� �� �׽�Ʈ
		File f7 = new File("c:/tmp/alphabet.txt"); // ���� -> ����
		File f8 = new File("c:/tmp/test");		 // ����(���丮) -> ���� �� �׽�Ʈ 
		
		// 1. ���� ���� Ȯ��
		String result = null;
		if(f1.isFile()) {
			result = "����";
		} else {
			result = "���丮";
		}
		System.out.println(f1.getName() + "�� " + result + "�Դϴ�.");
		
		// 2. ���丮 ���� Ȯ��
		if(f3.isDirectory()) {
			result = "���丮";
		} else {
			result = "����";
		}
		System.out.println(f3.getName() + "�� " + result + "�Դϴ�.");
		
		// 3. ���� �Ǵ� ������ ���� ���� Ȯ��
		if(f2.exists()) {
			System.out.println(f2.getName() + "��/�� �����ϴ� �����Դϴ�.");
		} else {
			System.out.println(f2.getName()+ "��/�� �������� �ʴ� �����Դϴ�.");
		}
		
		// 4. ���� ���� ��� ����, �Ǵ� ���� ������ Ȯ�� - ���� ũ��, �����ð�
		String[] fileList = f3.list();
		System.out.println("������ File List ������");
		for(String s : fileList) {
			File f = new File(f3, s);
			String name = f.getName();
			long t = f.lastModified();
			long size = f.length();
			System.out.printf("���ϸ� : %s 		|  ũ�� : %dByte 	 |  �����ð� : %ty�� %tb %td�� %ta���� %tT\n", name, size, t, t, t, t, t);
		}
		
		// 5. ���� ����
		if(!f2.exists()) {  // f2�� ���ٸ� -> ���� ����
			f2.mkdir(); 	// make dir -> ���丮�� �����Ѵ�
			System.out.println("���ο� " + f2.getName() + "������ �����Ͽ����ϴ�.");
		} else {			// f2�� �ִٸ�
			System.out.println("���ο� ���� ������ �����Ͽ����ϴ�.");
			System.out.println(f2.getName() + "��/�� �̹� �����ϴ� �����Դϴ�.");
		}
		
		// 6. ���� ����
		if(!f4.exists()) { // f4�� ���ٸ� -> ���� ����
			try {
				f4.createNewFile();
				System.out.println("���ο� " + f4.getName() + " ������ �����Ͽ����ϴ�.");
			} catch(IOException e) {
				//e.printStackTrace();
				System.out.println("���� ���� �߿� ���ܰ� �߻��Ͽ����ϴ�.");
			}
		} else {
			System.out.println("���� ������ �����Ͽ����ϴ�.");
			System.out.println(f4.getName() + "�� �̹� �����ϴ� �����Դϴ�.");
		}
		
		// 7. ���� ����
		if(f5.delete()) {
			System.out.println("���� ������ �����Ͽ����ϴ�.");
		} else {
			System.out.println("�������� �ʴ� �����Դϴ�.");
			System.out.println("���� ������ �����Ͽ����ϴ�.");
		}
		
		// 8. ���� ���� -> �� ������ ����, ������ �ִ� ������ ���� �Ұ�
		if(f6.delete()) {
			System.out.println("�� ������ �����Ͽ����ϴ�.");
		} else {
			System.out.println("���� ������ �����Ͽ����ϴ�.\n������ �������� �ʰų� ���� �ʾҽ��ϴ�.");
		}
		
		// 9. ���� �̸� ����
		if(f7.renameTo(new File("c:/tmp/������.txt"))) {
			System.out.println("���� �̸��� �����Ͽ����ϴ�.");
		} else {
			System.out.println("���� �̸� ���濡 �����Ͽ����ϴ�.\n������ �������� �ʽ��ϴ�.");
		}
		
		// 10. ���� �̸� ����
		if(f8.renameTo(new File ("c:/tmp/�׽�Ʈ.txt"))) {
			System.out.println("���� �̸��� �����Ͽ����ϴ�.");
		} else {
			System.out.println("���� �̸� ���濡 �����Ͽ����ϴ�.\n������ �������� �ʽ��ϴ�.");
		}
		
	}

}
