package com.greedy.section03.api.scanner;

import java.util.Scanner;

public class Application1 {
	
	
	public static void main(String[] args) {
		
		/* 콘솔화면에 값을 입력받아 출력해보기 */
		
		/* 1.Scanner 객체 생성 */
		Scanner sc = new Scanner(System.in);
		
		/* 2. 자료형 별 값 입력받기 */
		
		/* 2-1. 문자열 입력 받기 */
		/* nextLine() : 입력받은 값을 문자열로 반환해준다. */
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.printf("입력하신 이름은 %s입니다.\n",name);
		
		/* 2-2. 정수형 입력 받기 */
		/* nextInt() : 입력받은 값을 문자열로 반환해준다. */
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.printf("입력하신 이름은 %d입니다.\n", age);
		
		/* nextLong() : 입력받은 값을 long형으로 반환한다.

		 *  */
		System.out.print("금액을 입력하세요 : ");
		long money = sc.nextLong();
		System.out.println("입력하신 금액은 "+ money +"입니다.");
		
		System.out.print("키를 입력하세요 : ");
		float height = sc.nextFloat();
		System.out.println("입력하신 키는 "+ height + "cm 입니다.");
		
		
		/* nextDouble() : 입력받은 값을 double 형으로 반환한다. */
		/* 정수형태로 입력받으면 실수로 변환 후 정상 동작*/
		System.out.print("실수를 입력하세요 : ");
		double number = sc.nextDouble();
		System.out.println("입력하신 실수는 "+ number + "입니다.");
		
		/* nextBoolean() : 입력받은 값을 boolean 형으로 반환
		 * true or false 외에 다른 값을 입력하게 되면 InputMismatchException 발생
		 *  
		 * */
		
		System.out.print("참과 거짓 중에 한가지를 true or false로 입력하세요 : ");
		boolean isTrue = sc.nextBoolean();
		System.out.println("입력하신 논리값는 "+ isTrue + "입니다.");
		
		/* 문자형 값입력받기 */
		/* 따라서 문자열로 입력을 받고, 입력받은 문자에서 원하는 순번째 문자를 분리해서 사용해야한다.
		 * 
		 * java.lang.String에서 charAt(int index)를 사용한다.
		 * index를 정수형으로 입력하면 문자열에서 해당 인덱스에 있는 한 문자를 문자형을 반환해주는 기능 
		 * 
		 * index는 0부터 시작하는 숫자체계이며 컴퓨터에서 주로 사용하는 방식
		 * 만약 존재하지 않는 인덱스를 입력하세되면 indexOutOfBoundsException이 발생.
		 * */
		
		sc.nextLine(); 
		System.out.print("아무 문자나 입력 해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		System.out.println("입력하신 문자는 "+ ch + "입니다.");
		
		sc.close();
		
	}
}

