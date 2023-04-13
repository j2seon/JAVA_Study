package com.greedy.section01.object.run;

import java.util.HashMap;
import java.util.Map;

import com.greedy.section01.object.book.vo.BookVO;

public class Application3 {

	
	public static void main(String[] args) {
		/* Object 클래스의 명세에 작성된 일반 규약에 따르면 
		 * equals() 메소드를 재정의 하는 경우 반드시 hashcode()메소드도 재정의 하도록 되어있다.
		 * 
		 * 만약 hashCode를 재정의하지 않으면 같은 값을 가지는 동등객체를 
		 * 같은 해쉬코드 값을 가져야한다는 규약에 위반되게된다
		 * (강제성은 없지만 작성하는 것이 좋다...)
		 * 
		 * */
		
		BookVO book1 = new BookVO(1, "홍길동전", "허균", 50000);
		BookVO book2 = new BookVO(1, "홍길동전", "허균", 50000);

		System.out.println("book1.hashCode : " + book1.hashCode());
		System.out.println("book2.hashCode : " + book2.hashCode());
		
		/* Map은 key value를 쌍으로 저장하는 자료구조를 상속받아서 구현한 HashMap에 
		 * key로 홍길동전 정보를 가지는 BookVO타입의 인스턴스를 사용
		 * 
		 * HashMap에서 홍길동전 정보를 가지는 인스턴스로 값을 꺼내오려 할 때 
		 * hashCode가 재정의 되어 동일한 필드의 경우 hashCode가 반환되도록 작성되어 있지 않다면 
		 * 결과 값이 예상과 다르게 동작
		 * */
		Map<BookVO, String> map = new HashMap<>();
		map.put(new BookVO(1, "홍길동전", "허균", 50000), "selled");
		
		String str = map.get(book1);
		System.out.println(str);
		
		
	}
	
}
