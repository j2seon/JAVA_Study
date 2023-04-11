package com.greedy.section01.extend;

public class Car {

	/* 자동차의 달리는 상태를 확인 할 수 있는 메소드 */
	
	private boolean runningStatus; // 상태

	public Car() {
		System.out.println("Car클래스의 기본 생성자 호출됨....");
	}
	
	/**
	 * <pre>
	 * 자동차의 기본적인 달리는 기능
	 * </pre>
	 */
	public void run() {
		
		runningStatus = true;
		System.out.println("자동차가 달립니다!!");
	}
	
	/**
	 *<pre>
	 * 자동차의 기본적인 달리는 기능
	 * </pre>
	 */
	public void soundHorn() {
		if (isRunning()) {
			System.out.println("빵!빵!");
			return;
		}
		
		System.out.println("주행중이 아닌 상태에는 경적을 울릴 수 없습니다.");
	}

	/**
	 * <pre>
	 * 자동차의 주행 중 상태를 반환해주는 메소드
	 * </pre>
	 * @return true이면 주행 중인 상태이며, false이면 멈춘 상태이다.
	 */
	private boolean isRunning() {
		return runningStatus;
	}
	
	/**
	 * <pre>
	 * 자동차의 기본적인 멈추는 기능
	 * </pre>
	 */
	public void stop() {
		runningStatus = false;
		System.out.println("자동차가 멈춥니다~~");
	}
	
	
	
}
