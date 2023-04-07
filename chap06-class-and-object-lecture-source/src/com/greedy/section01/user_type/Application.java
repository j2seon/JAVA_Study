package com.greedy.section01.user_type;

import java.util.Arrays;


public class Application {

	public static void main(String[] args) {
		

		String id = "user01";
		String pwd = "pass01";
		String name = "홍길동";
		int age = 20;
		char gender = '남'; 
		String[] hobby = {"축구", "볼링", "테니스"}; 
		
		System.out.printf("id = %s, pwd = %s, name = %s, age = %d, gender = %c \n", id, pwd, name, age, gender);
		System.out.println("hobby = " + Arrays.toString(hobby));
		
		/* 각각의 변수로 관리하게 되면 여러가지 단점이 있다.
		 * 1. 변수명을 다 관리해야 하는 어려움이 생긴다.
		 * 2. 모든 회원정보를 인자로 메소드 호출 시 값을 전달해야하면 너무 많은 값들을 인자로 전달해야해서 한눈에 안들어온다
		 * 3. 리턴은 1개의 값만 가능하지 대문에 회원정보를 묶어서 리턴값으로 사용할 수 있다.
		 * 	  (서로다른 자료형들이기 때문에)
		 * */
		
		/* 사용자 정의 자료형 사용하기 */
		/* 1. 변수 선언 및 객체(instance) 생성 */
		Member member = new Member();
		System.out.println("member.id = " + member.id);
		System.out.println("member.pwd = " + member.pwd);
		
		/* heap에 생성되기 때문에 JVM이 기본값으로 초기화해준다 */
		
		/* 필드에 접근하기 위해서는 레퍼런스변수명.필드명으로 접근한다.
		 * 
		 * '.'은 참조연산자라고 하는데 레퍼런스 변수가 참조하고 있는 주소로 접근한다는 의미
		 * 각 공간은 필드명으로 접근한다(배열은 인덱스로 접근, 객체는 필드명으로 접근) 
		 * */
		
		/* 필드에 접근해서 변수 사용하듯이 사용할 수 있다. */
		
		member.id = id;
		member.pwd = pwd;
		member.age = age;
		member.name = name;
		member.gender = gender;
		member.hobby = hobby;
		
		System.out.println(member.toString());
		
	}

}
