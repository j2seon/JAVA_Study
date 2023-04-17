package com.greedy.section01.list.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.greedy.section01.list.comparator.AscendingPrice;
import com.greedy.section01.list.dto.BookDTO;

public class Application2 {

	public static void main(String[] args) {
		
		/* ArrayList의 용법과 정렬 확인 */
		
		List<BookDTO> bookList = new ArrayList<>();
		
		bookList.add(new BookDTO(1,"홍길동전", "허균", 50000));
		bookList.add(new BookDTO(2,"목민심서", "정약용", 30000));
		bookList.add(new BookDTO(3,"동의보감", "허준", 40000));
		bookList.add(new BookDTO(4,"삼국사기", "김부식", 45000));
		bookList.add(new BookDTO(5,"삼국유사", "일연", 43000));
		
		//Ascending (ASC) : 오름차순
		//Decending (DESC) : 내림차순
		
		/* 제네릭 타입의 comparable을 구현한 */
//		Collections.sort(bookList);
		
		bookList.stream().forEach(System.out::println);
		
		/* Comparator 인터페이스를 상속받아 정렬의 기준을 정해준 뒤 Lis의 default 매소드인 sort()
		 * 인자로 정렬 기준이 되는 인스턴스를 넣어주게 되면 내부적으로 오버라이딩한 메소드가 동작하여 정렬
		 *  
		 * */
		
		bookList.sort(new AscendingPrice());
		
		System.out.println("================== 가격 오름차순 ================");
		bookList.stream().forEach(System.out::println);
		
		/* 인터페이스를 구현한 클래스를 재사용하는 경우 AsecendingPrice클래스 처럼 작성하면 되지만
		 * 한 번만 사용하기 위해서는 익명클래서(Anonymous)를 이용할 수 있다.
		 * */
		
		bookList.sort(new Comparator<BookDTO>() {
			
			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				return o1.getPrice() >= o2.getPrice() ? -1 : 1;
			}
			
		});
		
		/* 제목 순 오름차순 정렬 */
		
		bookList.sort(new Comparator<BookDTO>() {

			/* 문자열은 대소비교를 할 수 없다.
			 * 문자 배열로 변경 후 인덱스 하나하나를 비교해서 어느 것이 더 큰 값인지 확인해야하는데
			 * String클래스의 compareTo() 메소드에서 이미 정의를 해놓았다
			 * */
			
			/* 앞의 값이 더 작은 경우(즉, 바꾸지 않아도 되는 경우) 음수
			 * 같으면 0,
			 * 앞에 값이 더 큰경우 양수 반환(바꿔야하는 경우)
			 * 
			 * */
			@Override
			public int compare(BookDTO o1, BookDTO o2) {
				return o1.getTitle().compareTo(o2.getTitle());
			}
			
		});
		
		
		System.out.println("================== 제목 오름차순 ================");
		bookList.stream().forEach(System.out::println);
		
		
	}
}
