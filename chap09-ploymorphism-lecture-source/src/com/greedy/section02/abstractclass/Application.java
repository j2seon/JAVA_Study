package com.greedy.section02.abstractclass;

public class Application {

	public static void main(String[] args) {
		
		/* 추상클래스와 추상메소드
		 * 추상메소드를 0개이상 포함하는 클래스를 추상클래스라고한다.
		 * 
		 * 추상클래스는 클래스 선언부에 abstract 키워드를 명시해야한다.
		 * 추상클래스는 인스턴스를 생성할 수 없다.
		 * 
		 * 추상클래스를 상속받아 구현할 때는 extends 키워드를 사용하며 
		 * 자바에서는 extends로 클래스를 상속받을 시 하나의 부모클래스만 가질 수 있다.(단일상속)
		 * 
		 * 추상메소드란? 
		 * 메소드의 선언부만 있고 구현부가 없는 메소드를 추상메소드라고 한다.
		 * 추상 메소드의 경우 반드시 abstract 키워드를 메소드 헤드에 작성해야한다.
		 * 
		 * 예) public abstract void method();
		 * */
		
		
		/* 추상클래스는 생성자도 가질 수 있다.
		 * 하지만 직접적으로 생성할 수는 없다.
		 * */
//		Product product = new Product();
		
		
		SmartPhone smartPhone = new SmartPhone(); // smartPhone타입, Product 타입
		System.out.println(smartPhone instanceof SmartPhone);
		System.out.println(smartPhone instanceof Product);
		
		/* 따라서 다형성을 적용해서 추상클래스를 레퍼런스 타입으로 활용할 수 있다. */
		Product product = new SmartPhone();
		
		product.abstMethod(); // 동적바인딩
		
		product.nonStaticMethod();
		
		product.staticMethod();
		Product.staticMethod();
		
		/* 추상클래스를 왜 쓰는가
		 * 추상클래스의 추상메소드는 오버라이딩에 대한 강제성이 부여된다.
		 * 따라서 여러클래스들을 그룹화하여
		 * 필수 기능을 정의하여 강제성을 부여해 개발시 일관된 인터페이스를 제공할 수 있음.
		 * */
		
		
	}
}
