package com.greed.section05.logical_operator;

public class Application3 {

	public static void main(String[] args) {
		/* 
		 * AND 연산과 OR연산의 특징
		 * 
		 * 논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실행 안한다.
		 * 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안한다.
		 * 
		 * */
		
		/* 1. 논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실행 안한다.
		 * 
		 * 조건식 두개가 모두만족해야 true를 반환하지만 앞에서 미리 false가 나오게 되면
		 * 뒤의 조건을 확인 할 피요없이 false를 반환
		 * 따라서 연산횟수를 줄이기 위해서는 &&연산의 경우 앞에 false가 나올 가능성이 높은조건을 작성
		 * 
		 * */
		
		int num1 = 10;
		
		int result1= (false && ++num1> 0) ? num1 : num1;
		
		System.out.println("&& 실행 확인 : " + result1);
		
		
		/* 2. 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안한다.
		 * 
		 * 조건식 둘 중 하나라도 true를 반환하면 true를 반환하기 때문에 앞에서 미리 true가 
		 * 나오개 되면 뒤의 조건을 확인 할 필요 없이 true를 반환한다.
		 * 따라서 안션횟수를 줄이기 위해서 || 연산의 경우 앞에서 true가 나올 가능성이 높은 조건을 작성
		 * */
		
		int num2 = 10; 
		int resul2 = (true || ++ num2 > 0)? num2 : num2;
		
		System.out.println("||실행확인 : " + resul2 );
		
		
		
		
	}

}
