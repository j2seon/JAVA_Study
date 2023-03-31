package com.greed.section03.increment_decrement_operator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application1 {

	public static void main(String[] args) {
		
		/* 증감연산자 */
		/* 피연산자의 앞 or 뒤에 사용이 가능하다 */
		/* '++' : 1 증가의 의미
		 * '--' : 1 감소의 의미
		 * 
		 * */
		
		int num = 20;
		
		System.out.println("num : " + num);
		
		num++;
		
		System.out.println("num : " + num);
		
		++num;
		
		System.out.println("num : " + num);
		
		--num;
		System.out.println("num : " + num);
		
		num--;
		System.out.println("num : " + num);
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		System.out.println(num1++); //10
		
		System.out.println((++num1) + (num2++)); //12+20 = 32
		
		System.out.println((num1++) + (--num2) + (--num3)); // 12 + 20 + 29 -> 61
		
		System.out.println("num1 : " + num1); // 13
		System.out.println("num2 : " + num2); // 20
		System.out.println("num3 : " + num3); // 29
		
		
		/* 다른 연산자와 함께 사용할 대 증감 연산자의 의미 */
		/* '++var' : 피연산자의 값을 먼저 1을 증가시킨 후 다른 연산을 진행함.
		 * 'var++' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피 연산자의 값을 1 증가시킴
		 * 'var--' : 피연산자의 값을 먼저 1 감소시킨 후 다른 연산을 진행함
		 * '--var' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 감소시킴
		 *  
		 * */
		
	}
}
