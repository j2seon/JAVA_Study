package com.greedy.section01.method;

public class Application3 {
	
	public static void main(String[] args) {
		
		/* 전달인자(argument)와 매개변수(parameter)를 이용한 메소드 호출
		 *
		 * 지금까지 우리가 배운 변수는 지역변수에 해당한다.
		 * 
		 * 변수의 종류
		 * 1. 지역변수
		 * 2. 매개변수
		 * 3. 전역변수(필드)
		 * 4. 클래스(static)변수
		 * 
		 * 지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다. 
		 * 이것을 지역변수의 스코프라고 한다.
		 *
		 * 다른 메소드간 서로 공유해야하는 값이 존재하는 경우 
		 * 메소드를 호출할 때 사용하는 괄호를 이용해서 전달
		 * 
		 * 이때 전달하는 값을 전달인자(argument)라고 부르고, 
		 * 메소드 선언부로 괄호 안에 전달인자를 받기 위해 선언하는 변수를 매개변수라고 한다
		 * 
		 * */
		
		Application3 application3 = new Application3();
		application3.testMethod(12); // 초기화한 것 -> 전달인자
		
		
		
		
//		application3.testMethod("20"); //매개변수는 int형이지만 인자가 String형이기 때문에 호출할 수 있다.
		
//		application3.testMethod(20,30,33); // 매개변수는 int형 1개이지만 인자는 3개이기 때문에 호출할 수 없다.
		
//		application3.testMethod() // 매개변수는 선언되어 있지만 인자로 값을 전달하지 않으면 호출할 수 없다.
		
		/* 변수에 저장한 값 전달 테스트 */
		/* 변수에 저장된 값을 이용하여 값을 전달할 수 있다. */
		
		int age = 20;
		application3.testMethod(age);
		
		/* 자동형변환을 이용하여 값을 전달할 수 있다. */
		byte byteAge = 10;
		application3.testMethod(byteAge);
		
		/* 강제형변환을 이용해서 값을 전달할 수 있다. */
		
		long longAge = 80L;
//		application3.testMethod(longAge); // 자동형변환 불가능
		application3.testMethod((int)longAge);
	
		/* 연산결과를 이용해서 값을 전달할 수 있다. */
		application3.testMethod(age * 3); // -> 전달인자
	}
	
	public void testMethod(int age) { //여기서 선언된것 - > 매개변수
		
		System.out.printf("당신의 나이는 %d세 입니다\n", age);
	}
}
