package com.greedy.section02.encapsulation.problem4;

import java.util.LinkedList;

public class Application {
	public static void main(String[] args) {
		
		/* 필드에 직접 접근 하면 complie error를 발생시킨다
		 * 접근을 허용하지 않았기 때문에 직접접근을 할 수 없다는 의미이다.
		 * 이는 메소드를 통한 간접접근을 강제화 한 것!
		 * 
		 * */
		Monster monster1 = new Monster();
//		monster1.kinds //접근 불가능
	
		
		/* 선언한 필드대로 공간은 생성되어 있지만 직접 접근하지 못하고
		 * public으로 접근을 허용한 메소드만 이용할 수 있도록 해놓은 것을 캡슐화라고 부른다.
		 * -> 정보은닉 중에 객체의 필드 및 메소드 은닉
		 * */
		
		monster1.setHp(200);
		monster1.setName("프랑켄슈타인");
		System.out.println(monster1.toString());
		
		
		/* 캡슐화는 유지보수성을 증가시키기 위해 필드의 직접 접근을 제한하고
		 * public 메소드를 이용해서 간접적으로 접근하여 사용할 수 있도록 만든 기술
		 * 클래스 작성 시 특별한 목적이 아닌 이상 캡슐화가 기본원칙으로 사용되고 있다.
		 * */
		
	}
}
