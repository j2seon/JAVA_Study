package com.jjs.test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Intro {
	
	public static void main(String[] args) {
		
		List<String> list2 = new ArrayList<>();
		
		list2.add("java");
		list2.add("python");
		list2.add("javascript");
		list2.add("dart");
		list2.add("C#");
		
		// 값을 변경하지 않는다
		Stream<String> stream = list2.stream().map(s -> s.toUpperCase());
		stream.forEach(System.out::println);
		System.out.println("=====================");
		
		list2.forEach(System.out::println);
		
		// 중간연산은 stream을 리턴함. -> lazy하다 (최종연산이 올때까지 실행하지 않는다.)
		// 최종연산은 stream을 리턴하지 않는다. 반드시 한개만

		list2.stream().map(s-> {
			System.out.println(s);
			return s.toUpperCase();
		}); // 지금이상태로 출력하면 정의만한 것이라 실행되지 않음.
		
		System.out.println("=====================");
		
		List<String> collect1 = list2.stream().map(s-> {
			System.out.println(s + " " + Thread.currentThread().getName());
			return s.toUpperCase();
		}).collect(Collectors.toList()); // 최종연산
		
		collect1.forEach(System.out::println);
		
		System.out.println("=====================");
		// 병렬적으로 처리하는 것을 확인 할 수 있음. -> 병렬로 처리한다고 다 좋은 것이 아니다.
		List<String> parallel = list2.parallelStream().map(s -> {
			System.out.println(s + " " + Thread.currentThread().getName());
			return s.toUpperCase();
		}).collect(Collectors.toList());
		
		
		
	}
}
