package com.greedy.section04.dto;

import java.util.Date;

public class UserDTO {
	
	/* 일반적으로 DTO(Data Transfer Object)목적으로 설계된 클래스는 명사 뒤에 DTO를 붙인다.
	 * 
	 * UserDTO, MemberDTO, BoardDTO....... 
	 * 
	 * 자바빈(Java Bean)이란
	 * JSP(Java Server Page)에서 배우게 될 표줌 액션태그로 접근할 수 있는 자바 클래스이다.
	 * 
	 * 자바코드를 모르는 웹 퍼블리셔들도 자바 코드를 사용할 수 있도록 태그형식으로 지원하는 문법을 의미
	 * 그 때 사용할 수 있도록 규칙을 지정해 놓은 java클래스를 자바(java bean)이라고 부른다.
	 * 
	 * 자바빈 작성 규칙
	 * 1. 자바빈은 특정 패키지에 속해있어야 한다.(default 패키지 사용 금지)
	 * 2. 멤버변수의 접근제어자는 private로 선언해야한다.
	 * 3. 기본생성자는 명시적으로 존재해야한다(매개변수 있는 생성자는 선택사항)
	 * 4. 멤버변수에 접근 가능한 설정자(setter)와 접근자 (getter)가 public으로 작성되어있어야한다.
	 * 5. 직렬화(Serializable) 가 되어야한다. 
	 * 
	 * */
	
	
	/* 모든 필드를 private 접근 제한자 */
	private String id;
	private String pwd;
	private String name;
	private Date enrollDate;
	
	/* 기본생성자 명시적으로 작성 */
	public UserDTO() {
		
	}
	
	/* 매개변수 있는 생성자(상황에 따라 선택사항으로 생성) */
	public UserDTO(String id, String pwd, String name, Date enrollDate) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.enrollDate = enrollDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", enrollDate=" + enrollDate + "]";
	}
	
	
	
}
