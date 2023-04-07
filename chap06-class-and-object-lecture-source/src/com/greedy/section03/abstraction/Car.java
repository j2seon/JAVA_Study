package com.greedy.section03.abstraction;

public class Car {
	
	/* 현재는 카레이서와 자동차가 서로 공유해야하는 속성이 존재한다. */
	
	private boolean isOn;
	private int speed;

	/**
	 * <pre>
	 * 자동차의 시동을 걸기 위한 메소드
	 * </pre>
	 */
	public void startUp() {
		
		if(isOn) {
			System.out.println("이미 시동이 걸려있습니다.");
			return;
		}
		
		this.isOn = true;
		System.out.println("시동을 걸었습니다. 이제 출발할 준비가 완료되었습니다.");
		
	}

	/**
	 * <pre>
	 * 자동차를 가속시키기 위한 메소드
	 * 시동이 걸린 상태인 경우에만 호출 시 10km씩 속도를 증가시킨다.
	 * </pre>
	 */
	public void go() {
		
		/* 시동이 걸려있는 상태인 경우 앞으로 가고, 그렇지 않은 경우 시동을 먼저 걸어야한다고 할 것 */
		
		if(!isOn) {
			System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요");
			return;
		}
		
		System.out.println("차가 앞으로 움직입니다.");
		this.speed += 10;
		System.out.println("현재 차의 시속은 " + this.speed +" km/h입니다");
		
	}

	/**
	 * <pre>
	 * 자동차를 멈추기 위한 메소드
	 * 시동이 걸려있고 달리는 상태인 경우에만 멈출 수 있다.
	 * </pre>
	 */
	public void stop() {
		
		if(!isOn) {
			System.out.println("차는 시동이 안켜져있습니다.");
			return;
		}
		
		if(this.speed == 0) {
			System.out.println("차는 이미 멈춰있는 상태입니다.");
			return;
		}
		
		this.speed = 0;
		System.out.println("브레이크를 밟았습니다. 차를 멈춥니다");
		return;
		

		
	}

	/**
	 * <pre>
	 * 자동차의 시동을 끄기 위한 메소드
	 * </pre>
	 */
	public void turnOff() {
		/* 시동이 걸려있는 상태인 경우 시동을 끄고, 이미꺼진 상태라면 이미 꺼져있다고 출력한다.
		 * 달리고 있는 상태인 경우 우선차를 멈추라고 안내
		 * */
		
		if(!isOn) {
			System.out.println("차는 이미 시동이 멈춰있는 상태입니다.");
			return;
		}
		
		if(this.speed > 0) {
			System.out.println("달리는 상태입니다. 차를 우선 멈춰주세요");
			return;
		}
		
		this.isOn = false;
		System.out.println("시동을 끕니다 다시 운행하시려면 시동을 켜주세요~~~");
	}
	
	
	
	
}
