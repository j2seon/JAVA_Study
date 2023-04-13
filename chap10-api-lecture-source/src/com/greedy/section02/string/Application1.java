package com.greedy.section02.string;

public class Application1 {

	public static void main(String[] args) {
		
		/* String 클래스의 자주 사용하는 메소드 */
		
		/* chatAt() : 해당문자열의 특정 인덱스에 해당하는 문자를 반환한다.
		 * 
		 * 인덱스 : 0부터 시작하는 숫자 체계를 의미
		 * 인덱스를 벗어난 정수를 인자로 전달하는 경우에는 IndexOutOfBoundsException이 발생한다.
		 * */
		
		String str1 = "apple";
		for (int i = 0; i < str1.length(); i++) {
			System.out.printf("charAt(%d) : %c\n", i, str1.charAt(i));
		}
		
		/*compareTo() : 인자로 전달된 문자열과 사전 순으로 비교를 하여
		 * 두 문자열이 같다면 0을 반환,
		 * 인자로 전달된 문자열보다 작으면 음수
		 * 인자로 전달된 문자열이 크면 양수
		 * 
		 * 대소문자를 구분하여 비교함
		 *
		 * */
		
		String str2 = "java"; 		
		String str3 = "java"; 		
		String str4 = "JAVA"; 		
		String str5 = "oracle";
		
		/* 같으면 0 */
		System.out.println(str2.compareTo(str3));

		System.out.println(str2.compareTo(str4));
		System.out.println(str4.compareTo(str2));

		System.out.println(str2.compareTo(str5));
		
		/* compareToIgnoreCase() */
		System.out.println(str3.compareToIgnoreCase(str4));
		
		/* concat() : 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환 
		 * 원본 문자열에는 영향을 주지 않음
		 *  */
		System.out.println(str2.concat(str5));
		
		System.out.println("str2 : "+ str2);
		
		/* indexOf() : 문자열에서 특정문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다. 
		 * 일치하는 문자가 없는 경우 -1
		 * */
		
		String indexof = "java oracle";
		
		System.out.println(indexof.indexOf('o'));
		System.out.println(indexof.indexOf('z'));
		
		/* lastIndexOf() : 문자열 탐색을 뒤에서부터 하고 처음 일치하는 인덱스를 반환 
		 * 단, 일치하는 문자가 없는 경우 -1 반환
		 * */
		System.out.println(indexof.lastIndexOf('a'));
		
		/* trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다. */
		String trimStr = "       java        ";
		System.out.println(trimStr);
		System.out.println(trimStr.trim());
		
		/* 원본에 영향을 주지않는다. */
		System.out.println(trimStr);
		
		/* toLowerCase() : 모든 문자를 소문자
		 * toUpperCase() : 모든 문자를 대문자
		 * */
		
		String caseStr = "JavaOracle";
		
		System.out.println(caseStr.toUpperCase());
		System.out.println(caseStr.toLowerCase());
		
		/* subString(): 문자열의 일부분을 잘라내어 새로운 문자열을 반환한다.
		 * 원본 영향 x
		 * */
		String javaoracle = "javaoracle";
		
		/* 시작인덱스 부터 종료인덱스 미만까지의 값을 잘라낸다. */
		System.out.println(javaoracle.substring(3,6));
		System.out.println(javaoracle.substring(3));
		
		/* replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환한다.
		 * 원본에 영향을 주지 않는다.
		 * */
		System.out.println("replace() : " + javaoracle.replace("java", "python"));
		
		/* isEmpty() : 문자열의 길이가 0 이면 true 반환 아니면 false반환
		 * 길이가 0인 문자열은 null과는 다르다. 
		 * */
		System.out.println("isEmpty() : " + "".isEmpty());
		
		
		
	}
}
