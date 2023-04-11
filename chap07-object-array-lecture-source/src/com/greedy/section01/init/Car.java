package com.greedy.section01.init;

public class Car {
	
	private String modelName;
	private int maxSpeed;

	/* 매개변수 있는 생성자 */
	public Car(String modelName, int maxSpeed) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
	}
	
	public void driveMaxSpeed() {
		System.out.println(this.modelName + "이(가) 최고시속 " + maxSpeed + "km/h로 달려갑니다.");
	}
	

	
	
	
}
