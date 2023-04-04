package com.greedy.section02.looping_statement;

import java.util.Iterator;
import java.util.Scanner;

public class A_nestedFor {
	
	public void printGugudanFromTwoToNine() {
		
		for (int i = 2; i < 10; i++) {
			System.out.printf("========== %d단 ===========\n", i);
			
			printGugudanOf(i);
		}
		
	}

	// 메소드를 따로 뽑아서 for 문안에 메서드로 동작하게 만들자
	private void printGugudanOf(int i) {
		
		for (int j = 1; j < 10; j++) {
			System.out.printf("%d * %d = %d\n", i, j, (i * j));
		}
		
	}
	
	public void printStarInputRowTimes() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 행 수를 입력하세요 : ");
		int row = sc.nextInt();
		
		
		for (int i = 0; i < row ; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==========================");
		// 방법 1
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			for (int j = row; j < row-1-i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println("==========================");
		// 방법2
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==========================");
		
		for (int i = 0; i < row; i++) {
			for (int j = row; i < j-1 ; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < row; i++) {
			for (int j = row; j > i  ; j--) {
				System.out.print("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < row; i++) {
			for (int j = row; i < j-1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int j = row; j > i; j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
	}

}
