package com.greedy.section01.method;

public class Application9 {

	//실행용 클래스
	public static void main(String[] args) {
		
		Calculator c = new Calculator(); // non - static 메소드 호출 
		
		int first = 100;
		int second = 50; 
		int min = c.minNumberOf(first, second);
		System.out.println("두 수 중 최소값은" + min);
		
		/*
		 * static 메소드인 경우
		 * 클래스명, 메소드명();
		 * 다른 클래스에 작성 한 static 메소드의 경우 호출할 대 반드시 클래스명을 기술해야한다.
		 * 
		 * */
		
		int max = Calculator.maxNumberOf(first, second);
		System.out.println("두 수 중 최대 값은 " + max);
		
		
		// static 
		int max2 = c.maxNumberOf(first, second);
		System.out.println("두 수 중 최대 값은 " + max2);
		
	}
}


