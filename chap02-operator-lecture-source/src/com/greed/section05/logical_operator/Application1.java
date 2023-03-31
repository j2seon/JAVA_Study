package com.greed.section05.logical_operator;

public class Application1 {

	public static void main(String[] args) {
		
		/* 논리 연산자
		 * 논리값(true or false)를 취급하는 연산자
		 * */
		
		/* 논리 연산자의 종류
		 * 1. 논리 연결 연산자 : 두개의 피연산자를 가지는 이항 연산자이며, 연산자의 결합 방향은
		 *  				  왼쪽에서 오른쪽이다. 두개의 논리식을 판다하여 참과 거짓을 판단한다.
		 *  
		 * 		1-1. &&(논리 AND) 연산자 : 두 개의 논리식 모두 참일 경우 참을 반환,
		 * 								 둘 중 한 개라도 거짓인 경우 거짓을 반환
		 * 		1-2. ||(논리 OR) 연산자 : 두 개의 논리식 중 둘 중 하나라도 참일 경우 참을 반환,
		 * 								둘다 모두 거짓일 경우 겨짓을 반환.
		 * 
		 * 2. 논리 부정 연산자 : 피연산자가 하나인 단한연산자로, 피연산자의 결합방향은 왼쪽에서 오른쪽이다.
		 * 		2-1. !(논리 MOT) 연산자 : 논리식의 결과각 참이면 거짓을, 거짓이면 참을 반환
		 * 		
		 * 
		 * */
		
		System.out.println("true 와 true의 논리 and 연산 : " + (true && true));
		System.out.println("true 와 false의 논리 and 연산 : " + (true && false));
		System.out.println("false와 true의 논리 and 연산 : " + (false && true));
		System.out.println("false와 false의 논리 and 연산 : " + (false && false));
		System.out.println("true와 true의 논리 or 연산 : " + (true || true));
		System.out.println("true와 true의 논리 or 연산 : " + (true || false));
		System.out.println("false와 true의 논리 or 연산 : " + (false || true));
		System.out.println("false와 false의 논리 or 연산 : " + (false || false));
		
		System.out.println("true의 논리 not 연산 : "+ (!true));
		System.out.println("false의 논리 not 연산 : "+ (!false));
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		
		System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인 : " + (a < b && c < d));
		System.out.println("a가 b보다 작으면서 c가 d보다 큰지 확인 : " + (a < b && c > d));
		System.out.println("a가 b보다 크면서 c가 d보다 작은지 확인 : " + (a > b && c < d));
		System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인 : " + (a > b && c > d));

		System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인 : " + (a < b || c < d));
		System.out.println("a가 b보다 작거나 c가 d보다 큰지 확인 : " + (a < b || c > d));
		System.out.println("a가 b보다 크면서 c가 d보다 작은지 확인 : " + (a > b || c < d));
		System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인 : " + (a > b || c > d));
		
		
	}

}
