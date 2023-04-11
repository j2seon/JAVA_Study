package com.jjs.test;

public class DefaultFoo implements Foo{

	String name;

	
	public DefaultFoo(String name) {
		this.name = name;
	}

	@Override
	public void printName() {
		
		System.out.println(this.name);
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override // 재정의도 가능하다.
	public void printNameUpperCase() {
		System.out.println("재정의한 메소드 : " + this.name.toUpperCase());
	}
	
	
}
