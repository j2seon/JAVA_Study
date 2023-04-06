package com.greedy.section03.array_copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application4 {

	public static void main(String[] args) {
		
		/* 깊은 복사는 원복과 복사본 중 둘 중 한가지 값을 변경해도 다른 하나에 영향을 주지 않는다.
		 * 같은 값을 가지고 있는 서로 다른 배열이기 때문
		 * */
		
		/* 두 개의 같은 값을 가지는 배열 생성 */

		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = arr1.clone();
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] += 10;
		}
		
		System.out.println(Arrays.toString(arr1));
		
		/* 향상된 for문 : JDK1.5버전부터 추가된 내용
		 * 
		 * 배열 인덱스에 하나씩 차례로 접근해서 담긴값을 임시로 사용할 변수에 담고 반복문을 실행한다.
		 * 
		 * */
		
		for (int i : arr2) {
			i += 10;
		}
		System.out.println(Arrays.toString(arr2)); //증가되지 않고 있다. 인덱스에 접근해서 값을 변경한게 아니고 꺼낸 값을 복사해서 쓴 것.
		
		/* 주의 : 향상된 for 문은 배열 인덱스에 차례로 접근할때는 편하게 사용할 수 있지만 값을 변경할 수는 없다. */
		
		//만약 향상된 for문으로 arr2를 변경하고 싶으면...? -> 가능은 한데 사용하지 않음
		int index = 0;
		for (int i : arr2) {
			i += 10;
			arr2[index] = i;
			index++;
		}
		System.out.println(Arrays.toString(arr2));
		
		
		String[] strArr = {"a","b","c"};
		List<String> list = new ArrayList<String>();
		
		for (String string : strArr) {
			string += "+";
			list.add(string);
		}
		System.out.println(Arrays.toString(strArr));
		System.out.println(list);
 	}

}
