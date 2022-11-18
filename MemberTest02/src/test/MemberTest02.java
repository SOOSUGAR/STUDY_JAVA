package test;

/*
1. Member 클래스
- SpecialMember의 부모 클래스
- 멤버변수 : 회원이름(name), 회원번호(no), 회원나이(age)
- 생성자
- getter / setter
- 출력 메소드 2가지, showInfo(), toString()

2. SpecialMember 클래스
- Member 클래스의 자식 클래스
- 멤버변수 : 특별혜택(privilege)
- 생성자
- getter / setter
- 출력 메소드 2가지 - 오버라이딩해서 생성
 
3. main() 메소드
- Member 인스턴스 2개, SpecialMember 인스턴스 2개를 만들어서 출력하시오
 
*/

import member.Member;
import member.SpecialMember;

// 문제) 아래의 상속 관계에 있는 인스턴스 4개를 다형성을 구현하여 처리하시오.
public class MemberTest02 {
	public static void main(String[] args) {
		/* 배열 1번
		Member[] member = new Member[4];
		member[0] = new Member("우영우", "221001", 27);
		member[1] = new Member("한수연", "221002", 27);
		member[2] = new SpecialMember("이준호", "221003", 29, "50% 할인");
		member[3] = new SpecialMember("정명석", "221004", 43, "3회 무료 입장");
		*/
		
		Member[] member = {
				new Member("우영우", "221001", 27),
				new Member("한수연", "221002", 27),
				new SpecialMember("이준호", "221003", 29, "50% 할인"),
				new SpecialMember("정명석", "221004", 43, "3회 무료 입장")
		};
		
		
		// 기본 for문
		for(int i = 0; i < member.length; i++) {
			System.out.println(member[i].toString());
		}
		
		// 확장 for문
		for(Member a : member) {
			System.out.println(a.toString());
		}
		
		/*
		Member m1 = new Member("우영우", "221001", 27);
		Member m2 = new Member("한수연", "221002", 27);
		SpecialMember m3 = new SpecialMember("이준호", "221003", 29, "50% 할인");
		SpecialMember m4 = new SpecialMember("정명석", "221004", 43, "3회 무료 입장");
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		*/
	}

}
