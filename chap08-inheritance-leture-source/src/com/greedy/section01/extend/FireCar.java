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

	/*
	 * @Override 어노테이션
	 * JDK1.5부터 추가된 문법으로 오버라이딩 성립요건을 체크하여 성립되지 않는 경우 컴파일 에러를 발생시킨다.
	 * (오버라이딩이 정상적으로 작성된 것인지 체크)
	 * */
	@Override
	public void soundHorn() {
		
		/* 오버라이딩하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야한다. */
		if(this.isRunning()) {
			/* this.isRunning() 혹은 super.isRunning() 둘다 사용이 가능하다
			 * 생략하면 기본적으로 this.을 자동으로 추가한다.
			 * 
			 * */
			System.out.println("빠아ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ");
		}else {
			System.out.println("소방차가 앞으로 갈 수 없음 비켜");
		}
	}
	
	/**
	 * <pre>
	 * 물을 뿌리는 기능을 제공
	 * </pre>
	 */
	public void sprayWater() {
		
		System.out.println("불난 곳을 발견했습니다.");
		
	}
	
	
	
}
