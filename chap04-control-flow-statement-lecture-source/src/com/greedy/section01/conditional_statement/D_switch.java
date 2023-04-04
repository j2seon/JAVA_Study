package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class D_switch {
	
	
	/**
	 * <pre>
	 * switch문 실행 흐륾을 확인하기 위한 용도의 기능을 제공
	 * </pre> 
	 */
	public void testSimpleSwitchStatement() {
		
		/* [switch문 표현식]
		 * 
		 * switch(비교할 변수){
		 * 		case 비교값1 : 비교값1과 일치하는 경우 실행할 구문 break;
		 * 		case 비교값2 : 비교값2과 일치하는 경우 실행할 구문 break;
		 * 		default : case에 모두 해당하지 않는 경우 실행할 구문; break;
		 * }
		 * 
		 * 여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은 if-else-if와 유사
		 * 따라서 일부 호환이 가능하다.
		 * 하지만 switch 문으로 비교가능한 값은 정수, 문자, 문자열 형태의 값이다.
		 * 실수의 논리는 비교할 수 없다.
		 * 또한 정확하게 일치하는 경우만 비교할 수 있으며 대소비교를 할 수 없다는게 차이점이다.
		 * 또한 문자열 비교는 jdk1.7이상부터 가능하다.
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수입력 : ");
		int first = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int second = sc.nextInt();
		System.out.print("연산 기호 입력(+, -, *, /, %) : ");
		char ch = sc.next().charAt(0);
		/* charAt() 메소드를 사용한 이유? Scanner클래스에서는 다른 기본자료형들은 nextXXX로 해당값을 가져오는데
		 * 문자에 대한 것만 메소드를 제공하고 있지 않아서 입력받은 값에서 제공하는 charAt이라는 메소드를
		 * 이용해서 원하는 인덱스에 있는 값ㄱ만 추출해서 사용하게된다.
		 * 
		 * HELLO라는 문자열을 입력받는다고 가정하면 
		 * 01234 와 같이 각 인덱스에 해당하는 문자가 관리되고 있어서 필요한 익덱스 번호를 지정하고 값을 가져온다.
		 *  
		 * */
		/* 연산의 결과를 저장할 변수 */
		int result = 0;
		
		switch (ch) {
		case '+':
			result = first + second;
			break;
		case '-':
			result = first - second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first / second; //0으로 나누는 경우 ArithmeticException
			break;
		case '%':
			result = first % second;
			break;
			/* default문은 생략 가능하지만 생략하는 경우 주석으로 생략 이유를 간략하게 작성해주는 것이 좋다 */
			/* 산술연산 외에 다른 문자에 대한 처리는 생략하겠다. */
		}

		System.out.printf("%d %c %d = %d", first, ch, second, result);
		sc.close();
	}
	
	/**
	 * <pre>
	 * switch문으로 문자열 값 비교 태스느 및 break 테스트
	 * </pre> 
	 */
	public void testSwitchVendingMachine() {
		
		
		/* swtich 문을 이용해서 문자열 값 비교 및 break에 대한 테스트
		 * 
		 * 1. JDK 1.7 이상부터 switch 문을 이용해서 문자열을 비교할 수 있다.
		 * 2. break를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킨다/
		 * 
		 * */
		
		System.out.println("========== greedy vending machine ===========");
		System.out.println("    사이다     콜라     환타     바카스     핫식스");
		System.out.println("=============================================");
		System.out.print("음료를 선택해주세요 : ");
		
		/* 원하는 음료를 문자열로 입력받는다. */
		Scanner sc = new Scanner(System.in);
		String selectedDrink = sc.nextLine();
		
		/* 원하는 음료에 맞는 가격을 저장할 변수 */
		int price = 0; 
		
		switch (selectedDrink) {
		case "사이다" :
			System.out.println("사이다를 선택하셨습니다.");
			price = 500;
		case "콜라" :
			System.out.println("콜라를 선택하셨습니다.");
			price = 700;
		case "환타" :
			System.out.println("환타를 선택하셨습니다.");
			price = 1000;

		case "바카스" :
			System.out.println("바카스를 선택하셨습니다.");
			price = 800;

		case "핫식스" :
			System.out.println("핫식스를 선택하셨습니다.");
			price = 1500;

		}
		System.out.println(price + " 을 투입해주세요");
		
		/* 수정 */
		System.out.println("=================== 개선된 자판기 =====================");
		
		String order = "";
		
		switch (selectedDrink) {
		case "사이다" :
			order = "사이다를 선택하셨습니다.";
			price = 500;
		case "콜라" :
			order = "콜라를 선택하셨습니다.";
			price = 700;
		case "환타" :
			order = "환타를 선택하셨습니다.";
			price = 1000;

		case "바카스" :
			order = "바카스를 선택하셨습니다.";
			price = 800;

		case "핫식스" :
			order = "핫식스를 선택하셨습니다.";
			price = 1500;

		}
		System.out.println(order + " 을 선택하셨습니다.");
		System.out.println(price + " 을 투입해주세요");
		
	}

}

