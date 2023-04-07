package com.greedy.section02.encapsulation.problem4;


public class Monster {

	/* 접근제한자
	 * 클래스 혹은 클래스의 맴버에 참조연산자로 접근할 수 있는 범위를 제한하기 위한 키워드 이다.
	 * 1. public : 모든 패키지
	 * 2. protected : 같은 패기지 + 상속관계의 경우 다른패키지
	 * 3. default : 동일 패키지에서만 접근 (작성하지 않은 것)
	 * 4. pivate : 같은 클래스내부에서만 접근
	 * 
	 * 위의 내용은 클래스의 멤버(필드,메서드)에 모두사용가능
	 * 단, 클래스는 public default만 가능
	 * 
	 * */
	
	private String kinds;
	private int hp;

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
