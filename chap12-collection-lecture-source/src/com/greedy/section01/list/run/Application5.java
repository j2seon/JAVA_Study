package com.greedy.section01.list.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application5 {
	
	public static void main(String[] args) {
		
		/* Queue
		 * 선입선출(FIFO - First Input First Out)방식의 자료구조
		 * 
		 * Queue 인터페이스를 상속받은 하위 인터페이스들은
		 * Dequeue, BlockingQueue, BlockingDeque, TranferQueue등 다양하지만
		 * 대부분 큐는 LinkedList를 이용한다.
		 *  
		 * */
		
		/* Queue 자체로는 인터페이스이기 때문에 인스턴스 생성이 불가능하다. */
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("first");
		queue.offer("second");
		queue.offer("third");
		queue.offer("fourth");
		queue.offer("fifth");
	
		/* 큐에서 데이터를 꺼낼때는 2가지 메소드가 있다.
		 * peek() : 해당 큐의 가장 앞에있는 요소(먼저 들어온 요소)를 반환
		 * poll() : 해당 큐의 가장 앞에있는 요소를 반환하고 제거
		 * 
		 * */
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
		
	}
}
