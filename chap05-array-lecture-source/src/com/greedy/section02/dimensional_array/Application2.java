package com.greedy.section02.dimensional_array;

public class Application2 {
	
	
	public static void main(String[] args) {
		
		/* 2차원 정변배열을 선언 및 할당 후 값을 대입하고 출력하기 */
		
		/* 1. 배열의 선언 및 할당
		 * 
		 * 정변 배열의 경우 각 인덱스별 배열을 따로 할당 할 수도 있지만
		 * 선언과 동시에 모든 배열을 할당할 수 있다.
		 * 자료형[][] 변수명 = 자료형[할당할 배열 갯수][할당할 배열의 길이]; 
		 *  
		 *  
		 * */ 
		
		int[][] iarr = new int[3][5];
		
		/* 2. 각배열의 인덱스에 접근해서 값대입 후 출력 */
		/* 값 대입 - 수동 */
//		iarr[0][0] = 1;
//		iarr[0][1] = 2;
//		iarr[0][2] = 3;
//		iarr[0][3] = 4;
//		iarr[0][4] = 5;
//		
//		iarr[1][0] = 6;
//		iarr[1][1] = 7;
//		iarr[1][2] = 8;
//		iarr[1][3] = 9;
//		iarr[1][4] = 10;
//
//		iarr[2][0] = 11;
//		iarr[2][1] = 12;
//		iarr[2][2] = 13;
//		iarr[2][3] = 14;
//		iarr[2][4] = 15;
		
		/* 값 출력 */
		/* 배열에 저장하기 위한 하나씩 증가하는 값을 저장할 변수 */
		int value = 1;
		for (int i = 0; i < iarr.length; i++) {
			
			/* 하나의 배열의 0 부터 마지막 인덱스까지 차례로 접근해서 값을 대입하는 용도의 반복문 */
			for (int j = 0; j < iarr[i].length; j++) {
				iarr[i][j] = value++;
				System.out.print(iarr[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}
	
	
}
