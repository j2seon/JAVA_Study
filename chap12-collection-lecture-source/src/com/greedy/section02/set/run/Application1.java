package com.greedy.section02.set.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
	
	public static void main(String[] args) {
		
		/* Set 인터페이스를 구현한 Set컬렉션 클래스의 특징
		 * 1. 요소의 저장순서를 유지하지 않는다.
		 * 2. 같은 요소의 중복 저장을 허용하지 않는다 (null값도 중복하지않게 하나의 null만 저장)
		 * */
		
		/* HashSet 클래스
		 * Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나
		 * JDK 1.2부터 제공 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점 
		 * */
		
		Set<String> hset = new HashSet<>();
		Collection<String> hset2 = new HashSet<>();
		
		hset.add("뭐먹지");
		hset.add("배고파");		
		hset.add("한솥..?");
		hset.add("냉면..?");
		
		// toString() 메소드가 오버라이딩 되어 있다.
		/* 저장 순서 유지가 안된다. */
		System.out.println(hset);
		
		/* 중복허용 x */
		hset.add("배고파");
		
		System.out.println("포함 : " + hset.contains("배고파"));
		
		/* 저장된 객체를 하나씩 꺼내는 기능은 제공하지 않음. 
		 * 
		 * 반복문을 이용한 연속처리하는 방법
		 * 1.toArray() 배열로 바꾸고 for loop 사용
		 * */
		Object[] array = hset.toArray();
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d : %s\n", i, array[i]);
		}
		System.out.println("==========================");

		/* 2. iter */
//		hset.iterator().forEachRemaining(System.out::println);
		Iterator<String> iter = hset.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//iter이 소모된거지 hset은 값이 계속있음.
		System.out.println(hset.isEmpty());
		
	}
}
