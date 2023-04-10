package com.greedy.section03.dto;

public class MemberDTO {
	
	
	/* 행위 위주가 아닌 데이터를 하나로 뭉치기 위한 객체(Data Transfer Object)
	 * 
	 * DTO -> 값을 받아서 다른곳으로 이동시키는 용도 
	 * VO -> 값 객체 
	 * 값 객체를 설계할 때는 행위가 아닌 데이터가 위주이며, 캡슐화의 원칙을 준수하여
	 * 모든 필드를 private으로 직접접근을 막고, 각 필드값을 변경하거나 반환하는 메소드를 세트로 미리 작성해둔다
	 * 
	 * private 필드와 필드값을 수정하는 설정자(setter), 필드에 접근하는 접근자(getter)들로 구성한다.
	 * */
	
	/* 회원 정보
	 * 
	 * 회원번호, 회원명, 나이, 성별, 키 몸무게 회원탈퇴여부(활성화 여부)를 관리할 것.
	 * 
	 * 값 객체가 가지는 속성(필드)를 추출하는 과정 또한 추상화라고 볼 수 있다.
	 * 
	 * */
	
	private int number;				// 회원번호
	private String name;			// 회원명
	private int age;				// 나이
	private char gender;			// 성별
	private double height;			// 키
	private double weigth;			// 몸무게
	private boolean isActivated;	// 회원탈퇴여부(활성화여부)
	
	
	/* 설정자(setter) 접근자(getter)의 경우 실무에서 암묵적으로 통용되는 작성 규칙이 존재한다. */
	/* 설정자(setter) 작성 규칙
	 * : 필드값을 변경할 목적의 매개변수를 변겨하려는 필드와 같은 자료형을 선언하고
	 *   호출 당시 전달되는 매개변수의 값을 이용하여 필드의 값을 변경한다.
	 *   
	 *   [표현식]
	 *   public void set필드명(매개변수){
	 *   	필드 = 매개변수;
	 *   }
	 *   
	 * 	 [작성 예시]
	 * 	 public void setName(String name){
	 * 		this.name = name;
	 * 	 }
	 * 
	 *   접근자(getter) 작성 규칙
	 *  
	 *   [표현식]
	 *   public void get필드명(){
	 *   	return 반환값;
	 *   }
	 *   
	 *   [작성 예시]
	 * 	 public void getName(){
	 * 		return this.name;
	 * 	 }
	 *  
	 * */
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWeigth() {
		return weigth;
	}
	
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	
	public boolean isActivated() {
		return isActivated;
	}
	
	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}
	
	/* alt + shift + s*/
	
	
}
