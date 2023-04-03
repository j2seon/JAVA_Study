package com.greedy.section01.method;

public class Application8 {
		
	public static void main(String[] args) {
		
		/* static 메소드 호출 
		 * static이 있는 메소드나 non-static 메소드 둘다 메소드의 동작 흐름은 동일하다.
		 * 
		 * */

		/* non - static 메소드를 호출할 대 
		 * 
		 * 클래스명 사용할이름 = new 클래스명();
		 * 사용할 이름.메소드명();
		 *  
		 *  static 메소드를 호출할때
		 *  클래스명.메소드명();
		 *  */
		
		System.out.println("10과 20의 합 : " + Application8.sumTwoNumbers(10, 20));
		
		/* 같은 클래스내에서 작성된 static의 경우 클래스명을 생략가능하다 
		 * 
		 * */
		
		System.out.println("10과 20의 합 : " +sumTwoNumbers(10, 20));
		
	
	}

	
	public static int sumTwoNumbers(int first, int second) {

		return first + second;
	}
	
}

