package com.greedy.section03.filterstream;

import java.io.Serializable;

public class MemberVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String pwd;
	private String name;
	private String email;
	private int age;
	private char gender;
	private transient double pcint; // transient 직렬화시 제외하고 넘기겟다.

	public MemberVO() {}

	public MemberVO(String id, String pwd, String name, String email, int age, char gender, double pcint) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.pcint = pcint;
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public double getPcint() {
		return pcint;
	}
	
	public void setPcint(double pcint) {
		this.pcint = pcint;
	}
	
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", age=" + age
				+ ", gender=" + gender + ", pcint=" + pcint + "]";
	}



}
