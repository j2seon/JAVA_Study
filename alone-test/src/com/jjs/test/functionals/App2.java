package com.jjs.test.functionals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class App2 {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("콜팝");
		list.add("치킨");
		list.add("곱창");
		list.add("피자");
		list.add("스파게티");		
		
		
		Spliterator<String> spliterator1 = list.spliterator();
		
		// 1. trySplit -> 두개의 Spliterator로 쪼개서 사용
		Spliterator<String> spliterator2 = spliterator1.trySplit();

		// 2. tryAdvance -> 원소가 있으면 true 없으면 false
		while (spliterator1.tryAdvance(System.out::println));
		
		System.out.println("====================");
		while(spliterator2.tryAdvance(System.out::println));
		
		// 3. long estimateSize -> 사이즈 반환(null이면 -1)
		
		System.out.println(spliterator1.estimateSize()); // 다사용했기 때문에 0	
		System.out.println("====================");
		
		// 4. void forEachRemaining -> 각 요소에 대해 지정된 작업을 순차적으로 수행함.
		list.spliterator().forEachRemaining(System.out::println);
		
		// 5.  int characteristics -> 특성을 포함하는 int 값 반환
		int i = list.spliterator().characteristics();
		System.out.println(i);
		
		System.out.println();
		
		List<String> list2 = new ArrayList<>();
		
		list2.add("java");
		list2.add("python");
		list2.add("javascript");
		list2.add("dart");
		list2.add("C#");
		
		list2.forEach(System.out::println);
		System.out.println();
//		list2.removeIf(t -> t.startsWith("j"));
//		list2.forEach(System.out::println);
		
		Comparator<String> c = String::compareToIgnoreCase;
		list2.sort(c.reversed()/* .thenComparing(c) */);
		list2.forEach(System.out::println);

		
		
		
	}
	
	
}
