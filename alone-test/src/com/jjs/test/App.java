package com.jjs.test;


import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


public class App {
	public static void main(String[] args) {
		
		UnaryOperator<String> hi1 = (str) -> "hi " + str;
		
		// static 메소드를 사용
		UnaryOperator<String> hi2 = Greeting::hi; 
		System.out.println(hi2.apply("jjs")); // Greeting의 static 메소드 hi 실행됌.
		
		//인스턴스 메소드를 사용
		Greeting greeting = new Greeting();
		UnaryOperator<String> hello = greeting::hello;
		System.out.println(hello.apply("ss")); // Greeting의 인스턴스 메소드 hello 실행됌
		
		//기본 생성자 
		Supplier<Greeting> sup = Greeting::new;
		System.out.println(sup.get()); // 객체 생성된 것 확인 
		
		//입력값있는 생성자 
		
		Function<String, Greeting> sup2 = Greeting::new;
		System.out.println(sup2.apply("jjs").getName());
		
		String[] names = {"kay","jjs","ywj"};
//		Arrays.sort(names, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return 0;
//			}
//		});
		
		//타입의 인스턴스메소드 사용 
		Arrays.sort(names, String::compareToIgnoreCase);
		
		System.out.println(Arrays.toString(names));
		
		DefaultFoo foo = new DefaultFoo("java");
		foo.printName();
		foo.printNameUpperCase();
		
	}
}
