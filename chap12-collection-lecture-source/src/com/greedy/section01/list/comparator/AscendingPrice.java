package com.greedy.section01.list.comparator;

import java.util.Comparator;

import com.greedy.section01.list.dto.BookDTO;

public class AscendingPrice implements Comparator<BookDTO>{

	@Override
	public int compare(BookDTO o1, BookDTO o2) {
		
		/* sort()에서 내부적으로 사용하는 메소드 */
		
		/* 비교 대상 두 인스턴스의 가격이 오름차순 정렬이 되기 위해서는 
		 * 앞의 가격이 더 적은 가격이여야한다.
		 * 
		 * 만약 뒤의 가격이 더 적은 경우에는 두 인스턴스의 순서를 바꿔야한다.
		 * 그때 두 값을 바꾸라는 신호로 양수를 보내주게되면 정렬시 순서를 바꾸는 조건으로 사용된다.
		 * 
		 * */
		
		int result = 0;
		
		if(o1.getPrice() > o2.getPrice()) {
			
			/* 오름차순을 위해 순서를 바꿔야하는 경우 양수를 반환 */
			result = 1;
		} 
		
		if (o1.getPrice() < o2.getPrice()) {
			/* 이미 오름차순으로 정렬 되어있는 경우 음수를 반환 */
			result = -1;
		}
		
		
	/* 값이 같은 경우 0을 반환*/	
		return result;
	}

}
