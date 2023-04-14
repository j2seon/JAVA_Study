package com.greedy.section01.list.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Application1 {

	public static void main(String[] args) {
		
		/* 컬렉션 프레임워크 
		 * 자바에서 컬렉션 프레임워크는 여러 개 의 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록
		 * 표준화된 방법을 제공하는 클래스들의 집합을 의미한다.
		 * 
		 * Collection Framework는 크게 3가지 인터페이스 중 한가지를 상속받아 구현해 놓았다.
		 * 1. List
		 * 2. Set
		 * 3. Map
		 * 
		 * List 인터페이스와 Set 인터페이스의 공통부분을 Collection인터페이스에서 정의하고 있다.
		 * 하지만 Map은 구조상의 차이로 Collection 인터페이스에서 정의하고 있지 않다
		 * */
		
		/* 
		 * ArrayList
		 * 가장 많이 사용되는 컬렉션 클래스이다.
		 * JDK1.2부터 제공된다.
		 * 내부적으로 배열을 이용하여 요소를 관리하며, 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있다.
		 * 
		 * ArrayList는 배열의 단점을 보완하기 위해 만들어졌다.
		 * 배열의 크기를 변경할 수 없고, 요소의 추가 삭제 정렬등이 복잡하다는 단점을 가지고 있다.
		 * 
		 * ArrayList는 이러한 배열의 단점을 보완하고자 크기변경, 요소의 추가 삭제 정렬 기능을
		 * 미리 메소드로 구현해서 제공하고 있다.
		 * --> 자동으로 수행되는 것이지 속도가 빨라지는 것은 아니다.
		 * 
		 * */
		
		ArrayList<Object> aList = new ArrayList<>();
		
		/* 다형성을 적용하여 상위 래퍼런스로 ArrayList객체를 만들 수도 있다. 
		 * 
		 * List 인터페이스 하위의 다양한 구현체들로 타입변경이 가능하기 때문에
		 * 래퍼런스 타입은 List로 해두는 것이 더 유연한 코드를 작성하는 것이다.
		 * */
		List<Object> list = new ArrayList<>();
		Collection<Object> c = new ArrayList<>();
		
		/* ArrayList는 저장 순서가 유지되며 index(순번)이 적용된다.
		 * 단 size()메소드는 배열의 크기가 아닌 요소의 갯수를 반환한다.
		 * */
		
		aList.add("apple"); // alist[0] = "apple"; 유사
		aList.add(123); // 오토박싱 처리 됨 (값 -> 객체)
		aList.add(45.67); // 오토박싱 처리 됨 (값 -> 객체)
		aList.add(new Date()); // 오토박싱 처리 됨 (값 -> 객체)
		System.out.println(aList);
		System.out.println(aList.size());
	
		aList.stream().forEach(System.out::println);
		
		/* ArryList는 데이터 중복 허용
		 * 원하는 인덱스 위치에 값을 추가할 수도 있다.
		 * 값을 중간에 추가하는 경우 인덱스 위치에 덮어쓰는 것이 아니고
		 * 새로운값이 들어가는 인덱스 위치에 값을 넣고 이후 인덱스는 하나씩 뒤로 밀리게 된다.
		 * */
		
		aList.add(1, "bananan");
		System.out.println(aList);
		
		/* 저장된 값을 삭제할 때는 remove() 메소드를 사용한다.
		 * 중간 인덱스의 값을 삭제하는 경우 자동으로 인덱스를 하나씩 앞으로 당긴다.
		 * */
		
		aList.remove(1);
		System.out.println(aList);
		
		/* 지정된 위치의 값을 수정할 때에도 인덱스를 활용할 수 있다. */
		aList.set(1, Boolean.valueOf(false));
		System.out.println(aList);
		
		List<String> stringList = new ArrayList<>();
		stringList.add("apple");
		stringList.add("banana");
		stringList.add("orange");
		stringList.add("mango");
		stringList.add("grape");
		
		/* Collection 인터페이스가 아닌 Collections 클래스이다.
		 * Collection에서 사용되는 기능들을 static메소드로 구현한 클래스
		 * 인터페이스명 뒤에 s가 붙은 클래스들은 관례상 비슷한 방식으로 작성된 클래스를 의미
		 * */
		Collections.sort(stringList);// 오름차순
		
		System.out.println(stringList); 
		Collections.reverse(stringList); // 뒤집기 
		
		System.out.println(stringList);
		
		String a = Collections.min(stringList);
		System.out.println(a);
		
		stringList = new LinkedList<>(stringList);
		
		/* Iterator 반복자 인터페이스를 활용해서 역순으로 정렬한다.
		 * Collecton 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
		 * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용한다.
		 * 반복자라고 불리우면 반복문을 이용해서 목록을 하나씩 거내는 방식으로 사용하기 위함이다.
		 * 
		 * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에 
		 * 인덱스를 사용하지 않고도 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면된다.
		 * 
		 * hasNext() : 다음요소를 가지고 있는 경우 true 없으면 false 
		 * next() : 다음요소 반환
		 * 
		 * */
		Iterator<String> dIter = ((LinkedList<String>)stringList).descendingIterator();
		
//		while(dIter.hasNext()) {
//			System.out.println(dIter.next());
//		}
//		
		List<String> descList = new ArrayList<>();
		while(dIter.hasNext()) {
			descList.add(dIter.next());
		}
		System.out.println(descList);
		
	}
	
	
}
