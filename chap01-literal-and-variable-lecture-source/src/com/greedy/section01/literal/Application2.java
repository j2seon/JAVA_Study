package com.greedy.section01.literal;


public class Application2 {
	
	public static void main(String[] args) {
		
		/*
		 * 값을 직접 연산하여 출력 연산자의 종류 : + - * / %
		 */
		
		System.out.println("========== 정수와 정수의 연산 ==========");
		
		System.out.println(123 + 456);
		System.out.println(123 - 23);
		
		System.out.println(123 * 10);
		System.out.println(123 / 10);
		System.out.println(123 % 10);
		
		System.out.println("========== 실수와 실수의 연산 ==========");
		System.out.println(1.23 + 1.23);
		System.out.println(1.23 - 0.23);
		System.out.println(1.23 * 10.0);
		System.out.println(1.23 / 10.0);
		System.out.println(1.23 % 1.0);
		
		/*
		 * 정수와 실수의 연산도 수학에서 사용하는 사칙연산에 나머지를 구하는 연산을 사용할 수 있고,
		 * 정수와 실수의 연산결과는 항상 실수가 나온다.
		 */
		System.out.println("========== 정수와 실수의 연산 ==========");
		System.out.println(123 + 0.5);
		System.out.println(123 - 0.5);
		System.out.println(123 * 0.5);
		System.out.println(123 / 0.5);
		System.out.println(123 % 0.5);
		
		/* 문자끼리의 연산도 사칙연산에 mod연산까지 가능하다. */
		System.out.println("========== 문자와 문자의 연산 ==========");
		System.out.println('a' + 'b');
		System.out.println('a' - 'b');
		System.out.println('2' + '1');
		System.out.println('a' * 2);
		
		System.out.println("========== 문자와 정수의 연산 ==========");
		System.out.println('a' + 1);
		System.out.println('a' - 1);
		System.out.println('a' * 1);
		System.out.println('a' / 1);
		System.out.println('a' % 1);
		System.out.println('a' + 0); // a가 97이라는 것을 알 수 있다. -> 아스키코드 
		
		System.out.println("========== 문자와 실수의 연산 ==========");
		System.out.println('a' + 1.0);
		System.out.println('a' - 1.0);
		System.out.println('a' * 2.0);
		System.out.println('a' / 2.0);
		System.out.println('a' % 2.0); 
		
		/* 결론은 문자는 내부적으로 숫자 취급을 한다 
		 * 
		 * 따라서 지금까지의 연산은 숫자끼리의 연산이고, 숫자(정수/실수)형태의 값은 사칙연산, mod연산이 가능한 것
		 * */
		
		
		/* 문자열과 다른 형태의 값 연산 
		 * 
		 * -> 문자열과의 연산은 '+'연산만 가능하다.
		 * -> 문자열과 문자열의 연산도 + 연산만 가능
		 * 
		 * */
		
		System.out.println("========== 문자열과 문자열의 연산 ==========");
	
		System.out.println("hello" + "world");
//		System.out.println("hello" - "world"); //-> 에러 발생
//		System.out.println("hello" * "world"); 
//		System.out.println("hello" / "world"); 
//		System.out.println("hello" % "world"); 
		
		System.out.println("========== 문자열과 다른 형태의 연산 ==========");
		System.out.println("helloworld" + 123); // 새로운 문자열을 만드는 것 
		System.out.println("helloworld" + 123.45345);
		System.out.println("helloworld" + 'a');
		System.out.println("helloworld" + true);
		
		System.out.println("123" + "456");
		
		/* 논리값 연산 
		 * 논리값끼리의 연산 정수 실수 문자 모두 연산자 사용이 불가능하다.
		 * 
		 * 단, 논리값과 문자열의 '+' 연산만 가능하다.-> 문자열 합치기만 가능
		 * 
		 */
		
//		System.out.println(true + false); // -> 에러발생 (모든 연산 불가능)
//		System.out.println(true + 1); // -> 에러발생
//		System.out.println(true + 1.0); // -> 에러발생
//		System.out.println(true + 'a'); // -> 에러발생 문자는 내부적으로 숫자 취급을 하기때문에 논리값과 숫자의 연산과 동일한 의미
		System.out.println(true + "a"); // '+' 연산만 가능

		

		
		char ch = 'a';
		String st = "A";
		
//		ch = ''; 불가능
		st = "";
		
		
		
	}
}
