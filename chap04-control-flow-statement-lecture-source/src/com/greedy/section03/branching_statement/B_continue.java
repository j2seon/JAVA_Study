package com.greedy.section03.branching_statement;

public class B_continue {
	
	/* continue문은 반복문 내에서 사용한다.
	 * 
	 * 해당 반복문의 반복회차를 중간에 멈추고 다시 증감식으로 넘어가게 해준다
	 * 일반적으로 if(조건식){ continue; } 처럼 사용한다.
	 * 
	 * 보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 자주 사용된다.
	 *  
	 * */
	
	public void testSimpleContinueStatemnet() {
		
		for (int i = 2; i < 10; i++) {
			System.out.printf("========== %d =========\n", i);
			
			for (int j = 1; j < 10; j++) {
				
				if(j % 2 == 0) {
					continue; // j가 짝수인 경우 해당 회차 반복내용을 건너뛰고 증감식으로 이동
				}
				
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
			
		}
	}

	/**
	 * <pre>
	 * continue문 실행흐름을 확인하기 위한 용도의 기능 제공
	 * 중첩 반복문 내에서 분기문(continue)을 이용하여 한번에 여러 개의 반복문 건너뛰기
	 * </pre>
	 */
	public void testJumpContinue() {
		
		Outer:
		for (int i = 2; i < 10; i++) {
			System.out.printf("========== %d =========\n", i);
			
			for (int j = 1; j < 10; j++) {
				
				if(j % 2 == 0) {
					continue Outer; // j가 짝수인 경우 해당 회차 반복 내용을 건너뛰고 이름이 부여된 증감식으로 이동
				}
				
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
			
		}
		
	}
	
	
}
