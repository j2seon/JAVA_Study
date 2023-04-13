package com.greedy.section03.interfaceImplements;

import java.io.Serializable;

public class Product implements InterProduct, Serializable {

	@Override
	public void nonstaticMethod() {
		
		System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출함");
	}

	@Override
	public void abstMethod() {
		
		System.out.println("InterProduct의 abstMethod 오버라이딩한 메소드 호출함.");
	}

	/* static 메소드는 오버라이딩 할 수 있다. */
	
	
	/* default 메소드는 인터페이스에서만 작성 가능하다. */	
	@Override
	public void defaultMethod() {
		System.out.println("Product 클래스의 defaultMethod 호출됨");
		//InterProduct.super.defaultMethod();
	}

	
	
}
