package com.greedy.section04.array_sort;

public class Application1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);
		
		/* 두 변수의 값을 바꾸기 위해 다른 변수 한개가 더 필요하다. */
		
		int temp;
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int[] arr = {2, 1, 3};
		
		int temp2;
		temp2 = arr[0]; //temp2 = 2 
		arr[0] = arr[1]; //{1, 1, 3}
		arr[1] = temp2; //{1, 2, 3}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "");
		}
		
	}

}
