package com.greedy.section01.generic;

public class Application {

	public static void main(String[] args) {
		
		/* 제네릭
		 * 
		 * 제네릭의 사전적인 의미는 일반적인이라는 의미를 가지며
		 * 자바에서 제네릭이랑 테이터 타입을 일반화한ㄴ다는 의미를 가진다
		 * 
		 *  제네릭은 클래스나 메소드에서 사용할 내부데이터 타입을 컴파일 시에 지정하는 방법을 말한다.
		 *  컴파일 시에 미리 타입 검사를 시행하게 되면 클래스나 메소드 내부에서 사용되는 객체의 타입안정성을 높일 수 있으며
		 *  (잘못된 타입의 경우 컴파일 에러를 발생시킴)
		 *  반환값에 대한 타입 변환 및 타입검사에 들어가는 코드 생략이 가능하다.
		 *  (instanceof 비교 및 다운 캐스팅 작성 불필요)
		 * 
		 * 제네릭 프로그래밍 
		 * 데이터의 형식에 의존하지 않고 하나의 값이 여러 다른 데이터 타입들을 가질 수 있는 기술에 중점을 두어
		 * 재사용성을 높일 수 있느 프로그래밍 방식이다.
		 * 
		 * */
		
		GenericTest<Integer> gt1 = new GenericTest<>();
		
		gt1.setValue(10);
		
		System.out.println(gt1.getValue());
		System.out.println(gt1.getValue());
		
		GenericTest<String> gt2 = new GenericTest<>();
		
		gt2.setValue("홍길동");
		System.out.println(gt2.getValue());
	
		GenericTest<Double> gt3 = new GenericTest<>();		
		gt3.setValue(0.5);
		
		
		

	}

}