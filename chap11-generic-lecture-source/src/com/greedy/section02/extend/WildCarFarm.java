package com.greedy.section02.extend;

public class WildCarFarm {

	
	/**
	 * 토끼 농장에 있는 토끼가 어떤 토끼던 상관없다
	 */
	public void anyType(RabbitFarm<?> farm) {
		
		farm.getAnimal().cry();
		
	}
	
	/**
	 * 토끼농장의 토끼는 Bunny이거나 그 후손타입으로 만들어진 토끼 농장만 매개변수로 가능하다.
	 * @param farm
	 */
//	public void extendsType(RabbitFarm<? extends Bunny> farm) { // 이거랑 같은거
	public <T extends Bunny> void extendsType(RabbitFarm<T> farm) {
		
		farm.getAnimal().cry();
		
	}
	
	/**
	 * 토끼농장의 토끼는 bunny이거나 그 부모타입으로 만들어진 토끼 농장만 매개변수로 사용가능하다.
	 * @param farm
	 */
	public void superType(RabbitFarm<? super Bunny> farm) {
		
		farm.getAnimal().cry();
		
	}
	
}
