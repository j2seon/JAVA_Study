package com.greedy.section05.parameter;

import java.util.Arrays;

public class Application {
	
	public static void main(String[] args) {
		
		/* 메소드의 파라미터 선어부에는 다양한 종류의 값을 인자로 전달하여 호출할 수 있다.
		 * 
		 * 매개변수(parameter)로 사용 가능한 자료형
		 * 1. 기본자료형
		 * 2. 기본자료형 배열 
		 * 3. 클래스자료형 
		 * 4. 클래스자료형 배열 
		 * 5. 가변인자  
		 * */
		
		ParameterTest pt = new ParameterTest();
		
		/* 1. 기본자료형을 매개변수로 전달 받는 메소드 호출 */
		/* 기본자료형 8가지 모두 가능하다. */
		int num = 20;
		
		pt.testPrimaryTypeParameter(num);
		
		/* 기본자료형은 인자로 전달하는 값과 매개변수로 전달하는 값이 동일하다. */
		
		/* 2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출 */
		int [] iarr = new int[] {1,2,3,4};
		
		pt.testPrimaryTypeArrayParameter(iarr);
		
		System.out.println("변경후 배열출력 : " + Arrays.toString(iarr));
		System.out.println("인자로 전달하는 값 " + iarr);
		
		/* 3. 클래스 자료형 */
		RectAngle rectAngle = new RectAngle(12.5, 22.5);
		
		System.out.println("인자로 전달하는 값 : " + rectAngle);
		pt.testClassTypeParameter(rectAngle);
		
		
		/* 4. 가변인자
		 * 인자로 전달하는 값의 갯수가 정해지지 않은 경우 가변배열을 활용할 수 있다.
		 * */
//		pt.testVariableLengthArrayParameter(); //인자가 아무것도 없는 경우 에러발생
		
		pt.testVariableLengthArrayParameter("홍길동");
		pt.testVariableLengthArrayParameter("유관순", "볼링");
		pt.testVariableLengthArrayParameter("이순신", "볼링", "당구");
		pt.testVariableLengthArrayParameter("신사임당", new String[] {"떡썰기", "서예"});
		
		/* 메소드를 오버로딩하고 다시 돌아오려면 컴파일에러가 발생하는데
		 * 이는 둘 중 어떤 메소드를 호출하는 것인지에 대한 모호성이 발생했기 때문에 에러가 발생
		 * 
		 * 가변배열을 매개변수로 이용한 메소드드 모호성으로 인해 오버로딩 하지 않는 것이 좋다.
		 * */
		
		
		
		
		
		
	}
	
}
