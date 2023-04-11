package com.greedy.section06.sigleton;

import com.greedy.section06.statickeyword.StaticFieldTest;

public class Application {

	public static void main(String[] args) {
		
		/* 
		 * static을 이용한 싱글톤 패턴
		 * singleton pattern이란
		 * 애플리케이션이 시작될 대 어떤 클래스가 최초 한 번만 메모리를 할당하고 
		 * 그 메모리에 인스턴스를 만들어서 하나의 인스턴스를 공유해서 사용하며 
		 * 메모리 낭비를 방지할 수 있게한다(매번 인스턴스를 생성하지 않는다)
		 * 
		 * 장점
		 * 1. 첫번째 이용 시에는 인스턴스를 생성해야 하므로 속도차이가 나지 않지만 
		 * 	  두번째 이용 시에는 인스턴스 생성 시간 없이 사용할 수 있다
		 * 2. 인스턴스가 절대적으로 한 개만 존재하는 것을 보증할 수 있다.
		 *  
		 * 단점
		 * 1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다.
		 *   (유지보수와 테스트에 문제점이 있음)
		 * 2. 동시성 문제를 고려해서 설계해야하지 때문에 난이도가 있다. 
		 * 
		 * */
		
		/* 싱글톤 구현 방법
		 * 1. 이른 초기화(Eager Initialization)
		 * 2. 게으른 초기화(Lazy Initialization)
		 * */
		EagerSingleton singleton1 = EagerSingleton.getInstance();
		EagerSingleton singleton2 = EagerSingleton.getInstance();
		
		
		System.out.println(singleton1);
		System.out.println(singleton2);
		
		LazySingleton lazy1 = LazySingleton.getInstance();
		LazySingleton lazy2 = LazySingleton.getInstance();
		
		System.out.println(lazy1);
		System.out.println(lazy1);
		
		/* 이른 초기화를 사용하면 클래스를 로드하는 속도가 느려지지만 
		 * 처음 인스턴스 반환 요청에서 속도가 빠르다는 장점을 가진다.
		 * 반면 게으른 초기화는 클래스를 로드하는 속도는 빠르지만
		 * 첫 번째 요청에 대한 속도가 두번째 요청에 대한 속도보다 느리다는 특징을 가지게된다.
		 * */
		
		StaticFieldTest sft1 = new StaticFieldTest();
		System.out.println("non-static field : " + sft1.getNonStaticCount());
		System.out.println("static field : " + sft1.getStaticCount());
		
		sft1.increaseNonStaticCount();
		sft1.increaseStaticCount();
		
		StaticFieldTest sft2 = new StaticFieldTest();
		System.out.println("non-static field : " + sft2.getNonStaticCount());
		System.out.println("static field : " + sft2.getStaticCount());
		
		/* 인스턴스 변수의 경우에는 sft1과 sft2 두개의 인스턴스가 서로 값을 공유하지 못하고
		 * 인스턴스를 생성할때마다 0으로 초기화된다/
		 * 하지만 static 필드의 경우에는 클래스 변수 자체가 프로그램을 종료할 때까지 유지되고 있기 때문에
		 * 값을 유지하고 있다.
		 * 
		 * 따라서 static 필드는 여러개의 인스턴스가 같은 공간을 공유할 목족으로 필드에 static키워드를 사용한다.
		 * */
		
		
	}

}
