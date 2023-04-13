package com.greedy.section01.object.run;

import com.greedy.section01.object.book.vo.BookVO;

public class Application1 {

	public static void main(String[] args) {
		
		/* 
		 * 
		 * 
		 * */
		
		
		BookVO book1 = new BookVO(1,"홍길동전", "허균", 50000);
		BookVO book2 = new BookVO(2,"목민심서", "정약용", 30000);
		BookVO book3 = new BookVO(2,"목민심서", "정약용", 30000);
		
		/* java.lang.Object 클래스의 toString()메소드의 기능
		 * 인스턴스가 생성될 때 사용한 full class name + @ + 16진수 해쉬코드가 반환
		 * */
		
		System.out.println("book1.toString() : " + book1.toString());
		System.out.println("book2.toString() : " + book2.toString());
		System.out.println("book3.toString() : " + book3.toString());

		System.out.println();
		System.out.println("book1 : " + book1);
		System.out.println("book2 : " + book2);
		System.out.println("book3 : " + book3);
		
	}
}
