package com.greedy.section02.variable;

import java.nio.channels.InterruptedByTimeoutException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* 변수를 사용하기 위한 방법
		 *  
		 * 1. 변수를 준비한다 (선언)
		 * 2. 변수를 대입한다 (값 대입 및 초기화) 
		 * 3. 변수를 사용한다
		 */
		
		/* 변수를 준비한다(선언)
		 * 변수를 선언하는 방법
		 * 
		 * 자료형 변수명 ;
		 * */
		
		/* 자료형이란? 
		 * 다양한 값의 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드
		 *  
		 * 이러한 자료형은 기본자료형(Primary type)과 참조자료형(Reference type)으로 나누어진다.
		 *  
		 * */
		
		// 기본자료형 8가지 
		// 정수 
		byte bnum; // 1byte
		short snum; // 2byte
		int inum; // 4byte
		long lnum; // 8byte
		
		// 실수
		float fnum; // 4byte
		double dnum; // 8byte(기본)
		
		// 문자
		char ch1; //2byte
		char ch2;
		
		// 논리값
		boolean isTrue; //1byte 
		
		
		String str; // 참조자료형 -> 4byte(주소값) 
		
		/* 변수에 값을 대입(값 대입 및 초기화) */
		
		/* 변수선언은 메모리에 값을 저장하기 위한 공간만 생성한 상태 
		 * 
		 * 그 공간에 대입연산자를 이용하여 자료형에 저장하기로 한 형태의 값을 저장할 수 있다.
		 * 만약, 약속 내용과 다른 형태의 값을 대입하려고하면 Compiler는 에러를 발생시킨다.
		 * 
		 * 대입 연산자의 실행 방향은 오른쪽에서 왼쪽이다.
		 * 즉, 오른쪽에 있는 값을 왼쪽의 공간에 대입한다는 의미 -> 왼쪽에는 공간, 오른쪽은 값이다!
		 * 
		 * 변수를 대입연산자 왼쪽에 사용하면 공간의 의미이고, 대입연산자의 오른쪽에 사용하면 변수가 가진 값을 의미한다.
		 * 
		 * */
		
		bnum = 1; 
		snum = 2;
		inum = 4; 
//		lnum = 8; // 아무문제 없는 것 같지만 사실 뒤에 대문자 L을 붙여야한다.
		lnum = 8L; // 소문자 l도 가능하지만 글꼴에 따라 숫자1과 혼선이 빚어질 수 있기 때문에 대문자로하는 것을 권장한다.

		fnum = 4.0f; // 실수 기본형이 double이기 때문에 float를 명시
		
		ch1 = 'a'; // 문자형태의 값을 저장 할 수 있다. 
		ch2 = 97; // 숫자로 저장할 수 있다. -> 문자는 저장될 때 숫자로 저장됨
		
		isTrue= true;
		
		str = "하이하이"; 
		
		int point = 10;
		int bonus = 10;
		
		// 변수를 선언하고 난 뒤 최초로 값이 대입되는 것을 초기화라고 한다.
		// 선언과 함께 초기화가 일어나는 것 
		
		//변수를 이용해서 출력 및 연산
		System.out.println("포인트와 보너스의 합은? " + (point + bnum));
		
		
		
		byte numByte = 1; 
		short numShort = 1; 
		int numInt = 1; 
		
		
		long numLong = 1123;
//		float numFloat = 2d; // 불가능
		double numDouble = 3f;
		
		
	}

}
