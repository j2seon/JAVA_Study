package com.greedy.section03.array_copy;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class Application3 {

	public static void main(String[] args) {
				
		/* 
		 * 깊은 복사는 heap에 생성된 배열이 가지고 있는 값을 
		 * 또 다른 배열에 복사를 해 놓은 것이다.
		 * 
		 * 서로 같은 값을 가지고 있지만 두 배열은 서로 다른 배열이기에
		 * 하나의 배열에 변경을 하더라도 다른 배열에는 영향을 주지 않는다. 
		 * */

		/* 깊은 복사를 하는 방법은 4가지가 있다.
		 * 1. for문을 이용한 동일한 인덱스 값 복사
		 * 2. Object clone()을 이용한 복사
		 * 3. System의 arraycopy()를 이용한 복사
		 * 4. Arrays copyOf()를 이용한 복사
		 * 
		 * 이 중 가장 높은 성능을 보이는 것은 순수 배열의 복사를 위해 만들어진 arraycopy()
		 * 가장 많이 사용되는 방식은 좀 더 유연한 방식인 copyOf()메소드이다.
		 * 
		 * clone()은 이전 배열과 같은 배열방에 만들 수 없다는 특징 
		 * */
		
		int[] originArr = {1, 2, 3, 4, 5};
		
		print(originArr);
		
		/* 1. for문을 이용한 동일한 인덱스 값 복사*/
		int[] copyArr1 = new int[10];
		
		for (int i = 0; i < originArr.length; i++) {
			copyArr1[i] = originArr[i];
		}
		
		print(copyArr1); //원복 배열과 복사한 값은 같은 값을 가지고 나머지 인덱스는 다른값, 다른 주소를 가지고 있다.
		
		/* 2. Object의 clone()을 이용한 복사 */
		int[] copyArr2 = originArr.clone();
		
		print(copyArr2); // 동일한 길이, 동일한 값을 가지는 배열이 생성되어 복사되며, 다른 주소를 가지고 있다.
		
		/* 3.System의 arraycopy()를 이용한 복사 */
		int[] copyArr3 = new int[10];

		/* 매개변수 순서의 의미
		 * 원본배열(복사하고싶은), 복사를 시작할 인덱스 , 복사를 시작할 인덱스, 복사할 길이
		 * 
		 * */
		System.arraycopy(originArr, 0, copyArr3, 0, originArr.length);
		print(copyArr3);
		
		/* 4. Arrays의 copyOf()를 이용한 복사 */
		/* 시작인덱스로 부터 원하는 길이만큼만 복사해서 사용가능하다 */
		int[] copyArr4 = Arrays.copyOf(originArr, 7);
		
		print(copyArr4); // 복사한만큼의 값은 같지만 길이도 다르고 주소도 다르다.
		
	}
	
	/**
	 * <pre>
	 * 배열을 매개변수로 전달 받아 
	 * 모든 인덱스에 저장되어 있는 값을 출력하는 기능을 제공
	 * </pre>
	 * @param arr 저장된 값을 출력하기 위한 정수 배열 
	 */
	public static void print(int[] arr) {
		
		/* 전달받은 배열의 hashCode 출력 */
		System.out.println("iarr hashCode : " + arr);
		
		/* 전달받은 배열 출력 */
		System.out.println(Arrays.toString(arr));
		
		
	}

}
