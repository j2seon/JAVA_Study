package com.greedy.section03.array_copy;

import java.util.Arrays;

public class Application1 {
	
	public static void main(String[] args) {
		
		/* 배열의 복사
		 * 
		 * 배열의 복사에는 크게 두 가지 종류가 있다.
		 * 
		 * 1. 얕은 복사(shallow copy) : stack의 주소값만 복사
		 * 2. 깊은 복사(deep copy) : heap 배열에 저장된 값을 복사 
		 *
		 * */
		
		/* 얕은복사는 stack에 저장되어 있는 배열의 주소값을 복사한다는 것이다.
		 * 따라서 두 개의 레퍼런스 변수는 동일한 배열의 주소값을 가지고 있다.
		 * 하나의 레퍼런스변수에 저장된 주소값을 가지고 배열의 내용을 수정(값 변경)을 하게 되면
		 * 다른 레퍼런스변수로 배열이 접근했을 때도 동일한 배열을 가리키고 있기 때문에 변경된 값이 반영
		 * */
		
		
		/* 얕은 복사 확인을 위한 원본 배열 생성 */
		int[] originArr = {1, 2, 3, 4, 5};
		
		/* originArr 에 저장된 배열의 주소를 copyArr에도 저장 */
		int[] copyArr = originArr; // 주소를 넣어줌 
		
		/* hashCode를 이용해서 출력해보면 동일한 것을 확인할 수 있음. */
		System.out.println("orginArr hashCode = "+ originArr.hashCode());
		System.out.println("copyArr hashCode = "+ copyArr.hashCode());
		
		/* 원본 배열과 복사본 배열의 값 출력 */
		System.out.println("originArr = " + Arrays.toString(originArr));
		System.out.println("copyArr = " + Arrays.toString(copyArr));
		
		originArr[0] = 99;
		
		/* 원본 배열과 복사본 배열의 값 출력 */
		System.out.println("originArr = " + Arrays.toString(originArr));
		System.out.println("copyArr = " + Arrays.toString(copyArr));
		
	}
	
}
