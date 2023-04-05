package com.greedy.section01.array;

import java.util.Arrays;

public class Application3 {

	public static void main(String[] args) {
		
		/* 기본적으로 배열을 선언하고 할당하게 되면
		 * 배열의 각 인덱스에는 자바에서 지정한 기본값으로 초기화가 된 상태가 된다.
		 * heap영역에는 값이 없는 빈 공간이 존재할 수 없다.
		 * 
		 * */
		
		/* 값의 형태별 기본값
		 * 정수 : 0
		 * 실수 : 0.0
		 * 논리 : false
		 * 문자 : \u0000
		 * 참조 : null <- String, 사용자 정의 타입
		 * */
		
		int[] iarr = new int[5];
		for (int i = 0; i < iarr.length; i++) {
			System.out.print(iarr[i]);
		}
		System.out.println();
		
		double[] darr = new double[5];
		for (int i = 0; i < darr.length; i++) {
			System.out.print(darr[i]);
		}
		System.out.println();
		
		boolean[] barr = new boolean[5];
		for (int i = 0; i < barr.length; i++) {
			System.out.print(barr[i]);
		}
		System.out.println();
		
		/* 자바에서 지정한 기본값 외의 값으로 초기화를 하고 싶은 경우 블럭을 이용한다.
		 * 블럭을 사용하는 경우에는 new를 사용하지 않아도 되며, 값의 갯수만큼 자동으로 크기를 설정한다.
		 * */
		int[] iarr2 = {11, 22, 33, 44, 55};
		
		//이러한 형식도 가능하다
		int[] iarr3 = new int[] {11,22,33,44,55};
		
		System.out.println("iarr2의 길이 : " + iarr2.length);
		System.out.println("iarr3의 길이 : " + iarr3.length);
		System.out.println(Arrays.toString(iarr2));
		System.out.println(Arrays.toString(iarr3));
		
		String[] starr = {"apple","banana","greenapple"};
		System.out.println(Arrays.toString(starr));
		
	}
}
