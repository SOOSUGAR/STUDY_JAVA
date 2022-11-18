package Operator01;
/* 
- ������(Operator)
- �������� ����(���)�� ���� �з�

1. ��� ������: +, -, *, /(��), %(������)
- *, / , % ,��  +, -���� �켱������ ����,

2. ���� ������: ++(����),--(����) �ڽ��� ���� 1���� �Ǵ� 1���� �ϴ� ������
++a; ���� ���� ������ �ڽ��� ���� 1���� ��Ű�� �� �� ����(â��)
a++; ���� ���� ������ ���� ������ �� �ڽ��� ���� 1 ����
--a; ���� ���� ������ �ڽ��� ���� 1 ���� ��Ű�� �� �� ����(â��)
a--; ���� ���� ������ ���� ������ �� �ڽ��� ���� 1 ����

3. �� ������: < , <= , > , >= , ==, != , instanceof(�پ缺 ������ ���)
- �� ������ ����� true , false �� ���� �ϳ��� ���� ���� , 
- >, >=, <, <=�� ==, != ���� �켱������ ���� 

4. �� ������: &&(��AND) , ||(��OR), !(��NOT)
- �������� ����� true , false �� �� �ϳ��� ���� ����,
- &&�� ||���� �켱������ ����
- &&(��AND): �� ���� ���� ��δ� true �϶� , ��ü ����� true , �ϳ��� false��� ��ü ����� false.
- ||(��OR): �� ���� �� �߿��� �ϳ��� true ��� ��ü ����� true. ��δ� false ��� ��ü ����� false.
- ! (��NOT): true�� false��, false�� true�� 

5. ��Ʈ ������ : &(��ƮAND), |(��ƮOR), ^(Exclusive, ��Ÿ��OR, XOR), ~(��ƮNOT)

*/
public class Operator01 {
	public static void main(String[] arge) {

		/*
		// 1.��� ������
		System.out.println(3+5);
		System.out.println(10 - 3);
		System.out.println(3 * 5);
		System.out.println(10 / 3); // ��, 3
		System.out.println(10 % 3); // ������, 1
		*/
		
		/*
		// 2.���� ������
		int a =10,b;
		
		//b = ++a; (a = 11 , b = 11)
		//b = a++; (a = 11 , b = 10)
		//b = --a; (a = 9 , b = 9)
		//b = a--; (a= 9 , b = 10)
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		*/
		
		/*
		// 3.�� ������
		int c = 10, d = 20;
		
		System.out.println(c > d);
		System.out.println(c < d);
		System.out.println(c == d);
		System.out.println(c != d);
		//System.out.println(c = d);
		*/
		
		// 4.�� ������
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
