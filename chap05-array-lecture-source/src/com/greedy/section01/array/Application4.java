package com.greedy.section01.array;

import java.util.Scanner;

public class Application4 {

	public static void main(String[] args) {
		
		/* 5명의 자바 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램을 만들어보세요
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		/* 5의 자바 점수를 저장할 배열을 하나 할당 */
		int[] scores = new int[5];
		
		/* 반복문을 이용해서 배열 인덱스에 하나씩 접근해서 점수를 입력받는다. */
		
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d번째 학생의 점수를 입력해주세요 : ", i + 1);
			scores[i] = sc.nextInt();
		}
		
		/* 합계와 평균을 구한다 */
		double sum = 0.0;
		double avg = 0.0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		avg = sum / scores.length;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);

	}

}
