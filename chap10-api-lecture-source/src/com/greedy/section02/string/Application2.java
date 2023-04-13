package com.greedy.section02.string;

public class Application2 {

	public static void main(String[] args) {
		
		/* 문자열 객체를 만드는 방법
		 * "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다.(singleton)
		 * new String("문자열") : 매번 새로운 인스턴스를 생성한다.
		 * */
		
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		/* 리터럴 형태로 만든 문자열은 하나의 인스턴스로 관리한다.
		 * 따라서 주소값을 비교하는 == 연산으로 비교시 동일 true
		 * */
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str2 == str3 : " + (str2 == str3));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(System.identityHashCode(str1.hashCode()));
		System.out.println(System.identityHashCode(str2.hashCode()));
		System.out.println(System.identityHashCode(str3.hashCode()));
		System.out.println(System.identityHashCode(str4.hashCode()));
		
		/* 문자열은 불변이라는 특징을 가진다.
		 * 기존 문자열에 + 연산을 수행하는 경우 문자열을 수정하는 것이 아닌 새로운 문자열을 할당하게된다.
		 * */
		str2 += "oracle";
		
		System.out.println(str1.equals(str4));

		/* 스캐너를 이용해서 문자열을 입력받는 경우 
		 * substring으로 잘라내기해서 새로운 문자열을 생성 후 반환하기 때문에 
		 * new String()으로 인스턴스를 생성한것과 동일
		 * */
		
		
		
	}
}
