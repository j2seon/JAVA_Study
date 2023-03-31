package com.greedy.section01.literal;


public class Application1 {

	// 한줄 주석
	
	/* 여러줄 주석
	 * 
	 * Ctrl + shift+ /
	 * 해제할 경우 : Ctrl + shift+ \
	 * 
	 * */ 
	
	public static void main(String[] args) {
	
		//츌력
		System.out.println(123); // 정수
		System.out.println(1.25); // 실수
		
		System.out.println('a'); // 문자(Char)
//		System.out.println('ab'); // 두개 이상은 문자로 취급 x
		
//		System.out.println(''); // 빈문자는 에러가 발생
		System.out.println('1'); // 문자로 인식
		
		System.out.println("안녕하세요"); // 문자열(String)은 문자가 나열된 상태
		System.out.println("123"); // 문자열로 인식
		System.out.println(""); // 빈 쌍따옴표도 문자열로 취급	
		System.out.println("a"); //하나의 문자도 쌍따옴표로 감싸면 문자열임
		
		System.out.println(true); // 참
		System.out.println(false); // 거짓
		
		
		
	}

}
