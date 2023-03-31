package com.greedy.section05.typecasting;

public class Application3 {

	public static void main(String[] args) {
		/*
		 * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
		 * 
		 * 다른 자료형끼리 연산은 큰 자료형으로 자동 형변환 후 연산처리된다.
		 * 자바에서는 같은 자료형끼리만 연산이 가능하다.
		 * 따라서 서로 다른 자료형이 다른 두 자료형 을 연산할 때 자료형이 같아지도록 형변환을 해주어야한다.
		 * 
		 * */
		
		int inum = 10; 
		long lnum = 100;
		
//		int isum = inum + lnum ; // 그냥은 안돈다. 두자료형의 연산결과는 크 쪽 자료형인 long이 되고,
								// long 형 값을 int 형변수에 담길수 없다.
		
		/* 방볍 1. 연산결과를 int형으로 변환 후 int 자료형 변수에 리턴 받는다.  */
		
		int isum = (int) (inum + lnum);
		
		System.out.println("isum : " + isum);
		
		/* 방법2. long형 값을 int로 강제 형변환 한다.*/
		
		int isum2 = inum + (int) lnum;
		System.out.println("isum2 : " + isum2);
		
		/* 방법3. 결과 값을 long형 자료형으로 받는다 (자동형 변환 이용).*/
		long isum3 = inum + lnum;
		System.out.println("isum3 : " + isum3);
		
		
		/* 주의 !!!!! int 미만의 연산 처리 결과는 int형이다 */
		
		byte byteNum1 = 1; 
		byte byteNum2 = 2; 
		short shortNum1 = 3;
		short shortNum2 = 4;
		
		int result1 = byteNum1 + byteNum2;
		int result2 = byteNum1 + shortNum1;
		int result3 = shortNum1 + byteNum1;
		int result4 = shortNum1 + shortNum2;
		
		System.out.println("result1 : "+ result1);

		/* 형변환 사용 시 주의할 점*/
		/* 데이터 손실에 유의해서 사용해야한다. */
		
		int inum4 = 290;
		byte bnum4 = (byte) inum4;
		
		System.out.println("inum4 : " + inum4);
		System.out.println("bnum4 : " + bnum4);
		
		/* 의도한 데이터 손실 */
		double height = 175.5;
		int floorHeight = (int) height;
		
		System.out.println("height : " + height);
		System.out.println("floorHeight : " + floorHeight); //소수점 절식에 이용 
		
	}

}
