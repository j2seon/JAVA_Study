package com.greedy.section02.dimensional_array;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class Application4 {
	public static void main(String[] args) {
		
		/* 1차원 배열이나, 2차원 배열은 할당과 동시에 JVM이 기본값을 초기화 해주는데
		 * 따로 초기화하고 싶은 리터럴로 초기화를 진행할 수 있다.
		 * 
		 * */
		int[] iarr1 = {1,2,3,4};
		
		
		int[][] iarr2 = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15}
		};
		
		String[][] starr = {
				{"a", "b"},
				{"c", "d"}
		};
		
		for (int i = 0; i < iarr2.length; i++) {
			
			for (int j = 0; j < iarr2[i].length; j++) {
				System.out.print(iarr2[i][j]+" ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {6,7,8,9,10};
		int[][] arr3 = {arr1, arr2};
		
		for (int i = 0; i < arr3.length; i++) {
			
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}
}
