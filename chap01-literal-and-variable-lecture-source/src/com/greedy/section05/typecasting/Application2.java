package com.greedy.section05.typecasting;

public class Application2 {
	public static void main(String[] args) {
		/* 강제형변환
		 *
		 * 바꾸려는 자료형으로 캐스트 연산자를 이용하여 형변환한다.
		 * 예) (바꿀자료형) 값;
		 * */
		
		/* 자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다
		 * 1. 강제 형번환 규칙
		 *   1-1. 큰 자료형에서 작은 자료형으로 변경 시 강제 형변환이 필요하다.
		 *   1-3. 문자형을 int미만 크기의 변수에 저장할 대 강제형변환이 필요하다
		 *   1-4. 논리형은 강제 형변환 규칙에서도 제외된다.
		 * 
		 * */
		
		long lnum1 = 8;
//		int inum1 = lnum1; // 데이터 손실 가능성을 컴파일러가 알려줌(에러로)
		
		int inum1 = (int) lnum1;
		short snum1 = (short) inum1;
		byte bnum1 = (byte) snum1;
		
		double dnum1 = 8.0;
		float fnum1 = (float) dnum1;
		
		float fnum2 = 4.0f;
		
		long lnum2 = (long) fnum2; 
		
		System.out.println("lnum2 : " + lnum2);

		char ch = 'a';
		byte bnum2 = (byte) ch;
		short snum2 = (short) ch;
		
		int num3 = 97;
		int num4 = -97;
		
		char ch3 = (char) num3;
		char ch4 = (char) num4;
		
		System.out.println("ch3 = " + ch3);
		System.out.println("ch4 = " + ch4);
		
		boolean isTrue = true;
		
//		byte b = (byte) isTrue; //불가능 
		
	}
}
