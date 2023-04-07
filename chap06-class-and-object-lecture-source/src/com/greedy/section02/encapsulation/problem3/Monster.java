package com.greedy.section02.encapsulation.problem3;

import java.util.ArrayList;

public class Monster {

//	String name ;
	String kinds;
	int hp;

	public String getName() {
		return kinds;
	}
	
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.kinds = name;
	}
	
	public int getHp() {
		return hp;
	}
	
	/**
	 * 
	 * @param hp
	 */
	public void setHp(int hp) {
		if (hp > 0) {
			System.out.printf("양수값이 입력되어 hp를 %d로 설정합니다\n",hp);
			this.hp = hp;
		} else {
			System.out.printf("0또는 음수값이 입력되어 hp를 %d로 설정합니다\n", 0);
			this.hp = 0;
		}
	}
	
	@Override
	public String toString() {
		return "Monster [name=" + kinds + ", id=" + hp + "]";
	}

	
	
}
