package com.greedy.section02.dimensional_array;


public class Application1 {

	public static void main(String[] args) {
		
		/* 다차원 배열 
		 * 
		 * 다차원 배열은 2차원 이상의 배열을 의미한다.
		 * 배열의 인덱스마다 또다른 배열의 주소를 보관하는 배열을 의미한다.
		 * 즉.2차원 배열은 1차원 배열 여러 개를 하나로 묶어서 관리하는 배열을 의미한다.
		 * 
		 * */ 
		
		
		/* 2차원 배열을 사용하는 방법
		 * 1. 배열의 주소를 보관할 레퍼런스 변수 선언(stack)
		 * 2. 여러 개의 1차원 배열의 주소를 관리하는 배열을 생성(heap)
		 * 3. 각 인덱스에서 관리하는 배열을 할당(heap)하여 주소를 보관하는 배열에 저장
		 * 4. 생성한 여러개의 1차원 배열에 차례로 접근해서 사용
		 * */
		
		/* 1. 배열의 주소를 보관할 레퍼런스 변수 선언(stack) */
		
		int[][] iarr1;
		int iarr2[][];
		int[] iarr3[];
		
		/* 2. 여러개의 1차원 배열의 주소를 관리하는 배열을 생성 (heap) */
		// iarr1 = new int[][];  // 크기를 지정하지 않으면 에러발생
		// iarr1 = new int[][3]; // 주소를 묶어서 관리할 배열의 크기를 지정하지 않으면 에러 발생
		
		iarr1 = new int[3][];
		
		/* 3. 각 인덱스에서 관리하는 배열을 할당(heap)하여 주소를 보관하는 배열에 저장 */
		System.out.println(iarr1[0]);
		
		iarr1[0] = new int[5];
		iarr1[1] = new int[5];
		iarr1[2] = new int[5];
		
		iarr2 = new int[3][5];
		
		/* 참고 : 위에서 진행한 2,3번을 동시에 진행할 수 있다.
		 * 앞부분 정수는 주소를 관리하는 배열의 크기, 뒷부분 정수는 각 인덱스에 할당하는 배열의 길이.
		 * 
		 * 관리하는 여러 개의 배열의 길이가 동일한 경우 (iarr2 = new int[3][5];)와 같이 한번에 할당.
		 * 
		 * 하지만 여러 개의 배열의 길이가 각기 다른 경우에는 (iarr1 = new int[3][];)와같이
		 * 인덱스별로 따로 할당해 주어야한다.
		 * 
		 * 서로 같은 길이의 여러 개 배열을 하나로 묶어서 관리하는 2차원 배열을 정변배열이라고 하고,
		 * 서로 길이가 같이 않은 여러개의 배열을 하나로 묶어 관리하는 2차원 배열을 가변배열이라고 한다.
		 * */
		
		/* 4. 생성한 여러개의 1차원 배열에 차례로 접근해서 사용 */
		/* 할당 후에 아무 값을 대입하지 않아도 heap영역에는 값이 없는 상태로 
		 * 공간을 생성할 수 없기 때문에 기본값이 들어있다.
		 * */
		
		for (int i = 0; i < iarr1[0].length; i++) {
			System.out.print(iarr1[0][i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < iarr1[1].length; i++) {
			System.out.print(iarr1[1][i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < iarr1[2].length; i++) {
			System.out.print(iarr1[2][i] + " ");
		}
		System.out.println();
		System.out.println("================= for문 이용 =================");
		
		
		for (int i = 0; i < iarr1.length; i++) { //3
			
			for (int j = 0; j < iarr1[i].length; j++) { //5
				System.out.print(iarr1[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("================= 가변 배열 =================");

		int[][] iarr5 = new int[4][];
		for (int i = 0; i < iarr5.length; i++) { //4
			
			int num = (int)(Math.random() * 10) + 1;
			iarr5[i] = new int[num];
			
			for (int j = 0; j < iarr5[i].length; j++) {
				System.out.print(iarr5[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}

}
