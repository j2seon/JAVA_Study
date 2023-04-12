package com.greedy.section01.polymorphism;

public class Application3 {

	public static void main(String[] args) {
		/* 매개변수에도 다형성을 활용할 수 있다. */
		
		
		Application3 application3 = new Application3();
		
		Animal animal1 = new Rabbit();
		Animal animal2 = new Tiger();
		
		application3.feed(animal1);
		application3.feed(animal2);
		
		Animal animal3 = new Rabbit();
		Animal animal4 = new Tiger();
		
		application3.feed((Animal) animal3); // 명시적 형변환
		application3.feed((Animal) animal4);		
		
		application3.feed((Animal) animal4); // 묵시적 형변환
		application3.feed((Animal) animal4);		
	}
	/**
	 * <pre>
	 * 동물에게 먹이를 주기 위한 용도의 메소드
	 * </pre>
	 * @param animal 먹이를 줄 동물
	 */
	public void feed(Animal animal) {
		animal.eat();
	}
	
}
