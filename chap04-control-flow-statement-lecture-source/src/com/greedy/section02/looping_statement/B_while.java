package com.greedy.section02.looping_statement;

import java.util.Scanner;

public class B_while {
	
	/* [while문 표현식]
	 * 초기식 ;
	 * while(조건식){
	 * 		조건을 만족하는 경우 수행할 구문(반복할 구문);
	 * 		증감식;
	 * }
	 * 
	 * */
	
	public void testSimpleWhileStatement() {
		
		/* 1부터 10까지 1씩 증가시키면서 값을 출력하는 기본 반복문 */
		
		int i = 1;
		while (i <= 10) {
			
			System.out.println(i);
			i++;
		}
		
	}
	public void testwhileExample1() {
			
		/* 입력한 문자열의 인덱스를 이용해서 문자를 하나씩 출력해보기 */
		/* charAt() : 문자열에서 인덱스에 해당하는 문자를 char형으로 반환하는 기능 */
		/* length() : String 클래스의 메소드로 문자열의 길이를 int 형으로 반환한다. */
		/* index는 0부터 시작하고 마지막 인덱스는 항상 길이보다 한개 작은 숫자를 가진다.
		 * 만약 존재하지 않는 인덱스에 접근하게되면 StringIndexOutOfBoundsException이 발생
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		int length = str.length();
		
		System.out.println("============= while =============");
		int index = 0;
	
		
		while (index < str.length()) {
			char ch = str.charAt(index);
			
			System.out.println(index + " : " + ch);
			
			index++;
		}
		
		System.out.println("============= for =============");
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.printf("%d : %c \n", i, ch);
		}
		
	}
	
	public void testWhileExample2() {
		
		/* 정수 하나를 입력받아 1부터 입력받은 정수까지의 합계를 구한다. */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int num2 = 1;
		int sum = 0;
		System.out.println("============= while =============");
		while (num2 <= num) {
			sum += num2 ;
			num2++;
			
		}
		System.out.printf("1부터 입력받은 정수 %d까지의 합은 %d입니다\n", num, sum);
		
	}
	
	public void testWhileExample3() {
		int dan = 2;
		while (dan < 10) {
			int num = 1;
			System.out.printf("========= %d단 =========\n", dan);
			while (num < 10) {
				System.out.printf("%d * %d = %d\n", dan, num,(dan * num));
				num++;
			}
			dan++;
		}
	}
	
}
