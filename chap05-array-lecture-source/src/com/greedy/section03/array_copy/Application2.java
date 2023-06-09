package com.greedy.section03.array_copy;

public class Application2 {

	public static void main(String[] args) {
				
		
        /* 얕은 복사의 활용
         * 
         * 얕은복사를 활용하는 것은 주로 메소드 호출 시 인자로 사용하는 경우와 
         * 리턴값으로 동일한 배여을 리턴해주고 싶은 경우에 사용한다.
         * */ 
        
        String[] names = {"홍길동", "유관순", "이순신"};
        
        /* 얕은복사 확인을 위한 hashCode 출력 */
        System.out.println("names의 hashCode : " + names.hashCode());
        
        /* 인자와 매개변수를 활용 */
        print(names);
        
        /* 리턴값으로 활용 */
        String[] animals = getAnimals();
		System.out.println("리턴 받은 animals hashCode = " + animals.hashCode());
		
		/* 다른 메소드에서 동일한 배열(객체)를 사용하도록 하고 싶은 경우 얕은 복사를 이용 */
		System.out.println("====================================");
		print(animals);
		
		
	}
	
	/**
	 * <pre>
	 * 배열을 매개변수로 전달받아
	 * 모든 인덱스에 저장되어 있는 값을 출력하는 기능을 제공
	 * </pre>
	 * 
	 * @param arr 저장된 값을 출력하기 위한 문자열
	 */
	public static void print(String[] arr) {
		System.out.println("arr hashCode = "+arr.hashCode());
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	/**
	 * <pre>
	 * 동물 종류로 생성된 문자열 배열을 반환하는 메소드
	 * </pre>
	 * @return 동물 종류가 담긴 문자열 배열을 반환한다.
	 */
	public static String[] getAnimals() {
		
		String[] animals = {"낙타", "호랑이", "나무늘보"};
		System.out.println("animals hashCode = " + animals.hashCode());
		
		return animals;
	}
	

}
