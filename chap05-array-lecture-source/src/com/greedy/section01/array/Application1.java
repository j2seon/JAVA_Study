package com.greedy.section01.array;

import java.util.Arrays;

public class Application1 {

	public static void main(String[] args) {
		/* 배열이란?
		 * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도)
		 * 배열은 heap 영역에 new 연산자를 이용하여 할당한다.
		 * 
		 */

		/* 배열의 사용이유
		 * 
		 *  배열을 사용하지 않는다면 변수를 여러 개 사용해야한다.
		 *  1. 연속된 메모리 공간으로 관리할 수 없다(모든 변수의 이름을 사용자가 관리해야한다.)
		 *  2. 반복문을 이용한 연속 처리가 불가능하다.
		 *  
		 * */
		/* 배열의 선언 및 할당 */
		int[] arr = new int[5]; //arr이라고하는 변수 안에는 heap에 생성된 배열의 주소값을 가지고 있다.
		
		/* Stirng(문자열)에서 길이를 구하려고한다 "문자열".length() 
		 * 배열의 길이를 구하려고 하면 arr.length() -> 5
		 * */
		
		int sum = 0;
		
		for (int i = 0, value = 0; i < arr.length; i++) {
			arr[i] = (value += 10); 
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("sum = " + sum);
		
	
		
		
	}
	
	
}
