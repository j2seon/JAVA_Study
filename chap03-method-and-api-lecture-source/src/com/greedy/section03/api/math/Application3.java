package com.greedy.section03.api.math;

import java.util.Random;

public class Application3 {
	
	public static void main(String[] args) {
		/* java.util.Random
		 * 
		 * java.util.Random 클래스의 nextInt( )메소드를 이용한 난수 발생
		 * */
		
		/* 원하는 범위의 난수를 구하는 공식 
		 * random.nextInt*(구하려는 난수의 갯수) + 구하려는 난수의 최소값
		 * */
		
		Random random = new Random(); // 객체
		
		/* 0부터 9까지 난수 */
		int randomNumber1 = random.nextInt(10);
		System.out.println("0부터 9가지의 난수 : " + randomNumber1);
		int randomNumber2 = random.nextInt(10) + 1;
		System.out.println("0부터 10가지의 난수 : " + randomNumber1);
		
		/* 20번 46 */
		int randomNumber3 = random.nextInt(26) + 20;
		System.out.println("20부터 45까지의 난수 : " + randomNumber1);
		
		/* -128부터 127까지의 난수발생 */
//		int randomNumber4 = random.nextInt(256) - 128;
		int randomNumber4 = new Random().nextInt(256) - 128;
		System.out.println("-128부터 127까지의 난수 : " + randomNumber4);
		
	}
}
