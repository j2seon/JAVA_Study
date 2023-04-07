package com.greedy.section02.encapsulation.problem2;

public class Monster {

	String name ;
	int hp;
	
	public Monster() {
		this("알수없음", 100);
	}
	
	
	public Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return hp;
	}
	
	public void setId(int hp) {
		this.hp = hp;
	}
	
	@Override
	public String toString() {
		return "Monster [name=" + name + ", id=" + hp + "]";
	}

	
	
}
