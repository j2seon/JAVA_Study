package com.greedy.section04.contructor;

import java.util.Arrays;
import java.util.Date;

public class User {
	private String id;
	private String pwd;
	private String name;
	private Date enrollDate; // 필드로 다른 클래스 자료형도 사용할 수 있다.

	
	/* 생성자의 작성 위치
	 * 
	 * 작성 위치는 문법상으로는 클래스 내부에 작성하면되지만,
	 * 통상적으로 필드 선언부와 메소드 선언부 사이에 작성하는 것이 관례이다.
	 * */
	
	/* 생성자의 사용 목적 
	 * 1. 인스턴스 생성 시점에 수행할 명령이 있는 경우 사용한다.
	 * 2. 매개변수 있는 생성자의 경우 매개변수로 전달받은 값으로 필드를 초기화하여 인스턴스를 생성할 목적으로 주로 사용된다.
	 * 3. 작성한 생성자 외에는 인스턴스를 생성하는 방법을 제공하지 않는다는 의미를 가진다.
	 * 	  따라서, 인스턴스를 생성하는 방법을 제한하기 위한 용도로 사용할 수 도 있다.(초기값 전달 강제화)
	 * 
	 * 생성자 작성방법
	 * -> 메소드를 작성하는 방법과 매우 유사하다.
	 * 1. 생성자 메소드는 반드시 클래스의 이름과 동일해야한다(대/소문자까지 같아야한다)
	 * 2. 생성자 메소드는 반환형을 작성하지 않는다(작성하는 경우 생성자가 아닌 메소드로 인식한다.)
	 * 
	 * */
	
	public User() {
		
		System.out.println("User 클래스의 기본 생성자 호출함...");	
	}

//	public User() {} // 동일한 이름의 생성자 혹은 메소드를 한 클래스 안에서 작성하는 것은 불가능하다.
	
	/* 매개변수 있는 생성자 */
	/* 매개변수 선언부에 작성한 매개변수의 타입, 갯수, 순서에 따라 동일한 생성자 혹은 메소드를
	 * 한 클래스 내에 여러개 작성할 수 있게 만든 기술이다.(오버로딩)
	 *  
	 * */
	public User(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		
		System.out.println("User 클래스의 id, pwd, name을 초기화하는 생성자 호출함..");
	}

	/* 중복되는 초기화 내용이 발생하게 되는데, 이 중복되는 초기화 내용을 줄여서  작성할 수 있다.
	 * this()메소드를 이용하는 것.
	 * this()는 동일 클래스 내에 작성한 다른 생성자 메소드를 호출하는 구분
	 * 괄호 안에 매개변수의 타입, 갯수, 순서에 맞는 생성자를 호출하고 복귀한다.
	 * 리턴되어 돌아오지만 리턴값을 존재하지 않는다
	 * this()는 가장 철줄에 선언해야하며, 그렇지 않으면 compile error가 발생한다.
	 *  
	 * */
	
	public User(String id, String pwd, String name, Date enrollDate) {
		this(id,pwd,name);
		this.enrollDate = enrollDate;
	}
	

	/* 복사 생성자
	 * 이미 만들어진 동일한 타입의 인스턴스가 가지는 필드 값을 이용해서 새로운 인스턴스 생성 시 초기화 값으로 이용할 수 있다.
	 * 동일한 값을 가지지만 새롭게 할당되는 인스턴스이기 대문에 서로 다른 주소 값을 가지게 된다.(깊은 복사)
	 * 
	 * */

	public User(User otherUser) {
		this(otherUser.id,otherUser.pwd, otherUser.name,otherUser.enrollDate);
		System.out.println("User 클래스의 복사 생성자 호출함.");
		System.out.println("this의 hashcode = "+ this.hashCode());
		System.out.println("other의 hashcode = "+ otherUser.hashCode());
	}	

	
	@Override
	public String toString() {
		return "User [id=" + id + ", pwd=" + pwd + ", name=" + name + ", enrollDate=" + enrollDate + "]";
	}
	
	
	
	
	
	
}
