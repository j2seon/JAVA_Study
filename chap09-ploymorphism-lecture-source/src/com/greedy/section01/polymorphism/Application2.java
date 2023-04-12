package com.greedy.section01.polymorphism;

public class Application2 {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[5]; // 객체 배열
		animals[0] = new Rabbit();
		animals[1] = new Tiger();
		animals[2] = new Rabbit();
		animals[3] = new Tiger();
		animals[4] = new Rabbit();
		
		for (int i = 0; i < animals.length; i++) {
			animals[i].cry();
		}
		
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof Rabbit) {
				((Rabbit) animals[i]).jump();
			}
			if(animals[i] instanceof Tiger) {
				((Tiger) animals[i]).bite();
			}
			
		}
	}
}
