import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest05 {
	public static void main(String[] args) {
		// 회원정보를 저장하는 HashMap -> 로그인하는 화면을 구현
		// 키 : 아이디, 값 : 비밀번호
		HashMap<String, String> map = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		// 데이터 추가
		map.put("aaa1111", "1111");
		map.put("bbb2222", "2222");
		map.put("ccc3333", "3333");
		map.put("ddd4444", "4444");
		map.put("eee5555", "5555");
		System.out.println(map);
		
		// 문제 )로그인할 때 입력받은 아이디와 비밀번호를 확인하도록 구현하시오.
		/*
		System.out.println("아이디와 비밀번호를 입력해주세요.");
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		
		if(map.get(id) == null) {
			System.out.println("존재하지 않는 아이디 입니다.");
		} else {
			System.out.print("비밀번호 입력 : ");
			String pw = sc.next();
			if(map.get(id).equals(pw)) {
				System.out.println("로그인이 되었습니다.");
			} else {
				System.out.println("잘못된 비밀번호 입니다.");
			}
		}
		*/
		
		// 문제 ) 로그인할 때, 아이디와 비밀번호를 확인하도록 구현하시오.
		/*
	      System.out.println("[ 로 그 인  ]");
	      while (true) {
	         System.out.print("아이디를 입력하세요 : ");
	         String id = sc.next();

	         if (!(map.containsKey(id))) {
	            System.out.println("※존재하지 않는 아이디 입니다.");
	         } else {
	            while (true) {
	               System.out.print("비밀번호를 입력하세요 : ");
	               String pw = sc.next();

	               if (map.get(id).equals(pw)) {
	                  System.out.println(id+"님이 로그인 하였습니다!");
	                  sc.close();
	                  break;
	               } else {
	                  System.out.println("※비밀번호가 올바르지 않습니다.");
	                  continue;
	               }
	            }
	            sc.close();
	            break;
	         }
	      }
		*/
		
		/* 1번
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하시오");
			System.out.print("아이디 입력 : ");
			String id = sc.next();
			System.out.print("비밀번호 입력 : ");
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
							System.out.println(id + "님이 로그인 하였습니다.");
							flagPwd = true;
							break;
						} else {
							System.out.println("비밀번호가 일치하지 않습니다. \n다시 입력해 주세요.");
							break;
						}
					}
				}
			}
			if(flagPwd) break;
		}
		*/
		
		// 2번 방법
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하시오");
			System.out.print("아이디 입력 : ");
			String id = sc.next();
			System.out.print("비밀번호 입력 : ");
			String pw = sc.next();
			
			if(map.containsKey(id)) {
				if(pw.equals(map.get(id))) {
					System.out.println(id + "님이 로그인 하였습니다.");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("존재하지 않는 아이디 입니다. \n다시 입력해 주세요.");
			}
		}
		
		
		sc.close();
		
	}
	
}
