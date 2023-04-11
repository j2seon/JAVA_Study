package com.greedy.section01.extend;

public class Application {
	
	public static void main(String[] args) {
		FireCar fireCar = new FireCar();
		
		fireCar.soundHorn();
		fireCar.run();
		fireCar.soundHorn();
		fireCar.stop();
		fireCar.soundHorn();
	}
}
