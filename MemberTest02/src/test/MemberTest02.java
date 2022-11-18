package test;

/*
1. Member Ŭ����
- SpecialMember�� �θ� Ŭ����
- ������� : ȸ���̸�(name), ȸ����ȣ(no), ȸ������(age)
- ������
- getter / setter
- ��� �޼ҵ� 2����, showInfo(), toString()

2. SpecialMember Ŭ����
- Member Ŭ������ �ڽ� Ŭ����
- ������� : Ư������(privilege)
- ������
- getter / setter
- ��� �޼ҵ� 2���� - �������̵��ؼ� ����
 
3. main() �޼ҵ�
- Member �ν��Ͻ� 2��, SpecialMember �ν��Ͻ� 2���� ���� ����Ͻÿ�
 
*/

import member.Member;
import member.SpecialMember;

// ����) �Ʒ��� ��� ���迡 �ִ� �ν��Ͻ� 4���� �������� �����Ͽ� ó���Ͻÿ�.
public class MemberTest02 {
	public static void main(String[] args) {
		/* �迭 1��
		Member[] member = new Member[4];
		member[0] = new Member("�쿵��", "221001", 27);
		member[1] = new Member("�Ѽ���", "221002", 27);
		member[2] = new SpecialMember("����ȣ", "221003", 29, "50% ����");
		member[3] = new SpecialMember("����", "221004", 43, "3ȸ ���� ����");
		*/
		
		Member[] member = {
				new Member("�쿵��", "221001", 27),
				new Member("�Ѽ���", "221002", 27),
				new SpecialMember("����ȣ", "221003", 29, "50% ����"),
				new SpecialMember("����", "221004", 43, "3ȸ ���� ����")
		};
		
		
		// �⺻ for��
		for(int i = 0; i < member.length; i++) {
			System.out.println(member[i].toString());
		}
		
		// Ȯ�� for��
		for(Member a : member) {
			System.out.println(a.toString());
		}
		
		/*
		Member m1 = new Member("�쿵��", "221001", 27);
		Member m2 = new Member("�Ѽ���", "221002", 27);
		SpecialMember m3 = new SpecialMember("����ȣ", "221003", 29, "50% ����");
		SpecialMember m4 = new SpecialMember("����", "221004", 43, "3ȸ ���� ����");
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		*/
	}

}
