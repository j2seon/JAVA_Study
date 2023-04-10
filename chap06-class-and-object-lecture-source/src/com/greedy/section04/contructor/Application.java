package com.greedy.section04.contructor;

import java.util.Date;

public class Application {

	public static void main(String[] args) {
		/* 클래스명 레퍼런스 변수 = new 클래스명(); 이렇게 객체를 생성했다.
		 * 하지만 new 뒤에 클래스명은 사실 생성자(Constructor)라 불리는 메소드를 호출하는 구문이다.
		 * 
		 *  정확히 말하면 클래스명 레퍼런스변수 = new 생성자();라고 표현한다.
		 *  
		 * */
		
		/* 생성자란
		 * 인스턴스를 생성할 대 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를 생성할 때 호출한다.
		 * 생성자 함수에 매개변수기 없는 생성자를 기본생성자(default constructor)라고 하며, 
		 * 기본생성자는 complier에 의해 자동으로 추가되기 때문에 지금까지 명시적으로 작성하지 않고 사용할 수 있었다. 
		 * 
		 * 이렇게 기본 생성자를 이용해 인스턴스를 생성하게 되면 자바에서는 자료형별 초기값을 이용해 필드를 초기화한다.
		 * 필드의 초기값을 사용자가 원하는 대로 설정하고 싶은 경우 생성자의 호출 시 인자로 값을 전달하여 호출할 수 잇다.
		 * 이러한 인자를 받아 필드를 초기화 할 목적의 생성자를 매개변수있는 생성자라고 한다.
		 * 
		 * 하지만 매개변수 있는 생성자가 한개라도 존재할 경우 complier는 기본생성자를 자동으로 추가해주지 않으니
		 * 사용시 주의해야한다.
		 * 
		 * 매개변수 있는 생성자는 주로 인스턴스 생성 시점에 필드의 값을 사용자가 원하는 대로 초기화할 목적으로 사용한다.
		 * */
	
		/* 기본생성자 호출 */
		User user1 = new User();
		System.out.println(user1.toString());
		
		/* id, pwd, name을 매개변수로 전달받는 생성자를 호출 */
		User user2 = new User("user2", "1234", "홍길동");
		System.out.println(user2.toString());

		
		/* 모든필드를 초기화 하는 생성자를 호출 */
		User user3 = new User("user3", "1234", "이순신", new Date());
		System.out.println(user3.toString());
		
		User user4 = new User(user3);
		System.out.println(user4.toString());
		
		
		
	}
	
}
