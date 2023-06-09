package com.greedy.section05.overloading;

public class OverLoadingTest {
	
	/* 오버로딩(Overloading)
	 * 생성자, 메소드 작성 시 동일한 이름 생성자, 메소드를 한 클래스 내에서 작성하는 것은 불가능하다.
	 * 
	 * 하지만 매개변수 부분의 타입, 갯수, 순서를 다르게 작성하면
	 * 서로다른 메소드나 생성자로 인식하기 때문에 동일한 이름의 생성자나 메소드를 여러개 작성할 수 있게된다.
	 * 이를 오버로딩이라한다.
	 * 
	 * 조건
	 * 1.동일한 이름을 가진 메소드의 파라미터 선언부에 매개변수의 타입, 갯수, 순서를 다르게 작성하여
	 *   한 클래스 내에 동일한 이름의 메소드를 여러 개 작성할 수 있도록 한다.
	 * 
	 * 메소드의 시그니쳐(Signature)가 다르면 다른 메소드로 인식하기 때문이다
	 * 즉, 시그니쳐 중 메소드 이름은 동일헤야하기 때문에 파라미터 선언부가 다르게 작성되어야 오버로딩이 성립한다/
	 * 
	 * 
	 * 메소드의 시그니쳐?
	 * 메소드명과 파라미터 선언부분을 시그니쳐라고 한다. 
	 * 
	 * 메소드의 시그니쳐가 달라야하기 때문에 접근제한자나 반환형은 오버로딩 설입요건에 해당하지 않는다.
	 * */

	/* 오버로딩을 이용한 메소드 작성 테스트를 위한 기준이 되는 메소드 */
	public void test() {}
	
	/* 메소드의 시그니쳐가 동일한 경우 complie error를 발생시킨다.  */
//	public void test() {}
	
//	private void test() {} // 접근제한자는 메소드 시그니처에 해당하지 않는다.
	
//	public int test() {return 0;} // 반환형은 메소드 시그니처에 해당하지 않는다.
	
	/* 매개변수 유무에 따른 오버로딩 성립확인 */
	public void test(int num) {} // 파라미터 선언부는 메소드 시그니처에 해당된다
	
//	public void test(int num2) {} // 매개변수의 이름은 메소드 시그니쳐에 영향을 주지않는다 그래서 에러발생
	
	/* 매개변수 갯수에 따른 오버로딩 성립확인 */
	public void test(int num1, int num2) {}
	
	/* 매개변수의 타입변화에 따른 오버로딩 성립확인 */
	public void test(int num1,String name) {}
	
	/* 매개변수의 순서에 따른 오버로딩 성립확인 */
	public void test(String name, int num) {}
}
