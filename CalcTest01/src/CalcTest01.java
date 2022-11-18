
/*package test;

import calc.Calc;

/*
< 패키지(package)의 역할 >
1. 클래스를 기능별로 , 종류별로 나누는 역할
2. 클래스에 대한 접근 권한을 부여하는 역할

  # 패키지의 이름을 붙이는 방법 - 권장
  1. 선체를 소문자로 작성
  2. 패키지명을 인터넷 도메인명을 역순으로 사용할 것을 권장 -> 유일한 패키지명을 만들 수 있기 때문
  3. 패키지명은 도메인명이 아니어도 .(점)으로 단어를 구분함
  ex) kr.co.captain6
  
< 클래스를 통한 접근 제어 >
1. public 액세스 : 클래스 앞에 public 붙이는 방법
- 어디에서나 사용 가능한 클래스

2. package(default) 액세스 : 클래스 앞에 public 붙이지 않는 방법
- 같은 패키지 내에서만 사용 가능한 클래스

< 클래스의 맴버의 대한 접근 권한 >
1. private - 같은 클래스 내에서만 접근 가능
2. default - 같은 패키지 내에서만 접근 가능
3. protected - 같은 패키지 내에서는 물론, 다른 패키지라도 상속을 받았다면 접근 가능
4. public - 어디에서나 접근 가능

 # 접근의 범위 #
private < default < protected < public

*/
/*
public class CalcTest01 {
	public static void main(String[] args) {
		Calc a = new Calc();
		
		System.out.println("덧셈 : " + a.add(10, 20));
		// System.out.println("뺄셈 : " + a.subtract(50, 10));
		System.out.println("곱셈 : " + a.multiply(30, 50));
		System.out.println("나눗셈(몫) : " + a.divide(50, 70));
		
		
	}

}*/
