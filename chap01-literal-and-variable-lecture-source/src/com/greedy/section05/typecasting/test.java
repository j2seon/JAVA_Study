package com.greedy.section05.typecasting;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class test {

	public static void main(String[] args) {
		
//		IntStream intStream = IntStream.rangeClosed(1, 10);
//		
//		// 1개를 뛰어넘음 
////		intStream.skip(1).forEach(System.out::print);
//		
//		// 4개 뛰어넘음
//		intStream.skip(4).forEach(System.out::print);
//		System.out.println();
//		
//		Stream<String> stream = Stream.of("a","b","c","d");
//		
//		// 요소를 3개로 제한
//		stream.limit(3).forEach(System.out::print);
//
//		String a = "Zbcdefg";
//		String[] arr = a.split("");
//		
//		Stream<String> stream2 = Stream.of(arr);
//		String list = stream2.sorted(Comparator.reverseOrder()).collect(Collectors.toList()).toString();
//		System.out.println(list);
		

		String [] stArr = new String[] {"A","B","C","D"};
		
		System.out.println(concat(stArr));
		System.out.println(concat(" ",stArr));
//		System.out.println(concat("-","1","1","1"));
	}
	
	static String concat(String delim, String...arg) {
		String result = ""; 
		
		for (String i : arg) {
			result += i + delim;
		}
		return result;
	}
	
	static String concat(String ...strings) {
		return concat("-", strings);
	}
	
	
}


