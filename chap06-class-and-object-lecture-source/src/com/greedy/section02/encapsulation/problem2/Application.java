package com.greedy.section02.encapsulation.problem2;

public class Application {
	
	public static void main(String[] args) {
		
		
		/* 필드에 바로 접근할 때 발생할 수 있는 문제점
		 * 필드의 이름이나 자료형을 변경할때 사용한 쪽 모두 코드를 수정해야하는 경우 발생
		 * 
		 * 즉, 작은 변경이 사용하는 다른 여러 곳의 변경도 함께 초래한다.
		 * */
		
		Monster monster1 = new Monster("드라큘라", 100);
		Monster monster2 = new Monster("프랑켄슈타인", 300);
		Monster monster3 = new Monster("미이라", 400);
		
	}
}
