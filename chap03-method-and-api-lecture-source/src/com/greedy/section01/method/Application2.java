package com.greedy.section01.method;

public class Application2 {

	public static void main(String[] args) {
		
		System.out.println("main() 시작됨");
		
		Application2 application2 = new Application2();
		application2.methodA();
		application2.methodC();
		application2.methodB();
		
		System.out.println("main() 종료........");
		
	}
	
	public void methodA() {
	
		System.out.println("methodA() 호출");
		
		System.out.println("methodA() 종료");
		
	}
	
	public void methodB() {
		
		System.out.println("methodB() 호출");
		System.out.println("methodB() 종료");
		
	}
	public void methodC() {
		System.out.println("methodC() 호출");
		System.out.println("methodC() 종료");
	}
	
}
