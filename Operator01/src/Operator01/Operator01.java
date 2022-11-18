package Operator01;
/* 
- 연산자(Operator)
- 연산자의 역할(기능)에 따른 분류

1. 산술 연산자: +, -, *, /(몫), %(나머지)
- *, / , % ,가  +, -보다 우선순위가 높음,

2. 증감 연산자: ++(증가),--(감소) 자신의 값을 1증가 또는 1감소 하는 연산자
++a; 전의 증가 연산자 자신의 값을 1증가 시키고 난 후 대입(창조)
a++; 후의 증가 연산자 먼저 대입한 후 자신의 값을 1 증가
--a; 전의 감소 연산자 자신의 값을 1 감소 시키고 난 후 대입(창조)
a--; 후의 감소 연산자 먼저 대입한 후 자신의 값을 1 감소

3. 비교 연산자: < , <= , > , >= , ==, != , instanceof(다양성 구현에 사용)
- 비교 연산의 결과는 true , false 둘 중의 하나의 값을 가짐 , 
- >, >=, <, <=가 ==, != 보다 우선순위가 높음 

4. 논리 연산자: &&(논리AND) , ||(논리OR), !(논리NOT)
- 논리연산의 결과는 true , false 둘 중 하나의 값을 가짐,
- &&가 ||보다 우선순위가 높음
- &&(논리AND): 두 개의 항이 모두다 true 일때 , 전체 결과가 true , 하나라도 false라면 전체 결과는 false.
- ||(논리OR): 두 개의 항 중에서 하나라도 true 라면 전체 결과가 true. 모두다 false 라면 전체 결과는 false.
- ! (논리NOT): true를 false로, false를 true로 

5. 비트 연산자 : &(비트AND), |(비트OR), ^(Exclusive, 배타적OR, XOR), ~(비트NOT)

*/
public class Operator01 {
	public static void main(String[] arge) {

		/*
		// 1.산술 연산자
		System.out.println(3+5);
		System.out.println(10 - 3);
		System.out.println(3 * 5);
		System.out.println(10 / 3); // 값, 3
		System.out.println(10 % 3); // 나머지, 1
		*/
		
		/*
		// 2.증강 연산자
		int a =10,b;
		
		//b = ++a; (a = 11 , b = 11)
		//b = a++; (a = 11 , b = 10)
		//b = --a; (a = 9 , b = 9)
		//b = a--; (a= 9 , b = 10)
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		*/
		
		/*
		// 3.비교 연산자
		int c = 10, d = 20;
		
		System.out.println(c > d);
		System.out.println(c < d);
		System.out.println(c == d);
		System.out.println(c != d);
		//System.out.println(c = d);
		*/
		
		// 4.논리 연산자
		int a=10 , b=5;
		System.out.println(a>5 && b<10); // true && true -> true
		System.out.println(a>5 && b>10); // true && false -> false
		System.out.println(a<5 && b>10); // false && false -> false
		System.out.println(a>5 || b<10); // true || true -> true
		System.out.println(a>5 || b>10); // true || false -> true
		System.out.println(a<5 || b>10); // false || false -> false
		System.out.println((a>5)); //true
		System.out.println(!(a>5)); // !(true) -> false
		
	};
}
