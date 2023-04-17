package com.greedy.section03.map.run;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Application1 {
	
	public static void main(String[] args) {
		
		/* Map 인터페이스의 특징
		 * 
		 * Collection 인터페이스와는 다른 저장 방식을 가진다.
		 * 키(key)와 값(value)을 하나의 쌍으로 저장하는 방식을 사용한다.
		 * 
		 * 
		 * 키(key)란
		 * 값(value)을 찾기 위한 이름 역할을 하는 객체를 의미.
		 * 
		 * 1. 요소의 저장 순서를 유지하지 않는다.
		 * 2. 키는 중복을 허용하지않지만, 키가 다르면 중복되는 값은 저장 가능.
		 *  
		 * HashMap HashTable 등의 대표적인 클래스가 있다.
		 * HashMap이 가장 많이 사용되며 HashTable은 JDK1.0부터 제공
		 * HashMap과 동일하게 동작
		 *  
		 * */
		
		Map<Integer, String> map = new HashMap<>();
		
		/* 키와 값 둘다 반드시 객체여야한다. */
		/* 키는 중복저장되지 않음 : 최근 키로 override됨 */
		/* 값 객체 저장은 중복 저장된다. */
		map.put(1, "apple");
		map.put(2, "banana");
		map.put(1, "banana");
		
		System.out.println("map : " + map);
		
		/* 키 값을 가지고 삭제를 처리*/
		map.remove(1); // 키값으로 삭제
		System.out.println(map);
		
		System.out.println(map.size());
		
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("one", "java 11");
		map2.put("two", "jdbc");
		map2.put("three", "oracle ");
		
		/* 1.keySet()을 이용해서 키만 set으로 만들고, iterator()로 키에 대한 목록을 만든다 */
		Set<String> keys = map2.keySet();
		Iterator<String> keyIter = keys.iterator();
		
		while (keyIter.hasNext()) {
			String key = keyIter.next();
			String value = map2.get(key);
			System.out.println(key + " = " + value );
		}
		
		/* 2. 저장된 value 객체들만 values()로 Collection으로 만든다. */
		Collection<String> values = map2.values();
		Iterator<String> valueIter = values.iterator();
		
		while (valueIter.hasNext()) {
			System.out.println(valueIter.next());
		}
		
		/* toArray() 메소드를 이용해서 배열로 만들어서 처리 */
		Object[] valueArray = values.toArray();
		for (int i = 0; i < valueArray.length; i++) {
			System.out.println(i + " : " + valueArray[i]);
		}
		
		/* Map의 내부클래스인 EntrySet을 이용: entrySet() */
		
		Set<Entry<String, String>> entrySet = map2.entrySet();
		
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		
		List<String> keyList = new ArrayList<>(); 
		List<String> valueList = new ArrayList<>(); 
		while (iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			keyList.add(entry.getKey());
			valueList.add(entry.getValue());
			System.out.println(entry.getKey() + " : "+ entry.getValue());
		}
		System.out.println(keyList);
		System.out.println(valueList);
	}

}
