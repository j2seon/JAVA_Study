package com.greedy.section07.kindsofvariable;

public class KindsOfVariable { // 클래스영역의 시작

	/* 클래스 영역에 작성하는 변수를 필드라고 한다.
	 * 필드 == 멤버변수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용할 수 있는 변수라는 의미)
	 * 
	 * */
	
	/* non-static field를 인스턴스 변수라고 한다(인스턴스 생성 시점에 사용가능한 변수라는 의미) */
	private int globalNum;
	/* static field를 정적필드(클래스필드)라고 한다. (정적(클래스) 영역에 생성되는 변수) */
	private static int staticNum;
	
	public void testMethod(int num) { // 메소드 영역의 시작
		
		/* 메소드 영역에서 작성하는 변수를 지역변수라고 한다.
		 * 메소드 괄호 안에 선언하는 변수를 매개변수라고 한다.
		 * 매개변수도 일종의 지역변수로 생각하면 된다.
		 * 지역변수의 매개변수 모드 메소드 호출 시 stack을 할당받아 stack에 생성된다.
		 * 
		 * */
		int lv = 0;
		System.out.println(num); // 매개변수 호출 시 값이 넘어와서 변경되기 때문에 초기화가 필요없다.
		
		System.out.println(globalNum);
		System.out.println(staticNum);
		
		
	} //메소드영역의 끝
	
	public void testMethod2() {
//		System.out.println(lv); // 지역변수는 해당 지역(블럭 내)에서만 사용가능하다.
		System.out.println(globalNum);
		System.out.println(staticNum);
	}
	
	
} // 클래스영역 끝
