package com.greedy.section02.looping_statement;

import java.util.Iterator;
import java.util.Scanner;

public class A_for {

	/**
	 * <pre>
	 * 단순 for문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * </pre>
	 */
	public void testSimpleForStatement() {
		
		/* [for문 표현식]
		 * for(초기식; 조건식; 증감식){
		 * 		조건을 만족하는 경우 수행할 구문(반복할 구문);
		 * }
		 * */
		
		/* 1부터 10까지 1씩 증가시키면서 값을 출력하는 기본 반복문 */
		
		for (int i = 1; i <=10 ; i++) {
			System.out.println(i);
		}
	}
	
	/**
	 * <pre>
	 * 무엇을 반복하면 좋을지 생각해보는 예제1 
	 * </pre>
	 */
	public void testForExample1() {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("1번째 학생의 이름을 입력하세요 : ");
//		String student1 = sc.nextLine();
//		System.out.printf("1번째 학생의 이름은 %s 입니다", student1);
//		
//		System.out.println("2번째 학생의 이름을 입력해주세요 : ");
//		String student2 = sc.nextLine();
//		System.out.printf("2번째 학생의 이름은 %s 입니다", student2);
//		
//		System.out.println("3번째 학생의 이름을 입력해주세요 : ");
//		String student3 = sc.nextLine();
//		System.out.printf("3번째 학생의 이름은 %s 입니다", student3);
//		
//		System.out.println("4번째 학생의 이름을 입력해주세요 : ");
//		String student4 = sc.nextLine();
//		System.out.printf("4번째 학생의 이름은 %s 입니다", student4);
//		
//		System.out.println("5번째 학생의 이름을 입력해주세요 : ");
//		String student5 = sc.nextLine();
//		System.out.printf("5번째 학생의 이름은 %s 입니다", student5);
//		
//		
		/* 반복해야하는 내용은
		 * 1. 안내문구
		 * 2. 학생이름을 입력받아 변수에 저장
		 * 3. 저장된 이름을 출력 
		 * 
		 * 반복횟수는 1부터 10까지 1씩 증가하여 총 10번 반복
		 * */
		
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d 번째 학생의 이름을 입력해주세요 : ", i);
			String student = sc.nextLine();
			System.out.printf("%d번째 학생의 이름은 %s 입니다\n", i, student);
		}
		
	}
	
	
	public void testForExample2() {
		/* 1 ~ 10까지의 합계를 구하시오 */
		
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		int num5 = 5;
		
		/* 결과를 누적시켜 담아줄 변수 선언 */
		int sum = 0;
		
		/* 반복해야 할 내용
		 * 1. 변수에 1씩 증가하는 값 담기
		 * 2. 저장된 값을 sum에 누적시키기
		 * 
		 * 반복횟수는 1부터 10까지 1씩 증가 (10회 반복)
		 * 
		 * 반복하지 않을 내용
		 * 1. 값을 누적해서 저장할 sum
		 * 2. sum에 누적된 값 출력
		 * 
		 * */
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum2 += i;
		}
		System.out.println("sum2 : " + sum2);
		
	}
	
	public void testForExample3() {
		/* 5 ~ 10 사이의 난수를 발생시켜서 1부터 발생한 난수까지의 합계를 구해보자
		 * 
		 * 5 : 1+2+3+4+5
		 * */
		
		int random = (int)(Math.random() * 6) + 5;
		int sum = 0;
		
		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		
		System.out.printf("random : %d, sum : %d", random, sum);
		
	}

	public void testForExample4() {
		
		/* 두 개의 숫자를 입력받아 작은 수에서 큰수까지의 합계를 구하세요
		 * 단 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로
		 *  */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자하나를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자하나를 입력하세요 : ");
		int num2 = sc.nextInt();
		int sum = 0;
		
		if(num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				sum += i;
			}
		}else if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				sum += i;
			}
		}
		
		System.out.println("sum = " + sum);
		
		/* 다른방법 */
		/* 더 큰값과 작은 값을 저장할 변수를 초기화한다. */
		int min = 0;
		int max = 0;
		
		if(num1 > num2 ) {
			max = num1;
			min = num2;
		}else{
			min = num1;
			max = num2;
		}
		int sum2 = 0;
		
		for (int i = min; i <= max; i++) {
			sum2 += i;
		}
		System.out.println("sum2 = " + sum2);
		
	}
	
	public void printSimpleGugudan() {
		/* 키보드로 2~9 사이의 구구단을 입력받아
		 * 2~9 사이인 경우 해당 단의 구구단을 출력하고,
		 * 그렇지 않은경우 "반드시 2~9 사이의 양수를 입력해야한다. 출력
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 구구단의 단 수를 입력하세요 : ");
		int dan = sc.nextInt();		
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
		}
		
		
		
		
	}
	
}
