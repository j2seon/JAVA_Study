package com.greedy.section01.init;

import java.util.Iterator;

public class Application {
	
	public static void main(String[] args) {
		
		
	/* 객체 배열은 레퍼런스변수에 대한 배열이다.
	 * 생성한 인스턴스도 배열을 이용해서관리하면 동일한 타입의 여러개 인스턴스를
	 * 각각 취급하지 않고 연속 처리할 수 있어서 유용하다
	 * 
	 * 또한 반환값을 1개의 값만 반환할 수 있기 때문에
	 * 동일한 타입의 여러 인스턴스를 반환해야하는 경우 객체배열을 사용할 수 있다.
	 * */
		
		/* 동일한 타입의 인스턴스를 여러개 사용해야 할 때 객체 배열을 이용하면 보다 효율적으로 사용이 가능하다*/
		
		Car[] carArr = new Car[5];
		
		// 각인덱스에는 기본값 null로 초기화 되어 있어서 인덱스별로 인스턴스를 생성해야한다.
//		System.out.println(carArr[0]);
		
		carArr[0] = new Car("페라리", 300);
		carArr[1] = new Car("람보르기니", 350);
		carArr[2] = new Car("롤스로아스", 250);
		carArr[3] = new Car("부가티베이론", 400);
		carArr[4] = new Car("포터", 500);
		
		for (int i = 0; i < carArr.length; i++) {
			carArr[i].driveMaxSpeed();
		}
		System.out.println();
		
		Car[] carrArr2 = {
			new Car("페라리", 300),      
			new Car("람보르기니", 350),     
			new Car("롤스로아스", 250),     
			new Car("부가티베이론", 400),    
			new Car("포터", 500)        
		};
		
		for (Car car : carrArr2) {
			car.driveMaxSpeed();
		}
		
	}

}
