package com.greedy.section01.extend;

public class Application {
	
	public static void main(String[] args) {
		FireCar fireCar = new FireCar();
		
		fireCar.soundHorn();
		fireCar.run();
		fireCar.soundHorn();
		fireCar.stop();
		fireCar.soundHorn();
		
		/* 부모의 멤버중에 접근 제한자가 private이면 접근이 불가능 */
		
//		fireCar.runningStatus; //private 접근 불가
		fireCar.isRunning(); // private메소드는 불가지만 protected로 변경하면 가능
		fireCar.sprayWater();
		System.out.println("======================================");
		
		RacingCar racingCar = new RacingCar();
		
		racingCar.soundHorn();
		racingCar.run();
		racingCar.soundHorn();
		racingCar.stop();
		racingCar.soundHorn();
	}
}
