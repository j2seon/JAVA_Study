package com.greedy.section01.user_type;

import java.util.Arrays;

public class Member {
	
	/* 우리는 지금까지 클래스 내부에 메소드만 작성해봤다
	 * 하지만 클래스 내무에는 메소드를 작성하지 않고 바로 변수를 선언할 수 있다
	 * 이것을 전역변수(필드 == 인스턴스 변수 == 속성)
	 * */
	
	String id;
	String pwd;
	String name;
	int age;
	char gender;
	String[] hobby;
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", age=" + age + ", gender=" + gender
				+ ", hobby=" + Arrays.toString(hobby) + "]";
	}
	
	

}
