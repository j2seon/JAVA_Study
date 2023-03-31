package com.greedy.section01.method;

public class Application6 {
	
	public static void main(String[] args) {
		
		/* 메소드 리턴값 테스트
		 * 
		 * 메소드는 항상 마지막에 return 명령어가 존재한다.
		 * return 자신을 호출한 구문을 복귀 하는 것을 의미한다. 
		 * 
		 * 복귀를 할 때 값을 가지고 복귀 -> 이걸 리턴 값이라고 한다.
		 * 
		 * return 값을 반환 받기 위해서는 메소드 선언부에 리턴타입을 명시해주어야한다.
		 * void는 아무 반환값도 가지지 않겠다는 리턴타입에 사용할 수 있는 키워드이다
		 * 
		 * 반환 값이 없는 경우 return 구분은 생략해도 컴파일러가 자동으로 추가해주지만, 
		 * 반환값이 있는 경우 return 구문을 반드시 명시적으로 작성해야한다.
		 * 
		 * 또한, 메소드 선언부에 선언한 리턴타입 반환값의 자료형은 반드시 일치해야한다.
		 *
		 * */
		
		System.out.println("main()");
		
		Application6 app6 = new Application6();
		
		String returnText = app6.testMethod();
		System.out.println("변수에 담아서 호출 : " + returnText);
		
		System.out.println("변수에 담지 않고 호출 : " + app6.testMethod());
		
		System.out.println("main 끝");
	}
	
	public String testMethod() {
		/*
		 * public 뒤에 바로 return으로 가지고 갈 타입을 명시한다.
		 * 아무 값도 리턴하지 않을 경우 void 값을 반환하는 경우에는 반환 값의 자료형을 작성
		 * 
		 * */
		
		return "Hello";
	}
}
