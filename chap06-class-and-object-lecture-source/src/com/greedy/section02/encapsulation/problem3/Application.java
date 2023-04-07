package com.greedy.section02.encapsulation.problem3;

public class Application {
	public static void main(String[] args) {
		
		Monster monster1 = new Monster();
		monster1.setHp(100);
		monster1.setName("드라큘라");
		System.out.println(monster1.toString());
		
		Monster monster2 = new Monster();
		monster2.setHp(100);
		monster2.setName("프랑켄슈타인");
		System.out.println(monster2.toString());
		
	}
}
