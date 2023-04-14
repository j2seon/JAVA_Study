package com.greedy.section02.extend.run;

import com.greedy.section02.extend.Bunny;
import com.greedy.section02.extend.DrunkenBunny;
import com.greedy.section02.extend.Rabbit;
import com.greedy.section02.extend.RabbitFarm;

public class Application1 {

	public static void main(String[] args) {
		
		/* Animal 타입으로는 제네릭 클래스 인스턴스 생성이 불가능 */
//		RabbitFarm<Animal> farm1 = new RabbitFarm<>();
		
		/* Mammal 타입으로는 제네릭 클래스 인스턴스 생성이 불가능 */
//		RabbitFarm<Mammal> farm1 = new RabbitFarm<>();
		
		
		RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
		RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
		RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();
		
		farm1.setAnimal(new Bunny());
		farm1.getAnimal().cry();
		
		farm2.setAnimal(new Bunny());
		farm2.getAnimal();
		
		farm3.setAnimal(new DrunkenBunny());
		farm3.getAnimal();
		
	}
}
