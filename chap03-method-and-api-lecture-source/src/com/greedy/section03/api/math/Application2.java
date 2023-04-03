package com.greedy.section03.api.math;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* 난수의 활용
		 * 
		 * Math.random()을 이용해 발생한 난수는 0.0부터 1.0
		 *  
		 * */
		
		/* 원하는 범위의 난수를 구하는 공식
		 * 
		 * (int) (Math.random() * 구하려는 난수의 갯수) + 구하려는 난수의 가서
		 *  */
		
		
		/* */
		
		int random1 = (int) (Math.random() * 10);
		System.out.println("0부터 9사이의 난수 : " + random1);
		
		int random2 = (int) (Math.random() * 10) + 1;
		System.out.println("0부터 10사이의 난수 " + random2);
		
		//10부터 15까지의 난수 
		int random3 = (int) (Math.random() * 6) + 10;
		System.out.println("10부터 15사이의 난수 " + random3);
		
		
		//-128부터 ~ 127까지 의 난수 발생
		int random4 = (int) (Math.random() * 256) +(-128);
		System.out.println("-128부터 127사이의 난수 " + random4);
		
		
		
	}
}
