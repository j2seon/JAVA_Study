package com.greedy.section06.finalkeyword;


public class FinalFiedlTest {

	/* final은 변경 불가의 의미를 가진다.
	 * 
	 * 따라서 초기 인스턴스가 생성되고 나면 기본값이 0이 필드에 들어가게 되는데
	 * 그 초기화 이후 값을 변경할 수 없기 떄문에 선언하면서 바로 초기화를 해주어야한다.
	 * */
	
	//private final int nonStaticNum; //에러 발생 //0으로 초기화 되어 이후 변경 불가능 
	
	// 해결할 수 있는 방법은 2가지 있다.
	
	/* 1. 선언과 동시에 초기화한다. */
	private final int NON_STATIC_NUM = 1;
	
	/* 2. 생성자를 이용해서 초기화 */
	private final String NON_STATIC_NAME;

	public FinalFiedlTest(String NON_STATIC_NAME) {
		this.NON_STATIC_NAME = NON_STATIC_NAME;
	}
	
	
	/* static field final */
//	private static final int STATIC_NUM; //에러남 // 0으로 초기화되기 때문에 이후 변경불가능
	private static final int STATIC_NUM = 1;
	private static final int STATIC_DOUBLE;
	
	/* 생성자를 이용한 초기화는 불가능하다 
	 * 생성자는 인스턴스가 생성되는 시점에 호출되기 때문에 그 전에 초기화가 일어나지 못한다.
	 * 하지만 static은 프로그램이 start 될때 가지 할당되기 때문에 초기화가 되지 않은 상태로 선언된 것과
	 * 동일 하여 기본값으로 초기화 된 후 값을 변경하지 못하기 때문에 에러가 발생한다.
	 * */
	
//	public FinalFiedlTest(double staticDouble) {
//		FinalFieldTest.STATIC_DOUBLE = staticDouble;
//	}
	
	/* 초기화 블럭으로 초기화할 수 있음.*/
	static {
		STATIC_DOUBLE = 1;
	}
	
	
}
