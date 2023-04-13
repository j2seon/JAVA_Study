package com.greedy.section02.string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Application3 {

	public static void main(String[] args) {
		
		/* split()과 StringTokenizer 
		 * 
		 * 문자열과 특정 구분자로 하여 분리한 문자열을 반환하는 기능 
		 *
		 * split() : 정규표현식을 이용하여 문자열을 분리한다.
		 * 			 비정형화된 문자열을 분리할 때 좋지만(공백 문자열 값 포함)
		 * 			 정규표현식을 이용하기 때문에 속도가 느리다는 단점을 가진다.
		 * 
		 * StringTokenizer : 문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다.
		 * 					 정형화된 문자열 패턴을 분리할 때 사용하기 좋다 (공백 문자열 무시)
		 * 					 split()보다 속도면에서 더 빠르다.
		 * 					 구분자를 생랴갛는 경우 공백이 기본 구분자이다.
		 * */
		
		String emp1 = "100/홍길동/서울/영업부"; // 모든값 존재
		String emp2 = "200/유관순/총무부/"; // 주소없음
		String emp3 = "300/이순신/경기도/"; // 부서없음
		
		String[] strArr1 = emp1.split("/");
		String[] strArr2 = emp2.split("/");
		String[] strArr3 = emp3.split("/");
		
		System.out.println(Arrays.toString(strArr1));
		System.out.println(Arrays.toString(strArr2));
		System.out.println(Arrays.toString(strArr3));
		
		/* 마지막 구분자 사이에 값이 존재하지 않는 경우 이후 값도 추출하고 싶을때
		 * 몇개의 토큰으로 분리할 것인지 한계치를 두번째 인자로 넣어줄 수 있다.
		 * 음수를 넣게 되면 마지막 구분자 뒤의 값이 존재하지 않는 경우 빈 문자열로 토큰을 생성
		 * */
		String[] strArr4 = emp3.split("/", -1);
		
		for (int i = 0; i < strArr4.length; i++) {
			System.out.println("strArr4: " + strArr4[i]);
		}
		System.out.println();
		
		StringTokenizer st1 = new StringTokenizer(emp1, "/");
		StringTokenizer st2 = new StringTokenizer(emp2, "/");
		StringTokenizer st3 = new StringTokenizer(emp3, "/");
		
		/* hasMoreElemets() : 꺼내올 토큰이 있는지 여부를 판단해서 있으면 true, 없으면 false를 반환
		 * nextToken(): StringTokenizer객체에서 값을 꺼내오고
		 * 
		 *  nextToken()으로 토큰을 꺼내면 해당 StringTokenizer의 토큰을 재사용하는 것이 불가능
		 * */
		while (st1.hasMoreElements()) {
			System.out.println(st1.countTokens() + " : " + st1.nextToken());
		}
		
		System.out.println("=============================");
		/* split()은 정규표현식 이용(문자열패턴), StringTolenizer는 구분자 문자열 이용 */
		String colorStr = "red*orange#blue/yellow green";
		
		/* *#/이라는 문자열이 구분자로 존재하지 않아서 에러발생 */
//		String[] colors = colorStr.split("*#/");
		
		String[] colors = colorStr.split("[#*/ ]");
		System.out.println(Arrays.toString(colors));
		
		
		/*  */
		StringTokenizer cStringTokenizer = new StringTokenizer(colorStr,"*/# ");
		while (cStringTokenizer.hasMoreTokens()) {
			System.out.println(cStringTokenizer.nextToken());
			
		}
		
	}
}
