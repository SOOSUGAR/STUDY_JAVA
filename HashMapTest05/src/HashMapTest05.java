import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest05 {
	public static void main(String[] args) {
		// ȸ�������� �����ϴ� HashMap -> �α����ϴ� ȭ���� ����
		// Ű : ���̵�, �� : ��й�ȣ
		HashMap<String, String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		// ������ �߰�
		map.put("aaa1111", "1111");
		map.put("bbb2222", "2222");
		map.put("ccc3333", "3333");
		map.put("ddd4444", "4444");
		map.put("eee5555", "5555");
		System.out.println(map);
		
		// ���� )�α����� �� �Է¹��� ���̵�� ��й�ȣ�� Ȯ���ϵ��� �����Ͻÿ�.
		/*
		System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
		System.out.print("���̵� �Է� : ");
		String id = sc.next();
		
		if(map.get(id) == null) {
			System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
		} else {
			System.out.print("��й�ȣ �Է� : ");
			String pw = sc.next();
			if(map.get(id).equals(pw)) {
				System.out.println("�α����� �Ǿ����ϴ�.");
			} else {
				System.out.println("�߸��� ��й�ȣ �Դϴ�.");
			}
		}
		*/
		
		// ���� ) �α����� ��, ���̵�� ��й�ȣ�� Ȯ���ϵ��� �����Ͻÿ�.
		/*
	      System.out.println("[ �� �� ��  ]");
	      while (true) {
	         System.out.print("���̵� �Է��ϼ��� : ");
	         String id = sc.next();

	         if (!(map.containsKey(id))) {
	            System.out.println("���������� �ʴ� ���̵� �Դϴ�.");
	         } else {
	            while (true) {
	               System.out.print("��й�ȣ�� �Է��ϼ��� : ");
	               String pw = sc.next();

	               if (map.get(id).equals(pw)) {
	                  System.out.println(id+"���� �α��� �Ͽ����ϴ�!");
	                  sc.close();
	                  break;
	               } else {
	                  System.out.println("�غ�й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
	                  continue;
	               }
	            }
	            sc.close();
	            break;
	         }
	      }
		*/
		
		/* 1��
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��Ͻÿ�");
			System.out.print("���̵� �Է� : ");
			String id = sc.next();
			System.out.print("��й�ȣ �Է� : ");
			String pw = sc.next();
			
			boolean flagId = false;
			boolean flagPwd = false;
			it = keySet.iterator();
			while(it.hasNext()) {
				String hid = it.next();
				if(id.equals(hid)) {
					if(id.equals(hid)) {
						flagId = true;
						String hpwd = map.get(hid);
						if(pw.equals(hpwd)) {
							System.out.println(id + "���� �α��� �Ͽ����ϴ�.");
							flagPwd = true;
							break;
						} else {
							System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. \n�ٽ� �Է��� �ּ���.");
							break;
						}
					}
				}
			}
			if(flagPwd) break;
		}
		*/
		
		// 2�� ���
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է��Ͻÿ�");
			System.out.print("���̵� �Է� : ");
			String id = sc.next();
			System.out.print("��й�ȣ �Է� : ");
			String pw = sc.next();
			
			if(map.containsKey(id)) {
				if(pw.equals(map.get(id))) {
					System.out.println(id + "���� �α��� �Ͽ����ϴ�.");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			} else {
				System.out.println("�������� �ʴ� ���̵� �Դϴ�. \n�ٽ� �Է��� �ּ���.");
			}
		}
		
		
		sc.close();
		
	}
	
}
