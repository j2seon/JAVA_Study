package com.greedy.section02.extend;

public class Application2 {

	
	public static void main(String[] args) {
		/* 와일드 카드(WildCard)
		 * 제네릭  클래스 타입의 객체를 메소드의 매개변수로 받을 때 그 각체의 타입변수를 제한 할 수 있다.
		 * 
		 * 
		 * <?> : 제한없음
		 * <? extends Type> : 와일트카드의 상항제한(Type과 Type의 후손을 이용해 생성한 인스턴스만 인자로 가능)
		 * <? super Type> : 와일드 카드의 하한 제한(Type과 Type의 부모를 이용해 싱성한 안스턴스만 인자로 사용 가능)
		 * 
		 * */
		
		
		WildCarFarm wildCarFarm = new WildCarFarm();
		
		/* 매개변수의 타입제한이 없는 경우 */
		/* 농장 생성 자체가 불가능한 것은 매개변수로 사용할 스 */
//		wildCarFarm.anyType( new RabbitFarm<Mammal>(new Mammal));
		
		wildCarFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
		
		new RabbitFarm<Rabbit>(); // 기본생성자이면서 제네릭 추가
		new RabbitFarm<Rabbit>(new Rabbit()); // 매개변수있는 생성자이면서 제네릭 추가 
		
		wildCarFarm.anyType(new RabbitFarm<Rabbit>(new Rabbit()));
		wildCarFarm.anyType(new RabbitFarm<Bunny>(new Bunny()));
		wildCarFarm.anyType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny()));

		wildCarFarm.extendsType(new RabbitFarm<Bunny>(new DrunkenBunny()));
		wildCarFarm.extendsType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny())); // bunny를 상속해서 가능
		
		wildCarFarm.superType(new RabbitFarm<Bunny>(new Bunny()));
		wildCarFarm.superType(new RabbitFarm<Rabbit>(new Bunny()));
//		wildCarFarm.superType(new RabbitFarm<DrunkenBunny>()); // Bunny 하위라서 안됌
		
		
	}
	
	
}
