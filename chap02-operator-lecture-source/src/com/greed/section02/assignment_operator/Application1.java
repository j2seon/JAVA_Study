package com.greed.section02.assignment_operator;

public class Application1 {

	public static void main(String[] args) {
		/* 대입연산자와 산술 복합 대입연산자 */
		
		/* '=' : 왼쪽의 피연산자에 오른쪽의 피 연산자를 대입한다.
		 * '+=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입한다.
		 * '-=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입한다.
		 * '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입한다.
		 * '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 몫 결과를 왼쪽의 피연산자에 대입한다.
		 * '%=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나머지 결과를 왼쪽의 피연산자에 대입한다.
		 * 
		 * 
		 * */
		
		int num = 12;
		System.out.println("num : " + num);
		
		num += 3;
		System.out.println("num : " + num);
		
		num -= 5; // num = num - 5; 
		System.out.println("num : " + num);
		
		num *= 2; // num = num * 2;
		System.out.println("num : " + num);
		
		num /= 2;
		System.out.println("num : " + num);
		
		/* 주의 산술 복합 대입연산자의 작성 순서에 주의해야한다.
		 * 산술 대입연산자가 아닌 '-5'를 num에 대입한 것이다.*/
		
		num =- 5;
		System.out.println("num : " + num);
	
		
		
		
	}

}
