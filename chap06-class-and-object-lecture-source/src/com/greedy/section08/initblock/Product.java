package com.greedy.section08.initblock;

public class Product {
	
	/* 필드를 초기화 하지 않으면 JVM이 정한 기본 값으로 객체 생성이 된다. */
//	private String name;
//	private int price;
//	private static String brand;
	
	/* 기본 값을 명시적 초기값으로 덮어 쓰는 경우*/
	private String name = "갤럭시";
	private int price = 1000000;
	private static String brand = "삼송" ;
	
	/* 인스턴스 초기화 블럭 */
	{
		this.name = "사이언";
		this.price = 900000;
		
		/* 인스턴스 초기화 블러에서는 static필드를 초기화 할 수 있는 것 처럼 보인다.
		 * 하지만 static 초기화 블럭은 클래스가 로드될 대 이미 기본값으로 초기화를 진행했다.
		 * 따라서 인스턴스 초기화 블럭이 동작하는 시점에서는 이미 초기화가 진행된 정적 필드에
		 * 인스턴스 초기화 블럭에서 대입한 값으로 덮어쓰게 되는 것.
		 * */
		brand = "사과";
		System.out.println("인스턴스 초기화 블럭 동작");
	}
	
	static {
		/* static 초기화 블럭에는 non-static 필드를 초기화 하지 못한다.
		 * 정적 초기화블럭은 클래스 로드 시에 동작한다.
		 * 따라서 정적 초기화 블럭의 종작 시점에는 인스턴스가 아무것도 존재할 수 없기 때문에 
		 * 존재하지 않는 인스턴스 변수에 초기화하는 것은 시기상으로 불가능하다.
		 * */
		
//		name = "아이뽕";
//		price = 200000;
		
		brand = "엘지";
		System.out.println("정적 초기화 블럭 동작");
	}
	
	
	/* 기본 생성자 */
	public Product() {
		System.out.println("기본 생성자 호출됨!!!");
	}

	/* 매개변수 있는 생성자 */
	public Product(String name, int price, String brand) {
		this.name = name;
		this.price = price;
		Product.brand = brand;
		System.out.println("매개변수있는 생성자 호출됨...");
	}

	@Override
	public String toString() {
		return "name = " + name + ", price = " + price + ", brand = "+ Product.brand;
	}
	
	
	
	
}
