package com.greedy.section01.method;

/** alt shift j
 * 
 * <pre>
 * Class : Application4 
 * Comment : 여러개의 전달인자와 매개 변수를 이용한 메소드 호출 
 * History 
 * 2023/03/31 처음작성함
 * 2023/04/01 메소드 추가됨
 * </pre>
 * 
 * @author 주진선
 * @version 1.0.0
 */
public class Application4 {

	public static void main(String[] args) {
		
		/* 여러개의 전달인자를 이용한 메소드 호출 테스트 */
		/* 1. 여러개의 매개변수를 가진 메소드를 호출 */
		Application4 application4 = new Application4();
		application4.testMethod("으ㅏ아", 10, '남');
		
		/* 2. 변수에 저장된 값을 전달하여 호출할 수 있다. */
		String name = "유관순";
		int age = 20;
		char gender = '여';
		
		application4.testMethod(name, age, gender);

	}

	/**
	 * <pre>
	 * 이름과 나이의 성별을 전달받아 한번에 출력해주는 기능 제공
	 * </pre>
	 * @param name 출력할 이름을 전달해주세요
	 * @param age 출력할 나이를 전달해주세요
	 * @param gender 출력할 성별을 전달해주세요. 성별을 변경되지 않을 것을 보장합니다.
	 */
	public void testMethod(String name, int age, final char gender) {
		
		System.out.printf("당신의 이름은 %s이고, 나이는 %d세이며, 성별은 %c입니다.\n", name, age, gender);
		
		
		
	}
	
}
