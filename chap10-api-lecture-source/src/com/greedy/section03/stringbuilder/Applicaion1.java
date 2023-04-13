package com.greedy.section03.stringbuilder;

public class Applicaion1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("java");
		
		/* toString이 오버라이딩 되어있다. */
		System.out.println(sb.toString());
		
		System.out.println(sb.hashCode());
		
		sb.append("oracle");
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
	}
}
