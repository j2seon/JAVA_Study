package com.greedy.section05.parameter;

public class RectAngle {

	
	/* 사격형의 길이와 높이를 저장하는 필드 */
	private double width;
	private double height;
	
	/* 기본 생성자로 객체 생성을 막고, 모든 필드를 초기화하는 생성자를 추가
	 * 반드시 초기값을 입력해서 인스턴스를 생성하도록 제한시킨다.
	 *  
	 * */
	
	public RectAngle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * <pre>
	 * 사각형의 넓이를 구하는 용도의 메소드
	 * </pre>
	 */
	public void calcArea() {
		double area = width * height;
		
		System.out.println("이 사각형의 넓이는 " + area + "입니다.");
		
	} 
	
	/**
	 * <pre>
	 * 사각형의 둘레를 구하는 용도의 메소드
	 * </pre>
	 */
	public void calcRound() {
		double round = (width+ height) * 2;
		
		System.out.println("이 사각형의 둘레는 " + round + "입니다.");
	}
	
	
	
	
}
