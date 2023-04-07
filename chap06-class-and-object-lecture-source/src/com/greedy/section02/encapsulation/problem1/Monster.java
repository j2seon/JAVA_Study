package com.greedy.section02.encapsulation.problem1;

import java.util.ArrayList;

public class Monster {
	
	/* 필드로 몬스터 이름과 체력을 저장할 공간을 선언 */ 
	String name;	//몬스터 이름
	int hp;			//몬스터 체력
	
	
	public int getHp() {
		return hp;
	}

	/**
	 * <pre>
	 * 매개변수로 전달받은 정수를 이용해 hp의 값을 변경해주는 메소드
	 * 단,매개변수로 전달받은 값이 양수인 경우에만 전달받은 값으로 변경하고,
	 * 0보다 작거나 같은 경우에는 0으로 변경
	 * </pre> 
	 * @param hp
	 */
	public void setHp(int hp) {
		/* this는 인스턴스(객체)가 생성되었을 때 자신의 주소를 저장하는 레퍼런스 변수이다.
		 * 지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선적으로 접근하기 때문에
		 * 전역변수에 접근하기 위해서 this.을 명시해야한다.
		 * */
		
		if (hp > 0) {
			System.out.printf("양수값이 입력되어 hp를 %d로 설정합니다\n",hp);
			this.hp = hp;
		} else {
			System.out.printf("0또는 음수값이 입력되어 hp를 %d로 설정합니다\n", 0);
			this.hp = 0;
		}
	}
	
	

	
	
}
