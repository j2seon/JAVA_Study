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

	
	
	
}
