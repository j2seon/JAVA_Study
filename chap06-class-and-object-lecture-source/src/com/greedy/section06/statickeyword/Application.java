package com.greedy.section06.statickeyword;

public class Application {
	
	public static void main(String[] args) {
		

		/* static 키워드와 final 키워드 */
		/*
		 * static : 정적 메모리 영역에 프로그램이 start 될 때 할당을 하는 키워드 이다.
		 * 		  	인스턴스를 생성하지 않고도 사용할 클래스의 멤버(필드, 메소드)에 지정할 수 있다
		 * 			여러 인스턴스가 공유해서 사용할 목적의 공간이다/
		 * 			하지만 static 키워드의 남발을 유지보수와 추적이 힘든 코드를 작성하는 피해야할 방식이다.
		 * 			명확한 목적이 존재하지 않는 이상 static 키워드 사용은 자제하다
		 * 			의도적으로 static 키워드를 사용하는 대표적인 예는 Singleton 객체를 생성할 때이다.
		 * 
		 * final : final은 종단의 의미를 가지는 키워드이다.
		 * 		   final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미가 약간은 다르지만, 결국 변경불가의 의미이다.
		 * 		   1. 지역변수 : 초기화 이후 값 변경 불가
		 * 		   2. 매개변수 : 호출 시 전달한 인자 변경 불가
		 *         3. 전역변수 : 인스턴스 생성 후 초기화 이후에 값 변경 불가
		 *         4. 클래스(static)변수 : 프로그램 start 이후 값변경 불가
		 *         5. non-static 변수 : 메소드 재작성(overriding) 불가
		 *         6. static 메소드 : 메소드 재작성(overriding) 불가
		 *         7. 클래스 : 상속불가
		 * 
		 * */
		
		StaticMethodTest smt = new StaticMethodTest();
		smt.nonStaticMethod();
		
		/* static 메소드도 이렇게 호출은 할 수 있다.
		 * 하지만 static 메소드의 경우에는 인스턴스를 생성하지않고 호출하는 방식으로 사용해야한다.
		 * static method는 정적영역에 두고 인스턴스를 생성하지 않고 호출할 목적으로 만들기 때문에
		 * static 메소드를 호출하는 방식으로 호출해야한다.
		 * */
		
		smt.staticMethod(); // 가능하지만 권장하지 않는다.
		
		
	}

}

