package com.greedy.section06.sigleton;

public class EagerSingleton {

	
	/* 클래스가 초기화 되는 시점에서 인스턴스를 생성한다.*/
	private static final EagerSingleton eagerSingleTon = new EagerSingleton();
	
	static {
		EagerSingleton eagerSingleton2 = new EagerSingleton();
	}
	
	/* 싱글톤 패턴은 생성자 호출을 통해 외부에서 인스턴스를 생성하는 것을 제한한다. */
	private EagerSingleton() {}
	
	public static EagerSingleton getInstance() {
		return eagerSingleTon;
	}
}
