package com.greedy.section02.package_and_import;

import com.greedy.section01.method.Calculator;
/* com.greedy.section01.method 밑의 모든 클래스를 사용하는 경우*/
import com.greedy.section01.method.*;

/* static import의 경우 사용하려는 static method까지 써줘야한다. */
import static com.greedy.section01.method.Calculator.maxNumberOf;

import java.sql.Date;
//import java.util.Date.*;

/* com.greedy.section01.method.Calculator.* 모든 메소드를 메소드이름만으로 가져올 수 있다. */
import static com.greedy.section01.method.Calculator.*;

public class Application2 {

	public static void main(String[] args) {

		/* 임포트 : 서로다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 풀클래스 이름을 사용해야함
		 * 			하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
		 * 			그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import구문
		 * 			import는 package 선언문과 class 선언문 사이에 작성하며,
		 * 			어떠한 패키지내에 있는 클래스를 사용할 것인지에 대해 미리 선언하는 효과를 가진다.
		 * 
		 * 		동일한 클래스명을 import하는 경우 패키지가 달라도 허용하지 않고
		 * 		둘 중 하나만 사용할 수 있으며, 다른 클래스를 사용하려면 풀패키지명을 붙여서 사용한다.
		 * 
		 * 
		 * */
		
		
		//ctrl + shift + o : import 자동 추가 
		/* non-static 메소드일 경우 */
		Calculator calculator = new Calculator();
		int min = calculator.minNumberOf(50, 60);
		
		System.out.println("50과 60중 더 작은 값은 : " + min);
		
		/* static일 경우 */
		int max = Calculator.maxNumberOf(50, 60);
		System.out.println("50과 60중 더 큰 값은 : " + max);
		
		int max2 = maxNumberOf(100, 200);
		System.out.println("50과 60중 더 큰 값은 : " + max);
		
		//Date 클래스 -> java.util.Date, java.sql.Date
		
		Date data = new Date(System.currentTimeMillis());
		
		// 사용량이 적은 곳에 패키지까지 적어준다.
		java.util.Date utilDate = new java.util.Date(System.currentTimeMillis());
		
		
	}
}
