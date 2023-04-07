package com.greedy.section03.abstraction;

public class CarRacer {
	
	/* CarRacer가 상호작용할 Car클래스를 CarRacer는 알고있어야한다.
	 * 알고있다는 의미는 필드에 가지고 있다는 의미를 가진다.
	 * 
	 * */
	private Car car = new Car();
	

	/**
	 * <pre>
	 * 카레이서가 자동차의 시동을 걸 수 있는 메소드
	 * </pre>
	 */
	public void startUp() {
		
		car.startUp();
	}
	
	/**
	 * <pre>
	 * 카레이서가 엑셀레이터를 밟아 가속을 할 수 있는 메소드
	 * </pre>
	 */
	public void stepAccelator() {
		
		car.go();
	}
	
	/**
	 * <pre>
	 * 카레이서가 브레이크를 밟아 정기할 수 있는 메소드
	 * </pre>
	 */
	public void stopBreak() {
		
		car.stop();
	}
	
	/**
	 * <pre>
	 * 카레이서가 자동차의 시동을 끌 수 있는 메소드 
	 * </pre>
	 */
	public void turnOff() {
		
		car.turnOff();
	}
	
}
