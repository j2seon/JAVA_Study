package com.greedy.section06.sigleton;

public class LazySingleton {

	private static LazySingleton lazy;

	private LazySingleton() {} 
	
	public static LazySingleton getInstance() {

		if(lazy == null ) {
			return new LazySingleton();
		}
		
		return lazy;
	}
	
}
