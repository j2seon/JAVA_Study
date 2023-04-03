package com.greedy.section01.conditional_statement;

import java.util.Scanner;

public class C_ifElseIf {
	
	
	
	/**
	 * <pre>
	 * 단독 if -else-if문 실행 흐름을 확인하기 위한 용도의 기능을 제공
	 * </pre>
	 */
	public void testSimpleIfElseIfStatement() {
		
		
		/* [if-else-if문 표현식]
		 * if(조건식1) {
		 *     조건식1이 true일 때 실행할 명령문;
		 * } else if(조건식2) {
		 *     조건식1이 false이고 조건식2가 true일 때 실행할 명령문;
		 * } else if(조건식3) {
		 *     조건식2이 false이고 조건식3가 true일 때 실행할 명령문;
		 * } else {
		 *     위의 조건 2개가 모두 거짓인 경우 실행할 명령문;
		 * }
		 * 
		 * if-else-if문은 조건식1의 결과값이 참(true)이며 if {} 안에 있는 코드를 실행하고,
		 * 조건식1이 false이면 조건식2를 확인하여 참(true)이면 else if {} 안에 있는 코드를 실행한다.
		 * 
		 * 조건식1,2의 결과값이 모두 거짓(false)이면 else {}안에 있는 코드를 실행한다.
		 * 
		 * *** 여러 개의 조건을 제시하여 그 중 한가지를 반드시 실행시키고 싶은 경우 사용한다. ***
		 * */
		System.out.println("산속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
		System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
		System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어봤다. ");
		
		System.out.print("어느 도끼가 너의 도끼이냐? (1. 금도끼, 2. 은도끼, 3. 쇠도끼) : ");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt();
		
		if(answer == 1) {
			
			System.out.println("이런 거짓말 쟁이!! 너에게는 아무런 도끼도 줄 수 없구나!! 욕심쟁이야!!");
		} else if(answer == 2) {
			
			System.out.println("욕심이 과하지는 않지만 그래도 넌 거짓말을 하고 있구나!! 어서 썩 사라지거라!!");
		} else {
			
			System.out.println("오호~ 정직하구나~~ 여기있는 금도끼, 은도끼, 쇠도끼를 다 가져가거라!!");
		}
		
		System.out.println("그렇게 산신령은 다시 연못 속으로 사라지고 말았다....");
		
		
		
		
		
		
		

		
	}


	/**
	 * <pre>
	 * 중첩 if -else-if문 구문 흐름을 확인하기 위한 용도의 메소드
	 * </pre>
	 */
	public void testNesedIfElseIfStatement() {
		
		/* greedy 대학의 유xx교수님은 학생들 시험 성적을 수기로 계산해서 학점등급을 매기는 채점방식을 사용하고 있다.
		 * 
		 * 90점 이상이면 'A' 80점 이상이면 'B' 70점 이상이면 'C', 60점 이상으면 'D'를 
		 * 60점 미만인 경우에는 'F'가 기준이다/
		 * 추가로 각 등급의 중간점수인 경우 (97,85,75) '+'를 붙여서 세분화
		 * 학생이름과 점수를 입력하면 학점등급이 계산되는 프로그램
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("학생이름 : ");
		String name = sc.nextLine();
		System.out.println();
		
		System.out.println("점수 : ");
		int score = sc.nextInt();
		String result = "";
		
		if(score >= 90){
			result = "A";
			
		}else if(score >= 80) {
			
			result = "B";
			
		}else if(score >= 70) {
			result = "C";	
			
		}else if(score >= 60) {
			result = "D";	
			
		}else {
			result = "F";
		}
		
		/* 각 등급 중간 점수 이상이면  */
		if(score % 10 >= 5 && score >=60 || score == 100)
			result += "+";
		
		System.out.printf("%s의 점수는 %s 입니다.\n", name, result);
		
	}
}
