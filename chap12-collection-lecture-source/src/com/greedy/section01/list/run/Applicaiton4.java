package com.greedy.section01.list.run;

import java.util.Stack;

public class Applicaiton4 {

	public static void main(String[] args) {
		
		/* Stack
		 * Stack은 리스트 계열의 Vector클래스를 상속받아 구현하였다.
		 * 후입선출 (LIFO - Last Input First Out)방식의 자료구조라 불린다.
		 * */
		
		Stack<Integer> stack = new Stack<>();
		
		/* Stack에 값을 넣을 때는 push() 메소드를 이용한다.
		 * add()도 이용 가능하지만 Vector의 메소드이다.
		 * push()를 사용하는 것이 좋음.
		 * */
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		/* Stack에서 요소를 찾을 때 search()를 이용할 수 있다. 
		 * 인덱스가 아닌 위에서부터의 순번을 의미한다.
		 * 또한 가장 상단의 위치가 0이 아닌 1부터 시작
		 * */
		
		System.out.println(stack.search(4));
		
		/* Stack에서 값을 꺼내는 메소드는 크게 2가지로 볼 수 있다.
		 * peek() : 해당 스택의 가장 마지막(상단)에 있는 요소를 반환
		 * pop() :  해당 스택의 가장 마지막에 있는 요소 반환 후 제거
		 * */
		
		System.out.println(stack.pop());
		System.out.println(stack.peek());

		System.out.println(stack);
		
		
	}
}
