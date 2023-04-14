package com.jjs.test.stream.use;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
	
	public static void main(String[] args) {
		
		List<OnlineClass> springClasses = new ArrayList<>();
		springClasses.add(new OnlineClass(1, "spring boot", true));
		springClasses.add(new OnlineClass(2, "spring data jpa", true));
		springClasses.add(new OnlineClass(3, "spring mvc", false));
		springClasses.add(new OnlineClass(4, "spring core", false));
		springClasses.add(new OnlineClass(5, "spring api development", false));
		
		List<OnlineClass> javaClasses = new ArrayList<>();
		javaClasses.add(new OnlineClass(1, "The java Test", true));
		javaClasses.add(new OnlineClass(2, "The java Code manipulation", true));
		javaClasses.add(new OnlineClass(3, "The java 8 to 11", false));

		List<List<OnlineClass>> kessunEvents = new ArrayList<>();
		kessunEvents.add(springClasses);
		kessunEvents.add(javaClasses);
		
		System.out.println("===== spring으로 시작하는 수업 =====");
		List<OnlineClass> list1 = springClasses.stream()
				.filter(s-> s.getTitle().startsWith("spring"))
//				.forEach(System.out::println);
				.collect(Collectors.toList());
		
		list1.forEach(System.out::println);
		
		System.out.println("===== close 되지 않은 수업 =====");
		
		springClasses.stream()
			.filter(Predicate.not(OnlineClass::isClosed))
			.forEach(System.out::println);
		System.out.println();

		List<OnlineClass> list2 = springClasses.stream()
			.filter(Predicate.not(OnlineClass::isClosed))
			.collect(Collectors.toList());
		
		list2.forEach(System.out::println);
		
		
		System.out.println("===== 수업이름만 모아서 스트림만들기 =====");
		
		springClasses.stream()
			.map(OnlineClass::getTitle)
			.forEach(System.out::println);
		
		System.out.println("===== 두 수업 목록에 들어있는 모든 수업 아이디 출력 ====");
		
		kessunEvents.stream()
			.flatMap(Collection::stream)
			.map(ke -> ke.getId())
			.forEach(System.out::println);
		
		System.out.println("===== 10부터 1씩 증가하는 무제한 스트림 중 앞에 10개 빼고 최대 10개까지 ====");
		Stream.iterate(10, i -> i+1)
			.skip(10)
			.limit(10)
			.forEach(System.out::println);
		
		System.out.println("===== 자바 수업 중에 Test가 들어있는 수업이 있는 지 확인 ====");
		
		boolean containsTest = javaClasses.stream()
			.anyMatch(oc -> oc.getTitle().contains("Test"));
		System.out.println(containsTest);
		
		System.out.println("===== 스프링 수업 중에 제목이 spring이 들어간 제목만만 모아서 List로 만들기 ====");
		List<String> titleSpring = springClasses.stream()
			.filter(sp -> sp.getTitle().contains("spring"))
			.map(OnlineClass::getTitle)
			.collect(Collectors.toList());
		
		titleSpring.stream().forEach(System.out::println);
		
	}
}
