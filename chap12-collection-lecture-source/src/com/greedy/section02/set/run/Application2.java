package com.greedy.section02.set.run;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {

	public static void main(String[] args) {
		
		/* LinkedHashSet 클래스
		 * HashSet이 가지는 기능을 모두가지고 있고
		 * 추가적으로 저장순서를 유지하는 특징을 가지고 있다 
		 * */
		
		LinkedHashSet<String> lhset = new LinkedHashSet<>();
		
		lhset.add("java");
		lhset.add("html");
		lhset.add("css");
		lhset.add("oracle");
		lhset.add("jdbc");
		
		System.out.println(lhset);
		
		/* 오름차순 정렬을 원하면 같은 클래스 타입일 때만 가능하고
		 * 만들어진 linkedHashSet을 가지고 TreeSet으로 객체를 생성하면 
		 * 같은 타입의 객체를 자동으로 비교하여 오름차순으로 정렬
		 * */
		
		TreeSet<String> tSet = new TreeSet<>(lhset);
		
	}
}
