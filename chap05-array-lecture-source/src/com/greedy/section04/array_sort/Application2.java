package com.greedy.section04.array_sort;

import java.util.Arrays;
import java.util.Iterator;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* 순차정렬
		 * 
		 * 순차정렬이란 정렬 알고리즘에서 가장 단순하고 기본이 되는 알고리즘
		 * 배열의 처음과 끝을 탐색하면서 차순대로 정렬하는 가장 기초적인 정렬 알고리즘이다.
		 * */
		
		int[] iarr = {6,7,2,4,5,3};
		
		for (int i = 1; i < iarr.length; i++) {
			for (int j = 0; j < i; j++) {
				/* 부등호의 방향이 '<' 오름차순 정리 
				 * 				'>' 내림차순 정리
				 * */
				if(iarr[i] < iarr[j]) {
					int temp;
					temp = iarr[i];
					iarr[i] = iarr[j];
					iarr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(iarr));
		
	}
}
