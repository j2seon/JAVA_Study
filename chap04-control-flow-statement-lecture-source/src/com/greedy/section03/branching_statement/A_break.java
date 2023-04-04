package com.greedy.section03.branching_statement;

public class A_break {
	
	
	/* break문 -> 반복문 내에서 사용한다.
	 * 해당 반복문을 빠져 나올 때 사용하여, 반복문의 조건문 판단 결과와 상관없이 반복문을 빠져나올 때 사용
	 * break를 만나면 가장 가까운 반복문을 종료한다.
	 * 
	 * 일반적으로 if(조건식) {break;} 처럼 사용된다
	 * 단, switch문은 반복문이 아니지만 예외적으로 사용된다.
	 * 
	 * */
	
	public void testSimpleBreakStatement() {
		
		int sum = 0;
		int i = 1;
		while (true) {
			sum += i;
			
			if(i == 100) {
				break;
			}
			
			i++;
		}
		
		System.out.println("1부터 100까지의 합은 "+ sum + "입니다.");
		
	}
	
	
}
