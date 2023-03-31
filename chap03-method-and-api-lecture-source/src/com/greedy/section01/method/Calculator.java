package com.greedy.section01.method;

public class Calculator {

	
	public int minNumberOf(int first, int second) {
		
		/* 두 수가 동일한 조건은 제외하고
		 * 두 수를 비교하여 첫 번째 숫자가 크면 두번째 숫자를 반환하고,
		 * 아니면 첫번째 숫자를 반환하도록 작성
		 * 
		 * */
		return (first > second)? second : first;
	}
	
	/* 주의!
	 * static 메소드도 non-static 메소드 처럼 호출은 가능하다.
	 * 하지만 권장하지 않는다.
	 * 
	 * 이미 메모리에 로딩되어 있는 static 메소드는 여러 객체가 공유하게 된다.
	 * 그 때 객체로 접근하게 되면 인스턴스가 가진 값으로 공유된 값에 예상치 못하는 동작을 유발할 수 있기 때문이다.
	 * 그래서 사용을 제한해 달라는 경고 이다.
	 * 
	 *  시스템이 복잡해질수록 이런 에러를 찾기가 힘들어지기 대문에
	 *  하지말라면 하지말자 
	 *
	 * */
	public static int maxNumberOf(int first, int second) {
		return (first > second)? first : second;
		
	}
	
	
}
