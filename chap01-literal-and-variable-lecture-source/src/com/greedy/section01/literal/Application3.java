package com.greedy.section01.literal;

public class Application3 {
	
	public static void main(String[] args) {
		
		System.out.println("========== 두 개의 문자열 합치기 ==========");
		System.out.println(9 + 9);
		System.out.println("9" + 9);
		System.out.println(9 + "9");
		System.out.println("9" +"9");
		
		System.out.println("========== 세 개의 문자열 합치기 ==========");
		System.out.println(9 + 9 + "9"); // '+'의 연산 방향은 왼쪽에서 오른쪽
		// 					9 + 9 -> 18
		//					18 + "9" -> "189"
		
		System.out.println(9 + "9" + 9); // 999
		System.out.println("9" + 9 + 9); // 999
		System.out.println("9" + (9 + 9));// 918
		
		byte b = 1;
		short s = 1;
		int i = 1;
		char c = 'c';
		float f = 1.0f;
		String str = "str"; 
		
		System.out.printf("%d\n", i);
		System.out.printf("%b\n", b);
		System.out.printf("%s\n", str);
		System.out.printf("%f\n", f);
		System.out.printf("[%5c]\n", c);
		System.out.printf("[%-5c]\n", c);
		System.out.printf("[%05d]\n", i);
		
		
		
		
		
	}
}
