package com.greedy.section02.set.run;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Application3 {

	public static void main(String[] args) {

		/* TreeSet클래스
		 * TreeSet 클래스는 데이터가 정렬된 상태로 저장되는 이진 검색트리의 형태로 요소를 저장.
		 * 이진 검색트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠르다.
		 * 
		 * JDK 1.2부터 제공하고 있으며 Set인터페이스가 가지는 특징을 그래도 가지지만 정렬된 상태를 유지
		 * 
		 * */
		
		TreeSet<String> tset = new TreeSet<>();
		
		tset.add("java");
		tset.add("html");
		tset.add("css");
		tset.add("oracle");
		tset.add("jdbc");
		
		System.out.println(tset);
		
		/* 출력 */
		/* 배열로 바꾸어 연속 처리 */
		
		Set<String> set = tset.stream().map(String::toUpperCase).collect(Collectors.toSet());
		
		Object[] arr = tset.toArray();
		
		for (Object object : arr) {
			System.out.println(((String)object).toUpperCase());
		}
		System.out.println("===============================");
		set.iterator().forEachRemaining(System.out::println);
		
		/* 로또번호 */
		
		Set<Integer> lotto = new TreeSet<>();
		
		while(lotto.size() < 6) {
			int random = (int) (Math.random() * 45) + 1;
			
			lotto.add(random);
		}
		
		System.out.println(lotto);
		
	}
	
}
