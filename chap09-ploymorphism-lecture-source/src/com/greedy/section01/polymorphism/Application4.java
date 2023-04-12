package com.greedy.section01.polymorphism;

public class Application4 {
	
	public static void main(String[] args) {
		
		Application4 application4 = new Application4();
		
		Animal animal = application4.getRandomAnimal();
		animal.cry();
		
		
	}
	
	public Animal getRandomAnimal() {
		int random = (int) (Math.random() * 2);
		
		return (random == 0)? new Rabbit() : new Tiger(); 
	}
	
	
}
