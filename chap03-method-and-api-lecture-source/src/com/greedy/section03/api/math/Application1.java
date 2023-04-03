package com.greedy.section03.api.math;

public class Application1 {
	public static void main(String[] args) {
		
		/* API란 
		 * Application Programming Interface는 응용프로그램에서 사용할 수 있도록,
		 * 운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 인터퍼에스를 뜻한다.
		 * 쉽게말해우리가 구현 할 수 없거나 구현하기 번거로운 기능을 jdk에 설치하면
		 * 사용할 수 있도록 소스코드(클래스, 인터페이스)등을 의미한다.
		 * 
		 * */
		
		/* java.lang.Math
		 * Math클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스
		 * API문서 안에서 확인했듯 static method로만 구성되어있다.
		 *  
		 * */
		
		/* 절대값 출력 */
		
		System.out.println("절대값 -7의 " + (Math.abs(-7)) );
		
		/* 자주 사용하는 패키지라서 import를 하지 않고 사용할 수 있도록 해놓았다.
		 * 그 이유는 컴파일러가 import java.lang.*; 이코드를 자동으로 추가해서 컴파일을 하기때문
		 *  
		 *  */
		
		
		System.out.println("절대값 -12.5의 " + (Math.abs(-1.25)) );
		System.out.println("10과 20 중 더 작은 것은 : " + Math.min(10, 20));
		System.out.println("30과 20 중 더 큰 것은 : " + Math.max(30, 20));
		
		System.out.println("원주율 : "+ Math.PI);
		
		System.out.println("난수발생 : " +Math.random());
		
	}
}
