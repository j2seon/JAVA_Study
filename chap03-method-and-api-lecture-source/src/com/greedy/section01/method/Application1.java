package com.greedy.section01.method;

public class Application1 {

	public static void main(String[] args) {
		
		/* 메소드란?
		 * 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
		 * */ 

		
		System.out.println("main()..시작..");
		
		
		/* 클래스명 사용할 이름 = new 클래스명(); // 객체생성
		 * 사용할이름.메소드명();
		 * */
		
		Application1 application1 = new Application1();
		application1.methodA();
		
		System.out.println("main()...종료.....");
	}
	
	//접근제한자 반환값 이름(){}
	public void methodA() {
		
		System.out.println("methodA() 호출......");
		methodB();
		System.out.println("methodA() 종료......");
		
	}
	
	public void methodB() {
		System.out.println("methodB() 호출......");
		System.out.println("methodB() 종료......");
	}

}