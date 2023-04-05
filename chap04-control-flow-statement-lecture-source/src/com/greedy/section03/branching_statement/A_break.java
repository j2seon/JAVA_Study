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
	
	
	public void testSimpleBreakStatement2() {
		
		/* 중첩반복문 내에서 분기문의 흐름
		 * 구구단 2 ~ 9단까지 출력
		 * 단, 각단의 수가 5보다 큰경우는 출력 생략한다.
		 * 
		 * */
		
		for (int i = 2; i < 10; i++) {
			System.out.printf("=============%d============\n", i);
			
			for (int j = 1; j < 10; j++) {
				if(j > 5) {
					break; // 가장 가까운 반복문을 나간다. 현재 반복문을 나간다.
					//return은 메서드를 종료하고 나간다.
				}
				
				System.out.printf("%d * %d = %d\n", i, j, (i*j));
			}
			
		}
		
	}
	
	/**
	 * <pre>
	 * break문 실행 흐름을 확인
	 * 중첩 반복문 내에서 분기문(break)을 이용하여 한번에 여러 반복문 중지시키기
	 * </pre>
	 */
	public void testJumpBreak() {
		
		Outer: // 라벨이용
		for (;;) { // 무한 반복 for문
			
			for (int i = 0; i < 10; i++) {
				
				System.out.println(i);
				if(i==3) {
					break Outer;
				}
			}
		}
	}
	
	
	
}
