package com.greedy.section01.polymorphism;

import java.security.PKCS12Attribute;

public class Application1 {
	
	public static void main(String[] args) {
		
		System.out.println("===========Animal 생성===========");
		
		Animal animal = new Animal();
		animal.eat();
		animal.run();
		animal.cry();
	
		System.out.println("=========== Rabbit 생성===========");

		Rabbit rabbit = new Rabbit();
		rabbit.eat();
		rabbit.run();
		rabbit.cry();
		System.out.println("=========== Tiger 생성===========");

		Tiger tiger = new Tiger();
		tiger.eat();
		tiger.run();
		tiger.cry();
		
		/* Rabbit 과 Tiger은 Animal 클래스를 상속받았다.
		 * 따라서 Rabbit은 Rabbit 타입이기도하면서 Animal타입이기도 하며
		 * Tiger은 Tiger타입이기도하면서 Animal타입이기도 하다.
		 * */
		
		Animal a1 = new Rabbit();
		Animal a2 = new Tiger();
		
		/* 하지만 반대로 Animal은 Animal이지 Tiger나 Rabbit이 아니다.
		 * */
		
//		Rabbit r = new Animal();
//		Tiger t = new Animal();
		System.out.println("============== 동적바인딩확인 ===========");
		
		/* 동적바인딩
		 * 컴파일 당시에는 해당 타입의 메소드와 연결되어 있다가
		 * 런타임 당시 실제 객체가 가진 오버라이딩 된 메소드로 바인딩이 바뀌어 동작하는 것을 의미
		 * */
		
		a1.cry();
		a2.cry();
		
		/* 현재 레퍼런스 변수의 타입은 Animal이기 대문에 Rabbit 과 Tigger가 가지고 있는 
		 * 고유한 기능을 동작시키지 못한다
		 * */
//		a1.jump();
//		a1.bite();

		/* 객체별로 고유한 기능을 동작시키기 위해서는 레퍼런스변수를 형변환 하여 Rabbit과 Tiger로 변경해야 메소드 호출이 가능하다.
		 * class type casting : 클래스 형변환
		 * 
		 * 타입 형변환 시 실제 인스턴스와 타입이 일치하지 않는 경우
		 * ClassCastException 발생할 수 있다.
		 * */
		
		((Rabbit)a1).jump();
		((Tiger)a2).bite();
		
		/* 타입형변환을 잘못하는 경우
		 * 컴파일시에는 문제가 되지 않지만 런타임 시 Exception발생
		 * */
//		((Tiger)a1).bite();
		
		/* 레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산
		 * instanceof
		 * */
		
		System.out.println("========= instanceof 확인 ==========");
		System.out.println("a1이 Tiger 타입인지 확인 :" + (a1 instanceof Tiger));
		System.out.println("a1이 Rabbit타입인지 확인 :" + (a1 instanceof Rabbit));
		
		/* 상속받은 타입도 함께 가지고 있다. */
		System.out.println("a1이 Animal 타입인지 확인 :" + (a1 instanceof Animal));
		
		/* 모든 클래스는 Object를 상위 클래스로 가진다.*/
		System.out.println("a1이 Object 타입인지 확인 :" + (a1 instanceof Object));
		
		if(a1 instanceof Rabbit) {
			((Rabbit)a1).jump();
		}
		
		if (a1 instanceof Tiger){
			((Tiger) a1).bite();
		}
		/* 클래스 형변환은 up-casting과 down-casting으로 구분할 수 있다.
		 * 
		 * up-casting : 상위타입으로 형변환 
		 * down-casting : 하위타입으로 형변환 
		 * */
		
		Animal animal1 = (Animal) new Rabbit(); // up-casting 명시적 형변환 
		Animal animal2 = new Rabbit(); // up-casting 묵시적 형변환
		
		Rabbit rabbit1 = (Rabbit) animal1; // down-casting 명시적 형변환 
//		Rabbit rabbit2 = animal2; // down-casting 묵시적 형변환 
		
		
	}
}




