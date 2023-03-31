package com.greedy.section01.method;

public class Application5 {
	
	public static void main(String[] args) {
		/* 메소드 리턴 테스트 */
		/* 모든 메소드 내부에는 return이 존재한다.
		 * 
		 * void의 메소드의 경우 return;을 명시적으로 작성하지 않아도 마지막 중에 컴파일러가 자동으로 추가해준다. 
		 * 
		 * return은 현재 메소드를 강제 종료하고 호출한 구문으로 다시돌아가라는 명령어
		 *  
		 * */
		
		System.out.println("main()메소드 시작함");
		
		Application5 app5 = new Application5();
		app5.testMethod();
		
		System.out.println("main() 종료됨...");
		
	}
	
	public void testMethod() {
		
		System.out.println("testMethod() 동작확인");
		
		/* 컴파일러에 의해 자동으로 추가되는 구문 
		 * 가장 마지막에 작성해야하고 , 마지막에 작성되지 않을 경우 컴파일 에러가 발생한다.
		 * */ 
		
		return;
		
//		System.out.println("test");//에러발생, return은 가장 마지막에 작성해야함.
	}
}
