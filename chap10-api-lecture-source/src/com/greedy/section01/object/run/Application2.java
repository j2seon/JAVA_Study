package com.greedy.section01.object.run;

import com.greedy.section01.object.book.vo.BookVO;

public class Application2 {

	public static void main(String[] args) {
		
		/* equals() 메소드 오버라이딩
		 * 
		 * equals메소드는 매개변수로 전달받은 인스턴스와 == 연산하여 true or false를 반환한다.
		 * --> 동일한 인스턴스 인지를 비교하는 기능을 한다.
		 * 
		 * 동일 객체와 동등객체
		 * 동일객체 : 주소가 동일한 인스턴스를 통일 객체라고 한다.
		 * 동등객체 : 주소는 다르더라도 필드값이 동일한 객체를 동등객체라고한다.
		 * 
		 * equals() 메소드의 기본기능은 동일 객체를 판단한다(동일성확인)
		 * */
		
		BookVO book1 = new BookVO(1,"홍길동전", "허균", 50000);
		BookVO book2 = new BookVO(1,"홍길동전", "허균", 50000);

		System.out.println("book1.hashCode : " + book1.hashCode());
		System.out.println("book2.hashCode : " + book2.hashCode());
		
		System.out.println("book1==book2 : " + (book1==book2));
		System.out.println("book2.equals(book2) : "+(book2.equals(book2)));
		
	}

}
