package com.greedy.section04.overflow;

import javax.imageio.stream.FileCacheImageInputStream;
import javax.swing.plaf.multi.MultiButtonUI;

public class Application1 {

	public static void main(String[] args) {
		
		/* 오버 플로우 
		 * 자료형별 값의 최대 범위를 벗어나는 경우 
		 * 
		 * */

		// byte는 -128 ~ 127까지만 표현 가능 
		// byte num1 = 128;
		
		byte num1 = 127;
		
		System.out.println("num1 : " + num1); 
	
		// 후위 연산자
		num1++;

		System.out.println("num1 overflow : " + num1 );
		
		/* 언더플로우
		 * 
		 * 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생
		 * 
		 */
		
		byte num2 = -128;
		
		System.out.println("num2 : " + num2); 
		
		num2--;
		
		System.out.println("num2 : " + num2); 

		int firstNum = 1000000;
		int secondNum = 700000;
		
		int multi = firstNum * secondNum;
		
		System.out.println("firstNum * secondNum = " + multi);
		
		long longMulti = firstNum * secondNum;
		System.out.println("longMulti : " + longMulti );
		
		
		/* 계산이 처리되기 전에 long 타입으로 자료형을 변경해줘야한다. (강제 형변환)
		 * */
		
		long result = (long) firstNum * secondNum;
		System.out.println("result : " + result);
		
		
		
	}

}
