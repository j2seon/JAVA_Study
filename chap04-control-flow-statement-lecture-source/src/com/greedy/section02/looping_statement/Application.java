package com.greedy.section02.looping_statement;

import com.greedy.section03.branching_statement.A_break;

public class Application {

	public static void main(String[] args) {
		A_for a = new A_for();
//		a.testSimpleForStatement();
//		a.printSimpleGugudan();
		
		A_nestedFor a_nestedFor = new A_nestedFor();
		a_nestedFor.printStarInputRowTimes();
//		
		B_while b_while = new B_while();
//		b_while.testSimpleWhileStatement();
//		b_while.testwhileExample1();
//		b_while.testWhileExample2();
//		b_while.testWhileExample3();
		
		C_dowhile c_dowhile = new C_dowhile();
//		c_dowhile.testSimpleDoWhileStatement();
//		c_dowhile.testDoWhileExample1();
		
		
		A_break a_break = new A_break();
		a_break.testSimpleBreakStatement();
	}

}
