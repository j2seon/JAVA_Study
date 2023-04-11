package com.greedy.section01.extend;

public class FireCar extends Car{

	/* Car 클래스를 부모클래스로 FireCar를 자식클래스로 사용했으묘
	 * 
	 * FireCar는 부모클래스인 Car가 가지고 있는 모든 멤버를 상속받는다.
	 * 하지만 생성자는 상속받지 못한다. 또한 부모가 가지고 있는 private 멤버는 접근이 불가능하다. 
	 * */
	
	
	/* 기본생성자 */
	public FireCar() {
		/* 모든 생성자에는 맨 첫줄에 super()를 컴파일러가 자동 추가한다. 
		 * 
		 * 부모의 기본생성자를 호출하는 구문이다.
		 * 해당생성자가 호출 될 시 가장먼저 Car클래스 호출 내용이 출력된다.
		 * 명시적, 묵시적 전부 사용이 가능하다.
		 * 
		 * */
		super();
		
		System.out.println("FireCar 클래스의 기본 생성자 호출됨");
	}
	
	
	
}
