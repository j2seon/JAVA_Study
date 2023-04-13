package com.greedy.section02.string;

public class Application4 {

	public static void main(String[] args) {
		
		/* 이스케이프(escape)문자
		 * 문자열 내에서 사용하는 문자 중 특수문자를 표현하거나 사용할 때 사용하는 문자이다.
		 * 
		 * 이스케이프문자 			의미
		 *   \n					개행(줄바꿈)
		 *   \t					탭
		 *   \'					작은 따옴표
		 *   \"					큰 따옴표
		 *   \\					역슬래사 표시
		 *    
		 * */
		System.out.println("안녕하세요\n 저는 홍길동입니다.");
		System.out.println("안녕하세요\t 저는 홍길동입니다.");
		System.out.println("안녕하세요\r 저는 홍길동입니다.");
		System.out.println("안녕하세요 저는 \'홍길동\'입니다.");
		System.out.println("안녕하세요 저는 \"홍길동\"입니다.");
		System.out.println("안녕하세요 저는 \\홍길동\\입니다.");
		
		/* 
		 * split 시 이스케이프 문자를 사용해야하는 특수문자도 존재
		 * 이스케이프 문자 사용 안하는 특수문자
		 * ~ ` ! @ # % & - _ = ; ' \ " , < > /
		 * 
		 * 이스케이프 문자를 사용하는 특수문자
		 * $ ^ * ( ) + | { } [ ] . ?
		 * 
		 * (정규표현식에서 사용되는 특수문자인 경우 \$가 정규표현식 문자와 겹치게 된다.
		 * 따라서 $를 기준으로 split을 하기 위해서는 정규표현식 문자가 아닌 $라는 구분자로 split하겠스는 의미로 사용되려면
		 * 구분자를 \$로 표현해야한다.
		 * 
		 * 하지만 역슬래시가 위에서 배운 이스페이프 문자의 역슬래시와 곂치게 된다.
		 * */
		
		String str = "java^oracle^jdbc";
		
		
		
	}
}
