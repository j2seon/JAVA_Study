package com.greedy.section06.statickeyword;

public class StaticFieldTest {
	
	/* non-static 필드와 static 필드 선언 */
	private int nonStaticCount;
	private static int staticCount;
	
	public StaticFieldTest() {}

	public int getNonStaticCount() {
		return this.nonStaticCount;
	}
	
	public int getStaticCount() {
		/* static 필드에 접근하기 위해서는 클래스명.필드명으로 접근한다.
		 * this.으로 접근은 가능하지만 this.사용하지 않는 것이 좋다.
		 * */
		
		return StaticFieldTest.staticCount;
	}
	
	public void increaseNonStaticCount() {
		this.nonStaticCount++;
	}
	
	public void increaseStaticCount() {
		StaticFieldTest.staticCount++;
	}
	
	
}
