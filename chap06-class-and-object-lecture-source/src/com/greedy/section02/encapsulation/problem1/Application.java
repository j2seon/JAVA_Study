package com.greedy.section02.encapsulation.problem1;

public class Application {
	
	public static void main(String[] args) {
		
		/* 캡슐화를 해야 하는 이유!*/
		/* 필드에 바로 접근할 때 발생할 수 있는 문제점1 */
		/* 필드에 올바르지 않은 값이 들어가도 통제가 불가능해진다. */
		
		/* 1번 몬스터 생성*/
		Monster monster1 = new Monster();
		monster1.name = "두치";
		monster1.hp = 200;
				 
		System.out.println("monster1 name : " + monster1.name);
		System.out.println("monster1 hp : " + monster1.hp);
		
		/* 2번 몬스터 생성*/
		Monster monster2 = new Monster();
		monster2.name = "뿌꾸";
		monster2.hp = -200;

		System.out.println("monster2 name : " + monster2.name);
		System.out.println("monster2 hp : " + monster2.hp);

		/* 3번 몬스터 생성*/
		Monster monster3 = new Monster();
		monster3.name = "드라큘라";
		monster3.setHp(200);

		System.out.println("monster3 name : " + monster3.name);
		System.out.println("monster3 hp : " + monster3.hp);
		
		/* 4번 몬스터 생성*/
		Monster monster4 = new Monster();
		monster4.name = "프랑켄슈타인" ;
		monster4.setHp(200);

		System.out.println("monster4 name : " + monster4.name);
		System.out.println("monster4 hp : " + monster4.hp);
		
	}
	
}
