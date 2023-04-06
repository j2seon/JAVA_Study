package com.greedy.section03.array_copy;

import java.util.Arrays;

public class CopyTest {

	public static void main(String[] args) {
		
		String[] arr1 = {"s", "a"};
		String[] arr2 = Arrays.copyOf(arr1, arr1.length);// 1.Arrays.copyOf 이용
		String[] arr3 = arr1.clone(); // 2. Object의 clone
		String[] arr4 = new String[arr1.length]; 
		System.arraycopy(arr1, 0, arr4, 0, arr1.length); // 3. System의 arraycopy()메소드

		// 4. 직접 정의한 메소드 
		String[] arr5 = copy(arr1);
		
		//String의 hashCode 메소드 이용해서 비교
 		System.out.println("arr1의 hashCode = " + arr1[0].hashCode());
		System.out.println("arr1의 hashCode = " + arr2[0].hashCode());
		System.out.println("arr1의 hashCode = " + arr3[0].hashCode());
		System.out.println("arr1의 hashCode = " + arr4[0].hashCode());
		System.out.println("arr1의 hashCode = " + arr5[0].hashCode());
		
		System.out.println("=============== System.identityHashCode ==================");
		
		//System의 identityHashCode 메소드로 비교
		System.out.println("arr1의 identityHashCode = " + System.identityHashCode(arr1[0]));
		System.out.println("arr2의 identityHashCode = " + System.identityHashCode(arr2[0]));
		System.out.println("arr3의 identityHashCode = " + System.identityHashCode(arr3[0]));
		System.out.println("arr4의 identityHashCode = " + System.identityHashCode(arr4[0]));
		System.out.println("arr5의 identityHashCode = " + System.identityHashCode(arr5[0]));
		
		System.out.println("=============== 사용자정의 클래스 ==================");
		P[] p1 = {new P(), new P()};
		P[] p2 = Arrays.copyOf(p1, p1.length);
		P[] p3 = p1.clone();
		P[] p4 = new P[p1.length];
		System.arraycopy(p1, 0, p4, 0, p1.length);
		
		P[] p5 = copy(p1);
		System.out.println("p1의 hashCode = " + p1[0].hashCode());
		System.out.println("p2의 hashCode = " + p2[0].hashCode());
		System.out.println("p3의 hashCode = " + p3[0].hashCode());
		System.out.println("p4의 hashCode = " + p4[0].hashCode());
		System.out.println("p5의 hashCode = " + p5[0].hashCode());
		
		
		
	}
	public static String[] copy(String[] arr) {
		String[] starr = new String[arr.length];
		
		for (int i = 0; i < starr.length; i++) {
			starr[i] = new String(arr[i]);
		}
		return starr;
	}
	
	public static P[] copy(P[] arr) {
		P[] starr = new P[arr.length];
		
		for (int i = 0; i < starr.length; i++) {
			starr[i] = new P();
		}
		return starr;
	}

}
class P{}